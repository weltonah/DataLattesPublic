package br.com.estrutura;

public class DadosCurricular {
	private String nome;
	private String endereco;
	private String resumo;
	private String idLattes;
	private String ultAtualizacao;

	public DadosCurricular(String nome, String endereco, String resumo, String idLattes, String ultAtualizacao) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.resumo = resumo;
		this.idLattes = idLattes;
		this.ultAtualizacao = ultAtualizacao;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getResumo() {
		return this.resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getIdLattes() {
		return this.idLattes;
	}

	public void setIdLattes(String idLattes) {
		this.idLattes = idLattes;
	}

	public String getUltAtualizacao() {
		return this.ultAtualizacao;
	}

	public void setUltAtualizacao(String ultAtualizacao) {
		this.ultAtualizacao = ultAtualizacao;
	}

}
