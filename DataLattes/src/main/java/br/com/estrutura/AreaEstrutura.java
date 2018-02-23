package br.com.estrutura;

import java.util.ArrayList;

public class AreaEstrutura {
	private String nome;
	private String abre;
	private Double ValorTotalArea;
	private ArrayList<CriterioEstrutura> listCrit;

	public AreaEstrutura(String nome, String abre) {
		super();
		this.nome = nome;
		this.abre = abre;
		this.listCrit = new ArrayList<CriterioEstrutura>();
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<CriterioEstrutura> getListCrit() {
		return this.listCrit;
	}
	public void setListCrit(ArrayList<CriterioEstrutura> listCrit) {
		this.listCrit = listCrit;
	}
	public void addListCrit(CriterioEstrutura crit) {
		this.listCrit.add(crit);
	}

	public String getAbre() {
		return this.abre;
	}

	public void setAbre(String abre) {
		this.abre = abre;
	}

	public Double getValorTotalArea() {
		return this.ValorTotalArea;
	}

	public void setValorTotalArea(Double valorTotalArea) {
		this.ValorTotalArea = valorTotalArea;
	}
	
	
}
