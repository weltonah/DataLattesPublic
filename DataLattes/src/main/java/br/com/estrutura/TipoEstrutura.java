package br.com.estrutura;

public class TipoEstrutura {
	private String nomeTipo;
	private String abre;
	private String limite;

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
