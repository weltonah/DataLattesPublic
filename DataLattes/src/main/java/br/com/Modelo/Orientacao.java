package br.com.Modelo;

public class Orientacao {
	private String natureza;
	private String titulo;
	private int ano;
	private String nome_aluno;
	private String campAux;
	private String campAux2;
	public Orientacao(String natureza, String titulo, int ano, String nome_aluno) {
		super();
		this.natureza = natureza;
		this.titulo = titulo;
		this.ano = ano;
		this.nome_aluno = nome_aluno;
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getNome_aluno() {
		return nome_aluno;
	}
	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}
	public String getCampAux() {
		return campAux;
	}
	public void setCampAux(String campAux) {
		this.campAux = campAux;
	}
	public String getCampAux2() {
		return campAux2;
	}
	public void setCampAux2(String campAux2) {
		this.campAux2 = campAux2;
	}
	
}
