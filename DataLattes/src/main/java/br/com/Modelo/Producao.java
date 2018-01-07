package br.com.Modelo;

import java.util.ArrayList;

public class Producao {
	private String natureza;
	private ArrayList<String[]> autores;
	private String titulo;
	private String ano;
	private String issn;
	private String tipo;
	
	public Producao(String natureza, String titulo, String ano, String issn) {
		this.natureza = natureza;
		this.autores = new ArrayList<String[]>();
		this.titulo = titulo;
		this.ano = ano;
		this.issn = issn;
	}
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	public ArrayList<String[]> getAutores() {
		return autores;
	}
	public void addAutores(String[] autores) {
		this.autores.add(autores);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
