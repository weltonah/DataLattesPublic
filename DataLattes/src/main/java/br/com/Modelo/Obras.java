package br.com.Modelo;

import java.util.ArrayList;

public class Obras {
	private String nome;
	private boolean valido;
	private float valor;
	private String issn;
	private float FI;
	private ArrayList<String> coautores;
	
	public Obras(){
		valido = true;
		issn = "null";
		FI=0;
		coautores = new ArrayList<String>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public ArrayList<String> getCoautores() {
		return coautores;
	}
	public void AddCoautores(String coautores) {
		this.coautores.add(coautores);
	}
}
