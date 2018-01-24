package br.com.Modelo;

import java.util.ArrayList;

public class CriterioCheck {
	private String TipoCriterio;
	private ArrayList<DadosCriterio> ListDadosCriterio;
	
	
	public CriterioCheck(String tipoCriterio) {
		this.TipoCriterio = tipoCriterio;
		ListDadosCriterio = new ArrayList<DadosCriterio>();
	}

	
	public String getTipoCriterio() {
		return TipoCriterio;
	}


	public void setTipoCriterio(String tipoCriterio) {
		TipoCriterio = tipoCriterio;
	}


	public ArrayList<DadosCriterio> getListDadosCriterio() {
		return ListDadosCriterio;
	}

	public void addDadosCriterio(DadosCriterio dadosCriterio) {
		ListDadosCriterio.add(dadosCriterio);
	}
	public void setListDadosCriterio(ArrayList<DadosCriterio> listDadosCriterio) {
		ListDadosCriterio = listDadosCriterio;
	}


	
	
	
}
