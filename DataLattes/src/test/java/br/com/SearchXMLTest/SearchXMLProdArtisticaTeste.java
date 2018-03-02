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
import br.com.Modelo.Tipo6;
import br.com.SearchXML.SearchXMLProdArtistica;

public class SearchXMLProdArtisticaTeste {
	@Test
	public void ApresentacaoObraTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.ApresentacaoObraArtistica();
		assertEquals("titulo obraArt", ((Tipo6) listprod.get(0)).getTitulo());
		assertEquals(2006, ((Tipo6) listprod.get(0)).getAno());
		assertEquals("COREOGRAFICA", ((Tipo6) listprod.get(0)).getNatureza());
		assertEquals("CONCERTO", ((Tipo6) listprod.get(0)).getCampAux());
		assertEquals("CANTO", ((Tipo6) listprod.get(0)).getCampAux2());
		assertEquals("nome obraArt", ((Tipo6) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("n obraArt", ((Tipo6) listprod.get(0)).getAutores().get(0).getCitacao());
	}

	@Test
	public void ApresentacaoRadioTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.ApresentacaoRadioTV();
		assertEquals("titulo apreRadio", ((Tipo6) listprod.get(0)).getTitulo());
		assertEquals(2011, ((Tipo6) listprod.get(0)).getAno());
		assertEquals("DANCA", ((Tipo6) listprod.get(0)).getNatureza());
		assertEquals("nome apreRadio", ((Tipo6) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("n apreRadio", ((Tipo6) listprod.get(0)).getAutores().get(0).getCitacao());
	}

	@Test
	public void ArranjoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.ArranjoMusical();
		assertEquals("titulo arranjo", ((Tipo6) listprod.get(0)).getTitulo());
		assertEquals(2012, ((Tipo6) listprod.get(0)).getAno());
		assertEquals("CANTO", ((Tipo6) listprod.get(0)).getNatureza());
		assertEquals("nome arranjo", ((Tipo6) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("n arranjo", ((Tipo6) listprod.get(0)).getAutores().get(0).getCitacao());
	}

	@Test
	public void AtesCenicasTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.ArtesCenicas();
		assertEquals("titulo ArtesCenicas", ((Tipo6) listprod.get(0)).getTitulo());
		assertEquals(2009, ((Tipo6) listprod.get(0)).getAno());
		assertEquals("AUDIOVISUAL", ((Tipo6) listprod.get(0)).getNatureza());
		assertEquals("Exposicao", ((Tipo6) listprod.get(0)).getCampAux());
		assertEquals("nome ArtesCenicas", ((Tipo6) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("n ArtesCenicas", ((Tipo6) listprod.get(0)).getAutores().get(0).getCitacao());
	}

	@Test
	public void AtesVizuaisTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.ArtesVizuais();
		assertEquals("titulo ArtesVizuais", ((Tipo6) listprod.get(0)).getTitulo());
		assertEquals(2006, ((Tipo6) listprod.get(0)).getAno());
		assertEquals("INTERVENCAO_URBANA", ((Tipo6) listprod.get(0)).getNatureza());
		assertEquals("nome ArtesVizuais", ((Tipo6) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("n ArtesVizuais", ((Tipo6) listprod.get(0)).getAutores().get(0).getCitacao());
	}

	@Test
	public void ComposicaoMusicalTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.ComposicaoMusical();
		assertEquals("titulo composicao", ((Tipo6) listprod.get(0)).getTitulo());
		assertEquals(2012, ((Tipo6) listprod.get(0)).getAno());
		assertEquals("CANTO", ((Tipo6) listprod.get(0)).getNatureza());
		assertEquals("nome composicao", ((Tipo6) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("n composicao", ((Tipo6) listprod.get(0)).getAutores().get(0).getCitacao());
	}

	@Test
	public void MusicaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.Musica();
		assertEquals("titulo musica", ((Tipo6) listprod.get(0)).getTitulo());
		assertEquals(2002, ((Tipo6) listprod.get(0)).getAno());
		assertEquals("APRESENTACAO_DE_OBRA", ((Tipo6) listprod.get(0)).getNatureza());
		assertEquals("Abertura", ((Tipo6) listprod.get(0)).getCampAux());
		assertEquals("nome musica", ((Tipo6) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("n musica", ((Tipo6) listprod.get(0)).getAutores().get(0).getCitacao());
	}

	@Test
	public void ObraArtesVisuaisTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.ObraArtesVisuais();
		assertEquals("titulo ObraArtes", ((Tipo6) listprod.get(0)).getTitulo());
		assertEquals(2006, ((Tipo6) listprod.get(0)).getAno());
		assertEquals("CINEMA", ((Tipo6) listprod.get(0)).getNatureza());
		assertEquals("APRESENTACAO", ((Tipo6) listprod.get(0)).getCampAux());
		assertEquals("nome ObraArtes", ((Tipo6) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("n ObraArtes", ((Tipo6) listprod.get(0)).getAutores().get(0).getCitacao());
	}

	@Test
	public void PartituraTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.Partitura();
		assertEquals("titulo partitura", ((Tipo6) listprod.get(0)).getTitulo());
		assertEquals(2006, ((Tipo6) listprod.get(0)).getAno());
		assertEquals("CANTO", ((Tipo6) listprod.get(0)).getNatureza());
		assertEquals("nome partitura", ((Tipo6) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("n partitura", ((Tipo6) listprod.get(0)).getAutores().get(0).getCitacao());
	}

	@Test
	public void SonoplastiaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.Sonoplastia();
		assertEquals("titulo sonoplastia", ((Tipo6) listprod.get(0)).getTitulo());
		assertEquals(2000, ((Tipo6) listprod.get(0)).getAno());
		assertEquals("CINEMA", ((Tipo6) listprod.get(0)).getNatureza());
		assertEquals("nome sonoplastia", ((Tipo6) listprod.get(0)).getAutores().get(0).getNome());
		assertEquals("n sonoplastia", ((Tipo6) listprod.get(0)).getAutores().get(0).getCitacao());
	}
}
