package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.Orientacao;
import br.com.estrutura.AreaEstrutura;
import br.com.estrutura.CriterioEstrutura;
import br.com.estrutura.Estrutura;
import br.com.estrutura.ItemAnalisado;
import br.com.estrutura.TipoEstrutura;

public class AnaliseDados {

	public FiltroSearchXml filtroSearchXml;

	public void preencherEstruturaAnaliseXml(Estrutura SessaoCriteriosKey, Document xmlfile) {
		int anofim = SessaoCriteriosKey.getAnoFim();
		int anoinicio = SessaoCriteriosKey.getAnoInicio();
		this.filtroSearchXml = new FiltroSearchXml(anofim, anoinicio);
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

	public ArrayList<ItemAnalisado> switchBuscaXml(String areaEstrutura, String criterioEstrutura, String tipoEstrutura,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItemAnalisado = new ArrayList<ItemAnalisado>();
		try {
			switch (areaEstrutura) {
			case "For":
				return ForSwitch(criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "PrTec":
				return PrTecSwitch(criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "PrArt":
				return PrArtSwitch(criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "PrBli":
				return PrBliSwitch(criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Orien":
				return OrienSwitch(criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Banc":
				return BancSwitch(criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "CrGe":
				return CrGeSwitch(criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			}
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<ItemAnalisado> ForSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLFormacoes searchXMLFormacoes = new SearchXMLFormacoes(xmlfile);
		switch (criterioEstrutura) {
		case "Gr":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.Graduacao(), xmlfile,
						ObjecttipoEstrutura);
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.Graduacao(),
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.Graduacao(),
						xmlfile, ObjecttipoEstrutura);
			}
		case "Es":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.Especializacao(), xmlfile,
						ObjecttipoEstrutura);
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.Especializacao(), xmlfile,
						ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.Especializacao(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "Me":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.Mestrado(), xmlfile,
						ObjecttipoEstrutura);
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.Mestrado(),
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.Mestrado(),
						xmlfile, ObjecttipoEstrutura);
			}
		case "Do":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.Doutorado(), xmlfile,
						ObjecttipoEstrutura);
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.Doutorado(),
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.Doutorado(),
						xmlfile, ObjecttipoEstrutura);
			}
		case "PDo":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.PosDoutorado(), xmlfile,
						ObjecttipoEstrutura);
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.PosDoutorado(), xmlfile,
						ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.PosDoutorado(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "LDo":
			return this.filtroSearchXml.PreencherItemFormacao(searchXMLFormacoes.LivreDocencia(), 
					xmlfile, ObjecttipoEstrutura);
		case "CuTePr":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.CursoTecnico(), xmlfile,
						ObjecttipoEstrutura);
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.CursoTecnico(), xmlfile,
						ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.CursoTecnico(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "MePr":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.MestradoProfissional(),
						xmlfile, ObjecttipoEstrutura);
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.MestradoProfissional(), xmlfile,
						ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.MestradoProfissional(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "ReMe":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.ResidenciaMedica(), xmlfile,
						ObjecttipoEstrutura);
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.ResidenciaMedica(), xmlfile,
						ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.ResidenciaMedica(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "Ape":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.Aperfeicoamento(), xmlfile,
						ObjecttipoEstrutura);
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.Aperfeicoamento(), xmlfile,
						ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.Aperfeicoamento(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "MBA":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.MBA(),
						xmlfile, ObjecttipoEstrutura);
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.MBA(),
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.MBA(),
						xmlfile, ObjecttipoEstrutura);
			}
		}
		return null;

	}

	public ArrayList<ItemAnalisado> PrTecSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLProdTecnica searchXMLProdTecnica = new SearchXMLProdTecnica(xmlfile);

		switch (criterioEstrutura) {
		case "Tr":
			return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdTecnica.Traducao(), xmlfile,
					ObjecttipoEstrutura);
		case "CuRe":
			return this.filtroSearchXml.PreencherItemTipo3(searchXMLProdTecnica.CultivacapRegistrada(), xmlfile,
					ObjecttipoEstrutura);
		case "CuPr":
			return this.filtroSearchXml.PreencherItemTipo3(searchXMLProdTecnica.CultivacapProtegida(), xmlfile,
					ObjecttipoEstrutura);
		case "Sof":
			return this.filtroSearchXml.PreencherItemTipo4(searchXMLProdTecnica.Software(), xmlfile,
					ObjecttipoEstrutura);
		case "Pa":
			switch (tipoEstrutura) {
			case "NaIn":
				return this.filtroSearchXml.PreencherItemTipo3(searchXMLProdTecnica.Patente(),
						xmlfile, ObjecttipoEstrutura);
			case "Nac":
				return this.filtroSearchXml.PreencherItemTipo3Nac(searchXMLProdTecnica.Patente(),
						xmlfile, ObjecttipoEstrutura);
			case "Int":
				return this.filtroSearchXml.PreencherItemTipo3Inte(searchXMLProdTecnica.Patente(),
						xmlfile, ObjecttipoEstrutura);
			}
		case "DeTe":
			return this.filtroSearchXml.PreencherItemTipo3(searchXMLProdTecnica.DesenhoIndustrial(),
					xmlfile, ObjecttipoEstrutura);
		case "Mac":
			return this.filtroSearchXml.PreencherItemTipo3(searchXMLProdTecnica.Marca(), xmlfile, ObjecttipoEstrutura);
		case "ToCiIn":
			return this.filtroSearchXml.PreencherItemTipo3(searchXMLProdTecnica.TopogradiaDeCircuitoIntegrado(),
					xmlfile, ObjecttipoEstrutura);
		case "PrTe":
			return this.filtroSearchXml.PreencherItemTipo5(searchXMLProdTecnica.ProdutoTecnologico(),
					xmlfile, ObjecttipoEstrutura);
		case "ProuTe":
			return this.filtroSearchXml.PreencherItemTipo4(searchXMLProdTecnica.ProcessoTecnico(),
					xmlfile, ObjecttipoEstrutura);
		case "TrTe":
			return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdTecnica.TrabalhoTecnico(),
					xmlfile, ObjecttipoEstrutura);
		case "ApTr":
			return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdTecnica.ApresentacaoTrabalho(), xmlfile,
					ObjecttipoEstrutura);
		case "CaMaSi":
			return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdTecnica.CartaMapa(), xmlfile,
					ObjecttipoEstrutura);
		case "CuMiCuDu":
			return this.filtroSearchXml.PreencherItemProducao(searchXMLProdTecnica.CursoMinistradoCurtaDuracao(),
					xmlfile, ObjecttipoEstrutura);
		case "PrMaDi":
			return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdTecnica.MaterialDidatico(),
					xmlfile, ObjecttipoEstrutura);
		case "Edi":
			return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdTecnica.Editoracao(),
					xmlfile, ObjecttipoEstrutura);
		case "MaObAr":
			return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdTecnica.ManutencaoObraArtistica(), xmlfile,
					ObjecttipoEstrutura);
		case "Maq":
			return this.filtroSearchXml.PreencherItemProducao(searchXMLProdTecnica.Maquete(),
					xmlfile, ObjecttipoEstrutura);
		case "OrEv":
			return this.filtroSearchXml.PreencherItemTipo8(searchXMLProdTecnica.OrganizacaoEventos(),
					xmlfile, ObjecttipoEstrutura);
		case "CPRTV":
			return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdTecnica.ProgramaRadioTVComentario(), xmlfile,
					ObjecttipoEstrutura);
		case "RePe":
			return this.filtroSearchXml.PreencherItemProducao(searchXMLProdTecnica.RelatorioPesquisa(), xmlfile,
					ObjecttipoEstrutura);
		case "TeMiSo":
			return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdTecnica.MidiaSocial(), 
					xmlfile, ObjecttipoEstrutura);
		}
		return null;
	}

	public ArrayList<ItemAnalisado> PrArtSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLProdArtistica searchXMLProdArtistica = new SearchXMLProdArtistica(xmlfile);
		switch (criterioEstrutura) {
		case "CrPa":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdArtistica.Partitura(), xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return this.filtroSearchXml.PreencherItemTipo6Ind(searchXMLProdArtistica.Partitura(), 
						xmlfile, ObjecttipoEstrutura);
			case "Col":
				return this.filtroSearchXml.PreencherItemTipo6Cole(searchXMLProdArtistica.Partitura(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "ApObAr":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdArtistica.ApresentacaoObraArtistica(),
						xmlfile, ObjecttipoEstrutura);
			case "Ind":
				return this.filtroSearchXml.PreencherItemTipo6Ind(searchXMLProdArtistica.ApresentacaoObraArtistica(),
						xmlfile, ObjecttipoEstrutura);
			case "Col":
				return this.filtroSearchXml.PreencherItemTipo6Cole(searchXMLProdArtistica.ApresentacaoObraArtistica(),
						xmlfile, ObjecttipoEstrutura);
			}
		case "ApPrRTV":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdArtistica.ApresentacaoRadioTV(), xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return this.filtroSearchXml.PreencherItemTipo6Ind(searchXMLProdArtistica.ApresentacaoRadioTV(), xmlfile,
						ObjecttipoEstrutura);
			case "Col":
				return this.filtroSearchXml.PreencherItemTipo6Cole(searchXMLProdArtistica.ApresentacaoRadioTV(),
						xmlfile, ObjecttipoEstrutura);
			}
		case "ArMu":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdArtistica.ArranjoMusical(), xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return this.filtroSearchXml.PreencherItemTipo6Ind(searchXMLProdArtistica.ArranjoMusical(), xmlfile,
						ObjecttipoEstrutura);
			case "Col":
				return this.filtroSearchXml.PreencherItemTipo6Cole(searchXMLProdArtistica.ArranjoMusical(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "CoMu":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdArtistica.ComposicaoMusical(), xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return this.filtroSearchXml.PreencherItemTipo6Ind(searchXMLProdArtistica.ComposicaoMusical(), xmlfile,
						ObjecttipoEstrutura);
			case "Col":
				return this.filtroSearchXml.PreencherItemTipo6Cole(searchXMLProdArtistica.ComposicaoMusical(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "ObArVi":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdArtistica.ObraArtesVisuais(), xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return this.filtroSearchXml.PreencherItemTipo6Ind(searchXMLProdArtistica.ObraArtesVisuais(), xmlfile,
						ObjecttipoEstrutura);
			case "Col":
				return this.filtroSearchXml.PreencherItemTipo6Cole(searchXMLProdArtistica.ObraArtesVisuais(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "So":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdArtistica.Sonoplastia(), xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return this.filtroSearchXml.PreencherItemTipo6Ind(searchXMLProdArtistica.Sonoplastia(), xmlfile,
						ObjecttipoEstrutura);
			case "Col":
				return this.filtroSearchXml.PreencherItemTipo6Cole(searchXMLProdArtistica.Sonoplastia(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "TrArCe":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdArtistica.ArtesCenicas(), xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return this.filtroSearchXml.PreencherItemTipo6Ind(searchXMLProdArtistica.ArtesCenicas(), xmlfile,
						ObjecttipoEstrutura);
			case "Col":
				return this.filtroSearchXml.PreencherItemTipo6Cole(searchXMLProdArtistica.ArtesCenicas(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "TrArVi":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdArtistica.ArtesVizuais(), xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return this.filtroSearchXml.PreencherItemTipo6Ind(searchXMLProdArtistica.ArtesVizuais(), xmlfile,
						ObjecttipoEstrutura);
			case "Col":
				return this.filtroSearchXml.PreencherItemTipo6Cole(searchXMLProdArtistica.ArtesVizuais(), xmlfile,
						ObjecttipoEstrutura);
			}
		case "Mu":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherItemTipo6(searchXMLProdArtistica.Musica(), xmlfile,
						ObjecttipoEstrutura);
			case "Ind":
				return this.filtroSearchXml.PreencherItemTipo6Ind(searchXMLProdArtistica.Musica(), xmlfile,
						ObjecttipoEstrutura);
			case "Col":
				return this.filtroSearchXml.PreencherItemTipo6Cole(searchXMLProdArtistica.Musica(), xmlfile,
						ObjecttipoEstrutura);
			}
		}
		return null;
	}

	public ArrayList<ItemAnalisado> PrBliSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLProdBibliografica searchXMLProdBibliografica = new SearchXMLProdBibliografica(xmlfile);
		switch (criterioEstrutura) {
		case "TrEv":
			switch (tipoEstrutura) {
			case "NaIn":
				return this.filtroSearchXml.PreencherItemTipo0(searchXMLProdBibliografica.TrabalhoCompletoEvento(),
						xmlfile, ObjecttipoEstrutura);
			case "Nac":
				return this.filtroSearchXml.PreencherItemTipo0Nac(searchXMLProdBibliografica.TrabalhoCompletoEvento(),
						xmlfile, ObjecttipoEstrutura);
			case "Int":
				return this.filtroSearchXml.PreencherItemTipo0Int(searchXMLProdBibliografica.TrabalhoCompletoEvento(),
						xmlfile, ObjecttipoEstrutura);
			}
		case "ArPu":
			return this.filtroSearchXml.PreencherItemTipo0(searchXMLProdBibliografica.ArtigoCompletoAceito(), xmlfile,
					ObjecttipoEstrutura);
		case "ArAcPu":
			return this.filtroSearchXml.PreencherItemTipo0(searchXMLProdBibliografica.ArtigoCompletoPublicado(),
					xmlfile, ObjecttipoEstrutura);
		case "TeJoRe":
			return this.filtroSearchXml.PreencherItemTipo0(searchXMLProdBibliografica.TextoJornalRevista(), xmlfile,
					ObjecttipoEstrutura);
		case "CaLi":
			return this.filtroSearchXml.PreencherItemTipo1(searchXMLProdBibliografica.LivroCapitulo(), xmlfile,
					ObjecttipoEstrutura);
		case "OrLi":
			return this.filtroSearchXml.PreencherItemTipo2Or(searchXMLProdBibliografica.LivroPublicadoOuOrganizar(),
					xmlfile, ObjecttipoEstrutura);
		case "PuLi":
			return this.filtroSearchXml.PreencherItemTipo2Pu(searchXMLProdBibliografica.LivroPublicadoOuOrganizar(),
					xmlfile, ObjecttipoEstrutura);
		case "PrPoLi":
			return this.filtroSearchXml.PreencherItemTipo2(searchXMLProdBibliografica.LivroPrePosFacio(), xmlfile,
					ObjecttipoEstrutura);
		}
		return null;
	}

	public ArrayList<ItemAnalisado> OrienSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLOrientacoes searchXMLOrientacoes = new SearchXMLOrientacoes(xmlfile);
		switch (criterioEstrutura) {
		case "OrMe":
			ArrayList<Orientacao> listArray;
			ArrayList<Orientacao> listArray2;
			ArrayList<ItemAnalisado> resultado;
			ArrayList<ItemAnalisado> resultado2;
			switch (tipoEstrutura) {
			case "AnCos":
				resultado = this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoMesAnd(),
						xmlfile, ObjecttipoEstrutura);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoMesCon(),
						xmlfile, ObjecttipoEstrutura);
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoMesAnd(), xmlfile,
						ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoMesCon(), xmlfile,
						ObjecttipoEstrutura);
			case "Ori":
				listArray = searchXMLOrientacoes.OrientacaoMesAnd();
				listArray2 = searchXMLOrientacoes.OrientacaoMesCon();
				listArray.addAll(listArray2);
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray, xmlfile, ObjecttipoEstrutura);
			case "Coo":
				listArray = searchXMLOrientacoes.OrientacaoMesAnd();
				listArray2 = searchXMLOrientacoes.OrientacaoMesCon();
				listArray.addAll(listArray2);
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray, xmlfile, ObjecttipoEstrutura);

			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoMesAnd();
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray, xmlfile, ObjecttipoEstrutura);
			case "CooAnd":
				listArray = searchXMLOrientacoes.OrientacaoMesAnd();
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray, xmlfile, ObjecttipoEstrutura);
			case "OriCon":
				listArray = searchXMLOrientacoes.OrientacaoMesCon();
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray, xmlfile, ObjecttipoEstrutura);
			case "CooCon":
				listArray = searchXMLOrientacoes.OrientacaoMesCon();
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray, xmlfile, ObjecttipoEstrutura);
			}
			break;
		case "OrDo":

			switch (tipoEstrutura) {
			case "AnCos":
				resultado = this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouAnd(),
						xmlfile, ObjecttipoEstrutura);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouCon(),
						xmlfile, ObjecttipoEstrutura);
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouAnd(), xmlfile,
						ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouCon(), xmlfile,
						ObjecttipoEstrutura);
			case "Ori":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				listArray2 = searchXMLOrientacoes.OrientacaoDouCon();
				listArray.addAll(listArray2);
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray, xmlfile, ObjecttipoEstrutura);
			case "Coo":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				listArray2 = searchXMLOrientacoes.OrientacaoDouCon();
				listArray.addAll(listArray2);
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray, xmlfile, ObjecttipoEstrutura);
			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray, xmlfile, ObjecttipoEstrutura);
			case "CooAnd":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray, xmlfile, ObjecttipoEstrutura);
			case "OriCon":
				listArray = searchXMLOrientacoes.OrientacaoDouCon();
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray, xmlfile, ObjecttipoEstrutura);
			case "CooCon":
				listArray = searchXMLOrientacoes.OrientacaoDouCon();
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray, xmlfile, ObjecttipoEstrutura);

			}
			// case "OrPoDo":
			// switch (tipoEstrutura) {
			// case "AnCos":
			// ArrayList<ItemAnalisado> resultado =
			// this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouAnd(),
			// xmlfile, ObjecttipoEstrutura);
			// ArrayList<ItemAnalisado> resultado2 =
			// this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouCon(),
			// xmlfile, ObjecttipoEstrutura);
			// resultado.addAll(resultado2);
			// return resultado;
			// case "And":
			// return
			// this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouAnd(),
			// criterioEstrutura,
			// xmlfile, ObjecttipoEstrutura);
			// case "Con":
			// return
			// this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouCon(),
			// criterioEstrutura,
			// xmlfile, ObjecttipoEstrutura);
			// }
		case "OrEsAp":
			switch (tipoEstrutura) {
			case "AnCos":
				resultado = this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoAperfEspecAnd(),
						xmlfile, ObjecttipoEstrutura);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), xmlfile, ObjecttipoEstrutura,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoAperfEspecAnd(),
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemOrientacaoTipo(searchXMLOrientacoes.OutrasOrientacaoCon(),
						xmlfile, ObjecttipoEstrutura,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
			case "Ori":
				resultado = this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoAperfEspecAnd(),
						xmlfile, ObjecttipoEstrutura);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoOriTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), xmlfile, ObjecttipoEstrutura,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
				resultado.addAll(resultado2);
				return resultado;
			case "Coo":
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoCooTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), xmlfile, ObjecttipoEstrutura,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
				resultado2.addAll(resultado2);
				return resultado2;
			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				return this.filtroSearchXml.PreencherItemOrientacao(listArray, xmlfile, ObjecttipoEstrutura);
			case "OriCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherItemOrientacaoTipo(listArray, xmlfile, ObjecttipoEstrutura,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
			case "CooCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherItemOrientacaoCooTipo(listArray, xmlfile, ObjecttipoEstrutura,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
			}
		case "OrGr":
			switch (tipoEstrutura) {
			case "AnCos":
				resultado = this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoGraduacaoAnd(),
						xmlfile, ObjecttipoEstrutura);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), xmlfile, ObjecttipoEstrutura,
						"TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoGraduacaoAnd(),
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemOrientacaoTipo(searchXMLOrientacoes.OutrasOrientacaoCon(),
						xmlfile, ObjecttipoEstrutura,
						"TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
			case "Ori":
				resultado = this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoGraduacaoAnd(),
						xmlfile, ObjecttipoEstrutura);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoOriTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), xmlfile, ObjecttipoEstrutura,
						"TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
				resultado.addAll(resultado2);
				return resultado;
			case "Coo":
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoCooTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), xmlfile, ObjecttipoEstrutura,
						"TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
				resultado2.addAll(resultado2);
				return resultado2;
			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				return this.filtroSearchXml.PreencherItemOrientacao(listArray, xmlfile, ObjecttipoEstrutura);
			case "OriCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherItemOrientacaoTipo(listArray, xmlfile, ObjecttipoEstrutura,
						"TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
			case "CooCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherItemOrientacaoCooTipo(listArray, xmlfile, ObjecttipoEstrutura,
						"TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
			}
		case "OrInCi":
			switch (tipoEstrutura) {
			case "AnCos":
				resultado = this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoICAnd(),
						xmlfile, ObjecttipoEstrutura);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), xmlfile, ObjecttipoEstrutura,
						"INICIACAO_CIENTIFICA");
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoICAnd(),
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return this.filtroSearchXml.PreencherItemOrientacaoTipo(searchXMLOrientacoes.OutrasOrientacaoCon(),
						xmlfile, ObjecttipoEstrutura,
						"INICIACAO_CIENTIFICA");
			case "Ori":
				resultado = this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoICAnd(),
						xmlfile, ObjecttipoEstrutura);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoOriTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), xmlfile, ObjecttipoEstrutura,
						"INICIACAO_CIENTIFICA");
				resultado.addAll(resultado2);
				return resultado;
			case "Coo":
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoCooTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), xmlfile, ObjecttipoEstrutura,
						"INICIACAO_CIENTIFICA");
				resultado2.addAll(resultado2);
				return resultado2;
			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				return this.filtroSearchXml.PreencherItemOrientacao(listArray, xmlfile, ObjecttipoEstrutura);
			case "OriCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherItemOrientacaoTipo(listArray, xmlfile, ObjecttipoEstrutura,
						"INICIACAO_CIENTIFICA");
			case "CooCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherItemOrientacaoCooTipo(listArray, xmlfile, ObjecttipoEstrutura,
						"INICIACAO_CIENTIFICA");
			}
		}
		return null;
	}

	public ArrayList<ItemAnalisado> BancSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLOrientacoes searchXMLOrientacoes = new SearchXMLOrientacoes(xmlfile);
		switch (criterioEstrutura) {
		case "BaMe":
			return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.BancaMestrado(), xmlfile,
					ObjecttipoEstrutura);
		case "BaDo":
			return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.BancaDoutorado(), xmlfile,
					ObjecttipoEstrutura);
		case "BaQu":
			return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.BancaQualificacao(), xmlfile,
					ObjecttipoEstrutura);
		case "BaEsAp":
			return this.filtroSearchXml.PreencherItemOrientacao(
					searchXMLOrientacoes.BancaAperfeicoamentoEspecificacao(), xmlfile, ObjecttipoEstrutura);
		case "BaGr":
			return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.BancaGraduacao(), xmlfile,
					ObjecttipoEstrutura);
		case "BaPrTi":
			return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.BancaProfessorTitular(), xmlfile,
					ObjecttipoEstrutura);
		case "BaCoPu":
			return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.BancaConcursoPublico(), xmlfile,
					ObjecttipoEstrutura);
		case "BaLDo":
			return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.BancaLivreDocencia(), xmlfile,
					ObjecttipoEstrutura);
		case "BaAvCu":
			return this.filtroSearchXml.PreencherItemOrientacao(searchXMLOrientacoes.BancaAvaliacaoCurso(), xmlfile,
					ObjecttipoEstrutura);
		}
		return null;
	}

	public ArrayList<ItemAnalisado> CrGeSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLDadosGerais searchXMLDadosGerais = new SearchXMLDadosGerais(xmlfile);
		switch (criterioEstrutura) {
		case "DeEx":
			return this.filtroSearchXml.PreencherItemBolean(searchXMLDadosGerais.DedicaoExclusiva(), xmlfile,
					ObjecttipoEstrutura);
		}
		return null;
	}

}
