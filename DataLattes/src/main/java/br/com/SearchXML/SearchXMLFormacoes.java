package br.com.SearchXML;

import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

public class SearchXMLFormacoes extends SearchXML{

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
	public String Doutorado() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Mestrado() throws XPathExpressionException {
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

	public String EnsinoFundamental() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String EnsinoMedio() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Graduacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String IC() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String LivreDocencia() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Aperfeicoamento() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Especializacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MBA() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String PosDoutorado() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ResidenciaMedica() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CursoTecnico() throws XPathExpressionException {
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
