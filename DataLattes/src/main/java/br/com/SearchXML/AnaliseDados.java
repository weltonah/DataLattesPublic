package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.Producao;
import br.com.Modelo.Tipo3;
import br.com.Modelo.Tipo4;
import br.com.Modelo.Tipo5;
import br.com.Modelo.Tipo6;
import br.com.Modelo.Tipo8;
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
								criterioEstrutura.getAbre(), tipoEstrutura.getAbre(), xmlfile, tipoEstrutura));
					}
				}
			}
		}
	}

	public static ArrayList<ItemAnalisado> switchBuscaXml(String areaEstrutura, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItemAnalisado = new ArrayList<ItemAnalisado>();
		try {
			switch (areaEstrutura) {
			case "For":
				return ForSwitch(criterioEstrutura, tipoEstrutura, xmlfile);
			case "PrTec":
				return PrTecSwitch(criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "PrArt":
				return PrArtSwitch(criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "PrBli":
				return PrBliSwitch(criterioEstrutura, tipoEstrutura, xmlfile);
			case "OrEsAp":
				return OrEsApSwitch(criterioEstrutura, tipoEstrutura, xmlfile);
			case "CrGe":
				return CrGeSwitch(criterioEstrutura, tipoEstrutura, xmlfile);
			}
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static ArrayList<ItemAnalisado> ForSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile)
			throws XPathExpressionException {
		ArrayList<String[]> ListFor;
		SearchXMLFormacoes searchXMLFormacoes = new SearchXMLFormacoes(xmlfile);
		switch (criterioEstrutura) {
		case "Gr":
			ListFor = searchXMLFormacoes.Graduacao();
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
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLProdTecnica searchXMLProdTecnica = new SearchXMLProdTecnica(xmlfile);

		switch (criterioEstrutura) {
		case "Tr":
			return PreencherItemTipo6(searchXMLProdTecnica.Traducao(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "CuRe":
			return PreencherItemTipo3(searchXMLProdTecnica.CultivacapRegistrada(), criterioEstrutura, tipoEstrutura,
					xmlfile,
					ObjecttipoEstrutura);
		case "CuPr":
			return PreencherItemTipo3(searchXMLProdTecnica.CultivacapProtegida(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "Sof":
			return PreencherItemTipo4(searchXMLProdTecnica.Software(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "Pa":
			switch (tipoEstrutura) {
			case "NaIn":
				//
			case "Nac":
				break;
			case "Int":
				break;
			}
		case "DeTe":
			return PreencherItemTipo3(searchXMLProdTecnica.DesenhoIndustrial(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "Mac":
			return PreencherItemTipo3(searchXMLProdTecnica.Marca(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "ToCiIn":
			return PreencherItemTipo3(searchXMLProdTecnica.TopogradiaDeCircuitoIntegrado(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "PrTe":
			return PreencherItemTipo5(searchXMLProdTecnica.ProdutoTecnologico(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "ProuTe":
			return PreencherItemTipo4(searchXMLProdTecnica.ProcessoTecnico(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "TrTe":
			return PreencherItemTipo6(searchXMLProdTecnica.TrabalhoTecnico(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "ApTr":
			return PreencherItemTipo6(searchXMLProdTecnica.ApresentacaoTrabalho(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "CaMaSi":
			return PreencherItemTipo6(searchXMLProdTecnica.CartaMapa(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "CuMiCuDu":
			return PreencherItemProducao(searchXMLProdTecnica.CursoMinistradoCurtaDuracao(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "PrMaDi":
			return PreencherItemTipo6(searchXMLProdTecnica.MaterialDidatico(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "Edi":
			return PreencherItemTipo6(searchXMLProdTecnica.Editoracao(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "MaObAr":
			return PreencherItemTipo6(searchXMLProdTecnica.ManutencaoObraArtistica(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "Maq":
			return PreencherItemProducao(searchXMLProdTecnica.Maquete(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "OrEv":
			return PreencherItemTipo8(searchXMLProdTecnica.OrganizacaoEventos(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "CPRTV":
			return PreencherItemTipo6(searchXMLProdTecnica.ProgramaRadioTVComentario(), criterioEstrutura,
					tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "RePe":
			return PreencherItemProducao(searchXMLProdTecnica.RelatorioPesquisa(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "TeMiSo":
			return PreencherItemTipo6(searchXMLProdTecnica.MidiaSocial(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		}
		return null;
	}

	public static ArrayList<ItemAnalisado> PrArtSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura)
			throws XPathExpressionException {
		ArrayList<Object> ListPrArt;
		SearchXMLProdArtistica searchXMLProdArtistica = new SearchXMLProdArtistica(xmlfile);
		switch (criterioEstrutura) {
		case "CrPa":
			switch (tipoEstrutura) {
			case "InCo":
				return PreencherItemTipo6(searchXMLProdArtistica.Partitura(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return PreencherItemTipo6Ind(searchXMLProdArtistica.Partitura(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Col":
				return PreencherItemTipo6Cole(searchXMLProdArtistica.Partitura(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "ApObAr":
			switch (tipoEstrutura) {
			case "InCo":
				return PreencherItemTipo6(searchXMLProdArtistica.ApresentacaoObraArtistica(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Ind":
				return PreencherItemTipo6Ind(searchXMLProdArtistica.ApresentacaoObraArtistica(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Col":
				return PreencherItemTipo6Cole(searchXMLProdArtistica.ApresentacaoObraArtistica(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			}
		case "ApPrRTV":
			switch (tipoEstrutura) {
			case "InCo":
				return PreencherItemTipo6(searchXMLProdArtistica.ApresentacaoRadioTV(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Ind":
				return PreencherItemTipo6Ind(searchXMLProdArtistica.ApresentacaoRadioTV(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Col":
				return PreencherItemTipo6Cole(searchXMLProdArtistica.ApresentacaoRadioTV(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			}
		case "ArMu":
			switch (tipoEstrutura) {
			case "InCo":
				return PreencherItemTipo6(searchXMLProdArtistica.ArranjoMusical(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Ind":
				return PreencherItemTipo6Ind(searchXMLProdArtistica.ArranjoMusical(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Col":
				return PreencherItemTipo6Cole(searchXMLProdArtistica.ArranjoMusical(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "CoMu":
			switch (tipoEstrutura) {
			case "InCo":
				return PreencherItemTipo6(searchXMLProdArtistica.ComposicaoMusical(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Ind":
				return PreencherItemTipo6Ind(searchXMLProdArtistica.ComposicaoMusical(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Col":
				return PreencherItemTipo6Cole(searchXMLProdArtistica.ComposicaoMusical(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			}
		case "ObArVi":
			switch (tipoEstrutura) {
			case "InCo":
				return PreencherItemTipo6(searchXMLProdArtistica.ObraArtesVisuais(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Ind":
				return PreencherItemTipo6Ind(searchXMLProdArtistica.ObraArtesVisuais(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Col":
				return PreencherItemTipo6Cole(searchXMLProdArtistica.ObraArtesVisuais(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			}
		case "So":
			switch (tipoEstrutura) {
			case "InCo":
				return PreencherItemTipo6(searchXMLProdArtistica.Sonoplastia(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Ind":
				return PreencherItemTipo6Ind(searchXMLProdArtistica.Sonoplastia(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Col":
				return PreencherItemTipo6Cole(searchXMLProdArtistica.Sonoplastia(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "TrArCe":
			switch (tipoEstrutura) {
			case "InCo":
				return PreencherItemTipo6(searchXMLProdArtistica.ArtesCenicas(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Ind":
				return PreencherItemTipo6Ind(searchXMLProdArtistica.ArtesCenicas(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Col":
				return PreencherItemTipo6Cole(searchXMLProdArtistica.ArtesCenicas(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "TrArVi":
			switch (tipoEstrutura) {
			case "InCo":
				return PreencherItemTipo6(searchXMLProdArtistica.ArtesVizuais(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Ind":
				return PreencherItemTipo6Ind(searchXMLProdArtistica.ArtesVizuais(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Col":
				return PreencherItemTipo6Cole(searchXMLProdArtistica.ArtesVizuais(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "Mu":
			switch (tipoEstrutura) {
			case "InCo":
				return PreencherItemTipo6(searchXMLProdArtistica.Musica(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return PreencherItemTipo6Ind(searchXMLProdArtistica.Musica(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura);
			case "Col":
				return PreencherItemTipo6Cole(searchXMLProdArtistica.Musica(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		}
		return null;
	}

	public static ArrayList<ItemAnalisado> PrBliSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile)
			throws XPathExpressionException {
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
			Document xmlfile) throws XPathExpressionException {
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

	public static ArrayList<ItemAnalisado> CrGeSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile)
			throws XPathExpressionException {
		switch (criterioEstrutura) {
		case "DeEx":
			break;
		}
		return null;
	}

	public static ArrayList<ItemAnalisado> PreencherItemProducao(ArrayList<Producao> listArray,
			String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (Object tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0)
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
		}
		return listItem;
	}

	public static ArrayList<ItemAnalisado> PreencherItemTipo5(ArrayList<Tipo5> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (Object tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0)
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
		}
		return listItem;
	}

	public static ArrayList<ItemAnalisado> PreencherItemTipo4(ArrayList<Tipo4> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (Object tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0)
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
		}
		return listItem;
	}

	public static ArrayList<ItemAnalisado> PreencherItemTipo6Cole(ArrayList<Tipo6> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (Tipo6 tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0)
				if (tipo.getAutores().size() > 1)
					item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
		}
		return listItem;
	}

	public static ArrayList<ItemAnalisado> PreencherItemTipo6Ind(ArrayList<Tipo6> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (Tipo6 tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0)
				if (tipo.getAutores().size() == 1)
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else {
					item = new ItemAnalisado(valorContabilizado, true, tipo);
					limite--;
				}
		}
		return listItem;
	}

	public static ArrayList<ItemAnalisado> PreencherItemTipo6(ArrayList<Tipo6> listArray, String criterioEstrutura,
			String tipoEstrutura,
			Document xmlfile,TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (Object tipo : listArray) {
			ItemAnalisado item;
			if(limite == 0)
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
		}
		return listItem;
	}

	public static ArrayList<ItemAnalisado> PreencherItemTipo8(ArrayList<Tipo8> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (Object tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0)
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
		}
		return listItem;
	}



	public static ArrayList<ItemAnalisado> PreencherItemTipo3(ArrayList<Tipo3> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (Object tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0)
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
		}
		return listItem;
	}

}
