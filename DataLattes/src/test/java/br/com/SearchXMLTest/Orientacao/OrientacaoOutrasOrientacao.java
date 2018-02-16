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

public class OrientacaoOutrasOrientacao {
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
		File file = new ClassPathResource("static/testFile/Jorgecurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLOrientacoes(xmlfile);
		listprod = searchXML.OutrasOrientacaoCon();
	}

	@Test
	public void primeiroTituloPublicado() throws XPathExpressionException {
		assertEquals(
				"Efetividade da Hasta Pública no Processo do Trabalho",
				listprod.get(0).getTitulo());
	}

	@Test
	public void PrimeiroAnoPublicado() throws XPathExpressionException {
		assertEquals(2000, listprod.get(0).getAno());
	}

	@Test
	public void PrimeiroNatureza() throws XPathExpressionException {
		assertEquals("MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO",
				listprod.get(0).getNatureza());
	}

	@Test
	public void TipoOrientacao0() throws XPathExpressionException {
		assertEquals("CO_ORIENTADOR", listprod.get(0).getCampAux());
	}

	@Test
	public void nomeAluno() throws XPathExpressionException {
		assertEquals("Alexandre Alliprandino Medeiros", listprod.get(0).getNome_aluno());
	}

	@Test
	public void SegundoTituloPublicado() throws XPathExpressionException {
		assertEquals("A escravidão no Brasil do século XXI", listprod.get(5).getTitulo());
	}

	@Test
	public void SegundoAnoPublicado() throws XPathExpressionException {
		assertEquals(2006, listprod.get(5).getAno());
	}

	@Test
	public void SegundoNatureza() throws XPathExpressionException {
		assertEquals("MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO",
				listprod.get(5).getNatureza());
	}

	@Test
	public void TipoOrientacao() throws XPathExpressionException {
		assertEquals("CO_ORIENTADOR", listprod.get(5).getCampAux());
	}

	@Test
	public void nomeAluno1() throws XPathExpressionException {
		assertEquals("Mauricio Miguel Abou Assali", listprod.get(5).getNome_aluno());
	}

}