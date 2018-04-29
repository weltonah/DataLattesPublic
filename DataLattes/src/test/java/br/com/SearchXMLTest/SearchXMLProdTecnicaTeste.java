package br.com.SearchXMLTest;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

import br.com.Modelo.ObjetoCriterio;
import br.com.Modelo.Producao;
import br.com.Modelo.Tipo3;
import br.com.Modelo.Tipo4;
import br.com.Modelo.Tipo5;
import br.com.Modelo.Tipo6;
import br.com.Modelo.Tipo8;
import br.com.SearchXML.SearchXMLProdTecnica;

//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@SpringBootTest
public class SearchXMLProdTecnicaTeste {

	@Test
	public void ApresentacaoTrabalhoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.ApresentacaoTrabalho();
		ArrayList<Tipo6> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo6) objetoCriterio);
		}
		assertEquals(
				"Sistema para Gestão de Conhecimento em Ensino de Engenharia e para Gestão e Resolução de Problemas da Comunidade",
				listprod.get(0).getTitulo());
		assertEquals(2003, listprod.get(0).getAno());
		assertEquals("SEMINARIO", listprod.get(0).getNatureza());
		assertEquals("IX Seminário de Iniciação Científica", listprod.get(0).getCampAux());
		assertEquals("Jairo Francisco de Souza", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("SOUZA, J. F.", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void CartaMapaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.CartaMapa();
		ArrayList<Tipo6> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo6) objetoCriterio);
		}
		assertEquals("titulo cartamapa", listprod.get(0).getTitulo());
		assertEquals(2006, listprod.get(0).getAno());
		assertEquals("AEROFOTOGRAMA", listprod.get(0).getNatureza());
		assertEquals("nome carta mapa", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n c p", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void CultivarProtTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.CultivacapProtegida();
		ArrayList<Tipo3> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo3) objetoCriterio);
		}
		assertEquals("titulo cultProg", listprod.get(0).getTitulo());
		assertEquals(2010, listprod.get(0).getAno());
		assertEquals("nome cultiprot", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("N Cp", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void CultivarRegTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.CultivacapRegistrada();
		ArrayList<Tipo3> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo3) objetoCriterio);
		}
		assertEquals("titulo cultCult", listprod.get(0).getTitulo());
		assertEquals(2010, listprod.get(0).getAno());
		assertEquals("nome cultiReg", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("N CR", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void CursoCurtaDurTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.CursoMinistradoCurtaDuracao();
		ArrayList<Producao> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Producao) objetoCriterio);
		}
		assertEquals("Introdução a Objetos Distribuídos em CORBA", listprod.get(0).getTitulo());
		assertEquals(2003, listprod.get(0).getAno());
		assertEquals("Jairo Francisco de Souza", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("SOUZA, J. F.", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void DesenhoIndustrialTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.DesenhoIndustrial();
		ArrayList<Tipo3> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo3) objetoCriterio);
		}
		assertEquals("titulo Desenho industrial", listprod.get(0).getTitulo());
		assertEquals(2011, listprod.get(0).getAno());
		assertEquals("nome desenho", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("N D ", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void EditoracaoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.Editoracao();
		ArrayList<Tipo6> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo6) objetoCriterio);
		}
		assertEquals("titulo editoracao", listprod.get(0).getTitulo());
		assertEquals(2013, listprod.get(0).getAno());
		assertEquals("LIVRO", listprod.get(0).getNatureza());
		assertEquals("nome editoracao", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n c p", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void ManutencaoArtisticaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.ManutencaoObraArtistica();
		ArrayList<Tipo6> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo6) objetoCriterio);
		}
		assertEquals("manutencao titulo", listprod.get(0).getTitulo());
		assertEquals(2014, listprod.get(0).getAno());
		assertEquals("NAO_INFORMADO", listprod.get(0).getNatureza());
		assertEquals("nome obra", listprod.get(0).getCampAux());
		assertEquals("nome manutencao", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n m ", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void MaqueteTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.Maquete();
		ArrayList<Producao> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Producao) objetoCriterio);
		}
		assertEquals("maquete titulo", listprod.get(0).getTitulo());
		assertEquals(2009, listprod.get(0).getAno());
		assertEquals("nome maquete", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n m", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void MarcaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.Marca();
		ArrayList<Tipo3> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo3) objetoCriterio);
		}
		assertEquals("titulo marca", listprod.get(0).getTitulo());
		assertEquals(2000, listprod.get(0).getAno());
		assertEquals("nome marca", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("N m", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void MaterialDidaticoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.MaterialDidatico();
		ArrayList<Tipo6> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo6) objetoCriterio);
		}
		assertEquals("titulo materialdidatico", listprod.get(0).getTitulo());
		assertEquals(2013, listprod.get(0).getAno());
		assertEquals("Exemplo", listprod.get(0).getNatureza());
		assertEquals("nome material", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n c p", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void MidiaSocialTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.MidiaSocial();
		ArrayList<Tipo6> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo6) objetoCriterio);
		}
		assertEquals("midia titulo", listprod.get(0).getTitulo());
		assertEquals(2003, listprod.get(0).getAno());
		assertEquals("REDE_SOCIAL", listprod.get(0).getNatureza());
		assertEquals("nome midia", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n m", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void OrganizacaoEventoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.OrganizacaoEventos();
		ArrayList<Tipo8> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo8) objetoCriterio);
		}
		assertEquals("I Encontro de Informação e Tecnologia - ENITEC", listprod.get(0).getTitulo());
		assertEquals(2002, listprod.get(0).getAno());
		assertEquals("ORGANIZACAO", listprod.get(0).getNatureza());
		assertEquals("CONGRESSO", listprod.get(0).getTipo());
		assertEquals("Marcos Henrique Fonseca Ribeiro", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("RIBEIRO, M. H. F.", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void PatenteTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Johncurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.Patente();
		ArrayList<Tipo3> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo3) objetoCriterio);
		}
		assertEquals("Pedido de Patente F2", listprod.get(0).getTitulo());
		assertEquals(2011, listprod.get(0).getAno());
		assertEquals("61490937", listprod.get(0).getRegPatente().getCodigoPatente());
		assertEquals("PATENTE_NO_EXTERIOR_PE", listprod.get(0).getRegPatente().getTipoPatente());
		assertEquals("", listprod.get(0).getRegPatente().getDataConcessao());
		assertEquals("", listprod.get(0).getRegPatente().getNomeTitular());
		assertEquals("John Katz", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("KATZ, J.", listprod.get(0).getAutores().get(0).getCitacao());
		assertEquals("Pedido de Patente F1", listprod.get(1).getTitulo());
		assertEquals(2010, listprod.get(1).getAno());
		assertEquals("61362341", listprod.get(1).getRegPatente().getCodigoPatente());
		assertEquals("PATENTE_NO_EXTERIOR_PE", listprod.get(1).getRegPatente().getTipoPatente());
		assertEquals("", listprod.get(1).getRegPatente().getDataConcessao());
		assertEquals("", listprod.get(1).getRegPatente().getNomeTitular());
		assertEquals("John Katz", listprod.get(1).getAutores().get(0).getNome());
		assertEquals("KATZ, J.", listprod.get(1).getAutores().get(0).getCitacao());
	}

	@Test
	public void ProcessoTecnicaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Johncurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.ProcessoTecnico();
		ArrayList<Tipo4> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo4) objetoCriterio);
		}
		assertEquals("Pedido de Patente F2", listprod.get(0).getTitulo());
		assertEquals(2011, listprod.get(0).getAno());
		assertEquals("INSTRUMENTAL", listprod.get(0).getNatureza());
		assertEquals("John Katz", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("KATZ, J.", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void ProdutoTecniTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.ProdutoTecnologico();
		ArrayList<Tipo5> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo5) objetoCriterio);
		}
		assertEquals("titulo produto", listprod.get(0).getTitulo());
		assertEquals(2001, listprod.get(0).getAno());
		assertEquals("NAO_INFORMADO", listprod.get(0).getNatureza());
		assertEquals("PILOTO", listprod.get(0).getTipo());
		assertEquals("Nome produto", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("NP", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void ProgramaRadioTVTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.ProgramaRadioTVComentario();
		ArrayList<Tipo6> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo6) objetoCriterio);
		}
		assertEquals("programa titulo", listprod.get(0).getTitulo());
		assertEquals(2014, listprod.get(0).getAno());
		assertEquals("ENTREVISTA", listprod.get(0).getNatureza());
		assertEquals("nome radio", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n r", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void RelatorioPesquisaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.RelatorioPesquisa();
		ArrayList<Producao> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Producao) objetoCriterio);
		}
		assertEquals("relatorio titulo", listprod.get(0).getTitulo());
		assertEquals(2016, listprod.get(0).getAno());
		assertEquals("nome relatorio", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n r", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void SoftwareTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.Software();
		ArrayList<Tipo4> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo4) objetoCriterio);
		}
		assertEquals("GNoSIS: Algoritmo para cálculo de similaridade semântica entre conceitos de ontologias",
				listprod.get(0).getTitulo());
		assertEquals(2006, listprod.get(0).getAno());
		assertEquals("COMPUTACIONAL", listprod.get(0).getNatureza());
		assertEquals("Jairo Francisco de Souza", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("SOUZA, J. F.", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void TopografiaCircuitoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.TopogradiaDeCircuitoIntegrado();
		ArrayList<Tipo3> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo3) objetoCriterio);
		}
		assertEquals("titulo topografia", listprod.get(0).getTitulo());
		assertEquals(2012, listprod.get(0).getAno());
		assertEquals("8889", listprod.get(0).getRegPatente().getCodigoPatente());
		assertEquals("PRIVILEGIO_DE_INOVACAO_PI", listprod.get(0).getRegPatente().getTipoPatente());
		assertEquals("2011", listprod.get(0).getRegPatente().getDataConcessao());
		assertEquals("nome titular patente", listprod.get(0).getRegPatente().getNomeTitular());
		assertEquals("nome completo topografica", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("N C P", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void TrabalhoTecnicoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Luiscurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.TrabalhoTecnico();
		ArrayList<Tipo6> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo6) objetoCriterio);
		}
		// listprod.forEach(n -> n.imprimirTipo6());
		assertEquals("exemplo", "exemplo");
		assertEquals("Parecer para a Revista da Sociedade Brasileira de História da Ciência",
				listprod.get(0).getTitulo());
		assertEquals("PARECER", listprod.get(0).getNatureza());
		assertEquals(2004, listprod.get(0).getAno());
		assertEquals("Luís Miguel Nunes Carolino", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("CAROLINO, L. M. N.", listprod.get(0).getAutores().get(0).getCitacao());
		assertEquals("Parecer para a Revista da Sociedade Brasileira de História da Ciência",
				listprod.get(6).getTitulo());
		assertEquals("PARECER", listprod.get(6).getNatureza());
		assertEquals(2007, listprod.get(6).getAno());
		assertEquals("Luís Miguel Nunes Carolino", listprod.get(6).getAutores().get(0).getNome());
		assertEquals("CAROLINO, L. M. N.", listprod.get(6).getAutores().get(0).getCitacao());
	}

	@Test
	public void TraducaoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdTecnica searchXML = new SearchXMLProdTecnica(xmlfile);
		ArrayList<ObjetoCriterio> aux = searchXML.Traducao();
		ArrayList<Tipo6> listprod = new ArrayList<>();
		for (ObjetoCriterio objetoCriterio : aux) {
			listprod.add((Tipo6) objetoCriterio);
		}
		assertEquals("titulo traducao", listprod.get(0).getTitulo());
		assertEquals(2008, listprod.get(0).getAno());
		assertEquals("ARTIGO", listprod.get(0).getNatureza());
		assertEquals("titulo original", listprod.get(0).getCampAux());
		assertEquals("nome traducao", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("N T", listprod.get(0).getAutores().get(0).getCitacao());
	}

}
