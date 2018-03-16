package br.com.Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QUALIS")
public class Qualis implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1228066278910511890L;
	@EmbeddedId
	private QualisEntidade qualisEntidade;
	@Column(name = "ESTRATO")
	private String estrato;

	public Qualis(QualisEntidade qualisEntidade, String estrato) {
		super();
		this.qualisEntidade = qualisEntidade;
		this.estrato = estrato;
	}

	public QualisEntidade getQualisEntidade() {
		return this.qualisEntidade;
	}

	public void setQualisEntidade(QualisEntidade qualisEntidade) {
		this.qualisEntidade = qualisEntidade;
	}

	public String getEstrato() {
		return this.estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}
}
