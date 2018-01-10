package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.Orientacao;

public class SearchXMLOrientacoes extends SearchXML {

	public SearchXMLOrientacoes(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Orientacao> OrientacaoDouAnd() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO", "TITULO-DO-TRABALHO", 1, "TIPO-DE-ORIENTACAO", 0, null);
	}

	public ArrayList<Orientacao> OrientacaoDouCon() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO", "TITULO", 1, "TIPO-DE-ORIENTACAO", 0, null);
	}

	public ArrayList<Orientacao> OrientacaoMesAnd() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO", "TITULO-DO-TRABALHO", 0, "TIPO", 1, "TIPO-DE-ORIENTACAO");
	}

	public ArrayList<Orientacao> OrientacaoMesCon() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACOES-CONCLUIDAS-PARA-MESTRADO", "TITULO", 0, "TIPO", 1, "TIPO-DE-ORIENTACAO");
	}
	// monografia, tcc , ic
	public ArrayList<Orientacao> OutrasOrientacaoCon() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}

	public ArrayList<Orientacao> OrientacaoAperfEspecAnd() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}
	public ArrayList<Orientacao> OrientacaoGraduacaoAnd() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}
	public ArrayList<Orientacao> OrientacaoICAnd() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}
	
	
	
	public ArrayList<Orientacao> BancaMestrado() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}
	
	public ArrayList<Orientacao> BancaDoutorado() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}

	public ArrayList<Orientacao> BancaQualificacao() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}
	public ArrayList<Orientacao> BancaAperfeicoamentoEspecificacao() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}
	public ArrayList<Orientacao> BancaGraduacao() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}
	public ArrayList<Orientacao> BancaProfessorTitular() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}
	public ArrayList<Orientacao> BancaConcursoPublico() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}
	public ArrayList<Orientacao> BancaLivreDocencia() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}
	public ArrayList<Orientacao> BancaAvaliacaoCurso() throws XPathExpressionException {
		return BuscaOrientacao("", NomeTitulo, a, aux, b, aux2);
	}

}
