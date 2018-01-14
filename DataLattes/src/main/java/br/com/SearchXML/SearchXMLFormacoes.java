package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SearchXMLFormacoes extends SearchXML {

	public SearchXMLFormacoes(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String[]> Graduacao() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//GRADUACAO");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO").getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-DO-ORIENTADOR")
					.getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getChildNodes().item(0).getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-CURSO")
					.getTextContent();
			String aux[] = { nivel, tituloTcc, ano, nome_orientador, nome_instituicao, status, nome_curso };
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<String[]> Especializacao() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//ESPECIALIZACAO");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DA-MONOGRAFIA")
					.getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-DO-ORIENTADOR")
					.getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getChildNodes().item(0).getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-CURSO")
					.getTextContent();
			String aux[] = { nivel, tituloTcc, ano, nome_orientador, nome_instituicao, status, nome_curso };
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<String[]> Mestrado() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//MESTRADO");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("TITULO-DA-DISSERTACAO-TESE").getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("NOME-COMPLETO-DO-ORIENTADOR").getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getChildNodes().item(0).getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-CURSO")
					.getTextContent();
			String aux[] = { nivel, tituloTcc, ano, nome_orientador, nome_instituicao, status, nome_curso };
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<String[]> Doutorado() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//DOUTORADO");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("TITULO-DA-DISSERTACAO-TESE").getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("NOME-COMPLETO-DO-ORIENTADOR").getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getChildNodes().item(0).getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-CURSO")
					.getTextContent();
			String aux[] = { nivel, tituloTcc, ano, nome_orientador, nome_instituicao, status, nome_curso };
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<String[]> PosDoutorado() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//POS-DOUTORADO");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO")
					.getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-CURSO-INGLES")
					.getTextContent();
			String aux[] = { nivel, tituloTcc, ano, nome_instituicao, nome_curso };
			gra.add(aux);
		}
		return gra;
	}
	public ArrayList<String[]> LivreDocencia() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//LIVRE-DOCENCIA");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-OBTENCAO-DO-TITULO")
					.getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO")
					.getTextContent();
			String aux[] = { nivel, ano, nome_instituicao, nome_curso };
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<String[]> CursoTecnico() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//CURSO-TECNICO-PROFISSIONALIZANTE");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();

			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getChildNodes().item(0).getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-CURSO")
					.getTextContent();
			String aux[] = { nivel, ano, nome_instituicao, status, nome_curso };
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<String[]> MestradoProfissional() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//MESTRADO-PROFISSIONALIZANTE");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("TITULO-DA-DISSERTACAO-TESE").getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("NOME-COMPLETO-DO-ORIENTADOR").getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getChildNodes().item(0).getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-CURSO")
					.getTextContent();
			String aux[] = { nivel, tituloTcc, ano, nome_orientador, nome_instituicao, status, nome_curso };
			gra.add(aux);
		}
		return gra;
	}

	

	public ArrayList<String[]> ResidenciaMedica() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//RESIDENCIA-MEDICA");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getChildNodes().item(0).getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("TITULO-DA-RESIDENCIA-MEDICA").getTextContent();
			String aux[] = { nivel, ano, nome_instituicao, status, nome_curso };
			gra.add(aux);
		}
		return gra;
	}

	public ArrayList<String[]> Aperfeicoamento() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//APERFEICOAMENTO");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DA-MONOGRAFIA")
					.getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("NOME-COMPLETO-DO-ORIENTADOR").getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getChildNodes().item(0).getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-CURSO")
					.getTextContent();
			String aux[] = { nivel, tituloTcc, ano, nome_orientador, nome_instituicao, status, nome_curso };
			gra.add(aux);
		}
		return gra;
	}
	public ArrayList<String[]> areaAtuacao() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//AREA-DE-ATUACAO");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nomeGrandArea = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("NOME-GRANDE-AREA-DO-CONHECIMENTO").getTextContent();
			String NomeArea = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("NOME-DA-AREA-DO-CONHECIMENTO").getTextContent();
			String NomeSubArea = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("NOME-DA-SUB-AREA-DO-CONHECIMENTO").getTextContent();
			String NomeEspecialidade = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("NOME-DA-ESPECIALIDADE").getTextContent();
			String aux[] = { nomeGrandArea, NomeArea, NomeSubArea, NomeEspecialidade };
			gra.add(aux);
		}
		return gra;
	}
	

	public ArrayList<String[]> Idioma() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//IDIOMA");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String idioma = graNode.getChildNodes().item(0).getAttributes().getNamedItem("IDIOMA").getTextContent();
			String profLeitura = graNode.getChildNodes().item(0).getAttributes().getNamedItem("PROFICIENCIA-DE-LEITURA")
					.getTextContent();
			String profFala = graNode.getChildNodes().item(0).getAttributes().getNamedItem("PROFICIENCIA-DE-FALA")
					.getTextContent();
			String profEscrita = graNode.getChildNodes().item(0).getAttributes().getNamedItem("PROFICIENCIA-DE-ESCRITA")
					.getTextContent();
			String profCompreensao = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("PROFICIENCIA-DE-COMPREENSAO").getTextContent();
			String aux[] = { idioma, profLeitura, profFala, profEscrita, profCompreensao };
			gra.add(aux);
		}
		return gra;
	}
	public ArrayList<String[]> Premio() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//PREMIO-TITULO");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String NomePrem = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-DO-PREMIO-OU-TITULO")
					.getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DA-PREMIACAO")
					.getTextContent();
			String instituicao = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("NOME-DA-ENTIDADE-PROMOTORA").getTextContent();
			String aux[] = { NomePrem, ano, instituicao };
			gra.add(aux);
		}
		return gra;
	}

	

	public ArrayList<String[]> MBA() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//MBA");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("TITULO-DA-MONOGRAFIA").getTextContent();
			String ano = graNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("NOME-COMPLETO-DO-ORIENTADOR").getTextContent();
			String nome_instituicao = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getChildNodes().item(0).getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("NOME-CURSO")
					.getTextContent();
			String aux[] = { nivel, tituloTcc, ano, nome_orientador, nome_instituicao, status, nome_curso };
			gra.add(aux);
		}
		return gra;
	}

}
