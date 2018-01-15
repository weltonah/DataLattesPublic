package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.Modelo.Autores;
import br.com.Modelo.Orientacao;
import br.com.Modelo.Producao;
import br.com.Modelo.RegistroPatente;
import br.com.Modelo.Tipo0;
import br.com.Modelo.Tipo1;
import br.com.Modelo.Tipo2;
import br.com.Modelo.Tipo3;
import br.com.Modelo.Tipo4;
import br.com.Modelo.Tipo5;
import br.com.Modelo.Tipo6;
import br.com.Modelo.Tipo8;

public class SearchXML {

	XPath xpath;
	public Document xmlfile;

	public SearchXML(Document xmlfile) {
		XPathFactory xPathfactory = XPathFactory.newInstance();
		this.xpath = xPathfactory.newXPath();
		this.xmlfile = xmlfile;
	}

	public ArrayList<Producao> BuscaProducao(String raiz, int a, String aux) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList livros = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Producao> ListArtigoCompleto = new ArrayList<Producao>();
		for (int i = 0; i < livros.getLength(); i++) {
			Node TipoNode = livros.item(i);
			String titulo = TipoNode.getChildNodes().item(1).getAttributes().getNamedItem("TITULO")
					.getTextContent();
			int ano = Integer
					.valueOf(TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
			Producao prod = new Producao(titulo, ano);
			if (aux != null) {
				String campAux = TipoNode.getChildNodes().item(a).getAttributes().getNamedItem(aux).getTextContent();
				prod.setCampAux(campAux);
			}
			NodeList listAutores = TipoNode.getChildNodes();
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
	
	public ArrayList<Tipo6> BuscaBanca(String raiz,String nomeTitulo, int a, String aux, int b , String aux2) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList livros = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo6> ListArtigoCompleto = new ArrayList<Tipo6>();
		for (int i = 0; i < livros.getLength(); i++) {
			Node TipoNode = livros.item(i);
			String titulo = TipoNode.getChildNodes().item(1).getAttributes().getNamedItem(nomeTitulo)
					.getTextContent();
			String natureza = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			int ano = Integer
					.valueOf(TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
			Tipo6 prod = new Tipo6(titulo, ano, natureza);
			if (aux != null) {
				String campAux = TipoNode.getChildNodes().item(a).getAttributes().getNamedItem(aux).getTextContent();
				prod.setCampAux(campAux);
			}
			if (aux2 != null) {
				String campAux2 = TipoNode.getChildNodes().item(b).getAttributes().getNamedItem(aux2).getTextContent();
				prod.setCampAux(campAux2);
			}
			NodeList listAutores = TipoNode.getChildNodes();
			for (int j = 0; j < listAutores.getLength(); j++) {
				Node autoresNode = listAutores.item(j);
				if (autoresNode.getNodeName().contentEquals("PARTICIPANTE-BANCA")) {
					String aux0 = autoresNode.getAttributes().getNamedItem("NOME-COMPLETO-DO-PARTICIPANTE-DA-BANCA").getTextContent();
					String aux1 = autoresNode.getAttributes().getNamedItem("NOME-PARA-CITACAO-DO-PARTICIPANTE-DA-BANCA").getTextContent();
					Autores aut = new Autores(aux0, aux1);
					prod.AddAutores(aut);
				}
			}
			ListArtigoCompleto.add(prod);
		}
		return ListArtigoCompleto;
	}
	
	public ArrayList<Orientacao> BuscaOrientacao(String raiz, String NomeTitulo, int a, String aux,int b, String aux2)
			throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList artigos = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Orientacao> ListArtigoCompleto = new ArrayList<Orientacao>();
		for (int i = 0; i < artigos.getLength(); i++) {
			Node artigoNode = artigos.item(i);
			String titulo = artigoNode.getChildNodes().item(0).getAttributes().getNamedItem(NomeTitulo)
					.getTextContent();
			String natureza = artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			int ano = Integer
					.valueOf(artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
			String nome_aluno = artigoNode.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTADO")
					.getTextContent();
			
			Orientacao prod = new Orientacao(natureza, titulo, ano, nome_aluno);
			if (aux != null) {
				String campAux = artigoNode.getChildNodes().item(a).getAttributes().getNamedItem(aux).getTextContent();
				prod.setCampAux(campAux);
			}
			if (aux2 != null) {
				String campAux2 = artigoNode.getChildNodes().item(b).getAttributes().getNamedItem(aux2).getTextContent();
				prod.setCampAux(campAux2);
			}
			
			ListArtigoCompleto.add(prod);
		}
		return ListArtigoCompleto;
	}
	
	

	public ArrayList<Tipo0> BuscaTipo0(String raiz, String Tipocodigo, String NomeTitulo, String NomeAno, int a,
			String aux, int b, String aux2) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList artigos = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo0> ListArtigoCompleto = new ArrayList<Tipo0>();
		for (int i = 0; i < artigos.getLength(); i++) {
			Node artigoNode = artigos.item(i);
			String titulo = artigoNode.getChildNodes().item(0).getAttributes().getNamedItem(NomeTitulo)
					.getTextContent();
			String natureza = artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			String codigo = artigoNode.getChildNodes().item(1).getAttributes().getNamedItem(Tipocodigo)
					.getTextContent();
			int ano = Integer
					.valueOf(artigoNode.getChildNodes().item(0).getAttributes().getNamedItem(NomeAno).getTextContent());
			Tipo0 prod = new Tipo0(titulo, ano, natureza, codigo);
			if (aux != null) {
				String campAux = artigoNode.getChildNodes().item(a).getAttributes().getNamedItem(aux).getTextContent();
				prod.setCampAux(campAux);
			}
			if (aux2 != null) {
				String campAux2 = artigoNode.getChildNodes().item(b).getAttributes().getNamedItem(aux2)
						.getTextContent();
				prod.setCampAux2(campAux2);
			}
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

	public ArrayList<Tipo1> BuscaTipo1(String raiz) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList livros = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo1> ListArtigoCompleto = new ArrayList<Tipo1>();
		for (int i = 0; i < livros.getLength(); i++) {
			Node TipoNode = livros.item(i);
			String titulo = TipoNode.getChildNodes().item(1).getAttributes().getNamedItem("TITULO-DO-LIVRO")
					.getTextContent();
			String tituloCap = TipoNode.getChildNodes().item(0).getAttributes()
					.getNamedItem("TITULO-DO-CAPITULO-DO-LIVRO").getTextContent();
			String codigo = TipoNode.getChildNodes().item(1).getAttributes().getNamedItem("ISBN").getTextContent();
			int ano = Integer
					.valueOf(TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
			Tipo1 prod = new Tipo1(titulo, ano, codigo);
			prod.setCampAux(tituloCap);
			NodeList listAutores = TipoNode.getChildNodes();
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

	public ArrayList<Tipo2> BuscaTipo2(String raiz, String Tipocodigo, String NomeTitulo, int a, String aux)
			throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList livros = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo2> ListArtigoCompleto = new ArrayList<Tipo2>();
		for (int i = 0; i < livros.getLength(); i++) {
			Node TipoNode = livros.item(i);
			String titulo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem(NomeTitulo).getTextContent();
			String natureza = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			String tipo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("TIPO").getTextContent();
			String codigo = TipoNode.getChildNodes().item(1).getAttributes().getNamedItem(Tipocodigo).getTextContent();
			int ano = Integer
					.valueOf(TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
			Tipo2 prod = new Tipo2(titulo, ano, natureza, tipo, codigo);
			if (aux != null) {
				String campAux = TipoNode.getChildNodes().item(a).getAttributes().getNamedItem(aux).getTextContent();
				prod.setCampAux(campAux);
			}
			NodeList listAutores = TipoNode.getChildNodes();
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

	public ArrayList<Tipo3> BuscaTipo3(String raiz, String NomeTitulo, String NomeAno) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList livros = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo3> ListArtigoCompleto = new ArrayList<Tipo3>();
		for (int i = 0; i < livros.getLength(); i++) {
			Node TipoNode = livros.item(i);
			
			System.out.println(TipoNode.getChildNodes().getLength());
			String titulo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem(NomeTitulo).getTextContent();
			int ano = Integer
					.valueOf(TipoNode.getChildNodes().item(0).getAttributes().getNamedItem(NomeAno).getTextContent());
			Node RegPatente = TipoNode.getChildNodes().item(1).getFirstChild();
			String tipoPatente = RegPatente.getAttributes().getNamedItem("TIPO-PATENTE").getTextContent();
			String codigoPatente = RegPatente.getAttributes().getNamedItem("CODIGO-DO-REGISTRO-OU-PATENTE")
					.getTextContent();
			String dataConcessao = RegPatente.getAttributes().getNamedItem("DATA-DE-CONCESSAO").getTextContent();
			String nomeTitular = RegPatente.getAttributes().getNamedItem("NOME-DO-TITULAR").getTextContent();
			RegistroPatente regPatente = new RegistroPatente(tipoPatente, codigoPatente, dataConcessao, nomeTitular);
			
			Tipo3 prod = new Tipo3(titulo, ano, regPatente);
			NodeList listAutores = TipoNode.getChildNodes();
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

	public ArrayList<Tipo4> BuscaTipo4(String raiz, String NomeTitulo, String NomeAno) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList livros = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo4> ListArtigoCompleto = new ArrayList<Tipo4>();
		for (int i = 0; i < livros.getLength(); i++) {
			Node TipoNode = livros.item(i);
			System.out.println(TipoNode.getChildNodes().getLength());
			for (int j = 0; j < 15; j++)
				System.out.println(TipoNode.getChildNodes().item(j).toString());
			String titulo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem(NomeTitulo).getTextContent();
			String natureza = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			int ano = Integer
					.valueOf(TipoNode.getChildNodes().item(0).getAttributes().getNamedItem(NomeAno).getTextContent());
			Node RegPatente = TipoNode.getChildNodes().item(1).getFirstChild();
			String tipoPatente = RegPatente.getAttributes().getNamedItem("TIPO-PATENTE").getTextContent();
			String codigoPatente = RegPatente.getAttributes().getNamedItem("CODIGO-DO-REGISTRO-OU-PATENTE")
					.getTextContent();
			String dataConcessao = RegPatente.getAttributes().getNamedItem("DATA-DE-CONCESSAO").getTextContent();
			String nomeTitular = RegPatente.getAttributes().getNamedItem("NOME-DO-TITULAR").getTextContent();
			RegistroPatente regPatente = new RegistroPatente(tipoPatente, codigoPatente, dataConcessao, nomeTitular);

			Tipo4 prod = new Tipo4(titulo, ano, regPatente, natureza);
			NodeList listAutores = TipoNode.getChildNodes();
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

	public ArrayList<Tipo5> BuscaTipo5(String raiz) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList livros = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo5> ListArtigoCompleto = new ArrayList<Tipo5>();
		for (int i = 0; i < livros.getLength(); i++) {
			Node TipoNode = livros.item(i);
			System.out.println(TipoNode.getChildNodes().getLength());
			String titulo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-PRODUTO")
					.getTextContent();
			int ano = Integer
					.valueOf(TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
			String natureza = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			String tipo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("TIPO-PRODUTO")
					.getTextContent();
			Node RegPatente = TipoNode.getChildNodes().item(1).getFirstChild();
			String tipoPatente = RegPatente.getAttributes().getNamedItem("TIPO-PATENTE").getTextContent();
			String codigoPatente = RegPatente.getAttributes().getNamedItem("CODIGO-DO-REGISTRO-OU-PATENTE")
					.getTextContent();
			String dataConcessao = RegPatente.getAttributes().getNamedItem("DATA-DE-CONCESSAO").getTextContent();
			String nomeTitular = RegPatente.getAttributes().getNamedItem("NOME-DO-TITULAR").getTextContent();
			RegistroPatente regPatente = new RegistroPatente(tipoPatente, codigoPatente, dataConcessao, nomeTitular);

			Tipo5 prod = new Tipo5(titulo, ano, natureza, tipo, regPatente);
			NodeList listAutores = TipoNode.getChildNodes();
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

	public ArrayList<Tipo6> BuscaTipo6(String raiz, String NomeTitulo, int a, String aux,int b, String aux2)
			throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList artigos = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo6> ListArtigoCompleto = new ArrayList<Tipo6>();
		for (int i = 0; i < artigos.getLength(); i++) {
			Node artigoNode = artigos.item(i);
			String titulo = artigoNode.getChildNodes().item(0).getAttributes().getNamedItem(NomeTitulo)
					.getTextContent();
			String natureza = artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			int ano = Integer
					.valueOf(artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
			Tipo6 prod = new Tipo6(titulo, ano, natureza);
			if (aux != null) {
				String campAux = artigoNode.getChildNodes().item(a).getAttributes().getNamedItem(aux).getTextContent();
				prod.setCampAux(campAux);
			}
			if (aux2 != null) {
				String campAux2 = artigoNode.getChildNodes().item(b).getAttributes().getNamedItem(aux2).getTextContent();
				prod.setCampAux(campAux2);
			}
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

	public ArrayList<Tipo8> BuscaTipo8(String raiz, int a, String aux) throws XPathExpressionException {
		XPathExpression expr = xpath.compile(raiz);
		NodeList livros = (NodeList) expr.evaluate(xmlfile, XPathConstants.NODESET);
		ArrayList<Tipo8> ListArtigoCompleto = new ArrayList<Tipo8>();
		for (int i = 0; i < livros.getLength(); i++) {
			Node TipoNode = livros.item(i);
			System.out.println(TipoNode.getChildNodes().getLength());
			String titulo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO")
					.getTextContent();
			int ano = Integer
					.valueOf(TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
			String natureza = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA")
					.getTextContent();
			String tipo = TipoNode.getChildNodes().item(0).getAttributes().getNamedItem("TIPO-PRODUTO")
					.getTextContent();
			Tipo8 prod = new Tipo8(titulo, ano, natureza, tipo);
			if (aux != null) {
				String campAux = TipoNode.getChildNodes().item(a).getAttributes().getNamedItem(aux).getTextContent();
				prod.setCampAux(campAux);
			}
			NodeList listAutores = TipoNode.getChildNodes();
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

}
