package br.com.SearchXMLTest.formacao;

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

import br.com.Modelo.Formacao;
import br.com.SearchXML.SearchXMLFormacoes;

public class GraduacaoTeste {
	private static Document xmlfile;
	private static SearchXMLFormacoes searchXML;
	private static ArrayList<Formacao> listprod;

	// @Autowired
	// private MockMvc mvc;
	//
	// @MockBean
	// private StorageService storageService;

	@BeforeClass
	public static void shouldSaveUploadedFile() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLFormacoes(xmlfile);
		listprod = searchXML.Graduacao();
	}

	
	@Test
	public void tituloTcc() throws XPathExpressionException {
		assertEquals("Um Aporte de Web Mining para a Web Semântica", listprod.get(0).getTituloTrabalho());
	}

	@Test
	public void ano() throws XPathExpressionException {
		assertEquals(2004, listprod.get(0).getAno());
	}
	@Test
	public void nome_orientador() throws XPathExpressionException {
		assertEquals("Tarcísio de Souza Lima", listprod.get(0).getNomeOrientador());
	}
	@Test
	public void nome_instituicao() throws XPathExpressionException {
		assertEquals("Universidade Federal de Juiz de Fora", listprod.get(0).getNomeInstituicao());
	}
	@Test
	public void status() throws XPathExpressionException {
		assertEquals("CONCLUIDO", listprod.get(0).getStatus());
	}

	@Test
	public void nome_curso() throws XPathExpressionException {
		assertEquals("Informática", listprod.get(0).getTitulo());
	}
	
}