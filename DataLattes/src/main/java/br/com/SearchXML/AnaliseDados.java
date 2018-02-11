package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.Formacao;
import br.com.Modelo.ObjetoCriterio;
import br.com.Modelo.Orientacao;
import br.com.Modelo.Producao;
import br.com.Modelo.Tipo0;
import br.com.Modelo.Tipo1;
import br.com.Modelo.Tipo2;
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
	int anofim;
	int anoinicio;

	public void preencherEstruturaAnaliseXml(Estrutura SessaoCriteriosKey, Document xmlfile) {
		this.anofim = SessaoCriteriosKey.getAnoFim();
		this.anoinicio = SessaoCriteriosKey.getAnoInicio();
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
			case "OrEsAp":
				return OrEsApSwitch(criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
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
				return PreencherItemFormacaoAndCon(searchXMLFormacoes.Graduacao(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "And":
				return PreencherItemFormacaoAnd(searchXMLFormacoes.Graduacao(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemFormacaoCon(searchXMLFormacoes.Graduacao(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "Es":
			switch (tipoEstrutura) {
			case "AnCos":
				return PreencherItemFormacaoAndCon(searchXMLFormacoes.Especializacao(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "And":
				return PreencherItemFormacaoAnd(searchXMLFormacoes.Especializacao(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemFormacaoCon(searchXMLFormacoes.Especializacao(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "Me":
			switch (tipoEstrutura) {
			case "AnCos":
				return PreencherItemFormacaoAndCon(searchXMLFormacoes.Mestrado(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "And":
				return PreencherItemFormacaoAnd(searchXMLFormacoes.Mestrado(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemFormacaoCon(searchXMLFormacoes.Mestrado(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "Do":
			switch (tipoEstrutura) {
			case "AnCos":
				return PreencherItemFormacaoAndCon(searchXMLFormacoes.Doutorado(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "And":
				return PreencherItemFormacaoAnd(searchXMLFormacoes.Doutorado(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemFormacaoCon(searchXMLFormacoes.Doutorado(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "PDo":
			switch (tipoEstrutura) {
			case "AnCos":
				return PreencherItemFormacaoAndCon(searchXMLFormacoes.PosDoutorado(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "And":
				return PreencherItemFormacaoAnd(searchXMLFormacoes.PosDoutorado(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemFormacaoCon(searchXMLFormacoes.PosDoutorado(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "LDo":
			return PreencherItemFormacao(searchXMLFormacoes.LivreDocencia(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "CuTePr":
			switch (tipoEstrutura) {
			case "AnCos":
				return PreencherItemFormacaoAndCon(searchXMLFormacoes.CursoTecnico(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "And":
				return PreencherItemFormacaoAnd(searchXMLFormacoes.CursoTecnico(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemFormacaoCon(searchXMLFormacoes.CursoTecnico(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "MePr":
			switch (tipoEstrutura) {
			case "AnCos":
				return PreencherItemFormacaoAndCon(searchXMLFormacoes.MestradoProfissional(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "And":
				return PreencherItemFormacaoAnd(searchXMLFormacoes.MestradoProfissional(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemFormacaoCon(searchXMLFormacoes.MestradoProfissional(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			}
		case "ReMe":
			switch (tipoEstrutura) {
			case "AnCos":
				return PreencherItemFormacaoAndCon(searchXMLFormacoes.ResidenciaMedica(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "And":
				return PreencherItemFormacaoAnd(searchXMLFormacoes.ResidenciaMedica(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemFormacaoCon(searchXMLFormacoes.ResidenciaMedica(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "Ape":
			switch (tipoEstrutura) {
			case "AnCos":
				return PreencherItemFormacaoAndCon(searchXMLFormacoes.Aperfeicoamento(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "And":
				return PreencherItemFormacaoAnd(searchXMLFormacoes.Aperfeicoamento(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemFormacaoCon(searchXMLFormacoes.Aperfeicoamento(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			}
		case "MBA":
			switch (tipoEstrutura) {
			case "AnCos":
				return PreencherItemFormacaoAndCon(searchXMLFormacoes.MBA(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura);
			case "And":
				return PreencherItemFormacaoAnd(searchXMLFormacoes.MBA(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura);
			case "Con":
				return PreencherItemFormacaoCon(searchXMLFormacoes.MBA(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura);
			}
		}
		return null;

	}

	public ArrayList<ItemAnalisado> PrTecSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLProdTecnica searchXMLProdTecnica = new SearchXMLProdTecnica(xmlfile);

		switch (criterioEstrutura) {
		case "Tr":
			return PreencherItemTipo6(searchXMLProdTecnica.Traducao(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "CuRe":
			return PreencherItemTipo3(searchXMLProdTecnica.CultivacapRegistrada(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "CuPr":
			return PreencherItemTipo3(searchXMLProdTecnica.CultivacapProtegida(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "Sof":
			return PreencherItemTipo4(searchXMLProdTecnica.Software(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "Pa":
			switch (tipoEstrutura) {
			case "NaIn":
				return PreencherItemTipo3(searchXMLProdTecnica.Patente(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Nac":
				return PreencherItemTipo3Nac(searchXMLProdTecnica.Patente(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura);
			case "Int":
				return PreencherItemTipo3Inte(searchXMLProdTecnica.Patente(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura);
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
			return PreencherItemTipo6(searchXMLProdTecnica.TrabalhoTecnico(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "ApTr":
			return PreencherItemTipo6(searchXMLProdTecnica.ApresentacaoTrabalho(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "CaMaSi":
			return PreencherItemTipo6(searchXMLProdTecnica.CartaMapa(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "CuMiCuDu":
			return PreencherItemProducao(searchXMLProdTecnica.CursoMinistradoCurtaDuracao(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "PrMaDi":
			return PreencherItemTipo6(searchXMLProdTecnica.MaterialDidatico(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "Edi":
			return PreencherItemTipo6(searchXMLProdTecnica.Editoracao(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "MaObAr":
			return PreencherItemTipo6(searchXMLProdTecnica.ManutencaoObraArtistica(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "Maq":
			return PreencherItemProducao(searchXMLProdTecnica.Maquete(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
		case "OrEv":
			return PreencherItemTipo8(searchXMLProdTecnica.OrganizacaoEventos(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "CPRTV":
			return PreencherItemTipo6(searchXMLProdTecnica.ProgramaRadioTVComentario(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "RePe":
			return PreencherItemProducao(searchXMLProdTecnica.RelatorioPesquisa(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "TeMiSo":
			return PreencherItemTipo6(searchXMLProdTecnica.MidiaSocial(), criterioEstrutura, tipoEstrutura, xmlfile,
					ObjecttipoEstrutura);
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

	public ArrayList<ItemAnalisado> PrBliSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLProdBibliografica searchXMLProdBibliografica = new SearchXMLProdBibliografica(xmlfile);
		switch (criterioEstrutura) {
		case "TrEv":
			switch (tipoEstrutura) {
			case "NaIn":
				return PreencherItemTipo0(searchXMLProdBibliografica.TrabalhoCompletoEvento(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Nac":
				return PreencherItemTipo0Nac(searchXMLProdBibliografica.TrabalhoCompletoEvento(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Int":
				return PreencherItemTipo0Int(searchXMLProdBibliografica.TrabalhoCompletoEvento(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			}
		case "ArPu":
			return PreencherItemTipo0(searchXMLProdBibliografica.ArtigoCompletoAceito(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "ArAcPu":
			return PreencherItemTipo0(searchXMLProdBibliografica.ArtigoCompletoPublicado(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "TeJoRe":
			return PreencherItemTipo0(searchXMLProdBibliografica.TextoJornalRevista(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "CaLi":
			return PreencherItemTipo1(searchXMLProdBibliografica.LivroCapitulo(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "OrLi":
			return PreencherItemTipo2Or(searchXMLProdBibliografica.LivroPublicadoOuOrganizar(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "PuLi":
			return PreencherItemTipo2Pu(searchXMLProdBibliografica.LivroPublicadoOuOrganizar(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "PrPoLi":
			return PreencherItemTipo2(searchXMLProdBibliografica.LivroPrePosFacio(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		}
		return null;
	}

	public ArrayList<ItemAnalisado> OrEsApSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLOrientacoes searchXMLOrientacoes = new SearchXMLOrientacoes(xmlfile);
		switch (criterioEstrutura) {
		case "OrMe":
			switch (tipoEstrutura) {
			case "AnCos":
				ArrayList<ItemAnalisado> resultado = PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoMesAnd(),
						criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
				ArrayList<ItemAnalisado> resultado2 = PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoMesCon(),
						criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoMesAnd(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoMesCon(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			}
			break;
		case "OrDo":
			switch (tipoEstrutura) {
			case "AnCos":
				ArrayList<ItemAnalisado> resultado = PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouAnd(),
						criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
				ArrayList<ItemAnalisado> resultado2 = PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouCon(),
						criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouAnd(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouCon(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			}
			// case "OrPoDo":
			// switch (tipoEstrutura) {
			// case "AnCos":
			// ArrayList<ItemAnalisado> resultado =
			// PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouAnd(),
			// criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			// ArrayList<ItemAnalisado> resultado2 =
			// PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouCon(),
			// criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			// resultado.addAll(resultado2);
			// return resultado;
			// case "And":
			// return PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouAnd(),
			// criterioEstrutura,
			// tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			// case "Con":
			// return PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoDouCon(),
			// criterioEstrutura,
			// tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			// }
		case "OrEsAp":
			switch (tipoEstrutura) {
			case "AnCos":
				ArrayList<ItemAnalisado> resultado = PreencherItemOrientacao(
						searchXMLOrientacoes.OrientacaoAperfEspecAnd(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura);
				ArrayList<ItemAnalisado> resultado2 = PreencherItemOrientacaoTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura, "MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoAperfEspecAnd(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemOrientacaoTipo(searchXMLOrientacoes.OutrasOrientacaoCon(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura,
						"MONOGRAFIA_DE_CONCLUSAO_DE_CURSO_APERFEICOAMENTO_E_ESPECIALIZACAO");
			}
		case "OrGr":
			switch (tipoEstrutura) {
			case "AnCos":
				ArrayList<ItemAnalisado> resultado = PreencherItemOrientacao(
						searchXMLOrientacoes.OrientacaoGraduacaoAnd(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura);
				ArrayList<ItemAnalisado> resultado2 = PreencherItemOrientacaoTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura, "TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoGraduacaoAnd(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemOrientacaoTipo(searchXMLOrientacoes.OutrasOrientacaoCon(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura, "TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO");
			}
		case "OrInCi":
			switch (tipoEstrutura) {
			case "AnCos":
				ArrayList<ItemAnalisado> resultado = PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoICAnd(),
						criterioEstrutura, tipoEstrutura, xmlfile, ObjecttipoEstrutura);
				ArrayList<ItemAnalisado> resultado2 = PreencherItemOrientacaoTipo(
						searchXMLOrientacoes.OutrasOrientacaoCon(), criterioEstrutura, tipoEstrutura, xmlfile,
						ObjecttipoEstrutura, "INICIACAO_CIENTIFICA");
				resultado.addAll(resultado2);
				return resultado;
			case "And":
				return PreencherItemOrientacao(searchXMLOrientacoes.OrientacaoICAnd(), criterioEstrutura, tipoEstrutura,
						xmlfile, ObjecttipoEstrutura);
			case "Con":
				return PreencherItemOrientacaoTipo(searchXMLOrientacoes.OutrasOrientacaoCon(), criterioEstrutura,
						tipoEstrutura, xmlfile, ObjecttipoEstrutura, "INICIACAO_CIENTIFICA");
			}
		case "BaMe":
			return PreencherItemOrientacao(searchXMLOrientacoes.BancaMestrado(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "BaDo":
			return PreencherItemOrientacao(searchXMLOrientacoes.BancaDoutorado(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "BaQu":
			return PreencherItemOrientacao(searchXMLOrientacoes.BancaQualificacao(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "BaEsAp":
			return PreencherItemOrientacao(searchXMLOrientacoes.BancaAperfeicoamentoEspecificacao(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "BaGr":
			return PreencherItemOrientacao(searchXMLOrientacoes.BancaGraduacao(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "BaPrTi":
			return PreencherItemOrientacao(searchXMLOrientacoes.BancaProfessorTitular(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "BaCoPu":
			return PreencherItemOrientacao(searchXMLOrientacoes.BancaConcursoPublico(), criterioEstrutura,
					tipoEstrutura, xmlfile, ObjecttipoEstrutura);
		case "BaLDo":
			return PreencherItemOrientacao(searchXMLOrientacoes.BancaLivreDocencia(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		case "BaAvCu":
			return PreencherItemOrientacao(searchXMLOrientacoes.BancaAvaliacaoCurso(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		}
		return null;
	}

	public ArrayList<ItemAnalisado> CrGeSwitch(String criterioEstrutura, String tipoEstrutura, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) throws XPathExpressionException {
		SearchXMLDadosGerais searchXMLDadosGerais = new SearchXMLDadosGerais(xmlfile);
		switch (criterioEstrutura) {
		case "DeEx":
			return PreencherItemBolean(searchXMLDadosGerais.DedicaoExclusiva(), criterioEstrutura, tipoEstrutura,
					xmlfile, ObjecttipoEstrutura);
		}
		return null;
	}

	public ArrayList<ItemAnalisado> PreencherItemBolean(boolean flag, String criterioEstrutura, String tipoEstrutura,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		ItemAnalisado item;
		if (flag)
			item = new ItemAnalisado(valorContabilizado, false, new Producao("Possui Dedicação exclusiva", 2000));
		else {
			item = new ItemAnalisado(valorContabilizado, true, new Producao("Não possui Dedicação exclusiva", 2000));
		}
		listItem.add(item);
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemProducao(ArrayList<Producao> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacao(ArrayList<Orientacao> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoTipo(ArrayList<Orientacao> listArray,
			String criterioEstrutura, String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura,
			String tipoString) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Orientacao) tipo).getCampAux().contentEquals(tipoString)) {
				if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else {
					item = new ItemAnalisado(valorContabilizado, true, tipo);
					limite--;
				}
				listItem.add(item);
			}

		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo5(ArrayList<Tipo5> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo4(ArrayList<Tipo4> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	private ArrayList<ItemAnalisado> PreencherItemFormacaoAnd(ArrayList<Formacao> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0) {
				if (((Formacao) tipo).getStatus().contentEquals("EM_ANDAMENTO"))
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	private ArrayList<ItemAnalisado> PreencherItemFormacaoCon(ArrayList<Formacao> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0) {
				if (((Formacao) tipo).getStatus().contentEquals("CONCLUIDO"))
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	private ArrayList<ItemAnalisado> PreencherItemFormacaoAndCon(ArrayList<Formacao> listArray,
			String criterioEstrutura, String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0) {
				if (((Formacao) tipo).getStatus().contentEquals("CONCLUIDO")
						|| ((Formacao) tipo).getStatus().contentEquals("EM_ANDAMENTO"))
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	private ArrayList<ItemAnalisado> PreencherItemFormacao(ArrayList<Formacao> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0) {
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo6Cole(ArrayList<Tipo6> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno())) {
				if (((Producao) tipo).getAutores().size() > 1)
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo0Nac(ArrayList<Tipo0> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno())) {
				if (((Orientacao) tipo).getCampAux2().contentEquals("NACIONAL"))
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo0(ArrayList<Tipo0> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno())) {
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo1(ArrayList<Tipo1> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno())) {
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo0Int(ArrayList<Tipo0> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno())) {
				if (((Orientacao) tipo).getCampAux2().contentEquals("INTERNACIONAL"))
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo2Or(ArrayList<Tipo2> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno())) {
				if (((Tipo6) tipo).getNatureza().contentEquals("LIVRO_ORGANIZADO_OU_EDICAO"))
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo2Pu(ArrayList<Tipo2> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno())) {
				if (((Tipo6) tipo).getNatureza().contentEquals("LIVRO_PUBLICADO"))
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo2(ArrayList<Tipo2> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno())) {
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo6Ind(ArrayList<Tipo6> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno())) {
				if (((Producao) tipo).getAutores().size() == 1)
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			} else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo6(ArrayList<Tipo6> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			System.out.println("entrouy");
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo8(ArrayList<Tipo8> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo3(ArrayList<Tipo3> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo3Nac(ArrayList<Tipo3> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
				if (((Tipo3) tipo).getCampAux().contentEquals("Brasil"))
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo3Inte(ArrayList<Tipo3> listArray, String criterioEstrutura,
			String tipoEstrutura, Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
				if (!((Tipo3) tipo).getCampAux().contentEquals("Brasil"))
					item = new ItemAnalisado(valorContabilizado, false, tipo);
				else
					continue;
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

}
