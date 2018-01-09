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

import br.com.Modelo.Tipo2;
import br.com.converter.SearchXML;

public class LivroPublicadoOuOrganizadoTeste {
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
		listprod = searchXML.LivroPublicadoOuOrganizar();
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals("Petição Inicial: no processo civil e no processo do trabalho.", listprod.get(0).getTitulo());
	}

	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 1996, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroISSNPublicado() throws XPathExpressionException {
		assertEquals("", listprod.get(0).getCodigo());
	}

	@Test
	public void PrimeiranaturezaPublicado() throws XPathExpressionException {
		assertEquals("TEXTO_INTEGRAL", listprod.get(0).getNatureza());
	}

	@Test
	public void PrimeiraTipoPublicado() throws XPathExpressionException {
		assertEquals("LIVRO_PUBLICADO", listprod.get(0).getTipo());
	}

	@Test
	public void PrimeiraPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("Jorge Luiz Souto Maior", listprod.get(0).getAutores().get(0).getNome());
	}

	@Test
	public void PrimeiraPrimeiroAutorcitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("SOUTO MAIOR, Jorge Luiz", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void ultimoTituloPublicado() throws XPathExpressionException {
		assertEquals("Dumping social nas relações de trabalho", listprod.get(4).getTitulo());
	}

	@Test
	public void ultimoAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2014, listprod.get(4).getAno());
	}

	@Test
	public void ultimoISSNPublicado() throws XPathExpressionException {
		assertEquals("9788536128092", listprod.get(4).getCodigo());
	}

	@Test
	public void ultimonaturezaPublicado() throws XPathExpressionException {
		assertEquals("TEXTO_INTEGRAL", listprod.get(4).getNatureza());
	}

	@Test
	public void ultimoTipoPublicado() throws XPathExpressionException {
		assertEquals("LIVRO_PUBLICADO", listprod.get(4).getTipo());
	}

	@Test
	public void ultimoPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("Jorge Luiz Souto Maior", listprod.get(4).getAutores().get(0).getNome());
	}

	@Test
	public void ultimoPrimeiroAutorcitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("SOUTO MAIOR, Jorge Luiz", listprod.get(4).getAutores().get(0).getCitacao());
	}

	@Test
	public void ultimoUltimoAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("Valdete Souto Severo", listprod.get(4).getAutores().get(2).getNome());
	}

	@Test
	public void ultimoUltimoAutorcitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("SEVERO, Valdete Souto", listprod.get(4).getAutores().get(2).getCitacao());
	}

	@Test
	public void ultimoTituloOrganizado() throws XPathExpressionException {
		assertEquals("Trabalhos marginais", listprod.get(5).getTitulo());
	}

	@Test
	public void ultimoAnoOrganizado() throws XPathExpressionException {
		assertEquals((int) 2014, listprod.get(5).getAno());
	}

	@Test
	public void ultimoISSNOrganizado() throws XPathExpressionException {
		assertEquals("9788536127415", listprod.get(5).getCodigo());
	}

	@Test
	public void ultimonaturezaOrganizado() throws XPathExpressionException {
		assertEquals("COLETANEA", listprod.get(5).getNatureza());
	}

	@Test
	public void ultimoTipoOrganizado() throws XPathExpressionException {
		assertEquals("LIVRO_ORGANIZADO_OU_EDICAO", listprod.get(5).getTipo());
	}

	@Test
	public void ultimoPrimeiroAutornaturezaOrganizado() throws XPathExpressionException {
		assertEquals("Jorge Luiz Souto Maior", listprod.get(5).getAutores().get(0).getNome());
	}

	@Test
	public void ultimoPrimeiroAutorcitacaonaturezaOrganizado() throws XPathExpressionException {
		assertEquals("SOUTO MAIOR, Jorge Luiz", listprod.get(5).getAutores().get(0).getCitacao());
	}

	@Test
	public void ultimoUltimoAutornaturezaOrganizado() throws XPathExpressionException {
		assertEquals("Noa Piatã Bassfeld Gnata", listprod.get(5).getAutores().get(1).getNome());
	}

	@Test
	public void ultimoUltimoAutorcitacaonaturezaOrganizado() throws XPathExpressionException {
		assertEquals("GNATA, Noa Piatã Bassfeld", listprod.get(5).getAutores().get(1).getCitacao());
	}

}
