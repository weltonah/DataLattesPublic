package br.com.SearchXMLTest;

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

import br.com.Modelo.Tipo1;
import br.com.converter.SearchXML;

public class LivroCap {
	private static Document xmlfile;
	private static SearchXML searchXML;
	private static ArrayList<Tipo1> listprod;

	// @Autowired
	// private MockMvc mvc;
	//
	// @MockBean
	// private StorageService storageService;

	@BeforeClass
	public static void shouldSaveUploadedFile() throws Exception {
		File file = new ClassPathResource("static/testFile/Jorgecurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXML(xmlfile);
		listprod = searchXML.LivroCapitulo();
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals("Direito do trabalho rural: estudos em homenagem a Irany Ferrari.", listprod.get(0).getTitulo());
	}
	@Test
	public void primeiroTituloLivro() throws XPathExpressionException {
		assertEquals("Fundamentos da proteção ao trabalhador rural.", listprod.get(0).getCampAux());
	}

	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 1998, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroISSNPublicado() throws XPathExpressionException {
		assertEquals("", listprod.get(0).getCodigo());
	}

	@Test
	public void PrimeiraPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("Jorge Luiz Souto Maior", listprod.get(0).getAutores().get(0).getNome());
	}

	@Test
	public void ultimoTituloPublicado() throws XPathExpressionException {
		assertEquals("Curso de direito do trabalho", listprod.get(22).getTitulo());
	}
	@Test
	public void ultimoTituloLivro() throws XPathExpressionException {
		assertEquals("Breves considerações sobre a história do direito do trabalho no Brasil", listprod.get(22).getCampAux());
	}
	@Test
	public void ultimoAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2007, listprod.get(22).getAno());
	}

	@Test
	public void ultimoISSNPublicado() throws XPathExpressionException {
		assertEquals("", listprod.get(22).getCodigo());
	}

	@Test
	public void ultimoPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("Jorge Luiz Souto Maior", listprod.get(22).getAutores().get(0).getNome());
	}

	@Test
	public void ultimoPrimeiroAutorcitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("SOUTO MAIOR, Jorge Luiz", listprod.get(22).getAutores().get(0).getCitacao());
	}

}