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
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getAttributes()
					.getNamedItem("TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO").getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getAttributes().getNamedItem("NOME-DO-ORIENTADOR")
					.getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getAttributes().getNamedItem("NOME-CURSO")
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
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getAttributes().getNamedItem("TITULO-DA-MONOGRAFIA")
					.getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getAttributes().getNamedItem("NOME-DO-ORIENTADOR")
					.getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getAttributes().getNamedItem("NOME-CURSO")
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
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getAttributes()
					.getNamedItem("TITULO-DA-DISSERTACAO-TESE").getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getAttributes()
					.getNamedItem("NOME-COMPLETO-DO-ORIENTADOR").getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getAttributes().getNamedItem("NOME-CURSO")
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
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getAttributes()
					.getNamedItem("TITULO-DA-DISSERTACAO-TESE").getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getAttributes()
					.getNamedItem("NOME-COMPLETO-DO-ORIENTADOR").getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getAttributes().getNamedItem("NOME-CURSO")
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
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getAttributes().getNamedItem("TITULO-DO-TRABALHO")
					.getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getAttributes().getNamedItem("NOME-CURSO-INGLES")
					.getTextContent();
			String aux[] = { nivel, tituloTcc, ano, nome_instituicao,status, nome_curso };
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
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DE-OBTENCAO-DO-TITULO")
					.getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String nome_curso = graNode.getAttributes().getNamedItem("TITULO-DO-TRABALHO")
					.getTextContent(); 
			String aux[] = { nivel, ano, nome_instituicao, nome_curso };
			gra.add(aux);
		}
		return gra;
	}
	//testado
	public ArrayList<String[]> CursoTecnico() throws XPathExpressionException {
		ArrayList<String[]> gra = new ArrayList<String[]>();
		XPathExpression expr = xpath.compile("//CURSO-TECNICO-PROFISSIONALIZANTE");
		NodeList graNodeList = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		for (int i = 0; i < graNodeList.getLength(); i++) {
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();

			String ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getAttributes().getNamedItem("NOME-CURSO")
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
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getAttributes()
					.getNamedItem("TITULO-DA-DISSERTACAO-TESE").getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getAttributes()
					.getNamedItem("NOME-COMPLETO-DO-ORIENTADOR").getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getAttributes().getNamedItem("NOME-CURSO")
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
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getAttributes()
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
			System.out.println(graNode.getAttributes().getNamedItem("NIVEL").getTextContent().toString());
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getAttributes().getNamedItem("TITULO-DA-MONOGRAFIA")
					.getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getAttributes()
					.getNamedItem("NOME-DO-ORIENTADOR").getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getAttributes().getNamedItem("NOME-CURSO")
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
			String nomeGrandArea = graNode.getAttributes()
					.getNamedItem("NOME-GRANDE-AREA-DO-CONHECIMENTO").getTextContent();
			String NomeArea = graNode.getAttributes()
					.getNamedItem("NOME-DA-AREA-DO-CONHECIMENTO").getTextContent();
			String NomeSubArea = graNode.getAttributes()
					.getNamedItem("NOME-DA-SUB-AREA-DO-CONHECIMENTO").getTextContent();
			String NomeEspecialidade = graNode.getAttributes()
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
			String idioma = graNode.getAttributes().getNamedItem("DESCRICAO-DO-IDIOMA").getTextContent();
			String profLeitura = graNode.getAttributes().getNamedItem("PROFICIENCIA-DE-LEITURA")
					.getTextContent();
			String profFala = graNode.getAttributes().getNamedItem("PROFICIENCIA-DE-FALA")
					.getTextContent();
			String profEscrita = graNode.getAttributes().getNamedItem("PROFICIENCIA-DE-ESCRITA")
					.getTextContent();
			String profCompreensao = graNode.getAttributes()
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
			String NomePrem = graNode.getAttributes().getNamedItem("NOME-DO-PREMIO-OU-TITULO")
					.getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DA-PREMIACAO")
					.getTextContent();
			String instituicao = graNode.getAttributes()
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
			System.out.println(graNodeList.getLength());
			Node graNode = graNodeList.item(i);
			String nivel = graNode.getAttributes().getNamedItem("NIVEL").getTextContent();
			String tituloTcc = graNode.getAttributes()
					.getNamedItem("TITULO-DA-MONOGRAFIA").getTextContent();
			String ano = graNode.getAttributes().getNamedItem("ANO-DE-CONCLUSAO")
					.getTextContent();
			String nome_orientador = graNode.getAttributes()
					.getNamedItem("NOME-COMPLETO-DO-ORIENTADOR").getTextContent();
			String nome_instituicao = graNode.getAttributes().getNamedItem("NOME-INSTITUICAO")
					.getTextContent();
			String status = graNode.getAttributes().getNamedItem("STATUS-DO-CURSO")
					.getTextContent();
			String nome_curso = graNode.getAttributes().getNamedItem("NOME-CURSO")
					.getTextContent();
			String aux[] = { nivel, tituloTcc, ano, nome_orientador, nome_instituicao, status, nome_curso };
			gra.add(aux);
		}
		return gra;
	}

}
