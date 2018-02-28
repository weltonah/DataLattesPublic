package br.com.estrutura;

import java.util.ArrayList;

public class CriterioEstrutura {
	private String criterio;
	private String abre;
	private boolean possuilimite;
	private double ValorTotalCriterio;
	private ArrayList<ArrayList<TipoEstrutura>> listTipo;
	private ArrayList<DadosTipoList> dadosTipoList;

	public CriterioEstrutura(String criterio, String abre) {
		super();
		this.criterio = criterio;
		this.abre = abre;
		this.ValorTotalCriterio = 0;
		this.listTipo = new ArrayList<ArrayList<TipoEstrutura>>();
	}
	public String getCriterio() {
		return this.criterio;
	}
	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

	public ArrayList<ArrayList<TipoEstrutura>> getListTipo() {
		return this.listTipo;
	}

	public void addListTipo(ArrayList<TipoEstrutura> tipo) {
		this.listTipo.add(tipo);
	}

	public String getAbre() {
		return this.abre;
	}

	public void setAbre(String abre) {
		this.abre = abre;
	}

	public ArrayList<DadosTipoList> getDadosTipoList() {
		return this.dadosTipoList;
	}

	public void setDadosTipoList(ArrayList<DadosTipoList> dadosTipoList) {
		this.dadosTipoList = dadosTipoList;
	}

	public void setListTipo(ArrayList<ArrayList<TipoEstrutura>> listTipo) {
		this.listTipo = listTipo;
	}

	public boolean isPossuilimite() {
		return this.possuilimite;
	}

	public void setPossuilimite(boolean possuilimite) {
		this.possuilimite = possuilimite;
	}

	public double getValorTotalCriterio() {
		return this.ValorTotalCriterio;
	}

	public void setValorTotalCriterio(double valorTotalCriterio) {
		this.ValorTotalCriterio = valorTotalCriterio;
	}

	
	
}
