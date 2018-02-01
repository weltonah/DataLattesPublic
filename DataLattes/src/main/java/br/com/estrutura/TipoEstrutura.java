package br.com.estrutura;

public class TipoEstrutura {
	private String nomeCriterio;
	private String abre;
	private String valor;
	private String limite;

	public TipoEstrutura(String nomeCriterio, String valor, String abre) {
		this.nomeCriterio = nomeCriterio;
		this.valor = valor;
		this.abre = abre;
	}

	public String getNomeCriterio() {
		return this.nomeCriterio;
	}

	public void setNomeCriterio(String nomeCriterio) {
		this.nomeCriterio = nomeCriterio;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getLimite() {
		return this.limite;
	}

	public void setLimite(String limite) {
		this.limite = limite;
	}

	public String getAbre() {
		return this.abre;
	}

	public void setAbre(String abre) {
		this.abre = abre;
	}

}
