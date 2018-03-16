package br.com.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.formats.FunctionalSyntaxDocumentFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassAssertionAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

public class OntologyDAO {

	private ReadFile read;
	private File file;
	private OWLOntologyManager manager;
	private OWLOntology ontology;
	private IRI DATALATTESIRI = IRI.create("http://www.datalattes.com/ontologies/datalattes.owl");

	public OntologyDAO() throws OWLOntologyCreationException {
		this.manager = OWLManager.createOWLOntologyManager();
		this.file = this.read.PegarFile();
		this.ontology = this.manager.loadOntologyFromOntologyDocument(this.file);
	}

	public void saveOntologyDAO() throws OWLOntologyStorageException, FileNotFoundException {
		this.manager.saveOntology(this.ontology, new FunctionalSyntaxDocumentFormat(),
				new FileOutputStream(this.file));
	}

	public void imprimir() {
		// this.ontology.classesInSignature().forEach(cls->System.out.println(cls.getIRI().getFragment()));
		//this.ontology.logicalAxioms().forEach(System.out::println);
		this.ontology.signature().forEach(System.out::println);
		// this.ontology.signature().filter(u−>!u.isBuiltIn()&&u.getIRI().getRemainder().orElse("")).forEach(System.out::println);
	}

	public void imprimirIndividuos() {
		OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
		
		for (OWLClass cls : this.ontology.getClassesInSignature()) {
			if (cls.getIRI().getFragment().equals("Pessoa")) {
				OWLReasoner reasoner = reasonerFactory.createReasoner(this.ontology);
				NodeSet<OWLNamedIndividual> instances = reasoner.getInstances(cls, true);
				
				for (OWLNamedIndividual i : instances.getFlattened()) {
					System.out.println(i.getIRI().getFragment());
				}
			}
		}
	}

	public void addIndividual(String string) {
		OWLDataFactory factory = this.manager.getOWLDataFactory();
		OWLIndividual nome = factory.getOWLNamedIndividual(this.DATALATTESIRI + "#", string);
		OWLClass personClass = factory.getOWLClass(this.DATALATTESIRI + "#", "Pessoa");
		OWLClassAssertionAxiom da = factory.getOWLClassAssertionAxiom(personClass, nome);
		this.ontology.add(da);
	}
	public void addAxiom() {
		OWLDataFactory factory = this.manager.getOWLDataFactory();
		
	}
	
	

}
