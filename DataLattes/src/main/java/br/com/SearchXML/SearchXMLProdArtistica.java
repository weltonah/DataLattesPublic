package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.ObjetoCriterio;

public class SearchXMLProdArtistica extends SearchXML {

	public SearchXMLProdArtistica(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}
	//feito
	public ArrayList<ObjetoCriterio> Partitura() throws XPathExpressionException {
		return BuscaTipo6("//PARTITURA-MUSICAL", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> ApresentacaoObraArtistica() throws XPathExpressionException {
		return BuscaTipo6("//APRESENTACAO-DE-OBRA-ARTISTICA", "TITULO", 1, "TIPO-DE-EVENTO", 1,
				"ATIVIDADE-DOS-AUTORES");
	}
	//feito
	public ArrayList<ObjetoCriterio> ApresentacaoRadioTV() throws XPathExpressionException {
		return BuscaTipo6("//APRESENTACAO-EM-RADIO-OU-TV", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> ArranjoMusical() throws XPathExpressionException {
		return BuscaTipo6("//ARRANJO-MUSICAL", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> ComposicaoMusical() throws XPathExpressionException {
		return BuscaTipo6("//COMPOSICAO-MUSICAL", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> ObraArtesVisuais() throws XPathExpressionException {
		return BuscaTipo6("//OBRA-DE-ARTES-VISUAIS","TITULO", 1, "TIPO-DE-EVENTO",0,null);
	}
	//feito
	public ArrayList<ObjetoCriterio> Sonoplastia() throws XPathExpressionException {
		return BuscaTipo6("//SONOPLASTIA", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> ArtesCenicas() throws XPathExpressionException {
		return BuscaTipo6("//ARTES-CENICAS","TITULO", 1, "TIPO-DE-EVENTO",0,null);
	}
	//feito
	public ArrayList<ObjetoCriterio> ArtesVizuais() throws XPathExpressionException {
		return BuscaTipo6("//ARTES-VISUAIS", "TITULO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> Musica() throws XPathExpressionException {
		return BuscaTipo6("//MUSICA", "TITULO", 1, "TIPO-DE-EVENTO",0,null);
	}

}
