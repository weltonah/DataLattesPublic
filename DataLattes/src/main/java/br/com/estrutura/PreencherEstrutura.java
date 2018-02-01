package br.com.estrutura;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class PreencherEstrutura {
	private Estrutura estr;

	public PreencherEstrutura() {
		this.estr = new Estrutura();
		ArrayList<AreaEstrutura> listArea = new ArrayList<AreaEstrutura>();
		ArrayList<CriterioEstrutura> listCritFormacao = new ArrayList<CriterioEstrutura>();
		listCritFormacao.add(new CriterioEstrutura("Graduação", "Gr"));
		listCritFormacao.add(new CriterioEstrutura("Especialização", "Es"));
		listCritFormacao.add(new CriterioEstrutura("Mestrado", "Me"));
		listCritFormacao.add(new CriterioEstrutura("Doutorado", "Do"));
		listCritFormacao.add(new CriterioEstrutura("Pós-Doutorado", "PDo"));
		listCritFormacao.add(new CriterioEstrutura("Livre-docência", "LDo"));
		listCritFormacao.add(new CriterioEstrutura("Curso Técnico ou Profissionalizante", "CuTePr"));
		listCritFormacao.add(new CriterioEstrutura("Mestrado Profissionalizante", "MePr"));
		listCritFormacao.add(new CriterioEstrutura("Residência médica", "ReMe"));
		listCritFormacao.add(new CriterioEstrutura("Aperfeiçoamento", "Ape"));
		listCritFormacao.add(new CriterioEstrutura("MBA", "MBA"));
		AreaEstrutura areaEstruturaFormacao = new AreaEstrutura("Formação", "For");
		areaEstruturaFormacao.setListCrit(listCritFormacao);
		listArea.add(areaEstruturaFormacao);


	}

	public void PreencherCheckBoxFormacao(ArrayList<CriterioEstrutura> listCrit) {
		listCrit.add(new CriterioEstrutura("Graduação", "Gr"));
		listCrit.add(new CriterioEstrutura("Especialização", "Es"));
		listCrit.add(new CriterioEstrutura("Mestrado", "Me"));
		listCrit.add(new CriterioEstrutura("Doutorado", "Do"));
		listCrit.add(new CriterioEstrutura("Pós-Doutorado", "PDo"));
		listCrit.add(new CriterioEstrutura("Livre-docência", "LDo"));
		listCrit.add(new CriterioEstrutura("Curso Técnico ou Profissionalizante", "CuTePr"));
		listCrit.add(new CriterioEstrutura("Mestrado Profissionalizante", "MePr"));
		listCrit.add(new CriterioEstrutura("Residência médica", "ReMe"));
		listCrit.add(new CriterioEstrutura("Aperfeiçoamento", "Ape"));
		listCrit.add(new CriterioEstrutura("MBA", "MBA"));
	}

	public void PreencherCheckBoxProdTec(ArrayList<CriterioEstrutura> listCrit) {
		listCrit.add(new CriterioEstrutura("Tradução", "Tr"));
		listCrit.add(new CriterioEstrutura("Cultivação Registrada", "CuRe"));
		listCrit.add(new CriterioEstrutura("Cultivação Protegida", "CuPr"));
		listCrit.add(new CriterioEstrutura("Software", "So"));
		listCrit.add(new CriterioEstrutura("Patente", "Pa"));
		listCrit.add(new CriterioEstrutura("Desenho Técnico", "DeTe"));
		listCrit.add(new CriterioEstrutura("Marca", "Mac"));
		listCrit.add(new CriterioEstrutura("Topografia de circuito integrado", "ToCiIn"));
		listCrit.add(new CriterioEstrutura("Produto Tecnologico", "PrTe"));
		listCrit.add(new CriterioEstrutura("Processo ou técnica", "ProuTe"));
		listCrit.add(new CriterioEstrutura("Trabalho Técnico", "TrTe"));
		listCrit.add(new CriterioEstrutura("Apresentação de Trabalho", "ApTr"));
		listCrit.add(new CriterioEstrutura("Carta, mapa ou similar", "CaMaSi"));
		listCrit.add(new CriterioEstrutura("Curso ministrado de curta duração", "CuMiCuDu"));
		listCrit.add(new CriterioEstrutura("Produção de material didatico", "PrMaDi"));
		listCrit.add(new CriterioEstrutura("Editoração", "Edi"));
		listCrit.add(new CriterioEstrutura("Manutenção de obra artistica", "MaObAr"));
		listCrit.add(new CriterioEstrutura("Maquete", "Maq"));
		listCrit.add(new CriterioEstrutura("Organização de evento", "OrEv"));
		listCrit.add(new CriterioEstrutura("Comentario em programa de Radio ou TV", "CPRTV"));
		listCrit.add(new CriterioEstrutura("Relatorio de pesquisa", "RePe"));
		listCrit.add(new CriterioEstrutura("Texto em midia Social", "TeMiSo"));
	}

	public void PreencherCheckBoxProdArt(ArrayList<CriterioEstrutura> listCrit) {
		listCrit.add(new CriterioEstrutura("Criação de Partitura", "CrPa"));
		listCrit.add(new CriterioEstrutura("Apresentação de Obra Artistica", "ApObAr"));
		listCrit.add(new CriterioEstrutura("Apresentação de programa em Radio ou TV", "ApPrRTV"));
		listCrit.add(new CriterioEstrutura("Arranjo musical", "ArMu"));
		listCrit.add(new CriterioEstrutura("Composição musical", "CoMu"));
		listCrit.add(new CriterioEstrutura("Obra de Artes vizuais", "ObArVi"));
		listCrit.add(new CriterioEstrutura("Sonoplastia", "So"));
		listCrit.add(new CriterioEstrutura("Trabalho em Arte Cenicas", "TrArCe"));
		listCrit.add(new CriterioEstrutura("Trabalho em Artes Vizuais", "TrArVi"));
		listCrit.add(new CriterioEstrutura("Musica", "Mu"));
	}

	private void PreencherCheckBoxprodBibli(ArrayList<CriterioEstrutura> listCrit) {
		listCrit.add(new CriterioEstrutura("Trabalho em eventos", "TrEv"));
		listCrit.add(new CriterioEstrutura("Artigos publicados", "ArPu"));
		listCrit.add(new CriterioEstrutura("Artigos aceitos para publicação", "ArAcPu"));
		listCrit.add(new CriterioEstrutura("Textos em jornais ou revista", "TeJoRe"));
		listCrit.add(new CriterioEstrutura("Capítulo de livro", "CaLi"));
		listCrit.add(new CriterioEstrutura("Organização de livro", "OrLi"));
		listCrit.add(new CriterioEstrutura("Publicação de livro", "PuLi"));
		listCrit.add(new CriterioEstrutura("Prefácio ou posfácio de livro", "PrPoLi"));

	}

	private void PreencherCheckBoxOriBanc(ArrayList<CriterioEstrutura> listCrit) {
		listCrit.add(new CriterioEstrutura("Orientação Mestrado", "OrMe"));
		listCrit.add(new CriterioEstrutura("Orientação Doutorado", "OrDo"));
		listCrit.add(new CriterioEstrutura("Orientação Especialização ou Aperfeiçoamento", "OrEsAp"));
		listCrit.add(new CriterioEstrutura("Orientação de Graduação", "OrGr"));
		listCrit.add(new CriterioEstrutura("Orientação de Iniciação Cientifica", "OrInCi"));
		listCrit.add(new CriterioEstrutura("Banca de Mestrado", "BaMe"));
		listCrit.add(new CriterioEstrutura("Banca de Doutorado", "BaDo"));
		listCrit.add(new CriterioEstrutura("Banca de Qualificação", "BaQu"));
		listCrit.add(new CriterioEstrutura("Banca de Especialização ou Aperfeiçoamento", "BaEsAp"));
		listCrit.add(new CriterioEstrutura("Banca de Graduação", "BaGr"));
		listCrit.add(new CriterioEstrutura("Banca de Professor Titular", "BaPrTi"));
		listCrit.add(new CriterioEstrutura("Banca de Concurso Publico", "BaCoPu"));
		listCrit.add(new CriterioEstrutura("Banca de Livre-docencia", "BaLDo"));
		listCrit.add(new CriterioEstrutura("Banca de Avaliação de curso", "BaAvCu"));
	}
}
