package br.com.estrutura;

import java.util.ArrayList;

public class CriterioEstrutura {
	private String Criterio;
	private ArrayList<TipoEstrutura> ListTipo;
	public CriterioEstrutura(String criterio) {
		super();
		Criterio = criterio;
		ListTipo = new ArrayList<TipoEstrutura>();
	}
	public String getCriterio() {
		return Criterio;
	}
	public void setCriterio(String criterio) {
		Criterio = criterio;
	}
	public ArrayList<TipoEstrutura> getListTipo() {
		return ListTipo;
	}
	public void setListTipo(ArrayList<TipoEstrutura> listTipo) {
		ListTipo = listTipo;
	}
	public void addListTipo(TipoEstrutura tipo) {
		ListTipo.add(tipo);
	}
	
	
}
