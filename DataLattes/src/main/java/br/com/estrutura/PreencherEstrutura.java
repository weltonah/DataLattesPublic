package br.com.estrutura;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class PreencherEstrutura {

	private Estrutura estr;

	public PreencherEstrutura() {
	}

	@PostConstruct
	public void Init() {
		this.estr = new Estrutura();
		ArrayList<AreaEstrutura> listArea = new ArrayList<AreaEstrutura>();
		// Formacao
		ArrayList<CriterioEstrutura> listCritFormacao = new ArrayList<CriterioEstrutura>();
		PreencherAndCon(new CriterioEstrutura("Graduação", "Gr"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Especialização", "Es"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Mestrado", "Me"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Doutorado", "Do"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Pós-Doutorado", "PDo"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Livre-docência", "LDo"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Curso Técnico ou Profissionalizante", "CuTePr"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Mestrado Profissionalizante", "MePr"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Residência médica", "ReMe"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Aperfeiçoamento", "Ape"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("MBA", "MBA"), listCritFormacao);
		AreaEstrutura areaEstruturaFormacao = new AreaEstrutura("Formação", "For");
		areaEstruturaFormacao.setListCrit(listCritFormacao);
		listArea.add(areaEstruturaFormacao);
		// Producao Tecnica
		listCritFormacao = new ArrayList<CriterioEstrutura>();
		PreencherConcluido(new CriterioEstrutura("Tradução", "Tr"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Cultivação Registrada", "CuRe"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Cultivação Protegida", "CuPr"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Software", "So"), listCritFormacao);
		PreencherNacInter(new CriterioEstrutura("Patente", "Pa"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Desenho Técnico", "DeTe"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Marca", "Mac"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Topografia de circuito integrado", "ToCiIn"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Produto Tecnologico", "PrTe"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Processo ou técnica", "ProuTe"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Trabalho Técnico", "TrTe"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Apresentação de Trabalho", "ApTr"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Carta, mapa ou similar", "CaMaSi"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Curso ministrado de curta duração", "CuMiCuDu"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Produção de material didatico", "PrMaDi"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Editoração", "Edi"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Manutenção de obra artistica", "MaObAr"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Maquete", "Maq"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Organização de evento", "OrEv"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Comentario em programa de Radio ou TV", "CPRTV"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Relatorio de pesquisa", "RePe"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Texto em midia Social", "TeMiSo"), listCritFormacao);
		areaEstruturaFormacao = new AreaEstrutura("Produção Técnica", "PrTe");
		areaEstruturaFormacao.setListCrit(listCritFormacao);
		listArea.add(areaEstruturaFormacao);
		// Producao Artistica
		listCritFormacao = new ArrayList<CriterioEstrutura>();
		PreencherIndCol(new CriterioEstrutura("Criação de Partitura", "CrPa"), listCritFormacao);
		PreencherIndCol(new CriterioEstrutura("Apresentação de Obra Artistica", "ApObAr"), listCritFormacao);
		PreencherIndCol(new CriterioEstrutura("Apresentação de programa em Radio ou TV", "ApPrRTV"), listCritFormacao);
		PreencherIndCol(new CriterioEstrutura("Arranjo musical", "ArMu"), listCritFormacao);
		PreencherIndCol(new CriterioEstrutura("Composição musical", "CoMu"), listCritFormacao);
		PreencherIndCol(new CriterioEstrutura("Obra de Artes vizuais", "ObArVi"), listCritFormacao);
		PreencherIndCol(new CriterioEstrutura("Sonoplastia", "So"), listCritFormacao);
		PreencherIndCol(new CriterioEstrutura("Trabalho em Arte Cenicas", "TrArCe"), listCritFormacao);
		PreencherIndCol(new CriterioEstrutura("Trabalho em Artes Vizuais", "TrArVi"), listCritFormacao);
		PreencherIndCol(new CriterioEstrutura("Musica", "Mu"), listCritFormacao);
		areaEstruturaFormacao = new AreaEstrutura("Produção Artística", "PrArt");
		areaEstruturaFormacao.setListCrit(listCritFormacao);
		listArea.add(areaEstruturaFormacao);
		// Producao Bibliografica
		listCritFormacao = new ArrayList<CriterioEstrutura>();
		PreencherNacInter(new CriterioEstrutura("Trabalho em eventos", "TrEv"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Artigos publicados", "ArPu"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Artigos aceitos para publicação", "ArAcPu"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Textos em jornais ou revista", "TeJoRe"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Capítulo de livro", "CaLi"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Organização de livro", "OrLi"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Publicação de livro", "PuLi"), listCritFormacao);
		PreencherConcluido(new CriterioEstrutura("Prefácio ou posfácio de livro", "PrPoLi"), listCritFormacao);
		areaEstruturaFormacao = new AreaEstrutura("Produção Bibliográfica", "PrBli");
		areaEstruturaFormacao.setListCrit(listCritFormacao);
		listArea.add(areaEstruturaFormacao);
		// Banca e Orientacao
		listCritFormacao = new ArrayList<CriterioEstrutura>();
		PreencherAndCon(new CriterioEstrutura("Orientação Mestrado", "OrMe"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Orientação Doutorado", "OrDo"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Orientação Especialização ou Aperfeiçoamento", "OrEsAp"),
				listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Orientação de Graduação", "OrGr"), listCritFormacao);
		PreencherAndCon(new CriterioEstrutura("Orientação de Iniciação Cientifica", "OrInCi"), listCritFormacao);
		PreencherParticipou(new CriterioEstrutura("Banca de Mestrado", "BaMe"), listCritFormacao);
		PreencherParticipou(new CriterioEstrutura("Banca de Doutorado", "BaDo"), listCritFormacao);
		PreencherParticipou(new CriterioEstrutura("Banca de Qualificação", "BaQu"), listCritFormacao);
		PreencherParticipou(new CriterioEstrutura("Banca de Especialização ou Aperfeiçoamento", "BaEsAp"),
				listCritFormacao);
		PreencherParticipou(new CriterioEstrutura("Banca de Graduação", "BaGr"), listCritFormacao);
		PreencherParticipou(new CriterioEstrutura("Banca de Professor Titular", "BaPrTi"), listCritFormacao);
		PreencherParticipou(new CriterioEstrutura("Banca de Concurso Publico", "BaCoPu"), listCritFormacao);
		PreencherParticipou(new CriterioEstrutura("Banca de Livre-docencia", "BaLDo"), listCritFormacao);
		PreencherParticipou(new CriterioEstrutura("Banca de Avaliação de curso", "BaAvCu"), listCritFormacao);
		areaEstruturaFormacao = new AreaEstrutura("Orientações e Banca", "BaOr");
		areaEstruturaFormacao.setListCrit(listCritFormacao);
		listArea.add(areaEstruturaFormacao);
		// Dados Gerais
		listCritFormacao = new ArrayList<CriterioEstrutura>();
		PreencherGeral(new CriterioEstrutura("Dedicação Exclusiva", "DeEx"), "Possui dedicação exclusiva", "DeEx",
				listCritFormacao);
		areaEstruturaFormacao = new AreaEstrutura("Critérios Gerais", "CrGe");
		areaEstruturaFormacao.setListCrit(listCritFormacao);
		listArea.add(areaEstruturaFormacao);
		this.estr.setListEst(listArea);
	}

	public Estrutura InserirCriteriosCheckbox(ArrayList<List<String>> conteudo) {
		Estrutura copia = new Estrutura();
		ArrayList<AreaEstrutura> listArea = new ArrayList<AreaEstrutura>();
		AreaEstrutura areaEstruturaFormacao = null;
		ArrayList<CriterioEstrutura> listCritFormacao = null;

		for (int i = 0; i < conteudo.size(); i++) {
			List<String> list = conteudo.get(i);
			// System.out.println("@@ valor i " + i);
			if (list != null) {
				areaEstruturaFormacao = new AreaEstrutura(this.estr.getListEst().get(i).getNome(),
						this.estr.getListEst().get(i).getAbre());
				listCritFormacao = new ArrayList<CriterioEstrutura>();
				int aux = 0;
				for (int j = 0; j < list.size(); j++) {
					// System.out.println("## valor j " + j);
					for (int k = aux; k < this.estr.getListEst().get(i).getListCrit().size(); k++) {
						// System.out.println("valor k " + k);
						// System.out.println(
						// list.get(j) + " " +
						// this.estr.getListEst().get(i).getListCrit().get(k).getAbre());

						if (this.estr.getListEst().get(i).getListCrit().get(k).getAbre().contentEquals(list.get(j))) {
							listCritFormacao.add(this.estr.getListEst().get(i).getListCrit().get(k));
							aux = k;
							break;
						}
					}
				}
				areaEstruturaFormacao.setListCrit(listCritFormacao);
				listArea.add(areaEstruturaFormacao);
			}
		}
		copia.setListEst(listArea);
		return copia;
	}

	public void PreencherAndCon(CriterioEstrutura crit, ArrayList<CriterioEstrutura> listCritFormacao) {
		ArrayList<TipoEstrutura> list = new ArrayList<TipoEstrutura>();
		TipoEstrutura tipo = new TipoEstrutura("Andamento ou Concluido", "AnCos");
		list.add(tipo);
		crit.addListTipo(list);
		list = new ArrayList<TipoEstrutura>();
		tipo = new TipoEstrutura("Andamento", "And");
		list.add(tipo);
		tipo = new TipoEstrutura("Concluido", "Con");
		list.add(tipo);
		crit.addListTipo(list);
		listCritFormacao.add(crit);
	}

	public void PreencherGeral(CriterioEstrutura crit, String nome, String abre,
			ArrayList<CriterioEstrutura> listCritFormacao) {
		ArrayList<TipoEstrutura> list = new ArrayList<TipoEstrutura>();
		TipoEstrutura tipo = new TipoEstrutura(nome, abre);
		list.add(tipo);
		crit.addListTipo(list);
		listCritFormacao.add(crit);
	}

	public void PreencherConcluido(CriterioEstrutura crit, ArrayList<CriterioEstrutura> listCritFormacao) {
		ArrayList<TipoEstrutura> list = new ArrayList<TipoEstrutura>();
		TipoEstrutura tipo = new TipoEstrutura("Concluido", "Con");
		list.add(tipo);
		crit.addListTipo(list);
		listCritFormacao.add(crit);
	}

	public void PreencherParticipou(CriterioEstrutura crit, ArrayList<CriterioEstrutura> listCritFormacao) {
		ArrayList<TipoEstrutura> list = new ArrayList<TipoEstrutura>();
		TipoEstrutura tipo = new TipoEstrutura("Participou", "Par");
		list.add(tipo);
		crit.addListTipo(list);
		listCritFormacao.add(crit);
	}

	public void PreencherNacInter(CriterioEstrutura crit, ArrayList<CriterioEstrutura> listCritFormacao) {
		ArrayList<TipoEstrutura> list = new ArrayList<TipoEstrutura>();
		TipoEstrutura tipo = new TipoEstrutura("Nacional ou Internacional", "NaIn");
		list.add(tipo);
		crit.addListTipo(list);
		list = new ArrayList<TipoEstrutura>();
		tipo = new TipoEstrutura("Nacional", "Nac");
		list.add(tipo);
		tipo = new TipoEstrutura("Internacional", "Int");
		list.add(tipo);
		crit.addListTipo(list);
		listCritFormacao.add(crit);
	}

	public void PreencherIndCol(CriterioEstrutura crit, ArrayList<CriterioEstrutura> listCritFormacao) {
		ArrayList<TipoEstrutura> list = new ArrayList<TipoEstrutura>();
		TipoEstrutura tipo = new TipoEstrutura("Individual ou Coletiva", "InCo");
		list.add(tipo);
		crit.addListTipo(list);
		list = new ArrayList<TipoEstrutura>();
		tipo = new TipoEstrutura("Individual", "Ind");
		list.add(tipo);
		tipo = new TipoEstrutura("Coletiva", "Col");
		list.add(tipo);
		crit.addListTipo(list);
		listCritFormacao.add(crit);
	}

	public Estrutura getEstr() {
		return this.estr;
	}

	public void setEstr(Estrutura estr) {
		this.estr = estr;
	}
}
