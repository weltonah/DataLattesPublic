package br.com.SearchXMLTest.bibliografica;

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

import br.com.Modelo.Tipo0;
import br.com.SearchXML.SearchXMLProdBibliografica;

public class ArtigoAceitoTeste {
	private static Document xmlfile;
	private static SearchXMLProdBibliografica searchXML;
	private static ArrayList<Tipo0> listprod;

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
		searchXML = new SearchXMLProdBibliografica(xmlfile);
		listprod = searchXML.ArtigoCompletoAceito();
	}
	
	@Test
	public void primeiroTitulo() throws XPathExpressionException {
		assertEquals(
				"Uma abordagem para identificac&#807;a&#771;o de similaridade entre recursos educacionais utilizando bases de conhecimento externas",
				listprod.get(0).getTitulo());
	}

	@Test
	public void PrimeiroAno() throws XPathExpressionException {
		assertEquals((int) 2017, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroISSN() throws XPathExpressionException {
		assertEquals("14145685", listprod.get(0).getCodigo());
	}

	@Test
	public void Primeiranatureza() throws XPathExpressionException {
		assertEquals("NAO_INFORMADO", listprod.get(0).getNatureza());
	}

	@Test
	public void PrimeiraPrimeiroAutornatureza() throws XPathExpressionException {
		assertEquals("Laura Lima Dias", listprod.get(0).getAutores().get(0).getNome());
	}

	@Test
	public void PrimeiraPrimeiroAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("DIAS, L. L.", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void PrimeiraUltimoAutornatureza() throws XPathExpressionException {
		assertEquals("Jairo Francisco de Souza", listprod.get(0).getAutores().get(3).getNome());
	}

	@Test
	public void PrimeiraUltimoAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("SOUZA, J. F.", listprod.get(0).getAutores().get(3).getCitacao());
	}
}