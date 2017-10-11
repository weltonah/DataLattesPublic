package br.com.Modelo;

public class Obras {
	private String Nome;
	private boolean valido;
	private float valor;
	private String issn;
	private float FI;
	
	public Obras(){
		valido = true;
		issn = "null";
		FI=0;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public boolean isValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	public float getFI() {
		return FI;
	}
	public void setFI(float fI) {
		FI = fI;
	}
}
