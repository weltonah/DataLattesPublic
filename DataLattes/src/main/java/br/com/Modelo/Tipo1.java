package br.com.Modelo;

/**
 * 
 */
public class Tipo1 extends Tipo7 {

	/**
	 * Default constructor
	 */

	/**
	 * 
	 */
	private String codigo;

	public Tipo1(String titulo, int ano, String tipo, String codigo) {
		super(titulo, ano, tipo);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}