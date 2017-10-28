package br.com.DAO;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.reasoner.NodeSet;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

public class OntologyDAO {

	private ReadFile read;

	private OWLOntology ontology;

	public OntologyDAO() {
		read = new ReadFile();
		ontology = read.getOntologyDataLattes();
	}

	public void imprimir() {
		ontology.classesInSignature().forEach(cls->System.out.println(cls.getIRI().getFragment()));
	}

	public void imprimirIndividuos() {
		OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();
		
		for (OWLClass cls : ontology.getClassesInSignature()) {
			if (cls.getIRI().getFragment().equals("Pessoa")) {
				System.out.println("My class is : " + cls.getIRI().getShortForm());
				System.out.println("The IRI of my class is : " + cls);
				System.out.println("-----------------------");
				OWLReasoner reasoner = reasonerFactory.createReasoner(ontology);
				NodeSet<OWLNamedIndividual> instances = reasoner.getInstances(cls, true);
				System.out.println("The Individuals of my class : ");

				for (OWLNamedIndividual i : instances.getFlattened()) {
					System.out.println(i.getIRI().getFragment());
				}

			}
		}
	}
	
	

}
