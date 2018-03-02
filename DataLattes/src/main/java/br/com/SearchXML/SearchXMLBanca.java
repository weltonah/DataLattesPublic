package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.ObjetoCriterio;

public class SearchXMLBanca extends SearchXML {

	public SearchXMLBanca(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<ObjetoCriterio> BancaMestrado() throws XPathExpressionException {
		return BuscaBanca("//PARTICIPACAO-EM-BANCA-DE-MESTRADO", "TITULO", 0, "TIPO", 0, null);
	}

	public ArrayList<ObjetoCriterio> BancaDoutorado() throws XPathExpressionException {
		return BuscaBanca("//PARTICIPACAO-EM-BANCA-DE-DOUTORADO", "TITULO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> BancaQualificacao() throws XPathExpressionException {
		return BuscaBanca("//PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO", "TITULO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> BancaAperfeicoamentoEspecificacao() throws XPathExpressionException {
		return BuscaBanca("//PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO", "TITULO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> BancaGraduacao() throws XPathExpressionException {
		return BuscaBanca("//PARTICIPACAO-EM-BANCA-DE-GRADUACAO", "TITULO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> BancaProfessorTitular() throws XPathExpressionException {
		return BuscaBancaDif("//BANCA-JULGADORA-PARA-PROFESSOR-TITULAR", "TITULO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> BancaConcursoPublico() throws XPathExpressionException {
		return BuscaBancaDif("//BANCA-JULGADORA-PARA-CONCURSO-PUBLICO", "TITULO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> BancaLivreDocencia() throws XPathExpressionException {
		return BuscaBancaDif("//BANCA-JULGADORA-PARA-LIVRE-DOCENCIA", "TITULO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> BancaAvaliacaoCurso() throws XPathExpressionException {
		return BuscaBancaDif("//BANCA-JULGADORA-PARA-AVALIACAO-CURSOS", "TITULO", 0, null, 0, null);
	}

}
