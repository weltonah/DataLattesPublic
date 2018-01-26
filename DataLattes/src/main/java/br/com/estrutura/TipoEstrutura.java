package br.com.estrutura;

public class TipoEstrutura {
	private String NomeCriterio;
	private String Valor;
	private String Limite;
	public TipoEstrutura(String nomeCriterio, String valor) {
		NomeCriterio = nomeCriterio;
		Valor = valor;
	}
	public String getNomeCriterio() {
		return NomeCriterio;
	}
	public void setNomeCriterio(String nomeCriterio) {
		NomeCriterio = nomeCriterio;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
	}
	public String getLimite() {
		return Limite;
	}
	public void setLimite(String limite) {
		Limite = limite;
	}
	
	
}
