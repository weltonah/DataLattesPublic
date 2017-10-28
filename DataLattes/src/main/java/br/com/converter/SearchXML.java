package br.com.converter;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

import br.com.DAO.OntologyDAO;

public class SearchXML {

	private OntologyDAO ontology;
	XPath xpath;
	
	public SearchXML() {
		XPathFactory xPathfactory = XPathFactory.newInstance();
		this.xpath =  xPathfactory.newXPath();
		this.ontology = new OntologyDAO();
	}
	
	
	//Nome
	//IDLattes
	//Nacionalidade
	//Sexo
	public void Pessoa(Document document) throws XPathExpressionException {
		XPathExpression expr = xpath.compile("//EXEMPLO");
	}
	//@cidade
	//@estado
	//@Pais
	//--EnderecoProfissional
	//codigoInstituicao
	//--EnderecoResidencial
	public void Endereco(Document document) throws XPathExpressionException {
		XPathExpression expr = xpath.compile("//EXEMPLO");
	}
	
	//AnoFormacao
	//Codigoinstituicao
	//Nomeinstituicao
	//idLattes (orientador)
	//TituloCurso
	//Titulo Trabalhofinal
	public void Formacao(Document document) throws XPathExpressionException {
		XPathExpression expr = xpath.compile("//EXEMPLO");
	}
	
	
}
