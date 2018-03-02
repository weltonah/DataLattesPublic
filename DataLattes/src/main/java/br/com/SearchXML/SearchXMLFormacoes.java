package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.Modelo.Formacao;
import br.com.Modelo.ObjetoCriterio;

public class SearchXMLFormacoes extends SearchXML {

	public SearchXMLFormacoes(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<ObjetoCriterio> Graduacao() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//GRADUACAO");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String tituloTrabalho = graNode.getAttributes().getNamedItem("TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO")
					.getTextContent();
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent().contentEquals("") ? -1
					: Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent());
			String nomeOrientador = graNode.getAttributes().getNamedItem("NOME-DO-ORIENTADOR").getTextContent();
			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("NOME-CURSO").getTextContent();
			Formacao aux = new Formacao(ano, tituloTrabalho, nomeOrientador, nomeInstituicao, status, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> Especializacao() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//ESPECIALIZACAO");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String tituloTrabalho = graNode.getAttributes().getNamedItem("TITULO-DA-MONOGRAFIA").getTextContent();
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent().contentEquals("") ? -1
					: Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent());
			String nomeOrientador = graNode.getAttributes().getNamedItem("NOME-DO-ORIENTADOR").getTextContent();
			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("NOME-CURSO").getTextContent();
			Formacao aux = new Formacao(ano, tituloTrabalho, nomeOrientador, nomeInstituicao, status, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> Mestrado() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//MESTRADO");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String tituloTrabalho = graNode.getAttributes().getNamedItem("TITULO-DA-DISSERTACAO-TESE").getTextContent();
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent().contentEquals("") ? -1
					: Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent());
			String nomeOrientador = graNode.getAttributes().getNamedItem("NOME-COMPLETO-DO-ORIENTADOR")
					.getTextContent();
			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("NOME-CURSO").getTextContent();
			Formacao aux = new Formacao(ano, tituloTrabalho, nomeOrientador, nomeInstituicao, status, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> Doutorado() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//DOUTORADO");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String tituloTrabalho = graNode.getAttributes().getNamedItem("TITULO-DA-DISSERTACAO-TESE").getTextContent();
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent().contentEquals("") ? -1
					: Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent());
			String nomeOrientador = graNode.getAttributes().getNamedItem("NOME-COMPLETO-DO-ORIENTADOR")
					.getTextContent();
			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("NOME-CURSO").getTextContent();
			Formacao aux = new Formacao(ano, tituloTrabalho, nomeOrientador, nomeInstituicao, status, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> PosDoutorado() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//POS-DOUTORADO");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String tituloTrabalho = graNode.getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent().contentEquals("") ? -1
					:
					Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent());
			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("NOME-CURSO-INGLES").getTextContent();
			Formacao aux = new Formacao(ano, tituloTrabalho, null, nomeInstituicao, status, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> LivreDocencia() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//LIVRE-DOCENCIA");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-OBTENCAO-DO-TITULO").getTextContent()
					.contentEquals("") ? -1
							: Integer.valueOf(
									graNode.getAttributes().getNamedItem("ANO-DE-OBTENCAO-DO-TITULO").getTextContent());

			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
			Formacao aux = new Formacao(ano, null, null, nomeInstituicao, null, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	// testado
	public ArrayList<ObjetoCriterio> CursoTecnico() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//CURSO-TECNICO-PROFISSIONALIZANTE");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent().contentEquals("") ? -1
					: Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent());
			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("NOME-CURSO").getTextContent();
			Formacao aux = new Formacao(ano, null, null, nomeInstituicao, status, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> MestradoProfissional() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//MESTRADO-PROFISSIONALIZANTE");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String tituloTrabalho = graNode.getAttributes().getNamedItem("TITULO-DA-DISSERTACAO-TESE").getTextContent();
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent().contentEquals("") ? -1
					: Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent());
			String nomeOrientador = graNode.getAttributes().getNamedItem("NOME-COMPLETO-DO-ORIENTADOR")
					.getTextContent();
			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("NOME-CURSO").getTextContent();
			Formacao aux = new Formacao(ano, tituloTrabalho, nomeOrientador, nomeInstituicao, status, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> ResidenciaMedica() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//RESIDENCIA-MEDICA");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent().contentEquals("") ? -1
					: Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent());
			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("TITULO-DA-RESIDENCIA-MEDICA").getTextContent();
			Formacao aux = new Formacao(ano, null, null, nomeInstituicao, status, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> Aperfeicoamento() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//APERFEICOAMENTO");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String tituloTrabalho = graNode.getAttributes().getNamedItem("TITULO-DA-MONOGRAFIA").getTextContent();
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent().contentEquals("") ? -1
					: Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent());
			String nomeOrientador = graNode.getAttributes().getNamedItem("NOME-DO-ORIENTADOR").getTextContent();
			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("NOME-CURSO").getTextContent();
			Formacao aux = new Formacao(ano, tituloTrabalho, nomeOrientador, nomeInstituicao, status, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> MBA() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//MBA");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String tituloTrabalho = graNode.getAttributes().getNamedItem("TITULO-DA-MONOGRAFIA").getTextContent();
			int ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent().contentEquals("") ? -1
					: Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO").getTextContent());
			String nomeOrientador = graNode.getAttributes().getNamedItem("NOME-COMPLETO-DO-ORIENTADOR")
					.getTextContent();
			String nomeInstituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO").getTextContent();
			String nomeCurso = graNode.getAttributes().getNamedItem("NOME-CURSO").getTextContent();
			Formacao aux = new Formacao(ano, tituloTrabalho, nomeOrientador, nomeInstituicao, status, nomeCurso);
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> areaAtuacao() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//AREA-DE-ATUACAO");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nomeGrandArea = graNode.getAttributes().getNamedItem("NOME-GRANDE-AREA-DO-CONHECIMENTO")
					.getTextContent();
			String NomeArea = graNode.getAttributes().getNamedItem("NOME-DA-AREA-DO-CONHECIMENTO").getTextContent();
			String NomeSubArea = graNode.getAttributes().getNamedItem("NOME-DA-SUB-AREA-DO-CONHECIMENTO")
					.getTextContent();
			String NomeEspecialidade = graNode.getAttributes().getNamedItem("NOME-DA-ESPECIALIDADE").getTextContent();
			// Formacao aux = new Formacao(ano, tituloTrabalho, nomeOrientador,
			// nomeInstituicao, status, nomeCurso);
			// gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> Idioma() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//IDIOMA");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String idioma = graNode.getAttributes().getNamedItem("DESCRICAO-DO-IDIOMA").getTextContent();
			String profLeitura = graNode.getAttributes().getNamedItem("PROFICIENCIA-DE-LEITURA").getTextContent();
			String profFala = graNode.getAttributes().getNamedItem("PROFICIENCIA-DE-FALA").getTextContent();
			String profEscrita = graNode.getAttributes().getNamedItem("PROFICIENCIA-DE-ESCRITA").getTextContent();
			String profCompreensao = graNode.getAttributes().getNamedItem("PROFICIENCIA-DE-COMPREENSAO")
					.getTextContent();
			// Formacao aux = new Formacao(ano, tituloTrabalho, nomeOrientador,
			// nomeInstituicao, status, nomeCurso);
			// gra.add(aux);
		}
		return gra;
	}

	public ArrayList<ObjetoCriterio> Premio() throws XPathExpressionException {
		ArrayList<ObjetoCriterio> gra = new ArrayList<ObjetoCriterio>();
		XPathExpression expr = this.xpath.compile("//PREMIO-TITULO");
		NodeList graNodeList = (NodeList) expr.evaluate(this.xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String NomePrem = graNode.getAttributes().getNamedItem("NOME-DO-PREMIO-OU-TITULO").getTextContent();
			int ano = Integer.valueOf(graNode.getAttributes().getNamedItem("ANO-DA-PREMIACAO").getTextContent());
			String instituicao = graNode.getAttributes().getNamedItem("NOME-DA-ENTIDADE-PROMOTORA").getTextContent();
			// Formacao aux = new Formacao(ano, tituloTrabalho, nomeOrientador,
			// nomeInstituicao, status, nomeCurso);
			// gra.add(aux);
		}
		return gra;
	}

}
