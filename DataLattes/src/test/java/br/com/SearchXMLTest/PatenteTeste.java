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

import br.com.Modelo.Tipo3;
import br.com.SearchXML.SearchXMLProdTecnica;

public class PatenteTeste {
	private static Document xmlfile;
	private static SearchXMLProdTecnica searchXML;
	private static ArrayList<Tipo3> listprod;

	// @Autowired
	// private MockMvc mvc;
	//
	// @MockBean
	// private StorageService storageService;

	@BeforeClass
	public static void shouldSaveUploadedFile() throws Exception {
		File file = new ClassPathResource("static/testFile/Johncurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdTecnica(xmlfile);
		listprod = searchXML.Patente();
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals("Pedido de Patente F2", listprod.get(0).getTitulo());
	}
	
	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2011, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroCodigoPublicado() throws XPathExpressionException {
		assertEquals("61490937", listprod.get(0).getRegPatente().getCodigoPatente());
	}
	@Test
	public void PrimeiroTipoPatentePublicado() throws XPathExpressionException {
		assertEquals("PATENTE_NO_EXTERIOR_PE", listprod.get(0).getRegPatente().getTipoPatente());
	}
	@Test
	public void PrimeiroDataConPublicado() throws XPathExpressionException {
		assertEquals("", listprod.get(0).getRegPatente().getDataConcessao());
	}
	@Test
	public void PrimeiroNomePublicado() throws XPathExpressionException {
		assertEquals("", listprod.get(0).getRegPatente().getNomeTitular());
	}

	@Test
	public void PrimeiraPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("John Katz", listprod.get(0).getAutores().get(0).getNome());
	}
	@Test
	public void PromeiroPrimeiroAutorcitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("KATZ, J.", listprod.get(0).getAutores().get(0).getCitacao());
	}
	@Test
	public void ultimoTituloPublicado() throws XPathExpressionException {
		assertEquals("Pedido de Patente F1", listprod.get(1).getTitulo());
	}
	@Test
	public void ultimoAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2010, listprod.get(1).getAno());
	}

	@Test
	public void ultimoCodigoPublicado() throws XPathExpressionException {
		assertEquals("61362341", listprod.get(1).getRegPatente().getCodigoPatente());
	}
	@Test
	public void ultimoTipoPatentePublicado() throws XPathExpressionException {
		assertEquals("PATENTE_NO_EXTERIOR_PE", listprod.get(1).getRegPatente().getTipoPatente());
	}
	@Test
	public void ultimoDataConPublicado() throws XPathExpressionException {
		assertEquals("", listprod.get(1).getRegPatente().getDataConcessao());
	}
	@Test
	public void ultimoNomePublicado() throws XPathExpressionException {
		assertEquals("", listprod.get(1).getRegPatente().getNomeTitular());
	}

	@Test
	public void ultimoPrimeiroAutornaturezaPublicado() throws XPathExpressionException {
		assertEquals("John Katz", listprod.get(1).getAutores().get(0).getNome());
	}

	@Test
	public void ultimoPrimeiroAutorcitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("KATZ, J.", listprod.get(1).getAutores().get(0).getCitacao());
	}

}