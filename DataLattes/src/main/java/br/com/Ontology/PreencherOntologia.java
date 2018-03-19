package br.com.Ontology;

import java.io.File;

import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;

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
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void inserirDadosGerais() throws XPathExpressionException {
		SearchXMLDadosGerais searchXML = new SearchXMLDadosGerais(this.xmlfile);
		this.NomeCurriculo = searchXML.NomeCompleto();
		this.ontologyDAO.addIndividual(searchXML.NomeCompleto(), "Pessoa");
		this.ontologyDAO.addAtribNoIndivido(this.NomeCurriculo, searchXML.IDLattes(), "IdLattes");
		this.ontologyDAO.addAtribNoIndivido(this.NomeCurriculo, searchXML.NomeCompleto(), "NomeCompleto");
	}

}
