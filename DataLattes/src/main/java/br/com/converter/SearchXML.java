package br.com.converter;

import java.util.ArrayList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.DAO.OntologyDAO;
import br.com.Modelo.Autores;
import br.com.Modelo.Tipo0;
import br.com.Modelo.Tipo1;
import br.com.Modelo.Tipo2;

public class SearchXML {

	private OntologyDAO ontology;
	XPath xpath;
	private Document xmlfile;

	public SearchXML(Document xmlfile) {
		XPathFactory xPathfactory = XPathFactory.newInstance();
		this.xpath = xPathfactory.newXPath();
		this.ontology = new OntologyDAO();
		this.xmlfile = xmlfile;
	}

	public String NomeCompleto() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String NomeCitacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-EM-CITACOES-BIBLIOGRAFICAS)");
		return expr.evaluate(xmlfile);
	}

	public String IDLattes() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/CURRICULO-VITAE[1]/@NUMERO-IDENTIFICADOR)");
		return expr.evaluate(xmlfile);
	}

	public String ResumoCV() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS/RESUMO-CV[1]/@TEXTO-RESUMO-CV-RH)");
		return expr.evaluate(xmlfile);
	}

	public String UltimaAtualizacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/CURRICULO-VITAE[1]/@DATA-ATUALIZACAO)");
		return expr.evaluate(xmlfile);
	}

	public boolean DedicaoExclusiva() throws XPathExpressionException {
		XPathExpression expr = xpath
				.compile("//ATUACAO-PROFISSIONAL/VINCULOS[@FLAG-DEDICACAO-EXCLUSIVA='SIM' and  @ANO-FIM='']");
		NodeList dedicacao = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		if (dedicacao.getLength() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Tipo0> BuscaTipo0(String raiz) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList artigos = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo0> ListArtigoCompleto = new ArrayList<Tipo0>();
		for (int i = 0; i < artigos.getLength(); i++) {
			Node artigoNode = artigos.item(i);
			String titulo = artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-ARTIGO")
					.getTextContent();
			String natureza = artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			String codigo = artigoNode.getChildNodes().item(1).getAttributes().getNamedItem("ISSN").getTextContent();
			int ano = Integer.valueOf(
					artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DO-ARTIGO").getTextContent());
			Tipo0 prod = new Tipo0(titulo, ano, natureza, codigo);
			NodeList listAutores = artigoNode.getChildNodes();
			for (int j = 0; j < listAutores.getLength(); j++) {
				Node autoresNode = listAutores.item(j);
				if (autoresNode.getNodeName().contentEquals("AUTORES")) {
					String aux0 = autoresNode.getAttributes().getNamedItem("NOME-COMPLETO-DO-AUTOR").getTextContent();
					String aux1 = autoresNode.getAttributes().getNamedItem("NOME-PARA-CITACAO").getTextContent();
					Autores aut = new Autores(aux0, aux1);
					prod.AddAutores(aut);
				}
			}
			ListArtigoCompleto.add(prod);
		}
		return ListArtigoCompleto;
	}

	public ArrayList<Tipo0> ArtigoCompletoPublicado() throws XPathExpressionException {
		return BuscaTipo0("//ARTIGO-PUBLICADO");
	}

	public ArrayList<Tipo0> ArtigoCompletoAceito() throws XPathExpressionException {
		return BuscaTipo0("//ARTIGO-ACEITO-PARA-PUBLICACAO");
	}

	public ArrayList<Tipo2> LivroPublicadoOuOrganizar() throws XPathExpressionException {
		return BuscaTipo2("//LIVRO-PUBLICADO-OU-ORGANIZADO");
	}

	public ArrayList<Tipo2> BuscaTipo2(String raiz) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList livros = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo2> ListArtigoCompleto = new ArrayList<Tipo2>();
		for (int i = 0; i < livros.getLength(); i++) {
			Node livroNode = livros.item(i);
			String titulo = livroNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-LIVRO")
					.getTextContent();
			String natureza = livroNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			String tipo = livroNode.getChildNodes().item(0).getAttributes().getNamedItem("TIPO").getTextContent();
			String codigo = livroNode.getChildNodes().item(1).getAttributes().getNamedItem("ISBN").getTextContent();
			int ano = Integer
					.valueOf(livroNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
			Tipo2 prod = new Tipo2(titulo, ano, natureza, tipo, codigo);
			NodeList listAutores = livroNode.getChildNodes();
			for (int j = 0; j < listAutores.getLength(); j++) {
				Node autoresNode = listAutores.item(j);
				if (autoresNode.getNodeName().contentEquals("AUTORES")) {
					String aux0 = autoresNode.getAttributes().getNamedItem("NOME-COMPLETO-DO-AUTOR").getTextContent();
					String aux1 = autoresNode.getAttributes().getNamedItem("NOME-PARA-CITACAO").getTextContent();
					Autores aut = new Autores(aux0, aux1);
					prod.AddAutores(aut);
				}
			}
			ListArtigoCompleto.add(prod);
		}
		return ListArtigoCompleto;
	}

	public ArrayList<Tipo1> LivroCapitulo() throws XPathExpressionException {
		return BuscaTipo1("//CAPITULO-DE-LIVRO-PUBLICADO");
	}

	public ArrayList<Tipo1> BuscaTipo1(String raiz) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList livros = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo1> ListArtigoCompleto = new ArrayList<Tipo1>();
		for (int i = 0; i < livros.getLength(); i++) {
			Node livroNode = livros.item(i);
			String titulo = livroNode.getChildNodes().item(1).getAttributes().getNamedItem("TITULO-DO-LIVRO")
					.getTextContent();
			String tituloCap = livroNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("TITULO-DO-CAPITULO-DO-LIVRO").getTextContent();
			String codigo = livroNode.getChildNodes().item(1).getAttributes().getNamedItem("ISBN").getTextContent();
			int ano = Integer
					.valueOf(livroNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
			Tipo1 prod = new Tipo1(titulo, ano, codigo);
			prod.setCampAux(tituloCap);
			NodeList listAutores = livroNode.getChildNodes();
			for (int j = 0; j < listAutores.getLength(); j++) {
				Node autoresNode = listAutores.item(j);
				if (autoresNode.getNodeName().contentEquals("AUTORES")) {
					String aux0 = autoresNode.getAttributes().getNamedItem("NOME-COMPLETO-DO-AUTOR").getTextContent();
					String aux1 = autoresNode.getAttributes().getNamedItem("NOME-PARA-CITACAO").getTextContent();
					Autores aut = new Autores(aux0, aux1);
					prod.AddAutores(aut);
				}
			}
			prod.imprimirTipo1();
			ListArtigoCompleto.add(prod);
		}
		return ListArtigoCompleto;
	}

	public String LivroApresentacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String LivroIntroducao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String LivroPosFacio() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String LivroPrefacio() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TrabalhoCompletoEventoNacInte() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TrabalhoCompletoEventoNacional() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TrabalhoCompletoEventoInternacional() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Patente() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String PatenteNacional() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String PatenteInternacional() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String BancaMestrado() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String BancaMestradoInterna() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String BancaMestradoExterna() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String BancaDoutorado() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String BancaDoutoradoInterna() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String BancaDoutoradoExterna() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String BancaQualificacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String BancaQualificacaoInterna() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String BancaQualificacaoExterna() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrientacaoDouAnd() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrientacaoDouCon() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrientacaoDouAndCon() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CoorientacaoDouAnd() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CoorientacaoDouCon() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CoorientacaoDouAndCon() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrientacaoMesAnd() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrientacaoMesCon() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrientacaoMesAndCon() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CoorientacaoMesAnd() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CoorientacaoMesCon() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CoorientacaoMesAndCon() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrientacaoTCCCon() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrientacaoIC() throws XPathExpressionException {
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

	public String OrientacaoExtensao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProducaoArtColetivaNacional() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProducaoArtColetivaInternacional() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProducaoArtIndividualNacional() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProducaoArtIndividualInternacional() throws XPathExpressionException {
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

	public String EnderecoProfissional() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String EnderecoResidencial() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TrabalhoTecnicoAssesoria() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TrabalhoTecnicoConsultoria() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TrabalhoTecnicoElaboracaoProjeto() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TrabalhoTecnicoParecer() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TrabalhoTecnicoRelatorioTecnico() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TopogradiaDeCircuitoIntegrado() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String SoftwareComputacional() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String SoftwareMultimidia() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String RelatorioPesquisa() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProgramaRadioTVComentario() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProgramaRadioTVEntrevista() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProgramaRadioTVMesaRedonda() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TrabalhoTecnicoPrograma() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProdutoTecnologicoPiloto() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProdutoTecnologicoProjeto() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProdutoTecnologicoPrototipo() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProcessoTecnicoAnalitica() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProcessoTecnicoInstrumental() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProcessoTecnicoPedagogica() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProcessoTecnicoProcessual() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ProcessoTecnicoTerapeutica() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrganizacaoEventosCuradoria() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrganizacaoEventosMontagem() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrganizacaoEventosMuseologia() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String OrganizacaoEventosOrganizacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MidiaSocialBlog() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MidiaSocialForum() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MidiaSocialRedeSocial() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MaterialDidatico() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Marca() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Maquete() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String EditoracaoAnais() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String EditoracaoCatalogo() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String EditoracaoColetanea() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String EditoracaoEnciclopedia() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String EditoracaoLivro() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String EditoracaoPeriodico() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String DesenhoTecnico() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CursoMinistradoCurtaDuracao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CursoMinistradoLongaDuracao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CultivacapProtegida() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CultivacapRegistrada() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CartaMapaAerofotografia() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CartaMapaCarta() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CartaMapaCFotografia() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CartaMapaMapa() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ApresentacaoTrabalho() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Traducao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TextoMidiasJornal() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String TextoMidiasRevista() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ApresentacaoObraArtisticaCoreografia() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ApresentacaoObraArtisticaLiteraria() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ApresentacaoObraArtisticaMusical() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ApresentacaoObraArtisticaTeatral() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ApresentacaoRadioTVDanca() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ApresentacaoRadioTVMusica() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ApresentacaoRadioTVTeatro() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArranjoMusical() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesCenicasAudiovisual() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesCenicasCircense() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesCenicasCoreografia() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesCenicasDiversas() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesCenicasOperistica() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesCenicasPerfomatica() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesCenicasRadialistica() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesCenicasTeatral() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesVizuaisCinema() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesVizuaisDesenho() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesVizuaisEscultura() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesVizuaisFotografia() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesVizuaisGravura() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesVizuaisInstalacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesVizuaisPintura() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesVizuaisTelevisao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ArtesVizuaisVideo() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ComposicaoMusical() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CursoCurtaDuracaoAperfeicoamento() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CursoCurtaDuracaoEspecializacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String CursoCurtaDuracaoExtensao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MusicaApresentacaoObra() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MusicaArranjo() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MusicaComposicao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MusicaDiversas() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MusicaInterpletacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MusicaPunlicacaoPartitura() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MusicaRegistroFonografico() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String MusicaTrilhaSonora() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ObraArtesVisuaisCinema() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ObraArtesVisuaisDesenho() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ObraArtesVisuaisEscultura() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ObraArtesVisuaisFotografia() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ObraArtesVisuaisGravura() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ObraArtesVisuaisInstalacao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ObraArtesVisuaisPintura() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ObraArtesVisuaisTelevisao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String ObraArtesVisuaisVideo() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Partitura() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String SonoplastiaCinema() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String SonoplastiaMusica() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String SonoplastiaRadio() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String SonoplastiaTeatro() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String SonoplastiaTelevisao() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Premio() throws XPathExpressionException {
		XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
		return expr.evaluate(xmlfile);
	}

	public String Idioma() throws XPathExpressionException {
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

}
