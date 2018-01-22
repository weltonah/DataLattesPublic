package br.com.Modelo;

import java.util.ArrayList;
import java.util.List;

public class CriteriosCheckBox {
	private ArrayList<String> formacao;
	private ArrayList<String> prodTec;
	private ArrayList<String> prodArt;
	private ArrayList<String> prodBibli;
	private ArrayList<String> OriBanc;
	private ArrayList<String> DadosGerais;
	public CriteriosCheckBox() {
		this.formacao = new ArrayList<String>();
		preencherFormacao();
		this.prodTec = new ArrayList<String>();
		preencherprodTec();
		this.prodArt = new ArrayList<String>();
		preencherprodArt();
		this.prodBibli = new ArrayList<String>();
		preencherprodBibli();
		this.OriBanc = new ArrayList<String>();
		preencherOriBanc();
		this.DadosGerais = new ArrayList<String>();
		preencherDadosGerais();
	}
	private void preencherFormacao() {
		this.formacao.add("Graduação");
		this.formacao.add("Especialização");
		this.formacao.add("Mestrado");
		this.formacao.add("Doutorado");
		this.formacao.add("Pós-Doutorado");
		this.formacao.add("Livre-docência");
		this.formacao.add("Curso Técnico ou Profissionalizante");
		this.formacao.add("Mestrado Profissionalizante");
		this.formacao.add("Residência médica");
		this.formacao.add("Aperfeiçoamento");
		this.formacao.add("MBA");
	}
	private void preencherprodTec() {
		this.prodTec.add("Tradução");
		this.prodTec.add("Cultivação Registrada");
		this.prodTec.add("Cultivação Protegida");
		this.prodTec.add("Software");
		this.prodTec.add("Patente");
		this.prodTec.add("Desenho Técnico");
		this.prodTec.add("Marca");
		this.prodTec.add("Topografia de circuito integrado");
		this.prodTec.add("Produto Tecnologico");
		this.prodTec.add("Processo ou técnica");
		this.prodTec.add("Trabalho Técnico");
		this.prodTec.add("Apresentação de Trabalho");
		this.prodTec.add("Carta, mapa ou similar");
		this.prodTec.add("Curso ministrado de curta duração");
		this.prodTec.add("Produção de material didatico");
		this.prodTec.add("Editoração");
		this.prodTec.add("Manutenção de obra artistica");
		this.prodTec.add("Maquete");
		this.prodTec.add("Organização de evento");
		this.prodTec.add("Comentario em programa de Radio ou TV");
		this.prodTec.add("Relatorio de pesquisa");
		this.prodTec.add("Texto em midia Social");
	}
	private void preencherprodArt() {
		this.prodArt.add("Criação de Partitura");
		this.prodArt.add("Apresentação de Obra Artistica");
		this.prodArt.add("Apresentação de programa em Radio ou TV");
		this.prodArt.add("Arranjo musical");
		this.prodArt.add("Composição musical");
		this.prodArt.add("Obra de Artes vizuais");
		this.prodArt.add("Sonoplastia");
		this.prodArt.add("Trabalho em Arte Cenicas");
		this.prodArt.add("Trabalho em Artes Vizuais");
		this.prodArt.add("Musica");
		
	}
	private void preencherprodBibli() {
		this.prodBibli.add("Trabalho em eventos");
		this.prodBibli.add("Artigos publicados");
		this.prodBibli.add("Artigos aceitos para publicação");
		this.prodBibli.add("Textos em jornais ou revista");
		this.prodBibli.add("Capítulo de livro");
		this.prodBibli.add("Organização de livro");
		this.prodBibli.add("Publicação de livro");
		this.prodBibli.add("Prefácio ou posfácio de livro");
		
	}
	private void preencherOriBanc() {
		this.OriBanc.add("Orientação Mestrado");
		this.OriBanc.add("Orientação Doutorado");
		this.OriBanc.add("Orientação Aperfeicoamento");
		this.OriBanc.add("Orientação Especialização ou Aperfeiçoamento");
		this.OriBanc.add("Orientação de Graduação");
		this.OriBanc.add("Orientação de Iniciação Cientifica");
		this.OriBanc.add("Banca de Mestrado");
		this.OriBanc.add("Banca de Doutorado");
		this.OriBanc.add("Banca de Qualificação");
		this.OriBanc.add("Banca de Especialização ou Aperfeiçoamento");
		this.OriBanc.add("Banca de Graduação");
		this.OriBanc.add("Banca de Professor Titular");
		this.OriBanc.add("Banca de Concurso Publico");
		this.OriBanc.add("Banca de Livre-docencia");
		this.OriBanc.add("Banca de Avaliação de curso");
	}
	private void preencherDadosGerais() {
		this.DadosGerais.add("Dedicação Exclusiva");
	}
	public ArrayList<String> getFormacao() {
		return formacao;
	}
	public void setFormacao(ArrayList<String> formacao) {
		this.formacao = formacao;
	}
	public ArrayList<String> getProdTec() {
		return prodTec;
	}
	public void setProdTec(ArrayList<String> prodTec) {
		this.prodTec = prodTec;
	}
	public ArrayList<String> getProdArt() {
		return prodArt;
	}
	public void setProdArt(ArrayList<String> prodArt) {
		this.prodArt = prodArt;
	}
	public ArrayList<String> getProdBibli() {
		return prodBibli;
	}
	public void setProdBibli(ArrayList<String> prodBibli) {
		this.prodBibli = prodBibli;
	}
	public ArrayList<String> getOriBanc() {
		return OriBanc;
	}
	public void setOriBanc(ArrayList<String> oriBanc) {
		OriBanc = oriBanc;
	}
	public ArrayList<String> getDadosGerais() {
		return DadosGerais;
	}
	public void setDadosGerais(ArrayList<String> dadosGerais) {
		DadosGerais = dadosGerais;
	}
	
}
