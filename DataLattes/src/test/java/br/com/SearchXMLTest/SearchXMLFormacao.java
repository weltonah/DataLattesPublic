package br.com.SearchXMLTest;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

import br.com.Modelo.Formacao;
import br.com.SearchXML.SearchXMLFormacoes;

public class SearchXMLFormacao {

	@Test
	public void AperfeicoamentoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.Aperfeicoamento();
		assertEquals("titulo monogra aperfeicoamento", listprod.get(0).getTituloTrabalho());
		assertEquals(-1, listprod.get(0).getAno());
		assertEquals("orientador aperfeicoamento", listprod.get(0).getNomeOrientador());
		assertEquals("instituicao aperfeicoamento", listprod.get(0).getNomeInstituicao());
		assertEquals("EM_ANDAMENTO", listprod.get(0).getStatus());
		assertEquals("nome aperfeicoamento", listprod.get(0).getTitulo());
	}

	@Test
	public void CursoTecProfTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.CursoTecnico();
		assertEquals(1997, listprod.get(0).getAno());
		assertEquals("Colégio Pio X", listprod.get(0).getNomeInstituicao());
		assertEquals("CONCLUIDO", listprod.get(0).getStatus());
		assertEquals("Processamento de Dados", listprod.get(0).getTitulo());
	}

	@Test
	public void DoutoradoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.Doutorado();
		assertEquals("Uma abordagem heurística uni-objetivo para calibragem em meta-alinhadores de ontologias",
				listprod.get(0).getTituloTrabalho());
		assertEquals(2012, listprod.get(0).getAno());
		assertEquals("Carlos José Pereira de Lucena", listprod.get(0).getNomeOrientador());
		assertEquals("Pontifícia Universidade Católica do Rio de Janeiro", listprod.get(0).getNomeInstituicao());
		assertEquals("CONCLUIDO", listprod.get(0).getStatus());
		assertEquals("Informática", listprod.get(0).getTitulo());
	}

	@Test
	public void EspecializacaoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.Especializacao();
		assertEquals("Monografia Especializacao", listprod.get(0).getTituloTrabalho());
		assertEquals(-1, listprod.get(0).getAno());
		assertEquals("Orientador Especializacao", listprod.get(0).getNomeOrientador());
		assertEquals("Nome instituicao Especializacao", listprod.get(0).getNomeInstituicao());
		assertEquals("EM_ANDAMENTO", listprod.get(0).getStatus());
		assertEquals("Nome do curso especializacao", listprod.get(0).getTitulo());
	}

	@Test
	public void GraduacaoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.Graduacao();
		assertEquals("Um Aporte de Web Mining para a Web Semântica", listprod.get(0).getTituloTrabalho());
		assertEquals(2004, listprod.get(0).getAno());
		assertEquals("Tarcísio de Souza Lima", listprod.get(0).getNomeOrientador());
		assertEquals("Universidade Federal de Juiz de Fora", listprod.get(0).getNomeInstituicao());
		assertEquals("CONCLUIDO", listprod.get(0).getStatus());
		assertEquals("Informática", listprod.get(0).getTitulo());
	}

	@Test
	public void LivredocenciaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.LivreDocencia();
		assertEquals(2010, listprod.get(0).getAno());
		assertEquals("Nome instituicao livre docencia", listprod.get(0).getNomeInstituicao());
		assertEquals("titulo trabalho livre docencia", listprod.get(0).getTitulo());
	}

	@Test
	public void MBATeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.MBA();
		assertEquals("titulo monografia mba", listprod.get(0).getTituloTrabalho());
		assertEquals(2009, listprod.get(0).getAno());
		assertEquals("orientador mba", listprod.get(0).getNomeOrientador());
		assertEquals("instituicao mba", listprod.get(0).getNomeInstituicao());
		assertEquals("CONCLUIDO", listprod.get(0).getStatus());
		assertEquals("nome curso mba", listprod.get(0).getTitulo());
	}

	@Test
	public void MestradoProfTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.MestradoProfissional();
		assertEquals("titulo tese mestrado profissionalizandte", listprod.get(0).getTituloTrabalho());
		assertEquals(-1, listprod.get(0).getAno());
		assertEquals("orientador mestrad pro", listprod.get(0).getNomeOrientador());
		assertEquals("instituicao mesd prof", listprod.get(0).getNomeInstituicao());
		assertEquals("EM_ANDAMENTO", listprod.get(0).getStatus());
		assertEquals("curso mest prof", listprod.get(0).getTitulo());
	}

	@Test
	public void MestradoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.Mestrado();
		assertEquals("Negociação de significado para viabilizar interoperabilidade semântica",
				listprod.get(0).getTituloTrabalho());
		assertEquals(2007, listprod.get(0).getAno());
		assertEquals("Jano Moreira de Souza", listprod.get(0).getNomeOrientador());
		assertEquals("Universidade Federal do Rio de Janeiro", listprod.get(0).getNomeInstituicao());
		assertEquals("CONCLUIDO", listprod.get(0).getStatus());
		assertEquals("Engenharia de Sistemas e Computação", listprod.get(0).getTitulo());
	}

	@Test
	public void PosDoutoradoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.PosDoutorado();
		assertEquals("titulo trabalho pos doutorado", listprod.get(0).getTituloTrabalho());
		assertEquals(2009, listprod.get(0).getAno());
		assertEquals("Nome instituicao pos doutorado", listprod.get(0).getNomeInstituicao());
		assertEquals("CONCLUIDO", listprod.get(0).getStatus());
		assertEquals("nome curso posdoutorado", listprod.get(0).getTitulo());
	}

	@Test
	public void ResidenciaProfTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<Formacao> listprod = searchXML.ResidenciaMedica();
		assertEquals(2001, listprod.get(0).getAno());
		assertEquals("instituicao residencia", listprod.get(0).getNomeInstituicao());
		assertEquals("EM_ANDAMENTO", listprod.get(0).getStatus());
		assertEquals("titulo residencia", listprod.get(0).getTitulo());
	}

}
