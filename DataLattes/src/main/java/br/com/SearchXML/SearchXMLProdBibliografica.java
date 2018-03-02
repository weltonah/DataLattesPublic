package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.ObjetoCriterio;

public class SearchXMLProdBibliografica extends SearchXML {

	public SearchXMLProdBibliografica(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<ObjetoCriterio> TrabalhoCompletoEvento() throws XPathExpressionException {
		return BuscaTipo0("//TRABALHO-EM-EVENTOS", "ISBN", "TITULO-DO-TRABALHO", "ANO-DO-TRABALHO", 1,
				"CLASSIFICACAO-DO-EVENTO", 1, "NOME-DO-EVENTO");
	}

	public ArrayList<ObjetoCriterio> ArtigoCompletoPublicado() throws XPathExpressionException {
		return BuscaTipo0("//ARTIGO-PUBLICADO", "ISSN", "TITULO-DO-ARTIGO", "ANO-DO-ARTIGO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> LivroPublicadoOuOrganizar() throws XPathExpressionException {
		return BuscaTipo2("//LIVRO-PUBLICADO-OU-ORGANIZADO", "ISBN", "TITULO-DO-LIVRO", 0, null);
	}

	public ArrayList<ObjetoCriterio> LivroCapitulo() throws XPathExpressionException {
		return BuscaTipo1("//CAPITULO-DE-LIVRO-PUBLICADO");
	}

	public ArrayList<ObjetoCriterio> TextoJornalRevista() throws XPathExpressionException {
		return BuscaTipo0("//TEXTO-EM-JORNAL-OU-REVISTA", "ISSN", "TITULO-DO-TEXTO", "ANO-DO-TEXTO", 0, null, 0, null);
	}

	public ArrayList<ObjetoCriterio> LivroPrePosFacio() throws XPathExpressionException {
		return BuscaTipo2("//PREFACIO-POSFACIO", "ISSN-ISBN", "TITULO", 1, "TITULO-DA-PUBLICACAO");
	}

	public ArrayList<ObjetoCriterio> ArtigoCompletoAceito() throws XPathExpressionException {
		return BuscaTipo0("//ARTIGO-ACEITO-PARA-PUBLICACAO", "ISSN", "TITULO-DO-ARTIGO", "ANO-DO-ARTIGO", 0, null, 0,
				null);
	}
	
	

}
