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

public class SearchXMLProdTecnica extends SearchXML {

	public SearchXMLProdTecnica(Document xmlfile) {
		super(xmlfile);
		// TODO Auto-generated constructor stub
	}
	//feito
	public ArrayList<Tipo6> Traducao() throws XPathExpressionException {
		return BuscaTipo6("//TRADUCAO", "TITULO", 1, "TITULO-DA-OBRA-ORIGINAL", 0, null);
	}
	//feito
	public ArrayList<Tipo3> CultivacapRegistrada() throws XPathExpressionException {
		return BuscaTipo3("//CULTIVAR-REGISTRADA", "DENOMINACAO", "ANO-SOLICITACAO");
	}
	//feito
	public ArrayList<Tipo4> Software() throws XPathExpressionException {
		return BuscaTipo4("//SOFTWARE", "TITULO-DO-SOFTWARE", "ANO");
	}
	//feito
	public ArrayList<Tipo3> Patente() throws XPathExpressionException {
		return BuscaTipo3("//PATENTE", "TITULO", "ANO-DESENVOLVIMENTO");
	}
	//feito
	public ArrayList<Tipo3> CultivacapProtegida() throws XPathExpressionException {
		return BuscaTipo3("//CULTIVAR-PROTEGIDA", "DENOMINACAO", "ANO-SOLICITACAO");
	}
	//feito
	public ArrayList<Tipo3> DesenhoIndustrial() throws XPathExpressionException {
		return BuscaTipo3("//DESENHO-INDUSTRIAL", "TITULO", "ANO-DESENVOLVIMENTO");
	}
	//feito
	public ArrayList<Tipo3> Marca() throws XPathExpressionException {
		return BuscaTipo3("//MARCA", "TITULO", "ANO-DESENVOLVIMENTO");
	}
	//feito
	public ArrayList<Tipo3> TopogradiaDeCircuitoIntegrado() throws XPathExpressionException {
		return BuscaTipo3("//TOPOGRAFIA-DE-CIRCUITO-INTEGRADO", "TITULO", "ANO-DESENVOLVIMENTO");
	}
	//feito
	public ArrayList<Tipo5> ProdutoTecnologico() throws XPathExpressionException {
		return BuscaTipo5("//PRODUTO-TECNOLOGICO");
	}
	//feito
	public ArrayList<Tipo4> ProcessoTecnico() throws XPathExpressionException {
		return BuscaTipo4("//PROCESSOS-OU-TECNICAS", "TITULO-DO-PROCESSO", "ANO");
	}
	//feito
	public ArrayList<Tipo6> TrabalhoTecnico() throws XPathExpressionException {
		return BuscaTipo6("//TRABALHO-TECNICO", "TITULO-DO-TRABALHO-TECNICO", 0, null, 0, null);
	}
	//feito
	public ArrayList<Tipo6> ApresentacaoTrabalho() throws XPathExpressionException {
		return BuscaTipo6("//APRESENTACAO-DE-TRABALHO", "TITULO", 1, "NOME-DO-EVENTO", 0, null);
	}
	//feito
	public ArrayList<Tipo6> CartaMapa() throws XPathExpressionException {
		return BuscaTipo6("//CARTA-MAPA-OU-SIMILAR", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<Producao> CursoMinistradoCurtaDuracao() throws XPathExpressionException {
		return BuscaProducao("//CURSO-DE-CURTA-DURACAO-MINISTRADO", 0, null);
	}
	//feito
	public ArrayList<Tipo6> MaterialDidatico() throws XPathExpressionException {
		return BuscaTipo6("//DESENVOLVIMENTO-DE-MATERIAL-DIDATICO-OU-INSTRUCIONAL", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<Tipo6> Editoracao() throws XPathExpressionException {
		return BuscaTipo6("//EDITORACAO", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<Tipo6> ManutencaoObraArtistica() throws XPathExpressionException {
		return BuscaTipo6("//MANUTENCAO-DE-OBRA-ARTISTICA", "TITULO", 1, "NOME-DA-OBRA", 0,
				null);
	}
	//feito
	public ArrayList<Producao> Maquete() throws XPathExpressionException {
		return BuscaProducao("//MAQUETE", 0, null);
	}
	//feito
	public ArrayList<Tipo8> OrganizacaoEventos() throws XPathExpressionException {
		return BuscaTipo8("//ORGANIZACAO-DE-EVENTO", 0, null);
	}
	//feito
	public ArrayList<Tipo6> ProgramaRadioTVComentario() throws XPathExpressionException {
		return BuscaTipo6("//PROGRAMA-DE-RADIO-OU-TV", "TITULO", 0, null, 0, null);
	}
	//feito
	public ArrayList<Producao> RelatorioPesquisa() throws XPathExpressionException {
		return BuscaProducao("//RELATORIO-DE-PESQUISA", 0, null);
	}
	//feito
	public ArrayList<Tipo6> MidiaSocial() throws XPathExpressionException {
		return BuscaTipo6("//MIDIA-SOCIAL-WEBSITE-BLOG", "TITULO", 0, null, 0, null);
	}

}
