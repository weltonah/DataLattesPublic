package br.com.Modelo;

public class DadosCriterio {
	private String NomeCriterio;
	private String Valor;
	private String Limite;
	public DadosCriterio(String nomeCriterio, String valor) {
		super();
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