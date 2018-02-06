package br.com.estrutura;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Estrutura {
	private int anoInicio;
	private int anoFim;
	private ArrayList<AreaEstrutura> listEst;

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

}
