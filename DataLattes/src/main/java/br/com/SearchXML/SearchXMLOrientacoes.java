package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.ObjetoCriterio;

public class SearchXMLOrientacoes extends SearchXML {

	public SearchXMLOrientacoes(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<ObjetoCriterio> OrientacaoDouAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO", "TITULO-DO-TRABALHO", 1,
				"TIPO-DE-ORIENTACAO", 0, null);
	}

	public ArrayList<ObjetoCriterio> OrientacaoDouCon() throws XPathExpressionException {
		return BuscaOrientacaoCon("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO", "TITULO", 1, "TIPO-DE-ORIENTACAO", 0,
				null);
	}

	public ArrayList<ObjetoCriterio> OrientacaoMesAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO", "TITULO-DO-TRABALHO", 1,
				"TIPO-DE-ORIENTACAO", 0, "TIPO");
	}

	public ArrayList<ObjetoCriterio> OrientacaoMesCon() throws XPathExpressionException {
		return BuscaOrientacaoCon("//ORIENTACOES-CONCLUIDAS-PARA-MESTRADO", "TITULO", 1, "TIPO-DE-ORIENTACAO", 0,
				"TIPO");
	}

	public ArrayList<ObjetoCriterio> OrientacaoPosDouCon() throws XPathExpressionException {
		return BuscaOrientacaoCon("//ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO", "TITULO", 1, "TIPO-DE-ORIENTACAO", 0,
				null);
	}

	public ArrayList<ObjetoCriterio> OrientacaoPosDouAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-POS-DOUTORADO", "TITULO-DO-TRABALHO", 1,
				"TIPO-DE-ORIENTACAO", 0, null);
	}

	// monografia, tcc , ic
	public ArrayList<ObjetoCriterio> OutrasOrientacaoCon() throws XPathExpressionException {
		return BuscaOrientacaoCon("//OUTRAS-ORIENTACOES-CONCLUIDAS", "TITULO", 1, "TIPO-DE-ORIENTACAO-CONCLUIDA", 0,
				"TIPO");

	}

	public ArrayList<ObjetoCriterio> OrientacaoAperfEspecAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-APERFEICOAMENTO-ESPECIALIZACAO", "TITULO-DO-TRABALHO",
				0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> OrientacaoGraduacaoAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-GRADUACAO", "TITULO-DO-TRABALHO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> OrientacaoICAnd() throws XPathExpressionException {
		return BuscaOrientacaoAnd("//ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA", "TITULO-DO-TRABALHO", 0, null, 0,
				null);
	}


}
