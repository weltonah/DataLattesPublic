package br.com.Modelo;



/**
 * 
 */
public class Tipo7 extends Producao {

	/**
	 * Default constructor

	/**
	 * 
	 */
	private String tipo;

	public Tipo7(String titulo, int ano,   String tipo) {
		super(titulo, ano);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}