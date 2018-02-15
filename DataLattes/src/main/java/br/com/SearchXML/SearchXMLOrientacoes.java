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
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO", "TITULO-DO-TRABALHO", 1,
				"TIPO-DE-ORIENTACAO", 0, null);
	}

	public ArrayList<Orientacao> OrientacaoDouCon() throws XPathExpressionException {
		return BuscaOrientacaoCon("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO", "TITULO", 1, "TIPO-DE-ORIENTACAO", 0,
				null);
	}

	public ArrayList<Orientacao> OrientacaoMesAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO", "TITULO-DO-TRABALHO", 1,
				"TIPO-DE-ORIENTACAO", 0, "TIPO");
	}

	public ArrayList<Orientacao> OrientacaoMesCon() throws XPathExpressionException {
		return BuscaOrientacaoCon("//ORIENTACOES-CONCLUIDAS-PARA-MESTRADO", "TITULO", 1, "TIPO-DE-ORIENTACAO", 0,
				"TIPO");
	}

	public ArrayList<Orientacao> OrientacaoPosDouCon() throws XPathExpressionException {
		return BuscaOrientacaoCon("//ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO", "TITULO", 1, "TIPO-DE-ORIENTACAO", 0,
				null);
	}

	public ArrayList<Orientacao> OrientacaoPosDouAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO", "TITULO-DO-TRABALHO", 1,
				"TIPO-DE-ORIENTACAO", 0, null);
	}

	// monografia, tcc , ic
	public ArrayList<Orientacao> OutrasOrientacaoCon() throws XPathExpressionException {
		return BuscaOrientacaoCon("//OUTRAS-ORIENTACOES-CONCLUIDAS", "TITULO", 1, "TIPO-DE-ORIENTACAO-CONCLUIDA", 0,
				"TIPO");

	}

	public ArrayList<Orientacao> OrientacaoAperfEspecAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-APERFEICOAMENTO-ESPECIALIZACAO", "TITULO-DO-TRABALHO",
				0, null, 0, null);
	}

	public ArrayList<Orientacao> OrientacaoGraduacaoAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO", "TITULO-DO-TRABALHO", 0, null, 0, null);
	}

	public ArrayList<Orientacao> OrientacaoICAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA", "TITULO-DO-TRABALHO", 0, null, 0,
				null);
	}


}
