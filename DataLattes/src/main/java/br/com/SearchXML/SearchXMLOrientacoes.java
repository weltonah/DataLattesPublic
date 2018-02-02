package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.Orientacao;

public class SearchXMLOrientacoes extends SearchXML {

	public SearchXMLOrientacoes(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Orientacao> OrientacaoDouAnd() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO", "TITULO-DO-TRABALHO", 1, "TIPO-DE-ORIENTACAO",
				0, null);
	}

	public ArrayList<Orientacao> OrientacaoDouCon() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO", "TITULO", 1, "TIPO-DE-ORIENTACAO", 0, null);
	}

	public ArrayList<Orientacao> OrientacaoMesAnd() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO", "TITULO-DO-TRABALHO", 0, "TIPO", 1,
				"TIPO-DE-ORIENTACAO");
	}

	public ArrayList<Orientacao> OrientacaoMesCon() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACOES-CONCLUIDAS-PARA-MESTRADO", "TITULO", 0, "TIPO", 1, "TIPO-DE-ORIENTACAO");
	}

	// monografia, tcc , ic
	public ArrayList<Orientacao> OutrasOrientacaoCon() throws XPathExpressionException {
		return BuscaOrientacao("//OUTRAS-ORIENTACOES-CONCLUIDAS", "TITULO", 0, "TIPO", 0, null);

	}

	public ArrayList<Orientacao> OrientacaoAperfEspecAnd() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACAO-EM-ANDAMENTO-DE-APERFEICOAMENTO-ESPECIALIZACAO", "TITULO-DO-TRABALHO", 0,
				null, 0, null);
	}

	public ArrayList<Orientacao> OrientacaoGraduacaoAnd() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO", "TITULO-DO-TRABALHO", 0, null, 0, null);
	}

	public ArrayList<Orientacao> OrientacaoICAnd() throws XPathExpressionException {
		return BuscaOrientacao("//ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO", "TITULO-DO-TRABALHO", 0, null, 0, null);
	}

	public ArrayList<Orientacao> BancaMestrado() throws XPathExpressionException {
		return BuscaOrientacao("//PARTICIPACAO-EM-BANCA-DE-MESTRADO", "TITULO", 0, "TIPO", 0, null);
	}

	public ArrayList<Orientacao> BancaDoutorado() throws XPathExpressionException {
		return BuscaOrientacao("//PARTICIPACAO-EM-BANCA-DE-DOUTORADO", "TITULO", 0, null, 0, null);
	}

	public ArrayList<Orientacao> BancaQualificacao() throws XPathExpressionException {
		return BuscaOrientacao("//PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO", "TITULO", 0, null, 0, null);
	}

	public ArrayList<Orientacao> BancaAperfeicoamentoEspecificacao() throws XPathExpressionException {
		return BuscaOrientacao("//PARTICIPACAO-EM-BANCA-DE-APERFEICOAMENTO-ESPECIALIZACAO", "TITULO", 0, null, 0, null);
	}

	public ArrayList<Orientacao> BancaGraduacao() throws XPathExpressionException {
		return BuscaOrientacao("//PARTICIPACAO-EM-BANCA-DE-GRADUACAO", "TITULO", 0, null, 0, null);
	}

	public ArrayList<Orientacao> BancaProfessorTitular() throws XPathExpressionException {
		return BuscaOrientacao("//BANCA-JULGADORA-PARA-PROFESSOR-TITULAR", "TITULO", 0, null, 0, null);
	}

	public ArrayList<Orientacao> BancaConcursoPublico() throws XPathExpressionException {
		return BuscaOrientacao("//BANCA-JULGADORA-PARA-CONCURSO-PUBLICO", "TITULO", 0, null, 0, null);
	}

	public ArrayList<Orientacao> BancaLivreDocencia() throws XPathExpressionException {
		return BuscaOrientacao("//BANCA-JULGADORA-PARA-LIVRE-DOCENCIA", "TITULO", 0, null, 0, null);
	}

	public ArrayList<Orientacao> BancaAvaliacaoCurso() throws XPathExpressionException {
		return BuscaOrientacao("//BANCA-JULGADORA-PARA-AVALIACAO-CURSOS", "TITULO", 0, null, 0, null);
	}

}
