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

import br.com.Modelo.Tipo6;
import br.com.SearchXML.SearchXMLProdTecnica;

public class TrabalhoTecnicoTeste {
	private static Document xmlfile;
	private static SearchXMLProdTecnica searchXML;
	private static ArrayList<Tipo6> listprod;

	// @Autowired
	// private MockMvc mvc;
	//
	// @MockBean
	// private StorageService storageService;

	@BeforeClass
	public static void shouldSaveUploadedFile() throws Exception {
		File file = new ClassPathResource("static/testFile/Luiscurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdTecnica(xmlfile);
		listprod = searchXML.TrabalhoTecnico();
	}

	@Test
	public void imprimir() throws XPathExpressionException {
		this.listprod.forEach(n -> n.imprimirTipo6());
		assertEquals("exemplo", "exemplo");
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals("Parecer para a Revista da Sociedade Brasileira de História da Ciência",
				listprod.get(0).getTitulo());
	}

	@Test
	public void primeiroNatureza() throws XPathExpressionException {
		assertEquals("PARECER", listprod.get(0).getNatureza());
	}

	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2004, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiraPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("Luís Miguel Nunes Carolino", listprod.get(0).getAutores().get(0).getNome());
	}
	@Test
	public void PrimeiraPrimeiroCitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("CAROLINO, L. M. N.", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void ultimoTituloPublicado() throws XPathExpressionException {
		assertEquals("Parecer para a Revista da Sociedade Brasileira de História da Ciência",
				listprod.get(6).getTitulo());
	}

	@Test
	public void ultimoNatureza() throws XPathExpressionException {
		assertEquals("PARECER", listprod.get(6).getNatureza());
	}

	@Test
	public void ultimoAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2007, listprod.get(6).getAno());
	}

	@Test
	public void PrimeiraultimoAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("Luís Miguel Nunes Carolino", listprod.get(6).getAutores().get(0).getNome());
	}
	@Test
	public void PrimeiraultimoCitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("CAROLINO, L. M. N.", listprod.get(6).getAutores().get(0).getCitacao());
	}

}