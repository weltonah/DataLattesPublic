package br.com.SearchXML;

import java.util.ArrayList;

import org.w3c.dom.Document;

import br.com.estrutura.AreaEstrutura;
import br.com.estrutura.CriterioEstrutura;
import br.com.estrutura.Estrutura;
import br.com.estrutura.ItemAnalisado;
import br.com.estrutura.TipoEstrutura;

public class AnaliseDados {

	public static void preencherEstruturaAnaliseXml(Estrutura SessaoCriteriosKey, Document xmlfile) {
		for (AreaEstrutura areaEstrutura : SessaoCriteriosKey.getListEst()) {
			for (CriterioEstrutura criterioEstrutura : areaEstrutura.getListCrit()) {
				for (ArrayList<TipoEstrutura> listTipo : criterioEstrutura.getListTipo()) {
					for (TipoEstrutura tipoEstrutura : listTipo) {
						tipoEstrutura.setItemAnalisados(switchBuscaXml(areaEstrutura.getAbre(),
								criterioEstrutura.getAbre(), tipoEstrutura.getAbre(), xmlfile));
					}
				}
			}
		}
	}

	public static ArrayList<ItemAnalisado> switchBuscaXml(String areaEstrutura, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile) {
		ArrayList<ItemAnalisado> listItemAnalisado = new ArrayList<ItemAnalisado>();
		switch (areaEstrutura) {
		case "For":
			return ForSwitch(criterioEstrutura, tipoEstrutura, xmlfile);
		case "PrTec":
			return PrTecSwitch(criterioEstrutura, tipoEstrutura, xmlfile);
		case "PrArt":
			return PrArtSwitch(criterioEstrutura, tipoEstrutura, xmlfile);
		case "PrBli":
			return PrBliSwitch(criterioEstrutura, tipoEstrutura, xmlfile);
		case "OrEsAp":
			return OrEsApSwitch(criterioEstrutura, tipoEstrutura, xmlfile);
		case "CrGe":
			return CrGeSwitch(criterioEstrutura, tipoEstrutura, xmlfile);
		}
		return null;
	}

	public static ArrayList<ItemAnalisado> ForSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile) {
		ArrayList<Object> ListFor;
		SearchXMLFormacoes searchXMLFormacoes = new SearchXMLFormacoes(xmlfile);
		switch (criterioEstrutura) {
		case "Gr":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		case "Es":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		case "Me":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		case "Do":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		case "PDo":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		case "LDo":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		case "CuTePr":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		case "MePr":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		case "ReMe":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		case "Ape":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		case "MBA":
			switch (tipoEstrutura) {
			case "AnCos":
				break;
			case "And":
				break;
			case "Con":
				break;
			}
			break;
		}
		return null;

	}

	public static ArrayList<ItemAnalisado> PrTecSwitch(String criterioEstrutura, String tipoEstrutura,
			Document xmlfile) {
		ArrayList<Object> ListPrTec;
		SearchXMLProdTecnica searchXMLProdTecnica = new SearchXMLProdTecnica(xmlfile);
		switch (criterioEstrutura) {
		case "Tr":
			break;
		case "CuRe":
			break;
		case "CuPr":
			break;
		case "Sof":
			break;
		case "Pa":
			break;
		case "DeTe":
			break;
		case "Mac":
			break;
		case "ToCiIn":
			break;
		case "PrTe":
			break;
		case "ProuTe":
			break;
		case "TrTe":
			break;
		case "ApTr":
			break;
		case "CaMaSi":
			break;
		case "CuMiCuDu":
			break;
		case "PrMaDi":
			break;
		case "Edi":
			break;
		case "MaObAr":
			break;
		case "Maq":
			break;
		case "OrEv":
			break;
		case "CPRTV":
			break;
		case "RePe":
			break;
		case "TeMiSo":
			break;
		}

		return null;

	}

	public static ArrayList<ItemAnalisado> PrArtSwitch(String criterioEstrutura, String tipoEstrutura,
			Document xmlfile) {
		ArrayList<Object> ListPrArt;
		SearchXMLProdArtistica searchXMLProdArtistica = new SearchXMLProdArtistica(xmlfile);
		switch (criterioEstrutura) {
		case "CrPa":
			break;
		case "ApObAr":
			break;
		case "ApPrRTV":
			break;
		case "ArMu":
			break;
		case "CoMu":
			break;
		case "ObArVi":
			break;
		case "So":
			break;
		case "TrArCe":
			break;
		case "TrArVi":
			break;
		case "Mu":
			break;
		}
		return null;
	}

	public static ArrayList<ItemAnalisado> PrBliSwitch(String criterioEstrutura, String tipoEstrutura,
			Document xmlfile) {
		switch (criterioEstrutura) {
		case "TrEv":
			break;
		case "ArPu":
			break;
		case "ArAcPu":
			break;
		case "TeJoRe":
			break;
		case "CaLi":
			break;
		case "OrLi":
			break;
		case "PuLi":
			break;
		case "PrPoLi":
			break;
		}
		return null;
	}

	public static ArrayList<ItemAnalisado> OrEsApSwitch(String criterioEstrutura, String tipoEstrutura,
			Document xmlfile) {
		switch (criterioEstrutura) {
		case "OrMe":
			break;
		case "OrDo":
			break;
		case "OrPoDo":
			break;
		case "OrEsAp":
			break;
		case "OrGr":
			break;
		case "OrInCi":
			break;
		case "BaMe":
			break;
		case "BaDo":
			break;
		case "BaQu":
			break;
		case "BaEsAp":
			break;
		case "BaGr":
			break;
		case "BaPrTi":
			break;
		case "BaCoPu":
			break;
		case "BaLDo":
			break;
		case "BaAvCu":
			break;
		}
		return null;
	}

	public static ArrayList<ItemAnalisado> CrGeSwitch(String criterioEstrutura, String tipoEstrutura,
			Document xmlfile) {
		switch (criterioEstrutura) {
		case "DeEx":
			break;
		}
		return null;
	}

}
