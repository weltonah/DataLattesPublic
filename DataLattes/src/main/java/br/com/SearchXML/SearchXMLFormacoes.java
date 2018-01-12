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

	public String Premio() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Idioma() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
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
			String nome_curso = graNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DA-RESIDENCIA-MEDICA")
					.getTextContent();
			String aux[] = { nivel, ano,  nome_instituicao, status, nome_curso };
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
	public String MBA() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}
	
	public String CursoComplementarCurtaDuracao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CursoComplementarLongaDuracao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String IC() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	

	

	

	public String ConselhoComissaiConsultoria() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ChefeDepartamento() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CoordenacaoCurso() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CoordenadorPrograma() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String DecanoCentro() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String DiretorUnidade() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MembroColegiadoSuperior() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MembroComissaoPermanente() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MembroComissaoTemporaria() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MembroConselhoCentro() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MembroConselhoUnidade() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Reitor() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ViceReitor() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	// Disciplinas
	public String Ensino() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Estagio() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ExtensaoUniversitaria() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ParticipacaoProjeto() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String PesquisaDesenvolvimento() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ServicoTecnicoEspecializado() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Treinamento() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String BolsistaRecemDoutor() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Celetista() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Colaborador() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProfessorVisitante() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ServidorPublico() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String VinculoLivre() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

}
