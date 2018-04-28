package br.com.SearchXML;

import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.Formacao;
import br.com.Modelo.ObjetoCriterio;
import br.com.Modelo.Orientacao;
import br.com.Modelo.Producao;
import br.com.Modelo.Tipo0;
import br.com.Modelo.Tipo2;
import br.com.Modelo.Tipo3;
import br.com.estrutura.DadosCurricular;
import br.com.estrutura.ItemAnalisado;

public class FiltroSearchXml {
	private int anofim;
	private int anoinicio;
	private Document xmlfile;
	private int limite;

	public FiltroSearchXml(int anofim, int anoinicio) {
		super();
		this.anofim = anofim;
		this.anoinicio = anoinicio;
	}

	public void setlimiteFile(Document xmlfile, int limite) {
		this.xmlfile = xmlfile;
		this.limite = limite;
	}

	public DadosCurricular PreencherDadosCurricular(Document xmlfile) {
		SearchXMLDadosGerais searchXMLDadosGerais = new SearchXMLDadosGerais(this.xmlfile);
		String nome;
		try {
			nome = searchXMLDadosGerais.NomeCompleto();
			String endereco = "";
			String resumo = searchXMLDadosGerais.ResumoCV();
			String idLattes = searchXMLDadosGerais.IDLattes();
			String ultAtualizacao = searchXMLDadosGerais.UltimaAtualizacao();
			DadosCurricular dadosCurricular = new DadosCurricular(nome, endereco, resumo, idLattes, ultAtualizacao);
			return dadosCurricular;
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public ArrayList<ItemAnalisado> PreencherItemBolean(boolean flag) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		ItemAnalisado item;
		if (flag)
			item = new ItemAnalisado(0, new Producao("Possui Dedicação exclusiva", 2000));
		else {
			item = new ItemAnalisado(1, new Producao("Não possui Dedicação exclusiva", 2000));
		}
		listItem.add(item);
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimite(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<>();
		listArray.stream().filter(u -> (u.getAno() < this.anoinicio || u.getAno() > this.anofim))
				.forEach(u -> listItem.add(new ItemAnalisado(1, u)));
		listArray.stream().filter(u -> (u.getAno() >= this.anoinicio && u.getAno() <= this.anofim)).limit(this.limite)
				.forEach(u -> listItem.add(new ItemAnalisado(0, u)));
		listArray.stream().filter(u -> (u.getAno() >= this.anoinicio && u.getAno() <= this.anofim)).skip(this.limite)
				.forEach(u -> listItem.add(new ItemAnalisado(2, u)));
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoOri(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Orientacao) u).getCampAux().contentEquals("ORIENTADOR_PRINCIPAL"))
				.collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoCoo(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Orientacao) u).getCampAux().contentEquals("CO_ORIENTADOR")).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoTipo(ArrayList<ObjetoCriterio> listArray,
			String tipoString) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Orientacao) u).getNatureza().contentEquals(tipoString)).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimiteOriTipo(ArrayList<ObjetoCriterio> listArray, String tipoString) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Orientacao) u).getCampAux2().contentEquals(tipoString)
						&& (((Orientacao) u).getCampAux().contentEquals("ORIENTADOR_PRINCIPAL")))
				.collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimiteCooTipo(ArrayList<ObjetoCriterio> listArray, String tipoString) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Orientacao) u).getCampAux2().contentEquals(tipoString)
						&& (((Orientacao) u).getCampAux().contentEquals("CO_ORIENTADOR")))
				.collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherItemFormacaoAndCon(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Formacao) u).getStatus().contentEquals("CONCLUIDO")
						|| ((Formacao) u).getStatus().contentEquals("EM_ANDAMENTO"))
				.collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherItemFormacaoAnd(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Formacao) u).getStatus().contentEquals("EM_ANDAMENTO")).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherItemFormacaoCon(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Formacao) u).getStatus().contentEquals("CONCLUIDO")).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimiteCole(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Producao) u).getAutores().size() > 1).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimiteInd(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Producao) u).getAutores().size() == 1).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimiteTrabNac(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> !((Producao) u).getCampAux().contentEquals("INTERNACIONAL"))
				.filter(u -> ((Tipo0) u).getNatureza().contentEquals("COMPLETO")).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimiteTrabInt(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Producao) u).getCampAux().contentEquals("INTERNACIONAL"))
				.filter(u -> ((Tipo0) u).getNatureza().contentEquals("COMPLETO")).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimiteTrabCompleto(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Tipo0) u).getNatureza().contentEquals("COMPLETO")).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimiteOr(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Tipo2) u).getTipo().contentEquals("LIVRO_ORGANIZADO_OU_EDICAO"))
				.collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimitePu(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Tipo2) u).getTipo().contentEquals("LIVRO_PUBLICADO")).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimitePatenteNac(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> ((Tipo3) u).getCampAux().contentEquals("Brasil")).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public ArrayList<ItemAnalisado> PreencherAnoLimitePatenteInt(ArrayList<ObjetoCriterio> listArray) {
		ArrayList<ObjetoCriterio> listArrayFiltrado = (ArrayList<ObjetoCriterio>) listArray.stream()
				.filter(u -> !((Tipo3) u).getCampAux().contentEquals("Brasil")).collect(Collectors.toList());
		return PreencherAnoLimite(listArrayFiltrado);
	}

	public Document getXmlfile() {
		return this.xmlfile;
	}

	public void setXmlfile(Document xmlfile) {
		this.xmlfile = xmlfile;
	}

}
