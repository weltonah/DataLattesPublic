package br.com.estrutura;

public class ItemAnalisado {
	private int valorContabilizado;
	private boolean valido;
	private Object item;

	public ItemAnalisado(int valorContabilizado, boolean valido, Object item) {
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

}
