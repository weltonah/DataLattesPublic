package Ontology;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

import br.com.Ontology.OntologyDAO;
import br.com.SearchXML.SearchXMLDadosGerais;


public class PreencherTest {

	private static Document xmlfile;
	private static SearchXMLDadosGerais searchXML;

	OntologyDAO ontologyDAO;

	@BeforeClass
	public static void shouldSaveUploadedFile() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLDadosGerais(xmlfile);
		System.out.println("tt");
	}

	@Before
	public void before() throws OWLOntologyCreationException {
		this.ontologyDAO = new OntologyDAO();
		System.out.println("be");
	}

	@After
	public void after() throws OWLOntologyStorageException, FileNotFoundException {
		this.ontologyDAO.saveOntologyDAO();
		System.out.println("af");
	}

	@Test
	public void NomeCompleto()
			throws 
			OWLOntologyCreationException, XPathExpressionException, OWLOntologyStorageException, FileNotFoundException {
		this.ontologyDAO.addIndividual(searchXML.IDLattes(), "Pessoa");
		this.ontologyDAO.addAtribNoIndivido(searchXML.IDLattes(), searchXML.NomeCompleto(), "NomeCompleto");
		String nome = "artigoteste";
		this.ontologyDAO.addIndividual(nome, "ArtigoPublicado");
		this.ontologyDAO.addRelacaoInd(searchXML.IDLattes(), nome);
		// this.ontologyDAO.imprimir();
		// this.ontologyDAO.saveOntologyDAO();
		assertEquals("Jairo Francisco de Souza", searchXML.NomeCompleto());

	}

}
