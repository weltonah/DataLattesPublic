package br.com.SearchXMLTest;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

import br.com.Modelo.Orientacao;
import br.com.SearchXML.SearchXMLOrientacoes;

public class SearchXMLOrientacao {
	@Test
	public void OrientacaoAperf() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLOrientacoes searchXML = new SearchXMLOrientacoes(xmlfile);
		ArrayList<Orientacao> listprod = searchXML.OrientacaoAperfEspecAnd();
		assertEquals("titulo de oritentacao ape e esp em anamento", listprod.get(0).getTitulo());
		assertEquals(2015, listprod.get(0).getAno());
		assertEquals("", listprod.get(0).getNatureza());
		assertEquals("nome orientador", listprod.get(0).getNome_aluno());
	}

	@Test
	public void OrientacaoDoutorado() throws Exception {
		File file = new ClassPathResource("static/testFile/Jorgecurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLOrientacoes searchXML = new SearchXMLOrientacoes(xmlfile);
		ArrayList<Orientacao> listprod = searchXML.OrientacaoMesAnd();
		listprod.addAll(searchXML.OrientacaoMesCon());
		assertEquals("Área: Direito do Trabalho e da Seguridade Social", listprod.get(0).getTitulo());
		assertEquals(2015, listprod.get(0).getAno());
		assertEquals("Dissertação de mestrado", listprod.get(0).getNatureza());
		assertEquals("ORIENTADOR_PRINCIPAL", listprod.get(0).getCampAux());
		assertEquals("NAO_INFORMADO", listprod.get(0).getCampAux2());
		assertEquals("Victor Emanuel Bertoldo Teixeira", listprod.get(0).getNome_aluno());
		assertEquals("Terceirização e seus efeitos sobre os direitos do trabalhador no ordenamento jurídico brasileiro",
				listprod.get(5).getTitulo());
		assertEquals(2007, listprod.get(5).getAno());
		assertEquals("Dissertação de mestrado", listprod.get(5).getNatureza());
		assertEquals("ORIENTADOR_PRINCIPAL", listprod.get(5).getCampAux());
		assertEquals("ACADEMICO", listprod.get(5).getCampAux2());
		assertEquals("Tadeu Henrique Lopes da Cunha", listprod.get(5).getNome_aluno());
	}

	@Test
	public void OrientacaoGraduacao() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		 Document xmlfile = docBuilder.parse(file);
		 SearchXMLOrientacoes searchXML =  new SearchXMLOrientacoes(xmlfile);
		ArrayList<Orientacao> listprod = searchXML.OrientacaoGraduacaoAnd();
		assertEquals(
				"Uma anÃ¡lise de algoritmos de aprendizado de mÃ¡quina para parsing de sentenÃ§as em lÃ­ngua portuguesa",
				listprod.get(0).getTitulo());
		assertEquals(2016, listprod.get(0).getAno());
		assertEquals("Trabalho de conclusÃ£o de curso de graduaÃ§Ã£o", listprod.get(0).getNatureza());
		assertEquals("Gabriel Lomba", listprod.get(0).getNome_aluno());
	}

	@Test
	public void OrientacaoIC() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLOrientacoes searchXML = new SearchXMLOrientacoes(xmlfile);
		ArrayList<Orientacao> listprod = searchXML.OrientacaoICAnd();
		assertEquals("Meta-alinhamento de modelos baseado em abordagens populacionais", listprod.get(0).getTitulo());
		assertEquals(2015, listprod.get(0).getAno());
		assertEquals("IniciaÃ§Ã£o CientÃ­fica", listprod.get(0).getNatureza());
		assertEquals("Gerson Henrique Marciano dos Reis", listprod.get(0).getNome_aluno());
	}

	@Test
	public void OrientacaoMestrado() throws Exception {
		File file = new ClassPathResource("static/testFile/Jorgecurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLOrientacoes searchXML = new SearchXMLOrientacoes(xmlfile);
		ArrayList<Orientacao> listprod = searchXML.OrientacaoDouAnd();
		listprod.addAll(searchXML.OrientacaoDouCon());
		assertEquals("Área: Direito do Trabalho e da Seguridade Social", listprod.get(0).getTitulo());
		assertEquals(2014, listprod.get(0).getAno());
		assertEquals("Tese de doutorado", listprod.get(0).getNatureza());
		assertEquals("ORIENTADOR_PRINCIPAL", listprod.get(0).getCampAux());
		assertEquals("Janaina Vieira de Castro", listprod.get(0).getNome_aluno());
		assertEquals("Contribuição à critica do empregado como empreendedor de si mesmo", listprod.get(5).getTitulo());
		assertEquals(2013, listprod.get(5).getAno());
		assertEquals("Tese de doutorado", listprod.get(5).getNatureza());
		assertEquals("ORIENTADOR_PRINCIPAL", listprod.get(5).getCampAux());
		assertEquals("Thiago Ramos Barbosa", listprod.get(5).getNome_aluno());
	}

	@Test
	public void OrientacaoOutrasOrientacao() throws Exception {
		File file = new ClassPathResource("static/testFile/Jorgecurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLOrientacoes searchXML = new SearchXMLOrientacoes(xmlfile);
		ArrayList<Orientacao> listprod = searchXML.OutrasOrientacaoCon();
		assertEquals("Efetividade da Hasta Pública no Processo do Trabalho", listprod.get(0).getTitulo());
		assertEquals(2000, listprod.get(0).getAno());
		assertEquals("MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO",
				listprod.get(0).getNatureza());
		assertEquals("CO_ORIENTADOR", listprod.get(0).getCampAux());
		assertEquals("Alexandre Alliprandino Medeiros", listprod.get(0).getNome_aluno());
		assertEquals("A escravidão no Brasil do século XXI", listprod.get(5).getTitulo());
		assertEquals(2006, listprod.get(5).getAno());
		assertEquals("MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO",
				listprod.get(5).getNatureza());
		assertEquals("CO_ORIENTADOR", listprod.get(5).getCampAux());
		assertEquals("Mauricio Miguel Abou Assali", listprod.get(5).getNome_aluno());
	}
}
