package br.com.SearchXML;

import java.util.ArrayList;

import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;

import br.com.Modelo.ObjetoCriterio;

public class SearchXMLProdTecnica extends SearchXML {

	public SearchXMLProdTecnica(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}
	//feito
	public ArrayList<ObjetoCriterio> Traducao() throws XPathExpressionException {
		return BuscaTipo6("//TRADUCAO", "TITULO", 1, "TITULO-DA-OBRA-ORIGINAL", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> CultivacapRegistrada() throws XPathExpressionException {
		return BuscaTipo3("//CULTIVAR-REGISTRADA", "DENOMINACAO", "ANO-SOLICITACAO", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> Software() throws XPathExpressionException {
		return BuscaTipo4("//SOFTWARE", "TITULO-DO-SOFTWARE", "ANO");
	}
	//feito
	public ArrayList<ObjetoCriterio> Patente() throws XPathExpressionException {
		return BuscaTipo3("//PATENTE", "TITULO", "ANO-DESENVOLVIMENTO", 0, "PAIS");
	}
	//feito
	public ArrayList<ObjetoCriterio> CultivacapProtegida() throws XPathExpressionException {
		return BuscaTipo3("//CULTIVAR-PROTEGIDA", "DENOMINACAO", "ANO-SOLICITACAO", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> DesenhoIndustrial() throws XPathExpressionException {
		return BuscaTipo3("//DESENHO-INDUSTRIAL", "TITULO", "ANO-DESENVOLVIMENTO", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> Marca() throws XPathExpressionException {
		return BuscaTipo3("//MARCA", "TITULO", "ANO-DESENVOLVIMENTO", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> TopogradiaDeCircuitoIntegrado() throws XPathExpressionException {
		return BuscaTipo3("//TOPOGRAFIA-DE-CIRCUITO-INTEGRADO", "TITULO", "ANO-DESENVOLVIMENTO", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> ProdutoTecnologico() throws XPathExpressionException {
		return BuscaTipo5("//PRODUTO-TECNOLOGICO");
	}
	//feito
	public ArrayList<ObjetoCriterio> ProcessoTecnico() throws XPathExpressionException {
		return BuscaTipo4("//PROCESSOS-OU-TECNICAS", "TITULO-DO-PROCESSO", "ANO");
	}
	//feito
	public ArrayList<ObjetoCriterio> TrabalhoTecnico() throws XPathExpressionException {
		return BuscaTipo6("//TRABALHO-TECNICO", "TITULO-DO-TRABALHO-TECNICO", 0, null, 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> ApresentacaoTrabalho() throws XPathExpressionException {
		return BuscaTipo6("//APRESENTACAO-DE-TRABALHO", "TITULO", 1, "NOME-DO-EVENTO", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> CartaMapa() throws XPathExpressionException {
		return BuscaTipo6("//CARTA-MAPA-OU-SIMILAR", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> CursoMinistradoCurtaDuracao() throws XPathExpressionException {
		return BuscaProducao("//CURSO-DE-CURTA-DURACAO-MINISTRADO", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> MaterialDidatico() throws XPathExpressionException {
		return BuscaTipo6("//DESENVOLVIMENTO-DE-MATERIAL-DIDATICO-OU-INSTRUCIONAL", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> Editoracao() throws XPathExpressionException {
		return BuscaTipo6("//EDITORACAO", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> ManutencaoObraArtistica() throws XPathExpressionException {
		return BuscaTipo6("//MANUTENCAO-DE-OBRA-ARTISTICA", "TITULO", 1, "NOME-DA-OBRA", 0,
				null);
	}
	//feito
	public ArrayList<ObjetoCriterio> Maquete() throws XPathExpressionException {
		return BuscaProducao("//MAQUETE", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> OrganizacaoEventos() throws XPathExpressionException {
		return BuscaTipo8("//ORGANIZACAO-DE-EVENTO", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> ProgramaRadioTVComentario() throws XPathExpressionException {
		return BuscaTipo6("//PROGRAMA-DE-RADIO-OU-TV", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> RelatorioPesquisa() throws XPathExpressionException {
		return BuscaProducao("//RELATORIO-DE-PESQUISA", 0, null);
	}
	//feito
	public ArrayList<ObjetoCriterio> MidiaSocial() throws XPathExpressionException {
		return BuscaTipo6("//MIDIA-SOCIAL-WEBSITE-BLOG", "TITULO", 0, null, 0, null);
	}

}
