package br.com.SearchXML;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class SearchXMLDadosGerais extends SearchXML {

	public SearchXMLDadosGerais(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}

	public String UltimaAtualizacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/CURRICULO-VITAE[1]/@DATA-ATUALIZACAO)");
		return expr.evaluate(xmlfile);
	}

	public String IDLattes() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/CURRICULO-VITAE[1]/@NUMERO-IDENTIFICADOR)");
		return expr.evaluate(xmlfile);
	}

	public String NomeCompleto() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String NomeCitacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-EM-CITACOES-BIBLIOGRAFICAS)");
		return expr.evaluate(xmlfile);
	}

	public String ResumoCV() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS/RESUMO-CV[1]/@TEXTO-RESUMO-CV-RH)");
		return expr.evaluate(xmlfile);
	}

	public boolean DedicaoExclusiva() throws XPathExpressionException {
		XPathExpression expr = xpath
				.compile("//ATUACAO-PROFISSIONAL/VINCULOS[@FLAG-DEDICACAO-EXCLUSIVA='SIM' and  @ANO-FIM='']");
		NodeList dedicacao = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		if (dedicacao.getLength() > 0) {
			return true;
		} else {
			return false;
		}
	}

}
