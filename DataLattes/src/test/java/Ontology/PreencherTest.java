package Ontology;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

import br.com.DAO.OntologyDAO;
import br.com.SearchXML.SearchXMLDadosGerais;

public class PreencherTest {

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
			throws 
			OWLOntologyCreationException, XPathExpressionException, OWLOntologyStorageException, FileNotFoundException {
		OntologyDAO ontologyDAO = new OntologyDAO();
		ontologyDAO.addIndividual(searchXML.NomeCompleto());
		ontologyDAO.imprimir();
		ontologyDAO.saveOntologyDAO();
		assertEquals("Jairo Francisco de Souza", searchXML.NomeCompleto());

	}
}
