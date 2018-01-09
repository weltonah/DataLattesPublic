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

import br.com.Modelo.Tipo0;
import br.com.converter.SearchXML;

public class ArtigoCompletoTeste {
	private static Document xmlfile;
	private static SearchXML searchXML;
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
		searchXML = new SearchXML(xmlfile);
		listprod = searchXML.ArtigoCompletoPublicado();
	}

	@Test
	public void primeiroTitulo() throws XPathExpressionException {
		assertEquals("Improving software agent communication with structural ontology alignment methods",
				listprod.get(0).getTitulo());
	}
	@Test
	public void PrimeiroAno() throws XPathExpressionException {
		assertEquals((int)2010,
				listprod.get(0).getAno());
	}
	@Test
	public void PrimeiroISSN() throws XPathExpressionException {
		assertEquals("15541045",
				listprod.get(0).getCodigo());
	}
	@Test
	public void Primeiranatureza() throws XPathExpressionException {
		assertEquals("COMPLETO",
				listprod.get(0).getNatureza());
	}
	@Test
	public void PrimeiraPrimeiroAutornatureza() throws XPathExpressionException {
		assertEquals("Jairo Francisco de Souza",
				listprod.get(0).getAutores().get(0).getNome());
	}
	@Test
	public void PrimeiraPrimeiroAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("SOUZA, J. F.",
				listprod.get(0).getAutores().get(0).getCitacao());
	}
	@Test
	public void PrimeiraUltimoAutornatureza() throws XPathExpressionException {
		assertEquals("Sean Wolfgang Matsui Siqueira",
				listprod.get(0).getAutores().get(4).getNome());
	}
	@Test
	public void PrimeiraUltimoAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("SIQUEIRA, S. W. M.",
				listprod.get(0).getAutores().get(4).getCitacao());
	}
	@Test
	public void ultimoTitulo() throws XPathExpressionException {
		assertEquals("Management of Scientific Experiments in Computational Modeling: Challenges and Perspectives",
				listprod.get(6).getTitulo());
	}
	@Test
	public void ultimoAno() throws XPathExpressionException {
		assertEquals((int)2012,
				listprod.get(6).getAno());
	}
	@Test
	public void ultimoISSN() throws XPathExpressionException {
		assertEquals("19842902",
				listprod.get(6).getCodigo());
	}
	@Test
	public void ultimonatureza() throws XPathExpressionException {
		assertEquals("COMPLETO",
				listprod.get(6).getNatureza());
	}
	@Test
	public void ultimoPrimeiroAutornatureza() throws XPathExpressionException {
		assertEquals("Regina Maria Maciel Braga Villela",
				listprod.get(6).getAutores().get(0).getNome());
	}
	@Test
	public void ultimoPrimeiroAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("BRAGA, R. M. M.",
				listprod.get(6).getAutores().get(0).getCitacao());
	}
	@Test
	public void ultimoUltimoAutornatureza() throws XPathExpressionException {
		assertEquals("Kate Revoredo",
				listprod.get(6).getAutores().get(5).getNome());
	}
	@Test
	public void ultimoUltimoAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("REVOREDO, K.",
				listprod.get(6).getAutores().get(5).getCitacao());
	}

}
