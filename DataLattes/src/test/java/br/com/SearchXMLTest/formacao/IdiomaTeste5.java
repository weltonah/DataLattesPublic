package br.com.SearchXMLTest.formacao;

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

import br.com.SearchXML.SearchXMLFormacoes;

public class IdiomaTeste5 {
	private static Document xmlfile;
	private static SearchXMLFormacoes searchXML;
	private static ArrayList<String[]> listprod;

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
		searchXML = new SearchXMLFormacoes(xmlfile);
		listprod = searchXML.Idioma();
	}

	@Test
	public void DescricaoIdioma() throws XPathExpressionException {
		assertEquals("Inglês", listprod.get(0)[0]);
	}


	@Test
	public void leitura() throws XPathExpressionException {
		assertEquals("BEM", listprod.get(0)[1]);
	}


	@Test
	public void fala() throws XPathExpressionException {
		assertEquals("BEM", listprod.get(0)[2]);
	}

	@Test
	public void escrita() throws XPathExpressionException {
		assertEquals("BEM", listprod.get(0)[3]);
	}

	@Test
	public void compreencao() throws XPathExpressionException {
		assertEquals("BEM", listprod.get(0)[4]);
	}
	@Test
	public void segDescricaoIdioma() throws XPathExpressionException {
		assertEquals("Espanhol", listprod.get(1)[0]);
	}
	
	
	@Test
	public void segleitura() throws XPathExpressionException {
		assertEquals("RAZOAVELMENTE", listprod.get(1)[1]);
	}
	
	
	@Test
	public void segfala() throws XPathExpressionException {
		assertEquals("POUCO", listprod.get(1)[2]);
	}
	
	@Test
	public void segescrita() throws XPathExpressionException {
		assertEquals("POUCO", listprod.get(1)[3]);
	}
	
	@Test
	public void segcompreencao() throws XPathExpressionException {
		assertEquals("RAZOAVELMENTE", listprod.get(1)[4]);
	}

}