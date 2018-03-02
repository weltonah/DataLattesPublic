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
import br.com.Modelo.Tipo0;
import br.com.Modelo.Tipo1;
import br.com.Modelo.Tipo2;
import br.com.SearchXML.SearchXMLProdBibliografica;

public class SearchXMLBibliografiaTeste {
	private static Document xmlfile;
	private static SearchXMLProdBibliografica searchXML;

	@Test
	public void ArtigoCompletoAceito() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdBibliografica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.ArtigoCompletoAceito();
		assertEquals(
				"Uma abordagem para identificac&#807;a&#771;o de similaridade entre recursos educacionais utilizando bases de conhecimento externas",
				listprod.get(0).getTitulo());
		assertEquals(2017, listprod.get(0).getAno());
		assertEquals("14145685", ((Tipo0) listprod.get(0)).getCodigo());
		assertEquals("NAO_INFORMADO", ((Tipo0) listprod.get(0)).getNatureza());
		assertEquals("Laura Lima Dias", ((Tipo0) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("DIAS, L. L.", ((Tipo0) listprod.get(0)).getAutores().get(0).getCitacao());
		assertEquals("Jairo Francisco de Souza", ((Tipo0) listprod.get(0)).getAutores().get(3).getNome());
		assertEquals("SOUZA, J. F.", ((Tipo0) listprod.get(0)).getAutores().get(3).getCitacao());
	}

	@Test
	public void ArtigoPublicado() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdBibliografica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.ArtigoCompletoPublicado();

		assertEquals("Improving software agent communication with structural ontology alignment methods",
				listprod.get(0).getTitulo());
		assertEquals(2010, listprod.get(0).getAno());
		assertEquals("15541045", ((Tipo0) listprod.get(0)).getCodigo());
		assertEquals("COMPLETO", ((Tipo0) listprod.get(0)).getNatureza());
		assertEquals("Jairo Francisco de Souza", ((Tipo0) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("SOUZA, J. F.", ((Tipo0) listprod.get(0)).getAutores().get(0).getCitacao());
		assertEquals("Sean Wolfgang Matsui Siqueira", ((Tipo0) listprod.get(0)).getAutores().get(4).getNome());
		assertEquals("SIQUEIRA, S. W. M.", ((Tipo0) listprod.get(0)).getAutores().get(4).getCitacao());
		assertEquals("Management of Scientific Experiments in Computational Modeling: Challenges and Perspectives",
				((Tipo0) listprod.get(6)).getTitulo());
		assertEquals(2012, ((Tipo0) listprod.get(6)).getAno());
		assertEquals("19842902", ((Tipo0) listprod.get(6)).getCodigo());
		assertEquals("COMPLETO", ((Tipo0) listprod.get(6)).getNatureza());
		assertEquals("Regina Maria Maciel Braga Villela", ((Tipo0) listprod.get(6)).getAutores().get(0).getNome());
		assertEquals("BRAGA, R. M. M.", ((Tipo0) listprod.get(6)).getAutores().get(0).getCitacao());
		assertEquals("Kate Revoredo", ((Tipo0) listprod.get(6)).getAutores().get(5).getNome());
		assertEquals("REVOREDO, K.", ((Tipo0) listprod.get(6)).getAutores().get(5).getCitacao());
	}

	@Test
	public void LivroCap() throws Exception {
		File file = new ClassPathResource("static/testFile/Jorgecurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdBibliografica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.LivroCapitulo();
		assertEquals("Direito do trabalho rural: estudos em homenagem a Irany Ferrari.", listprod.get(0).getTitulo());
		assertEquals("Fundamentos da proteção ao trabalhador rural.", ((Tipo1) listprod.get(0)).getCampAux());
		assertEquals(1998, listprod.get(0).getAno());
		assertEquals("", ((Tipo1) listprod.get(0)).getCodigo());
		assertEquals("Jorge Luiz Souto Maior", ((Tipo1) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("Curso de direito do trabalho", listprod.get(22).getTitulo());
		assertEquals("Breves considerações sobre a história do direito do trabalho no Brasil",
				((Producao) listprod.get(22)).getCampAux());
		assertEquals(2007, listprod.get(22).getAno());
		assertEquals("", ((Tipo1) listprod.get(22)).getCodigo());
		assertEquals("Jorge Luiz Souto Maior", ((Producao) listprod.get(22)).getAutores().get(0).getNome());
		assertEquals("SOUTO MAIOR, Jorge Luiz", ((Producao) listprod.get(22)).getAutores().get(0).getCitacao());
	}

	@Test
	public void LivroPosPreFacio() throws Exception {
		File file = new ClassPathResource("static/testFile/Jorgecurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdBibliografica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.LivroPrePosFacio();
		assertEquals("A efetividade da hasta pública no processo do trabalho.", listprod.get(0).getTitulo());
		assertEquals("A efetividade da hasta pública no processo do trabalho",
				((Tipo2) listprod.get(0)).getCampAux());
		assertEquals(2003, listprod.get(0).getAno());
		assertEquals("", ((Tipo2) listprod.get(0)).getCodigo());
		assertEquals("LIVRO", ((Tipo2) listprod.get(0)).getNatureza());
		assertEquals("PREFACIO", ((Tipo2) listprod.get(0)).getTipo());
		assertEquals("Jorge Luiz Souto Maior", ((Tipo2) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("SOUTO MAIOR, Jorge Luiz", ((Tipo2) listprod.get(0)).getAutores().get(0).getCitacao());
		assertEquals("Terror psicológico no trabalho.", listprod.get(1).getTitulo());
		assertEquals("Terror psicológico no trabalho", ((Tipo2) listprod.get(1)).getCampAux());
		assertEquals(2003, listprod.get(1).getAno());
		assertEquals("", ((Tipo2) listprod.get(1)).getCodigo());
		assertEquals("LIVRO", ((Tipo2) listprod.get(1)).getNatureza());
		assertEquals("APRESENTACAO", ((Tipo2) listprod.get(1)).getTipo());
		assertEquals("Jorge Luiz Souto Maior", ((Tipo2) listprod.get(1)).getAutores().get(0).getNome());
		assertEquals("SOUTO MAIOR, Jorge Luiz", ((Tipo2) listprod.get(1)).getAutores().get(0).getCitacao());
	}

	@Test
	public void LivroPublicadoOuOrganizadoTeste()
			throws Exception {
		File file = new ClassPathResource("static/testFile/Jorgecurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdBibliografica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.LivroPublicadoOuOrganizar();
		assertEquals("Petição Inicial: no processo civil e no processo do trabalho.", listprod.get(0).getTitulo());
		assertEquals(1996, listprod.get(0).getAno());
		assertEquals("", ((Tipo2) listprod.get(0)).getCodigo());
		assertEquals("TEXTO_INTEGRAL", ((Tipo2) listprod.get(0)).getNatureza());
		assertEquals("LIVRO_PUBLICADO", ((Tipo2) listprod.get(0)).getTipo());
		assertEquals("Jorge Luiz Souto Maior", ((Tipo2) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("SOUTO MAIOR, Jorge Luiz", ((Tipo2) listprod.get(0)).getAutores().get(0).getCitacao());
		assertEquals("Dumping social nas relações de trabalho", listprod.get(4).getTitulo());
		assertEquals(2014, listprod.get(4).getAno());
		assertEquals("9788536128092", ((Tipo2) listprod.get(4)).getCodigo());
		assertEquals("TEXTO_INTEGRAL", ((Tipo2) listprod.get(4)).getNatureza());
		assertEquals("LIVRO_PUBLICADO", ((Tipo2) listprod.get(4)).getTipo());
		assertEquals("Jorge Luiz Souto Maior", ((Tipo2) listprod.get(4)).getAutores().get(0).getNome());
		assertEquals("SOUTO MAIOR, Jorge Luiz", ((Tipo2) listprod.get(4)).getAutores().get(0).getCitacao());
		assertEquals("Valdete Souto Severo", ((Tipo2) listprod.get(4)).getAutores().get(2).getNome());
		assertEquals("SEVERO, Valdete Souto", ((Tipo2) listprod.get(4)).getAutores().get(2).getCitacao());
		assertEquals("Trabalhos marginais", listprod.get(5).getTitulo());
		assertEquals(2014, listprod.get(5).getAno());
		assertEquals("9788536127415", ((Tipo2) listprod.get(5)).getCodigo());
		assertEquals("COLETANEA", ((Tipo2) listprod.get(5)).getNatureza());
		assertEquals("LIVRO_ORGANIZADO_OU_EDICAO", ((Tipo2) listprod.get(5)).getTipo());
		assertEquals("Jorge Luiz Souto Maior", ((Tipo2) listprod.get(5)).getAutores().get(0).getNome());
		assertEquals("SOUTO MAIOR, Jorge Luiz", ((Tipo2) listprod.get(5)).getAutores().get(0).getCitacao());
		assertEquals("Noa Piatã Bassfeld Gnata", ((Tipo2) listprod.get(5)).getAutores().get(1).getNome());
		assertEquals("GNATA, Noa Piatã Bassfeld", ((Tipo2) listprod.get(5)).getAutores().get(1).getCitacao());
	}

	@Test
	public void TrabalhoEventoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXMLProdBibliografica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.TrabalhoCompletoEvento();
		assertEquals("Peer-to-Peer Collaborative Integration of Dynamic Ontologies", listprod.get(0).getTitulo());
		assertEquals(2005, listprod.get(0).getAno());
		assertEquals("1846000025", ((Tipo0) listprod.get(0)).getCodigo());
		assertEquals("COMPLETO", ((Tipo0) listprod.get(0)).getNatureza());
		assertEquals("INTERNACIONAL", ((Tipo0) listprod.get(0)).getCampAux());
		assertEquals("9th International Conference on Computer Supported Cooperative Work in Design",
				((Tipo0) listprod.get(0)).getCampAux2());
		assertEquals("Juliana Lucas Rezende", ((Tipo0) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("REZENDE, J. L.", ((Tipo0) listprod.get(0)).getAutores().get(0).getCitacao());
		assertEquals("Jano Moreira Souza", ((Tipo0) listprod.get(0)).getAutores().get(3).getNome());
		assertEquals("SOUZA, J. M.", ((Tipo0) listprod.get(0)).getAutores().get(3).getCitacao());
		assertEquals("Criação de um Repositório de Dados Ligados para Filtragem de Hoax", listprod.get(22).getTitulo());
		assertEquals(2012, listprod.get(22).getAno());
		assertEquals("", ((Tipo0) listprod.get(22)).getCodigo());
		assertEquals("COMPLETO", ((Tipo0) listprod.get(22)).getNatureza());
		assertEquals("REGIONAL", ((Tipo0) listprod.get(22)).getCampAux());
		assertEquals("Simpósio Mineiro de Computação", ((Tipo0) listprod.get(22)).getCampAux2());
		assertEquals("Adriano Rodrigues Delvoux", ((Tipo0) listprod.get(22)).getAutores().get(0).getNome());
		assertEquals("DELVOUX, A. R.", ((Tipo0) listprod.get(22)).getAutores().get(0).getCitacao());
		assertEquals("Jairo Francisco de Souza", ((Tipo0) listprod.get(22)).getAutores().get(1).getNome());
		assertEquals("SOUZA, J. F.", ((Tipo0) listprod.get(22)).getAutores().get(1).getCitacao());
	}
}
