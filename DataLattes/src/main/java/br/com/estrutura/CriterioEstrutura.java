package br.com.estrutura;

import java.util.ArrayList;

public class CriterioEstrutura {
	private String criterio;
	private String abre;
	private int tipo;
	private ArrayList<TipoEstrutura> listTipo;

	public CriterioEstrutura(String criterio, String abre, int tipo) {
		super();
		this.criterio = criterio;
		this.abre = abre;
		this.tipo = tipo;
		this.listTipo = new ArrayList<TipoEstrutura>();
	}

	public CriterioEstrutura(String criterio, String abre) {
		super();
		this.criterio = criterio;
		this.abre = abre;
		this.listTipo = new ArrayList<TipoEstrutura>();
	}
	public String getCriterio() {
		return this.criterio;
	}
	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}
	public ArrayList<TipoEstrutura> getListTipo() {
		return this.listTipo;
	}
	public void setListTipo(ArrayList<TipoEstrutura> listTipo) {
		this.listTipo = listTipo;
	}
	public void addListTipo(TipoEstrutura tipo) {
		this.listTipo.add(tipo);
	}

	public String getAbre() {
		return this.abre;
	}

	public void setAbre(String abre) {
		this.abre = abre;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
