package br.com.estrutura;

import java.util.ArrayList;

public class TipoEstrutura {
	private String nomeTipo;
	private int valor;
	private int valorTotalContabilizado;
	private String abre;
	private int limite;
	private String sentencaTabela;
	private ArrayList<ItemAnalisado> itemAnalisados;

	public TipoEstrutura(String nomeTipo, int valor, String abre, int limite) {
		this.nomeTipo = nomeTipo;
		this.valor = valor;
		this.abre = abre;
		this.limite = limite;
	}

	public TipoEstrutura(String nomeCriterio, String abre) {
		this.nomeTipo = nomeCriterio;
		this.abre = abre;
	}

	public String getNomeTipo() {
		return this.nomeTipo;
	}

	public void setNomeTipo(String nomeCriterio) {
		this.nomeTipo = nomeCriterio;
	}

	public String getAbre() {
		return this.abre;
	}

	public void setAbre(String abre) {
		this.abre = abre;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getLimite() {
		return this.limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public ArrayList<ItemAnalisado> getItemAnalisados() {
		return this.itemAnalisados;
	}

	public void setItemAnalisados(ArrayList<ItemAnalisado> itemAnalisados) {
		this.itemAnalisados = itemAnalisados;
	}

	public int getValorTotalContabilizado() {
		return this.valorTotalContabilizado;
	}

	public void setValorTotalContabilizado(int valorTotalContabilizado) {
		this.valorTotalContabilizado = valorTotalContabilizado;
	}

	public String getSentencaTabela() {
		return this.sentencaTabela;
	}

	public void setSentencaTabela(String sentencaTabela) {
		this.sentencaTabela = sentencaTabela;
	}

}
