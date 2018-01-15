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

public class PosDoutoradoTeste4 {
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
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLFormacoes(xmlfile);
		listprod = searchXML.PosDoutorado();
	}

	@Test
	public void nivel() throws XPathExpressionException {
		assertEquals("3", listprod.get(0)[0]);
	}

	@Test
	public void tituloTcc() throws XPathExpressionException {
		assertEquals("titulo trabalho pos doutorado", listprod.get(0)[1]);
	}

	@Test
	public void ano() throws XPathExpressionException {
		assertEquals("2009", listprod.get(0)[2]);
	}

	@Test
	public void nome_instituicao() throws XPathExpressionException {
		assertEquals("Nome instituicao pos doutorado", listprod.get(0)[3]);
	}
	@Test
	public void status() throws XPathExpressionException {
		assertEquals("CONCLUIDO", listprod.get(0)[4]);
	}

	@Test
	public void nome_curso() throws XPathExpressionException {
		assertEquals("nome curso posdoutorado", listprod.get(0)[5]);
	}

}