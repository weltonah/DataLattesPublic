package br.com.estrutura;

public class TipoEstrutura {
	private String nomeTipo;
	private int valor;
	private String abre;
	private int limite;

	public TipoEstrutura(String nomeTipo, int valor, String abre, int limite) {
		this.nomeTipo = nomeTipo;
		this.valor = valor;
		this.abre = abre;
		this.limite = limite;
	}

	public TipoEstrutura(String nomeCriterio, String abre) {
		this.nomeTipo = nomeCriterio;
		this.abre = abre;
	}

	public String getNomeTipo() {
		return this.nomeTipo;
	}

	public void setNomeTipo(String nomeCriterio) {
		this.nomeTipo = nomeCriterio;
	}

	public String getAbre() {
		return this.abre;
	}

	public void setAbre(String abre) {
		this.abre = abre;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getLimite() {
		return this.limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

}
