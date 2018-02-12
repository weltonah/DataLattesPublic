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

public class OrientacaoGraduacao {
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
		listprod = searchXML.OrientacaoGraduacaoAnd();
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals(
				"Uma anÃ¡lise de algoritmos de aprendizado de mÃ¡quina para parsing de sentenÃ§as em lÃ­ngua portuguesa",
				listprod.get(0).getTitulo());
	}

	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals(2016, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroNatureza() throws XPathExpressionException {
		assertEquals("Trabalho de conclusÃ£o de curso de graduaÃ§Ã£o", listprod.get(0).getNatureza());
	}

	@Test
	public void nomeAluno() throws XPathExpressionException {
		assertEquals("Gabriel Lomba", listprod.get(0).getNome_aluno());
	}



}