package br.com.converter;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

import br.com.DAO.OntologyDAO;

public class SearchXML {

	private OntologyDAO ontology;
	XPath xpath;
	private Document xmlfile;
	
	public SearchXML(Document xmlfile) {
		XPathFactory xPathfactory = XPathFactory.newInstance();
		this.xpath =  xPathfactory.newXPath();
		this.ontology = new OntologyDAO();
		this.xmlfile = xmlfile;
	}
	
	
	//Nome
	//IDLattes
	//Nacionalidade
	//Sexo
	//Area de atuacao
	public void Pessoa() throws XPathExpressionException {
		
		
	}
	public String NomeCompleto() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
    	return expr.evaluate(xmlfile);
	}
	
	//@cidade
	//@estado
	//@Pais
	//--EnderecoProfissional
	//codigoInstituicao
	//--EnderecoResidencial
	public void Endereco() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("//EXEMPLO");
	}
	
	//AnoFormacao
	//Codigoinstituicao
	//Nomeinstituicao
	//idLattes (orientador)
	//TituloCurso
	//Titulo Trabalhofinal
	public void Formacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("//EXEMPLO");
	}
	
	
	//Disciplina
	public void AtuacaoProfissional() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("//EXEMPLO");
	}
	
	public void Produção() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("//EXEMPLO");
	}
	
	
	
}
