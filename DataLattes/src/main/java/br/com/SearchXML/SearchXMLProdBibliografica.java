package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.Tipo0;
import br.com.Modelo.Tipo1;
import br.com.Modelo.Tipo2;

public class SearchXMLProdBibliografica extends SearchXML {

	public SearchXMLProdBibliografica(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Tipo0> TrabalhoCompletoEvento() throws XPathExpressionException {
		return BuscaTipo0("//TRABALHO-EM-EVENTOS", "ISBN", "TITULO-DO-TRABALHO", "ANO-DO-TRABALHO", 1,
				"CLASSIFICACAO-DO-EVENTO", 1, "NOME-DO-EVENTO");
	}
	public ArrayList<Tipo0> ArtigoCompletoPublicado() throws XPathExpressionException {
		return BuscaTipo0("//ARTIGO-PUBLICADO", "ISSN", "TITULO-DO-ARTIGO", "ANO-DO-ARTIGO", 0, null, 0, null);
	}

	public ArrayList<Tipo2> LivroPublicadoOuOrganizar() throws XPathExpressionException {
		return BuscaTipo2("//LIVRO-PUBLICADO-OU-ORGANIZADO", "ISBN", "TITULO-DO-LIVRO", 0, null);
	}

	public ArrayList<Tipo1> LivroCapitulo() throws XPathExpressionException {
		return BuscaTipo1("//CAPITULO-DE-LIVRO-PUBLICADO");
	}
	public ArrayList<Tipo0> TextoJornalRevista() throws XPathExpressionException {
		return BuscaTipo0("//TEXTO-EM-JORNAL-OU-REVISTA", "ISSN", "TITULO-DO-TEXTO", "ANO-DO-TEXTO", 0, null, 0, null);
	}

	public ArrayList<Tipo2> LivroPrePosFacio() throws XPathExpressionException {
		return BuscaTipo2("//PREFACIO-POSFACIO", "ISSN-ISBN", "TITULO", 1, "TITULO-DA-PUBLICACAO");
	}
	public ArrayList<Tipo0> ArtigoCompletoAceito() throws XPathExpressionException {
		return BuscaTipo0("//ARTIGO-ACEITO-PARA-PUBLICACAO", "ISSN", "TITULO-DO-ARTIGO", "ANO-DO-ARTIGO", 0, null, 0,
				null);
	}
	
	

}
