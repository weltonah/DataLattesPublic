package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.ObjetoCriterio;
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

						for (ItemAnalisado itemAnalisado : tipoEstrutura.getItemAnalisados()) {
							if (itemAnalisado.getValidade() == 0) {
								tipoEstrutura.setValorTotalContabilizado(
										tipoEstrutura.getValorTotalContabilizado() + tipoEstrutura.getValor());
								criterioEstrutura.setValorTotalCriterio(
										criterioEstrutura.getValorTotalCriterio() + tipoEstrutura.getValor());
							}
						}
					}
				}
				areaEstrutura.setValorTotalArea(
						areaEstrutura.getValorTotalArea() + criterioEstrutura.getValorTotalCriterio());
			}
			SessaoCriteriosKey.setNotatotal(SessaoCriteriosKey.getNotatotal() + areaEstrutura.getValorTotalArea());
		}
		SessaoCriteriosKey.setDadosCurricular(this.filtroSearchXml.PreencherDadosCurricular(xmlfile));
	}

	public ArrayList<ItemAnalisado> switchBuscaXml(String areaEstrutura, String criterioEstrutura, String tipoEstrutura,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		try {
			this.filtroSearchXml.setlimiteFile(xmlfile, ObjecttipoEstrutura.getLimite());
			switch (areaEstrutura) {
			case "For":
				return ForSwitch(criterioEstrutura, tipoEstrutura);
			case "PrTec":
				return PrTecSwitch(criterioEstrutura, tipoEstrutura);
			case "PrArt":
				return PrArtSwitch(criterioEstrutura, tipoEstrutura);
			case "PrBli":
				return PrBliSwitch(criterioEstrutura, tipoEstrutura);
			case "Orien":
				return OrienSwitch(criterioEstrutura, tipoEstrutura);
			case "Banc":
				return BancSwitch(criterioEstrutura, tipoEstrutura);
			case "CrGe":
				return CrGeSwitch(criterioEstrutura, tipoEstrutura);
			case "ParEvento":
				return ParEventoSwitch(criterioEstrutura, tipoEstrutura);
			}
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<ItemAnalisado> ForSwitch(String criterioEstrutura, String tipoEstrutura)
			throws XPathExpressionException {
		SearchXMLFormacoes searchXMLFormacoes = new SearchXMLFormacoes(this.filtroSearchXml.getXmlfile());
		switch (criterioEstrutura) {
		case "Gr":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.Graduacao());
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.Graduacao());
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.Graduacao());
			}
		case "Es":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.Especializacao());
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.Especializacao());
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.Especializacao());
			}
		case "Me":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.Mestrado());
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.Mestrado());
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.Mestrado());
			}
		case "Do":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.Doutorado());
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.Doutorado());
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.Doutorado());
			}
		case "PDo":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.PosDoutorado());
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.PosDoutorado());
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.PosDoutorado());
			}
		case "LDo":
			// return
			// this.filtroSearchXml.PreencherItemFormacao(searchXMLFormacoes.LivreDocencia()
			// );
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLFormacoes.LivreDocencia());
		case "CuTePr":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.CursoTecnico());
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.CursoTecnico());
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.CursoTecnico());
			}
		case "MePr":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.MestradoProfissional());
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.MestradoProfissional());
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.MestradoProfissional());
			}
		case "ReMe":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.ResidenciaMedica());
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.ResidenciaMedica());
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.ResidenciaMedica());
			}
		case "Ape":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.Aperfeicoamento());
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.Aperfeicoamento());
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.Aperfeicoamento());
			}
		case "MBA":
			switch (tipoEstrutura) {
			case "AnCos":
				return this.filtroSearchXml.PreencherItemFormacaoAndCon(searchXMLFormacoes.MBA());
			case "And":
				return this.filtroSearchXml.PreencherItemFormacaoAnd(searchXMLFormacoes.MBA());
			case "Con":
				return this.filtroSearchXml.PreencherItemFormacaoCon(searchXMLFormacoes.MBA());
			}
		}
		return null;

	}

	public ArrayList<ItemAnalisado> PrTecSwitch(String criterioEstrutura, String tipoEstrutura)
			throws XPathExpressionException {
		SearchXMLProdTecnica searchXMLProdTecnica = new SearchXMLProdTecnica(this.filtroSearchXml.getXmlfile());

		switch (criterioEstrutura) {
		case "Tr":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.Traducao());
		case "CuRe":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.CultivacapRegistrada());
		case "CuPr":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.CultivacapProtegida());
		case "Sof":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.Software());
		case "Pa":
			switch (tipoEstrutura) {
			case "NaIn":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.Patente());
			case "Nac":
				return this.filtroSearchXml.PreencherAnoLimitePatenteNac(searchXMLProdTecnica.Patente());
			case "Int":
				return this.filtroSearchXml.PreencherAnoLimitePatenteInt(searchXMLProdTecnica.Patente());
			}
		case "DeTe":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.DesenhoIndustrial());
		case "Mac":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.Marca());
		case "ToCiIn":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.TopogradiaDeCircuitoIntegrado());
		case "PrTe":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.ProdutoTecnologico());
		case "ProuTe":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.ProcessoTecnico());
		case "TrTe":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.TrabalhoTecnico());
		case "ApTr":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.ApresentacaoTrabalho());
		case "CaMaSi":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.CartaMapa());
		case "CuMiCuDu":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.CursoMinistradoCurtaDuracao());
		case "PrMaDi":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.MaterialDidatico());
		case "Edi":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.Editoracao());
		case "MaObAr":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.ManutencaoObraArtistica());
		case "Maq":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.Maquete());
		case "OrEv":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.OrganizacaoEventos());
		case "CPRTV":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.ProgramaRadioTVComentario());
		case "RePe":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.RelatorioPesquisa());
		case "TeMiSo":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdTecnica.MidiaSocial());
		}
		return null;
	}

	public ArrayList<ItemAnalisado> PrArtSwitch(String criterioEstrutura, String tipoEstrutura)
			throws XPathExpressionException {
		SearchXMLProdArtistica searchXMLProdArtistica = new SearchXMLProdArtistica(this.filtroSearchXml.getXmlfile());
		switch (criterioEstrutura) {
		case "CrPa":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdArtistica.Partitura());
			case "Ind":
				return this.filtroSearchXml.PreencherAnoLimiteInd(searchXMLProdArtistica.Partitura());
			case "Col":
				return this.filtroSearchXml.PreencherAnoLimiteCole(searchXMLProdArtistica.Partitura());
			}
		case "ApObAr":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdArtistica.ApresentacaoObraArtistica());
			case "Ind":
				return this.filtroSearchXml.PreencherAnoLimiteInd(searchXMLProdArtistica.ApresentacaoObraArtistica());
			case "Col":
				return this.filtroSearchXml.PreencherAnoLimiteCole(searchXMLProdArtistica.ApresentacaoObraArtistica());
			}
		case "ApPrRTV":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdArtistica.ApresentacaoRadioTV());
			case "Ind":
				return this.filtroSearchXml.PreencherAnoLimiteInd(searchXMLProdArtistica.ApresentacaoRadioTV());
			case "Col":
				return this.filtroSearchXml.PreencherAnoLimiteCole(searchXMLProdArtistica.ApresentacaoRadioTV());
			}
		case "ArMu":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdArtistica.ArranjoMusical());
			case "Ind":
				return this.filtroSearchXml.PreencherAnoLimiteInd(searchXMLProdArtistica.ArranjoMusical());
			case "Col":
				return this.filtroSearchXml.PreencherAnoLimiteCole(searchXMLProdArtistica.ArranjoMusical());
			}
		case "CoMu":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdArtistica.ComposicaoMusical());
			case "Ind":
				return this.filtroSearchXml.PreencherAnoLimiteInd(searchXMLProdArtistica.ComposicaoMusical());
			case "Col":
				return this.filtroSearchXml.PreencherAnoLimiteCole(searchXMLProdArtistica.ComposicaoMusical());
			}
		case "ObArVi":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdArtistica.ObraArtesVisuais());
			case "Ind":
				return this.filtroSearchXml.PreencherAnoLimiteInd(searchXMLProdArtistica.ObraArtesVisuais());
			case "Col":
				return this.filtroSearchXml.PreencherAnoLimiteCole(searchXMLProdArtistica.ObraArtesVisuais());
			}
		case "So":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdArtistica.Sonoplastia());
			case "Ind":
				return this.filtroSearchXml.PreencherAnoLimiteInd(searchXMLProdArtistica.Sonoplastia());
			case "Col":
				return this.filtroSearchXml.PreencherAnoLimiteCole(searchXMLProdArtistica.Sonoplastia());
			}
		case "TrArCe":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdArtistica.ArtesCenicas());
			case "Ind":
				return this.filtroSearchXml.PreencherAnoLimiteInd(searchXMLProdArtistica.ArtesCenicas());
			case "Col":
				return this.filtroSearchXml.PreencherAnoLimiteCole(searchXMLProdArtistica.ArtesCenicas());
			}
		case "TrArVi":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdArtistica.ArtesVizuais());
			case "Ind":
				return this.filtroSearchXml.PreencherAnoLimiteInd(searchXMLProdArtistica.ArtesVizuais());
			case "Col":
				return this.filtroSearchXml.PreencherAnoLimiteCole(searchXMLProdArtistica.ArtesVizuais());
			}
		case "Mu":
			switch (tipoEstrutura) {
			case "InCo":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdArtistica.Musica());
			case "Ind":
				return this.filtroSearchXml.PreencherAnoLimiteInd(searchXMLProdArtistica.Musica());
			case "Col":
				return this.filtroSearchXml.PreencherAnoLimiteCole(searchXMLProdArtistica.Musica());
			}
		}
		return null;
	}

	public ArrayList<ItemAnalisado> PrBliSwitch(String criterioEstrutura, String tipoEstrutura)
			throws XPathExpressionException {
		SearchXMLProdBibliografica searchXMLProdBibliografica = new SearchXMLProdBibliografica(
				this.filtroSearchXml.getXmlfile());
		switch (criterioEstrutura) {
		case "TrEv":
			switch (tipoEstrutura) {
			case "NaIn":

				return this.filtroSearchXml
						.PreencherAnoLimiteTrabCompleto(searchXMLProdBibliografica.TrabalhoCompletoEvento());
			case "Nac":
				return this.filtroSearchXml
						.PreencherAnoLimiteTrabNac(searchXMLProdBibliografica.TrabalhoCompletoEvento());
			case "Int":
				return this.filtroSearchXml
						.PreencherAnoLimiteTrabInt(searchXMLProdBibliografica.TrabalhoCompletoEvento());
			}
		case "ArPu":
			switch (tipoEstrutura) {
			case "Con":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdBibliografica.ArtigoCompletoPublicado());
			case "A1":
				return this.filtroSearchXml
						.PreencherAnoLimiteTrabNac(searchXMLProdBibliografica.ArtigoCompletoPublicado());
			case "A2":
				return this.filtroSearchXml
						.PreencherAnoLimiteTrabInt(searchXMLProdBibliografica.ArtigoCompletoPublicado());
			case "B1":
				return this.filtroSearchXml
						.PreencherAnoLimiteTrabInt(searchXMLProdBibliografica.ArtigoCompletoPublicado());
			case "B2":
				return this.filtroSearchXml
						.PreencherAnoLimiteTrabInt(searchXMLProdBibliografica.ArtigoCompletoPublicado());
			case "B3":
				return this.filtroSearchXml
						.PreencherAnoLimiteTrabInt(searchXMLProdBibliografica.ArtigoCompletoPublicado());
			case "B4":
				return this.filtroSearchXml
						.PreencherAnoLimiteTrabInt(searchXMLProdBibliografica.ArtigoCompletoPublicado());
			case "B5":
				return this.filtroSearchXml
						.PreencherAnoLimiteTrabInt(searchXMLProdBibliografica.ArtigoCompletoPublicado());
			case "C":
				return this.filtroSearchXml
						.PreencherAnoLimiteTrabInt(searchXMLProdBibliografica.ArtigoCompletoPublicado());
			}
		case "ArAcPu":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdBibliografica.ArtigoCompletoAceito());
		case "TeJoRe":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdBibliografica.TextoJornalRevista());
		case "CaLi":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdBibliografica.LivroCapitulo());
		case "OrLi":
			return this.filtroSearchXml.PreencherAnoLimiteOr(searchXMLProdBibliografica.LivroPublicadoOuOrganizar());
		case "PuLi":
			return this.filtroSearchXml.PreencherAnoLimitePu(searchXMLProdBibliografica.LivroPublicadoOuOrganizar());
		case "PrPoLi":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLProdBibliografica.LivroPrePosFacio());
		}
		return null;
	}

	public ArrayList<ItemAnalisado> OrienSwitch(String criterioEstrutura, String tipoEstrutura)
			throws XPathExpressionException {
		SearchXMLOrientacoes searchXMLOrientacoes = new SearchXMLOrientacoes(this.filtroSearchXml.getXmlfile());
		switch (criterioEstrutura) {
		case "OrMe":
			ArrayList<ObjetoCriterio> listArray;
			ArrayList<ObjetoCriterio> listArray2;
			ArrayList<ItemAnalisado> resultado;
			ArrayList<ItemAnalisado> resultado2;
			switch (tipoEstrutura) {
			case "AnCosOri":
				resultado = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoMesAnd()
						);
				resultado2 = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoMesCon()
						);
				resultado.addAll(resultado2);

				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoMesAnd()
						);
			case "Con":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoMesCon()
						);
			case "Ori":
				listArray = searchXMLOrientacoes.OrientacaoMesAnd();
				listArray2 = searchXMLOrientacoes.OrientacaoMesCon();
				listArray.addAll(listArray2);
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray);
			case "Coo":
				listArray = searchXMLOrientacoes.OrientacaoMesAnd();
				listArray2 = searchXMLOrientacoes.OrientacaoMesCon();
				listArray.addAll(listArray2);
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray);

			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoMesAnd();
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray);
			case "CooAnd":
				listArray = searchXMLOrientacoes.OrientacaoMesAnd();
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray);
			case "OriCon":
				listArray = searchXMLOrientacoes.OrientacaoMesCon();
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray);
			case "CooCon":
				listArray = searchXMLOrientacoes.OrientacaoMesCon();
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray);
			}
			break;
		case "OrDo":
			switch (tipoEstrutura) {
			case "AnCosOri":
				resultado = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoDouAnd()
						);
				resultado2 = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoDouCon()
						);
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoDouAnd()
						);
			case "Con":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoDouCon()
						);
			case "Ori":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				listArray2 = searchXMLOrientacoes.OrientacaoDouCon();
				listArray.addAll(listArray2);
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray );
			case "Coo":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				listArray2 = searchXMLOrientacoes.OrientacaoDouCon();
				listArray.addAll(listArray2);
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray );
			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray );
			case "CooAnd":
				listArray = searchXMLOrientacoes.OrientacaoDouAnd();
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray );
			case "OriCon":
				listArray = searchXMLOrientacoes.OrientacaoDouCon();
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray );
			case "CooCon":
				listArray = searchXMLOrientacoes.OrientacaoDouCon();
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray );
			}
		case "OrPoDo":
			switch (tipoEstrutura) {
			case "AnCosOri":
				resultado = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoPosDouAnd()
						);
				resultado2 = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoPosDouCon()
						);
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoPosDouAnd()
						);
			case "Con":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoPosDouCon()
						);
			case "Ori":
				listArray = searchXMLOrientacoes.OrientacaoPosDouAnd();
				listArray2 = searchXMLOrientacoes.OrientacaoPosDouCon();
				listArray.addAll(listArray2);
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray);
			case "Coo":
				listArray = searchXMLOrientacoes.OrientacaoPosDouAnd();
				listArray2 = searchXMLOrientacoes.OrientacaoPosDouCon();
				listArray.addAll(listArray2);
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray );
			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoPosDouAnd();
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray );
			case "CooAnd":
				listArray = searchXMLOrientacoes.OrientacaoPosDouAnd();
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray );
			case "OriCon":
				listArray = searchXMLOrientacoes.OrientacaoPosDouCon();
				return this.filtroSearchXml.PreencherItemOrientacaoOri(listArray);
			case "CooCon":
				listArray = searchXMLOrientacoes.OrientacaoPosDouCon();
				return this.filtroSearchXml.PreencherItemOrientacaoCoo(listArray );
			}
		case "OrEsAp":
			switch (tipoEstrutura) {
			case "AnCosOri":
				resultado = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoAperfEspecAnd()
						);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon() ,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoAperfEspecAnd()
						);
			case "Con":
				return this.filtroSearchXml.PreencherItemOrientacaoTipo(searchXMLOrientacoes.OutrasOrientacaoCon()
						,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
			case "Ori":
				resultado = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoAperfEspecAnd()
						);
				resultado2 = this.filtroSearchXml.PreencherAnoLimiteOriTipo(searchXMLOrientacoes.OutrasOrientacaoCon()
						,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
				resultado.addAll(resultado2);
				return resultado;
			case "Coo":
				resultado2 = this.filtroSearchXml.PreencherAnoLimiteCooTipo(searchXMLOrientacoes.OutrasOrientacaoCon()
						,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
				resultado2.addAll(resultado2);
				return resultado2;
			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoAperfEspecAnd();

				return this.filtroSearchXml.PreencherAnoLimite(listArray );
			case "OriCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherItemOrientacaoTipo(listArray,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
				return resultado;
			case "CooCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherAnoLimiteCooTipo(listArray,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
				return resultado;
			}
		case "OrGr":
			switch (tipoEstrutura) {
			case "AnCosOri":
				resultado = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoGraduacaoAnd()
						);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon() ,
						"TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoGraduacaoAnd()
						);
			case "Con":
				return this.filtroSearchXml.PreencherItemOrientacaoTipo(searchXMLOrientacoes.OutrasOrientacaoCon()
						, "TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
			case "Ori":
				resultado = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoGraduacaoAnd()
						);
				resultado2 = this.filtroSearchXml.PreencherAnoLimiteOriTipo(searchXMLOrientacoes.OutrasOrientacaoCon()
						, "TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
				resultado.addAll(resultado2);
				return resultado;
			case "Coo":
				resultado2 = this.filtroSearchXml.PreencherAnoLimiteCooTipo(searchXMLOrientacoes.OutrasOrientacaoCon()
						, "TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
				resultado2.addAll(resultado2);
				return resultado2;
			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoGraduacaoAnd();
				return this.filtroSearchXml.PreencherAnoLimite(listArray );
			case "OriCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherItemOrientacaoTipo(listArray ,
						"TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
				return resultado;
			case "CooCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherAnoLimiteCooTipo(listArray ,
						"TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
				return resultado;
			}
		case "OrInCi":
			switch (tipoEstrutura) {
			case "AnCosOri":
				resultado = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoICAnd()
						);
				resultado2 = this.filtroSearchXml.PreencherItemOrientacaoTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon() ,
						"INICIACAO_CIENTIFICA");
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoICAnd()
						);
			case "Con":
				return this.filtroSearchXml.PreencherItemOrientacaoTipo(searchXMLOrientacoes.OutrasOrientacaoCon()
						, "INICIACAO_CIENTIFICA");
			case "Ori":
				resultado = this.filtroSearchXml.PreencherAnoLimite(searchXMLOrientacoes.OrientacaoICAnd()
						);
				resultado2 = this.filtroSearchXml.PreencherAnoLimiteOriTipo(searchXMLOrientacoes.OutrasOrientacaoCon()
						, "INICIACAO_CIENTIFICA");
				resultado.addAll(resultado2);
				return resultado;
			case "Coo":
				resultado2 = this.filtroSearchXml.PreencherAnoLimiteCooTipo(searchXMLOrientacoes.OutrasOrientacaoCon()
						, "INICIACAO_CIENTIFICA");
				resultado2.addAll(resultado2);
				return resultado2;
			case "OriAnd":
				listArray = searchXMLOrientacoes.OrientacaoICAnd();
				return this.filtroSearchXml.PreencherAnoLimite(listArray );
			case "OriCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherItemOrientacaoTipo(listArray,
						"INICIACAO_CIENTIFICA");
				return resultado;
			case "CooCon":
				listArray = searchXMLOrientacoes.OutrasOrientacaoCon();
				resultado = this.filtroSearchXml.PreencherAnoLimiteCooTipo(listArray,
						"INICIACAO_CIENTIFICA");
				return resultado;
			}
		}
		return null;
	}

	public ArrayList<ItemAnalisado> BancSwitch(String criterioEstrutura, String tipoEstrutura)
			throws XPathExpressionException {
		SearchXMLBanca searchXMLBanca = new SearchXMLBanca(this.filtroSearchXml.getXmlfile());
		switch (criterioEstrutura) {
		case "BaMe":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLBanca.BancaMestrado());
		case "BaDo":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLBanca.BancaDoutorado());
		case "BaQu":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLBanca.BancaQualificacao());
		case "BaEsAp":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLBanca.BancaAperfeicoamentoEspecificacao());
		case "BaGr":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLBanca.BancaGraduacao());
		case "BaPrTi":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLBanca.BancaProfessorTitular());
		case "BaCoPu":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLBanca.BancaConcursoPublico());
		case "BaLDo":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLBanca.BancaLivreDocencia());
		case "BaAvCu":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLBanca.BancaAvaliacaoCurso());
		}
		return null;
	}

	public ArrayList<ItemAnalisado> ParEventoSwitch(String criterioEstrutura, String tipoEstrutura)
			throws XPathExpressionException {
		SearchXMLParEvento searchXMLParEvento = new SearchXMLParEvento(this.filtroSearchXml.getXmlfile());
		switch (criterioEstrutura) {
		case "PaCo":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLParEvento.ParticipacaoCongresso());
		case "PaFe":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLParEvento.ParticipacaoFeira());
		case "PaSe":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLParEvento.ParticipacaoSeminario());
		case "PaSi":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLParEvento.ParticipacaoSimposio());
		case "PaOf":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLParEvento.ParticipacaoOficina());
		case "PaEn":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLParEvento.ParticipacaoEncontro());
		case "PaEx":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLParEvento.ParticipacaoExposicao());
		case "PaOl":
			return this.filtroSearchXml.PreencherAnoLimite(searchXMLParEvento.ParticipacaoOlimpiada());
		}
		return null;
	}

	public ArrayList<ItemAnalisado> CrGeSwitch(String criterioEstrutura, String tipoEstrutura)
			throws XPathExpressionException {
		SearchXMLDadosGerais searchXMLDadosGerais = new SearchXMLDadosGerais(this.filtroSearchXml.getXmlfile());
		switch (criterioEstrutura) {
		case "DeEx":
			return this.filtroSearchXml.PreencherItemBolean(searchXMLDadosGerais.DedicaoExclusiva());
		}
		return null;
	}

}
