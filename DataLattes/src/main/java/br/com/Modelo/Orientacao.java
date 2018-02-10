package br.com.Modelo;

public class Orientacao extends ObjetoCriterio {
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
		return this.natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	@Override
	public String getTitulo() {
		return this.titulo;
	}
	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public int getAno() {
		return this.ano;
	}
	@Override
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getNome_aluno() {
		return this.nome_aluno;
	}
	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}
	public String getCampAux() {
		return this.campAux;
	}
	public void setCampAux(String campAux) {
		this.campAux = campAux;
	}
	public String getCampAux2() {
		return this.campAux2;
	}
	public void setCampAux2(String campAux2) {
		this.campAux2 = campAux2;
	}
	
}
