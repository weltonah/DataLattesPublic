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
import br.com.Modelo.ObjetoCriterio;
import br.com.SearchXML.SearchXMLFormacoes;

public class SearchXMLFormacao {

	@Test
	public void AperfeicoamentoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.Aperfeicoamento();
		assertEquals("titulo monogra aperfeicoamento", ((Formacao) listprod.get(0)).getTituloTrabalho());
		assertEquals(-1, listprod.get(0).getAno());
		assertEquals("orientador aperfeicoamento", ((Formacao) listprod.get(0)).getNomeOrientador());
		assertEquals("instituicao aperfeicoamento", ((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("EM_ANDAMENTO", ((Formacao) listprod.get(0)).getStatus());
		assertEquals("nome aperfeicoamento", listprod.get(0).getTitulo());
	}

	@Test
	public void CursoTecProfTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.CursoTecnico();
		assertEquals(1997, listprod.get(0).getAno());
		assertEquals("Colégio Pio X", ((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("CONCLUIDO", ((Formacao) listprod.get(0)).getStatus());
		assertEquals("Processamento de Dados", ((Formacao) listprod.get(0)).getTitulo());
	}

	@Test
	public void DoutoradoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.Doutorado();
		assertEquals("Uma abordagem heurística uni-objetivo para calibragem em meta-alinhadores de ontologias",
				((Formacao) listprod.get(0)).getTituloTrabalho());
		assertEquals(2012, listprod.get(0).getAno());
		assertEquals("Carlos José Pereira de Lucena", ((Formacao) listprod.get(0)).getNomeOrientador());
		assertEquals("Pontifícia Universidade Católica do Rio de Janeiro",
				((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("CONCLUIDO", ((Formacao) listprod.get(0)).getStatus());
		assertEquals("Informática", listprod.get(0).getTitulo());
	}

	@Test
	public void EspecializacaoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.Especializacao();
		assertEquals("Monografia Especializacao", ((Formacao) listprod.get(0)).getTituloTrabalho());
		assertEquals(-1, listprod.get(0).getAno());
		assertEquals("Orientador Especializacao", ((Formacao) listprod.get(0)).getNomeOrientador());
		assertEquals("Nome instituicao Especializacao", ((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("EM_ANDAMENTO", ((Formacao) listprod.get(0)).getStatus());
		assertEquals("Nome do curso especializacao", listprod.get(0).getTitulo());
	}

	@Test
	public void GraduacaoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.Graduacao();
		assertEquals("Um Aporte de Web Mining para a Web Semântica", ((Formacao) listprod.get(0)).getTituloTrabalho());
		assertEquals(2004, listprod.get(0).getAno());
		assertEquals("Tarcísio de Souza Lima", ((Formacao) listprod.get(0)).getNomeOrientador());
		assertEquals("Universidade Federal de Juiz de Fora", ((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("CONCLUIDO", ((Formacao) listprod.get(0)).getStatus());
		assertEquals("Informática", listprod.get(0).getTitulo());
	}

	@Test
	public void LivredocenciaTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.LivreDocencia();
		assertEquals(2010, listprod.get(0).getAno());
		assertEquals("Nome instituicao livre docencia", ((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("titulo trabalho livre docencia", listprod.get(0).getTitulo());
	}

	@Test
	public void MBATeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.MBA();
		assertEquals("titulo monografia mba", ((Formacao) listprod.get(0)).getTituloTrabalho());
		assertEquals(2009, listprod.get(0).getAno());
		assertEquals("orientador mba", ((Formacao) listprod.get(0)).getNomeOrientador());
		assertEquals("instituicao mba", ((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("CONCLUIDO", ((Formacao) listprod.get(0)).getStatus());
		assertEquals("nome curso mba", listprod.get(0).getTitulo());
	}

	@Test
	public void MestradoProfTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.MestradoProfissional();
		assertEquals("titulo tese mestrado profissionalizandte", ((Formacao) listprod.get(0)).getTituloTrabalho());
		assertEquals(-1, listprod.get(0).getAno());
		assertEquals("orientador mestrad pro", ((Formacao) listprod.get(0)).getNomeOrientador());
		assertEquals("instituicao mesd prof", ((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("EM_ANDAMENTO", ((Formacao) listprod.get(0)).getStatus());
		assertEquals("curso mest prof", listprod.get(0).getTitulo());
	}

	@Test
	public void MestradoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.Mestrado();
		assertEquals("Negociação de significado para viabilizar interoperabilidade semântica",
				((Formacao) listprod.get(0)).getTituloTrabalho());
		assertEquals(2007, listprod.get(0).getAno());
		assertEquals("Jano Moreira de Souza", ((Formacao) listprod.get(0)).getNomeOrientador());
		assertEquals("Universidade Federal do Rio de Janeiro", ((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("CONCLUIDO", ((Formacao) listprod.get(0)).getStatus());
		assertEquals("Engenharia de Sistemas e Computação", listprod.get(0).getTitulo());
	}

	@Test
	public void PosDoutoradoTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.PosDoutorado();
		assertEquals("titulo trabalho pos doutorado", ((Formacao) listprod.get(0)).getTituloTrabalho());
		assertEquals(2009, listprod.get(0).getAno());
		assertEquals("Nome instituicao pos doutorado", ((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("CONCLUIDO", ((Formacao) listprod.get(0)).getStatus());
		assertEquals("nome curso posdoutorado", listprod.get(0).getTitulo());
	}

	@Test
	public void ResidenciaProfTeste() throws Exception {
		File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		Document xmlfile = docBuilder.parse(file);
		SearchXMLFormacoes searchXML = new SearchXMLFormacoes(xmlfile);
		ArrayList<ObjetoCriterio> listprod = searchXML.ResidenciaMedica();
		assertEquals(2001, listprod.get(0).getAno());
		assertEquals("instituicao residencia", ((Formacao) listprod.get(0)).getNomeInstituicao());
		assertEquals("EM_ANDAMENTO", ((Formacao) listprod.get(0)).getStatus());
		assertEquals("titulo residencia", listprod.get(0).getTitulo());
	}

}
