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
import br.com.SearchXML.SearchXML;
import br.com.SearchXML.SearchXMLProdBibliografica;

public class TrabalhoEventoTeste {
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
		listprod = searchXML.TrabalhoCompletoEvento();
	}

	@Test
	public void primeiroTitulo() throws XPathExpressionException {
		assertEquals("Peer-to-Peer Collaborative Integration of Dynamic Ontologies",
				listprod.get(0).getTitulo());
	}
	
	@Test
	public void PrimeiroAno() throws XPathExpressionException {
		assertEquals((int) 2005, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroISSN() throws XPathExpressionException {
		assertEquals("1846000025", listprod.get(0).getCodigo());
	}

	@Test
	public void Primeiranatureza() throws XPathExpressionException {
		assertEquals("COMPLETO", listprod.get(0).getNatureza());
	}
	@Test
	public void PrimeiraClassificacao() throws XPathExpressionException {
		assertEquals("INTERNACIONAL", listprod.get(0).getCampAux());
	}
	@Test
	public void PrimeiraNomeEvento() throws XPathExpressionException {
		assertEquals("9th International Conference on Computer Supported Cooperative Work in Design", listprod.get(0).getCampAux2());
	}

	@Test
	public void PrimeiraPrimeiroAutornatureza() throws XPathExpressionException {
		assertEquals("Juliana Lucas Rezende", listprod.get(0).getAutores().get(0).getNome());
	}

	@Test
	public void PrimeiraPrimeiroAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("REZENDE, J. L.", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void PrimeiraUltimoAutornatureza() throws XPathExpressionException {
		assertEquals("Jano Moreira Souza", listprod.get(0).getAutores().get(3).getNome());
	}

	@Test
	public void PrimeiraUltimoAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("SOUZA, J. M.", listprod.get(0).getAutores().get(3).getCitacao());
	}

	@Test
	public void ultimoTitulo() throws XPathExpressionException {
		assertEquals("Criação de um Repositório de Dados Ligados para Filtragem de Hoax",
				listprod.get(22).getTitulo());
	}

	@Test
	public void ultimoAno() throws XPathExpressionException {
		assertEquals((int) 2012, listprod.get(22).getAno());
	}

	@Test
	public void ultimoISSN() throws XPathExpressionException {
		assertEquals("", listprod.get(22).getCodigo());
	}

	@Test
	public void ultimonatureza() throws XPathExpressionException {
		assertEquals("COMPLETO", listprod.get(22).getNatureza());
	}
	@Test
	public void ultimoClassificacao() throws XPathExpressionException {
		assertEquals("REGIONAL", listprod.get(22).getCampAux());
	}
	@Test
	public void ultimoNomeEvento() throws XPathExpressionException {
		assertEquals("Simpósio Mineiro de Computação", listprod.get(22).getCampAux2());
	}

	@Test
	public void ultimoPrimeiroAutornatureza() throws XPathExpressionException {
		assertEquals("Adriano Rodrigues Delvoux", listprod.get(22).getAutores().get(0).getNome());
	}

	@Test
	public void ultimoPrimeiroAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("DELVOUX, A. R.", listprod.get(22).getAutores().get(0).getCitacao());
	}

	@Test
	public void ultimoUltimoAutornatureza() throws XPathExpressionException {
		assertEquals("Jairo Francisco de Souza", listprod.get(22).getAutores().get(1).getNome());
	}

	@Test
	public void ultimoUltimoAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("SOUZA, J. F.", listprod.get(22).getAutores().get(1).getCitacao());
	}

}
