package br.com.SearchXMLTest;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

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
		ArrayList<Tipo6> listprod = searchXML.ApresentacaoObraArtistica();
		assertEquals("titulo obraArt", listprod.get(0).getTitulo());
		assertEquals(2006, listprod.get(0).getAno());
		assertEquals("COREOGRAFICA", listprod.get(0).getNatureza());
		assertEquals("CONCERTO", listprod.get(0).getCampAux());
		assertEquals("CANTO", listprod.get(0).getCampAux2());
		assertEquals("nome obraArt", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n obraArt", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void ApresentacaoRadioTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<Tipo6> listprod = searchXML.ApresentacaoRadioTV();
		assertEquals("titulo apreRadio", listprod.get(0).getTitulo());
		assertEquals(2011, listprod.get(0).getAno());
		assertEquals("DANCA", listprod.get(0).getNatureza());
		assertEquals("nome apreRadio", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n apreRadio", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void ArranjoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<Tipo6> listprod = searchXML.ArranjoMusical();
		assertEquals("titulo arranjo", listprod.get(0).getTitulo());
		assertEquals(2012, listprod.get(0).getAno());
		assertEquals("CANTO", listprod.get(0).getNatureza());
		assertEquals("nome arranjo", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n arranjo", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void AtesCenicasTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<Tipo6> listprod = searchXML.ArtesCenicas();
		assertEquals("titulo ArtesCenicas", listprod.get(0).getTitulo());
		assertEquals(2009, listprod.get(0).getAno());
		assertEquals("AUDIOVISUAL", listprod.get(0).getNatureza());
		assertEquals("Exposicao", listprod.get(0).getCampAux());
		assertEquals("nome ArtesCenicas", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n ArtesCenicas", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void AtesVizuaisTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<Tipo6> listprod = searchXML.ArtesVizuais();
		assertEquals("titulo ArtesVizuais", listprod.get(0).getTitulo());
		assertEquals(2006, listprod.get(0).getAno());
		assertEquals("INTERVENCAO_URBANA", listprod.get(0).getNatureza());
		assertEquals("nome ArtesVizuais", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n ArtesVizuais", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void ComposicaoMusicalTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<Tipo6> listprod = searchXML.ComposicaoMusical();
		assertEquals("titulo composicao", listprod.get(0).getTitulo());
		assertEquals(2012, listprod.get(0).getAno());
		assertEquals("CANTO", listprod.get(0).getNatureza());
		assertEquals("nome composicao", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n composicao", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void MusicaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<Tipo6> listprod = searchXML.Musica();
		assertEquals("titulo musica", listprod.get(0).getTitulo());
		assertEquals(2002, listprod.get(0).getAno());
		assertEquals("APRESENTACAO_DE_OBRA", listprod.get(0).getNatureza());
		assertEquals("Abertura", listprod.get(0).getCampAux());
		assertEquals("nome musica", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n musica", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void ObraArtesVisuaisTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<Tipo6> listprod = searchXML.ObraArtesVisuais();
		assertEquals("titulo ObraArtes", listprod.get(0).getTitulo());
		assertEquals(2006, listprod.get(0).getAno());
		assertEquals("CINEMA", listprod.get(0).getNatureza());
		assertEquals("APRESENTACAO", listprod.get(0).getCampAux());
		assertEquals("nome ObraArtes", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n ObraArtes", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void PartituraTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<Tipo6> listprod = searchXML.Partitura();
		assertEquals("titulo partitura", listprod.get(0).getTitulo());
		assertEquals(2006, listprod.get(0).getAno());
		assertEquals("CANTO", listprod.get(0).getNatureza());
		assertEquals("nome partitura", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n partitura", listprod.get(0).getAutores().get(0).getCitacao());
	}

	@Test
	public void SonoplastiaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLProdArtistica searchXML = new SearchXMLProdArtistica(xmlfile);
		ArrayList<Tipo6> listprod = searchXML.Sonoplastia();
		assertEquals("titulo sonoplastia", listprod.get(0).getTitulo());
		assertEquals(2000, listprod.get(0).getAno());
		assertEquals("CINEMA", listprod.get(0).getNatureza());
		assertEquals("nome sonoplastia", listprod.get(0).getAutores().get(0).getNome());
		assertEquals("n sonoplastia", listprod.get(0).getAutores().get(0).getCitacao());
	}
}
