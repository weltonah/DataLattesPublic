package br.com.estrutura;

import br.com.Modelo.ObjetoCriterio;

public class ItemAnalisado {
	private int valorContabilizado;
	private boolean valido;
	private ObjetoCriterio item;

	public ItemAnalisado(int valorContabilizado, boolean valido, ObjetoCriterio item) {
		super();
		this.valorContabilizado = valorContabilizado;
		this.valido = valido;
		this.item = item;
	}

	public int getValorContabilizado() {
		return this.valorContabilizado;
	}

	public void setValorContabilizado(int valorContabilizado) {
		this.valorContabilizado = valorContabilizado;
	}

	public boolean isValido() {
		return this.valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	public ObjetoCriterio getItem() {
		return this.item;
	}

	public void setItem(ObjetoCriterio item) {
		this.item = item;
	}

}
