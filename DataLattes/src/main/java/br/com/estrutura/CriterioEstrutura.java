package br.com.estrutura;

import java.util.ArrayList;

public class CriterioEstrutura {
	private String criterio;
	private String abre;
	private int tipo;
	private ArrayList<ArrayList<TipoEstrutura>> listTipo;

	public CriterioEstrutura(String criterio, String abre, int tipo) {
		super();
		this.criterio = criterio;
		this.abre = abre;
		this.tipo = tipo;
		this.listTipo = new ArrayList<ArrayList<TipoEstrutura>>();
	}

	public CriterioEstrutura(String criterio, String abre) {
		super();
		this.criterio = criterio;
		this.abre = abre;
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

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
