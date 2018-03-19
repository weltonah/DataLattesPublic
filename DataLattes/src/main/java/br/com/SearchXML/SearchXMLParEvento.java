package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.ObjetoCriterio;

public class SearchXMLParEvento extends SearchXML {

	public SearchXMLParEvento(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}


	public ArrayList<ObjetoCriterio> ParticipacaoCongresso() throws XPathExpressionException {
		return BuscaEvento("//PARTICIPACAO-EM-CONGRESSO");
	}

	public ArrayList<ObjetoCriterio> ParticipacaoFeira() throws XPathExpressionException {
		return BuscaEvento("//PARTICIPACAO-EM-FEIRA");
	}

	public ArrayList<ObjetoCriterio> ParticipacaoSeminario() throws XPathExpressionException {
		return BuscaEvento("//PARTICIPACAO-EM-SEMINARIO");
	}

	public ArrayList<ObjetoCriterio> ParticipacaoSimposio() throws XPathExpressionException {
		return BuscaEvento("//PARTICIPACAO-EM-SIMPOSIO");
	}

	public ArrayList<ObjetoCriterio> ParticipacaoOficina() throws XPathExpressionException {
		return BuscaEvento("//PARTICIPACAO-EM-OFICINA");
	}

	public ArrayList<ObjetoCriterio> ParticipacaoEncontro() throws XPathExpressionException {
		return BuscaEvento("//PARTICIPACAO-EM-ENCONTRO");
	}

	public ArrayList<ObjetoCriterio> ParticipacaoExposicao() throws XPathExpressionException {
		return BuscaEvento("//PARTICIPACAO-EM-EXPOSICAO");
	}

	public ArrayList<ObjetoCriterio> ParticipacaoOlimpiada() throws XPathExpressionException {
		return BuscaEvento("//PARTICIPACAO-EM-OLIMPIADA");
	}

}
