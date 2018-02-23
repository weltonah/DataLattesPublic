package br.com.estrutura;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Estrutura {
	private int anoInicio;
	private int anoFim;
	private double Notatotal;
	private ArrayList<AreaEstrutura> listEst;
	private DadosCurricular dadosCurricular;

	public Estrutura() {
		this.listEst = new ArrayList<AreaEstrutura>();
	}

	public void addList(AreaEstrutura e) {
		this.listEst.add(e);
	}

	public ArrayList<AreaEstrutura> getListEst() {
		return this.listEst;
	}

	public void setListEst(ArrayList<AreaEstrutura> listEst) {
		this.listEst = listEst;
	}

	public int getAnoInicio() {
		return this.anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	public int getAnoFim() {
		return this.anoFim;
	}

	public void setAnoFim(int anoFim) {
		this.anoFim = anoFim;
	}

	public DadosCurricular getDadosCurricular() {
		return this.dadosCurricular;
	}

	public void setDadosCurricular(DadosCurricular dadosCurricular) {
		this.dadosCurricular = dadosCurricular;
	}

	public double getNotatotal() {
		return this.Notatotal;
	}

	public void setNotatotal(double notatotal) {
		this.Notatotal = notatotal;
	}

}
