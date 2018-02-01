package br.com.estrutura;

import java.util.ArrayList;

public class Estrutura {
	private ArrayList<AreaEstrutura> listEst;

	public Estrutura() {
		this.listEst = new ArrayList<AreaEstrutura>();
	}

	public void addList(AreaEstrutura e) {
		this.listEst.add(e);
	}

	public ArrayList<AreaEstrutura> getListEst() {
		return this.listEst;
	}

	public void setListEst(ArrayList<AreaEstrutura> listEst) {
		this.listEst = listEst;
	}

}
