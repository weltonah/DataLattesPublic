package br.com.Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class QualisEntidade implements Serializable {

	private static final long serialVersionUID = 1L;
	@NotNull
	@Column(name = "ISSN")
	private String issn;
	@NotNull
	@Column(name = "TITULO")
	private String titulo;

	public QualisEntidade(String issn, String titulo) {
		this.issn = issn;
		this.titulo = titulo;
	}

}
