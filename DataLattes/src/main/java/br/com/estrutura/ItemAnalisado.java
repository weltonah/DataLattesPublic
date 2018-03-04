package br.com.estrutura;

import br.com.Modelo.ObjetoCriterio;

public class ItemAnalisado {
	private int validade;
	private ObjetoCriterio item;


	public ItemAnalisado(int validade, ObjetoCriterio item) {
		super();
		this.validade = validade;
		this.item = item;
	}

	public ObjetoCriterio getItem() {
		return this.item;
	}

	public void setItem(ObjetoCriterio item) {
		this.item = item;
	}

	public int getValidade() {
		return this.validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}


}
