package br.com.DAO;

import java.io.File;
import java.io.IOException;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.springframework.core.io.ClassPathResource;

public class ReadFile {
	private OWLOntology ontology;
	
	public ReadFile() {
		 OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
		 try {
			File file = new ClassPathResource("static/OWL/datalattes.owl").getFile();
			ontology = manager.loadOntologyFromOntologyDocument(file);
		} catch (IOException | OWLOntologyCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public OWLOntology getOntologyDataLattes() {
		return ontology;
	}
}
