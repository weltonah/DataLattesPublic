package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.Tipo6;

public class SearchXMLProdArtistica extends SearchXML {

	public SearchXMLProdArtistica(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}
	//feito
	public ArrayList<Tipo6> Partitura() throws XPathExpressionException {
		return BuscaTipo6("//PARTITURA-MUSICAL", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<Tipo6> ApresentacaoObraArtistica() throws XPathExpressionException {
		return BuscaTipo6("//APRESENTACAO-DE-OBRA-ARTISTICA", "TITULO", 1, "TIPO-DE-EVENTO", 1,
				"ATIVIDADE-DOS-AUTORES");
	}
	//feito
	public ArrayList<Tipo6> ApresentacaoRadioTV() throws XPathExpressionException {
		return BuscaTipo6("//APRESENTACAO-EM-RADIO-OU-TV", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<Tipo6> ArranjoMusical() throws XPathExpressionException {
		return BuscaTipo6("//ARRANJO-MUSICAL", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<Tipo6> ComposicaoMusical() throws XPathExpressionException {
		return BuscaTipo6("//COMPOSICAO-MUSICAL", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<Tipo6> ObraArtesVisuais() throws XPathExpressionException {
		return BuscaTipo6("//OBRA-DE-ARTES-VISUAIS","TITULO", 1, "TIPO-DE-EVENTO",0,null);
	}
	//feito
	public ArrayList<Tipo6> Sonoplastia() throws XPathExpressionException {
		return BuscaTipo6("//SONOPLASTIA", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<Tipo6> ArtesCenicas() throws XPathExpressionException {
		return BuscaTipo6("//ARTES-CENICAS","TITULO", 1, "TIPO-DE-EVENTO",0,null);
	}
	//feito
	public ArrayList<Tipo6> ArtesVizuais() throws XPathExpressionException {
		return BuscaTipo6("//ARTES-VISUAIS", "TITULO", 0, null, 0, null);
	}

	public ArrayList<Tipo6> Musica() throws XPathExpressionException {
		return BuscaTipo6("//MUSICA", "TITULO", 1, "TIPO-DE-EVENTO",0,null);
	}

}
