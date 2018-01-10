package br.com.SearchXMLTest;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

import br.com.Modelo.Tipo2;
import br.com.converter.SearchXML;

public class LivroPrePosFacTeste {
	private static Document xmlfile;
	private static SearchXML searchXML;
	private static ArrayList<Tipo2> listprod;

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
		listprod = searchXML.LivroPrePosFacio();
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals("A efetividade da hasta pública no processo do trabalho.", listprod.get(0).getTitulo());
	}
	
	@Test
	public void primeiroTituloPublicacao() throws XPathExpressionException {
		assertEquals("A efetividade da hasta pública no processo do trabalho", listprod.get(0).getCampAux());
	}

	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2003, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroISSNPublicado() throws XPathExpressionException {
		assertEquals("", listprod.get(0).getCodigo());
	}
	@Test
	public void PrimeiranaturezaPublicado() throws XPathExpressionException {
		assertEquals("LIVRO", listprod.get(0).getNatureza());
	}

	@Test
	public void PrimeiraTipoPublicado() throws XPathExpressionException {
		assertEquals("PREFACIO", listprod.get(0).getTipo());
	}

	@Test
	public void PrimeiraPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("Jorge Luiz Souto Maior", listprod.get(0).getAutores().get(0).getNome());
	}
	@Test
	public void PrimeiraPrimeiroCitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("SOUTO MAIOR, Jorge Luiz", listprod.get(0).getAutores().get(0).getCitacao());
	}

	
	
	@Test
	public void segundoTituloPublicado() throws XPathExpressionException {
		assertEquals("Terror psicológico no trabalho.", listprod.get(1).getTitulo());
	}
	@Test
	public void segundoTituloLivro() throws XPathExpressionException {
		assertEquals("Terror psicológico no trabalho", listprod.get(1).getCampAux());
	}
	@Test
	public void segundoAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2003, listprod.get(1).getAno());
	}

	@Test
	public void segundoISSNPublicado() throws XPathExpressionException {
		assertEquals("", listprod.get(1).getCodigo());
	}
	@Test
	public void segundonaturezaPublicado() throws XPathExpressionException {
		assertEquals("LIVRO", listprod.get(1).getNatureza());
	}

	@Test
	public void segundoTipoPublicado() throws XPathExpressionException {
		assertEquals("APRESENTACAO", listprod.get(1).getTipo());
	}


	@Test
	public void segundoPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("Jorge Luiz Souto Maior", listprod.get(1).getAutores().get(0).getNome());
	}

	@Test
	public void segundoPrimeiroAutorcitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("SOUTO MAIOR, Jorge Luiz", listprod.get(1).getAutores().get(0).getCitacao());
	}

}