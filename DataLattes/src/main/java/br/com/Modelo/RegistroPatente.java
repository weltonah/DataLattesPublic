package br.com.Modelo;




/**
 * 
 */
public class RegistroPatente {

	/**
	 * Default constructor


	/**
	 * 
	 */
	private String tipoPatente;

	/**
	 * 
	 */
	private String codigoPatente;

	/**
	 * 
	 */
	private String dataConcessao;

	/**
	 * 
	 */
	private String nomeTitular;

	public RegistroPatente(String tipoPatente, String codigoPatente, String dataConcessao, String nomeTitular) {
		super();
		this.tipoPatente = tipoPatente;
		this.codigoPatente = codigoPatente;
		this.dataConcessao = dataConcessao;
		this.nomeTitular = nomeTitular;
	}

	public String getTipoPatente() {
		return tipoPatente;
	}

	public void setTipoPatente(String tipoPatente) {
		this.tipoPatente = tipoPatente;
	}

	public String getCodigoPatente() {
		return codigoPatente;
	}

	public void setCodigoPatente(String codigoPatente) {
		this.codigoPatente = codigoPatente;
	}

	public String getDataConcessao() {
		return dataConcessao;
	}

	public void setDataConcessao(String dataConcessao) {
		this.dataConcessao = dataConcessao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

}