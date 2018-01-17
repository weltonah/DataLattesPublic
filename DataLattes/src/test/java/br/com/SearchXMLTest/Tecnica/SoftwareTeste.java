package br.com.SearchXMLTest.Tecnica;

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

import br.com.Modelo.Tipo4;
import br.com.SearchXML.SearchXMLProdTecnica;

public class SoftwareTeste {
	private static Document xmlfile;
	private static SearchXMLProdTecnica searchXML;
	private static ArrayList<Tipo4> listprod;

	// @Autowired
	// private MockMvc mvc;
	//
	// @MockBean
	// private StorageService storageService;

	@BeforeClass
	public static void shouldSaveUploadedFile() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdTecnica(xmlfile);
		listprod = searchXML.Software();
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals("GNoSIS: Algoritmo para cálculo de similaridade semântica entre conceitos de ontologias", listprod.get(0).getTitulo());
	}
	
	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2006, listprod.get(0).getAno());
	}
	@Test
	public void PrimeiroNatureza() throws XPathExpressionException {
		assertEquals("COMPUTACIONAL", listprod.get(0).getNatureza());
	}

	@Test
	public void PrimeiraPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("Jairo Francisco de Souza", listprod.get(0).getAutores().get(0).getNome());
	}
	@Test
	public void PromeiroPrimeiroAutorcitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("SOUZA, J. F.", listprod.get(0).getAutores().get(0).getCitacao());
	}
	
}