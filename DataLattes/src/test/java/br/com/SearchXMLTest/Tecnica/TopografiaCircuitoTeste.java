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

import br.com.Modelo.Tipo3;
import br.com.SearchXML.SearchXMLProdTecnica;

public class TopografiaCircuitoTeste {
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
		File file = new ClassPathResource("static/testFile/padrao.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdTecnica(xmlfile);
		listprod = searchXML.TopogradiaDeCircuitoIntegrado();
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals("Teste Topografia", listprod.get(0).getTitulo());
	}
	
	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals((int) 2017, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroCodigoPublicado() throws XPathExpressionException {
		assertEquals("888555", listprod.get(0).getRegPatente().getCodigoPatente());
	}
	@Test
	public void PrimeiroTipoPatentePublicado() throws XPathExpressionException {
		assertEquals("PRIVILEGIO_DE_INOVACAO_PI", listprod.get(0).getRegPatente().getTipoPatente());
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
		assertEquals("Nome Completo", listprod.get(0).getAutores().get(0).getNome());
	}
	@Test
	public void PromeiroPrimeiroAutorcitacaonaturezaPublicado() throws XPathExpressionException {
		assertEquals("citacao", listprod.get(0).getAutores().get(0).getCitacao());
	}
	
}