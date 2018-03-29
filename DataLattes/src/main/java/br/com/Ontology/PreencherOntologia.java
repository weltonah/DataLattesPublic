package br.com.Ontology;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.xpath.XPathExpressionException;

import org.semanticweb.owlapi.model.OWLOntologyStorageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

import br.com.Ontology.modelo.OntoPessoa;
import br.com.SearchXML.SearchXMLDadosGerais;
import br.com.converter.ConverterFile;

@Service
public class PreencherOntologia {
	@Autowired
	OntologyDAO ontologyDAO;
	String NomeCurriculo;
	Document xmlfile;

	public void inserirFile(File xmlfile) {
		this.xmlfile = ConverterFile.ConverterFileToDocument(xmlfile);
		try {
			inserirDadosGerais();
		} catch (XPathExpressionException | OWLOntologyStorageException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void inserirDadosGerais()
			throws XPathExpressionException, OWLOntologyStorageException, FileNotFoundException {
		SearchXMLDadosGerais searchXML = new SearchXMLDadosGerais(this.xmlfile);
		OntoPessoa pessoa = new OntoPessoa(searchXML.NomeCompleto().replaceAll(" ", "_"),
				searchXML.IDLattes(), searchXML.UltimaAtualizacao());
		PreencherXMLtoOnto preencherXMLtoOnto = new PreencherXMLtoOnto(this.xmlfile);
		preencherXMLtoOnto.buscarXML(pessoa);
		// System.out.println(pessoa.toString());
		this.ontologyDAO.preencherOnto(pessoa);


		// this.ontologyDAO.addIndividual("WWW", "Pessoa");
		// this.ontologyDAO.addAtribNoIndivido(this.NomeCurriculo, searchXML.IDLattes(),
		// "IdLattes");
		// this.ontologyDAO.addAtribNoIndivido(this.NomeCurriculo,
		// searchXML.NomeCompleto(), "NomeCompleto");
		// this.ontologyDAO.imprimir();
		// this.ontologyDAO.saveOntologyDAO();
	}

	public void imprimir() {
		this.ontologyDAO.imprimir();
	}

}
