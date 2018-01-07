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

import br.com.Modelo.Producao;
import br.com.converter.SearchXML;

public class ArtigoAceitoTeste {
	private static Document xmlfile;
	private static SearchXML searchXML;
	private static ArrayList<Producao> listprod;

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
		searchXML = new SearchXML(xmlfile);
		listprod = searchXML.ArtigoCompletoAceito();
	}

	@Test
	public void primeiroTitulo() throws XPathExpressionException {
		assertEquals("Uma abordagem para identificac&#807;a&#771;o de similaridade entre recursos educacionais utilizando bases de conhecimento externas",
				listprod.get(0).getTitulo());
	}
	@Test
	public void PrimeiroAno() throws XPathExpressionException {
		assertEquals("2017",
				listprod.get(0).getAno());
	}
	@Test
	public void PrimeiroISSN() throws XPathExpressionException {
		assertEquals("14145685",
				listprod.get(0).getIssn());
	}
	@Test
	public void Primeiranatureza() throws XPathExpressionException {
		assertEquals("NAO_INFORMADO",
				listprod.get(0).getNatureza());
	}
	@Test
	public void PrimeiraPrimeiroAutornatureza() throws XPathExpressionException {
		assertEquals("Laura Lima Dias",
				listprod.get(0).getAutores().get(0)[0]);
	}
	@Test
	public void PrimeiraPrimeiroAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("DIAS, L. L.",
				listprod.get(0).getAutores().get(0)[1]);
	}
	@Test
	public void PrimeiraUltimoAutornatureza() throws XPathExpressionException {
		assertEquals("Jairo Francisco de Souza",
				listprod.get(0).getAutores().get(3)[0]);
	}
	@Test
	public void PrimeiraUltimoAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("SOUZA, J. F.",
				listprod.get(0).getAutores().get(3)[1]);
	}
}