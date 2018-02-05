package br.com.SearchXMLTest.ProdArtistica;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

import br.com.Modelo.Tipo6;
import br.com.SearchXML.SearchXMLProdArtistica;

public class ComposicaoMusicalTeste {
	private static Document xmlfile;
	private static SearchXMLProdArtistica searchXML;
	private static ArrayList<Tipo6> listprod;

	// @Autowired
	// private MockMvc mvc;
	//
	// @MockBean
	// private StorageService storageService;

	@BeforeClass
	public static void shouldSaveUploadedFile() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdArtistica(xmlfile);
		listprod = searchXML.ComposicaoMusical();
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals(
				"titulo composicao",
				listprod.get(0).getTitulo());
	}
	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2012, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroNatureza() throws XPathExpressionException {
		assertEquals("CANTO", listprod.get(0).getNatureza());
	}

	@Test
	public void PrimeiraPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("nome composicao", listprod.get(0).getAutores().get(0).getNome());
	}

	@Test
	public void PromeiroPrimeiroAutorcitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("n composicao", listprod.get(0).getAutores().get(0).getCitacao());
	}

}