package br.com.SearchXMLTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import br.com.SearchXML.SearchXMLDadosGerais;

//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@SpringBootTest
public class SearchXMLDadosGeraisTest {

	private static Document xmlfile;
	private static SearchXMLDadosGerais searchXML;

	@BeforeClass
	public static void shouldSaveUploadedFile() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLDadosGerais(xmlfile);
	}

	@Test
	public void NomeCompleto()
			throws XPathExpressionException, IOException, ParserConfigurationException, SAXException {
		assertEquals("Jairo Francisco de Souza", searchXML.NomeCompleto());
		assertEquals("SOUZA, J. F.", searchXML.NomeCitacao());
		assertEquals("4516605108233899", searchXML.IDLattes());
		assertEquals("Possui graduação em Ciência da " + "Computação pela Universidade Federal de Juiz de "
				+ "Fora (2004), mestrado em Engenharia de Sistemas e "
				+ "Computação pela Universidade Federal do Rio de " + "Janeiro (2007) e doutorado em Informática pela "
				+ "PUC-RJ, ambos na linha de Banco de Dados. " + "É professor do Departamento de Ciência da "
				+ "Computação da Universidade Federal de Juiz de" + " Fora e participa de pesquisas sobre Recuperação "
				+ "de Informação, Resolução de Identidade e " + "Representação do Conhecimento.", searchXML.ResumoCV());
		assertEquals("18/05/2017 ", searchXML.UltimaAtualizacao());
		assertTrue(searchXML.DedicaoExclusiva());

	}
}
