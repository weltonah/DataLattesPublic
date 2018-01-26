package br.com.estrutura;

import java.util.ArrayList;

public class AreaEstrutura {
	private String nome;
	private ArrayList<CriterioEstrutura> ListCrit;
	public AreaEstrutura(String nome) {
		super();
		this.nome = nome;
		this.ListCrit = new ArrayList<CriterioEstrutura>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<CriterioEstrutura> getListCrit() {
		return ListCrit;
	}
	public void setListCrit(ArrayList<CriterioEstrutura> listCrit) {
		ListCrit = listCrit;
	}
	public void addListCrit(CriterioEstrutura crit) {
		ListCrit.add(crit);
	}
	
	
}
