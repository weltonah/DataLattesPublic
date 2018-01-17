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

public class AreaAtuacaoTeste5 {
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
		listprod = searchXML.areaAtuacao();
	}

	@Test
	public void GrandeArea() throws XPathExpressionException {
		assertEquals("CIENCIAS_EXATAS_E_DA_TERRA", listprod.get(0)[0]);
	}
	@Test
	public void nomearea() throws XPathExpressionException {
		assertEquals("Ciência da Computação", listprod.get(0)[1]);
	}
	@Test
	public void subarea() throws XPathExpressionException {
		assertEquals("Sistemas de Computação", listprod.get(0)[2]);
	}
	@Test
	public void escialidade() throws XPathExpressionException {
		assertEquals("Banco de Dados", listprod.get(0)[3]);
	}
	@Test
	public void SegGrandeArea() throws XPathExpressionException {
		assertEquals("CIENCIAS_EXATAS_E_DA_TERRA", listprod.get(1)[0]);
	}
	@Test
	public void Segnomearea() throws XPathExpressionException {
		assertEquals("Ciência da Computação", listprod.get(1)[1]);
	}
	@Test
	public void Segsubarea() throws XPathExpressionException {
		assertEquals("Representação do Conhecimento", listprod.get(1)[2]);
	}
	@Test
	public void Segescialidade() throws XPathExpressionException {
		assertEquals("", listprod.get(1)[3]);
	}
}