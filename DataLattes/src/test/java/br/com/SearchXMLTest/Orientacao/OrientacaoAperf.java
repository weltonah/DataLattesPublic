package br.com.SearchXMLTest.Orientacao;

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

import br.com.Modelo.Orientacao;
import br.com.SearchXML.SearchXMLOrientacoes;

public class OrientacaoAperf {
	private static Document xmlfile;
	private static SearchXMLOrientacoes searchXML;
	private static ArrayList<Orientacao> listprod;

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
		searchXML = new SearchXMLOrientacoes(xmlfile);
		listprod = searchXML.OrientacaoAperfEspecAnd();
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals(
				"titulo de oritentacao ape e esp em anamento",
				listprod.get(0).getTitulo());
	}

	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals(2015, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroNatureza() throws XPathExpressionException {
		assertEquals("", listprod.get(0).getNatureza());
	}

	@Test
	public void nomeAluno() throws XPathExpressionException {
		assertEquals("nome orientador", listprod.get(0).getNome_aluno());
	}



}