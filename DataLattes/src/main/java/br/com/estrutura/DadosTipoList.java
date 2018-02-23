package br.com.estrutura;

import java.util.ArrayList;

public class DadosTipoList {
	private String sentencaCheckbox;
	ArrayList<String> sentencaTabela;

	public DadosTipoList(String sentencaCheckbox, ArrayList<String> sentencaTabela) {
		super();
		this.sentencaCheckbox = sentencaCheckbox;
		this.sentencaTabela = sentencaTabela;
	}

	public String getSentencaCheckbox() {
		return this.sentencaCheckbox;
	}

	public void setSentencaCheckbox(String sentencaCheckbox) {
		this.sentencaCheckbox = sentencaCheckbox;
	}

	public ArrayList<String> getSentencaTabela() {
		return this.sentencaTabela;
	}

	public void setSentencaTabela(ArrayList<String> sentencaTabela) {
		this.sentencaTabela = sentencaTabela;
	}

}
