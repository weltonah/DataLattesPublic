package br.com.estrutura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class PreencherEstrutura {

	private Estrutura estr;

	private HashMap<String, String> abreNome;

	public PreencherEstrutura() {
		this.abreNome = new HashMap<String, String>();
		this.abreNome.put("AnCos", "Andamento ou Concluido");
		this.abreNome.put("AnCosOri", "Orientação");
		this.abreNome.put("And", "Andamento");
		this.abreNome.put("Ape", "Aperfeiçoamento");
		this.abreNome.put("ApObAr", "Apresentação de Obra Artistica");
		this.abreNome.put("ApPrRTV", "Apresentação de programa em Radio ou TV");
		this.abreNome.put("ApTr", "Apresentação de Trabalho");
		this.abreNome.put("ArAcPu", "Artigos aceitos para publicação");
		this.abreNome.put("ArMu", "Arranjo musical");
		this.abreNome.put("ArPu", "Artigos publicados");
		this.abreNome.put("BaAvCu", "Banca de Avaliação de curso");
		this.abreNome.put("BaCoPu", "Banca de Concurso Publico");
		this.abreNome.put("BaDo", "Banca de Doutorado");
		this.abreNome.put("BaEsAp", "Banca de Especialização ou Aperfeiçoamento");
		this.abreNome.put("BaGr", "Banca de Graduação");
		this.abreNome.put("BaLDo", "Banca de Livre-docencia");
		this.abreNome.put("BaMe", "Banca de Mestrado");
		this.abreNome.put("Banc", "Participaçao de Banca");
		this.abreNome.put("BaOr", "Orientações e Banca");
		this.abreNome.put("BaPrTi", "Banca de Professor Titular");
		this.abreNome.put("BaQu", "Banca de Qualificação");
		this.abreNome.put("CaLi", "Capítulo de livro");
		this.abreNome.put("CaMaSi", "Carta, mapa ou similar");
		this.abreNome.put("Col", "Coletiva");
		this.abreNome.put("CoMu", "Composição musical");
		this.abreNome.put("Con", "Concluido");
		this.abreNome.put("Coo", "Coorientação");
		this.abreNome.put("CooAnd", "Coorientação Andamento");
		this.abreNome.put("CooCon", "Coorientação Concluida");
		this.abreNome.put("CPRTV", "Comentario em programa de Radio ou TV");
		this.abreNome.put("CrGe", "Critérios Gerais");
		this.abreNome.put("CrPa", "Criação de Partitura");
		this.abreNome.put("CuMiCuDu", "Curso ministrado de curta duração");
		this.abreNome.put("CuPr", "Cultivação Protegida");
		this.abreNome.put("CuRe", "Cultivação Registrada");
		this.abreNome.put("CuTePr", "Curso Técnico ou Profissionalizante");
		this.abreNome.put("DeEx", "Dedicação Exclusiva");
		this.abreNome.put("DeTe", "Desenho Técnico");
		this.abreNome.put("Do", "Doutorado");
		this.abreNome.put("Edi", "Editoração");
		this.abreNome.put("Es", "Especialização");
		this.abreNome.put("For", "Formação");
		this.abreNome.put("Gr", "Graduação");
		this.abreNome.put("InCo", "Individual ou Coletiva");
		this.abreNome.put("Ind", "Individual");
		this.abreNome.put("Int", "Internacional");
		this.abreNome.put("LDo", "Livre-docência");
		this.abreNome.put("Mac", "Marca");
		this.abreNome.put("MaObAr", "Manutenção de obra artistica");
		this.abreNome.put("Maq", "Maquete");
		this.abreNome.put("MBA", "MBA");
		this.abreNome.put("Me", "Mestrado");
		this.abreNome.put("MePr", "Mestrado Profissionalizante");
		this.abreNome.put("Mu", "Musica");
		this.abreNome.put("Nac", "Nacional");
		this.abreNome.put("NaIn", "Nacional ou Internacional");
		this.abreNome.put("ObArVi", "Obra de Artes vizuais");
		this.abreNome.put("OrDo", "Orientação Doutorado");
		this.abreNome.put("OrEsAp", "Orientação Especialização ou Aperfeiçoamento");
		this.abreNome.put("OrEv", "Organização de evento");
		this.abreNome.put("OrGr", "Orientação de Graduação");
		this.abreNome.put("Ori", "Orientação");
		this.abreNome.put("OriAnd", "Orientação Andamento");
		this.abreNome.put("Orien", "Orientações");
		this.abreNome.put("OriCon", "Orientação Concluida");
		this.abreNome.put("OrInCi", "Orientação de Iniciação Cientifica");
		this.abreNome.put("OrLi", "Organização de livro");
		this.abreNome.put("OrMe", "Orientação Mestrado");
		this.abreNome.put("OrPoDo", "Orientação Pós-Doutorado");
		this.abreNome.put("Pa", "Patente");
		this.abreNome.put("Par", "Participou");
		this.abreNome.put("PDo", "Pós-Doutorado");
		this.abreNome.put("PoDeEx", "Possui dedicação exclusiva");
		this.abreNome.put("PrArt", "Produção Artística");
		this.abreNome.put("PrBli", "Produção Bibliográfica");
		this.abreNome.put("PrMaDi", "Produção de material didatico");
		this.abreNome.put("ProuTe", "Processo ou técnica");
		this.abreNome.put("PrPoLi", "Prefácio ou posfácio de livro");
		this.abreNome.put("PrTe", "Produto Tecnologico");
		this.abreNome.put("PrTec", "Produção Técnica");
		this.abreNome.put("PuLi", "Publicação de livro");
		this.abreNome.put("ReMe", "Residência médica");
		this.abreNome.put("RePe", "Relatorio de pesquisa");
		this.abreNome.put("So", "Sonoplastia");
		this.abreNome.put("Sof", "Software");
		this.abreNome.put("TeJoRe", "Textos em jornais ou revista");
		this.abreNome.put("TeMiSo", "Texto em midia Social");
		this.abreNome.put("ToCiIn", "Topografia de circuito integrado");
		this.abreNome.put("Tr", "Tradução");
		this.abreNome.put("TrArCe", "Trabalho em Arte Cenicas");
		this.abreNome.put("TrArVi", "Trabalho em Artes Vizuais");
		this.abreNome.put("TrEv", "Trabalho em eventos");
		this.abreNome.put("TrTe", "Trabalho Técnico");
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
		PreencherConcluido(new CriterioEstrutura("Livre-docência", "LDo"), listCritFormacao);
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
		PreencherConcluido(new CriterioEstrutura("Software", "Sof"), listCritFormacao);
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
		areaEstruturaFormacao = new AreaEstrutura("Produção Técnica", "PrTec");
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
		PreencherAndConOriCo(new CriterioEstrutura("Orientação Mestrado", "OrMe"), listCritFormacao);
		PreencherAndConOriCo(new CriterioEstrutura("Orientação Doutorado", "OrDo"), listCritFormacao);
		PreencherAndConOriCo(new CriterioEstrutura("Orientação Pós-Doutorado", "OrPoDo"), listCritFormacao);
		PreencherAndConOriSub(new CriterioEstrutura("Orientação Especialização ou Aperfeiçoamento", "OrEsAp"),
				listCritFormacao);
		PreencherAndConOriSub(new CriterioEstrutura("Orientação de Graduação", "OrGr"), listCritFormacao);
		PreencherAndConOriSub(new CriterioEstrutura("Orientação de Iniciação Cientifica", "OrInCi"), listCritFormacao);
		areaEstruturaFormacao = new AreaEstrutura("Orientações", "Orien");
		areaEstruturaFormacao.setListCrit(listCritFormacao);
		listArea.add(areaEstruturaFormacao);
		// Banca
		listCritFormacao = new ArrayList<CriterioEstrutura>();
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
		areaEstruturaFormacao = new AreaEstrutura("Participaçao de Banca", "Banc");
		areaEstruturaFormacao.setListCrit(listCritFormacao);
		listArea.add(areaEstruturaFormacao);
		// Dados Gerais
		listCritFormacao = new ArrayList<CriterioEstrutura>();
		PreencherGeral(new CriterioEstrutura("Dedicação Exclusiva", "DeEx"), "Possui dedicação exclusiva", "PoDeEx",
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

	public ArrayList<List<String[]>> decifrarChave(String key) {
		System.out.println("ees");
		ArrayList<List<String[]>> conteudo = new ArrayList<List<String[]>>();
		String[] t = key.split("%");
		String[] aux = t[0].split(">");
		int anoInicio = !(aux[1].contentEquals("")) ? Integer.parseInt(aux[1]) : 1950;
		int anofim = Integer.parseInt(aux[2]);
		int cont = 0;
		for (int i = 1; i < t.length; i++) {
			ArrayList<String[]> listString = new ArrayList<String[]>();
			String[] ta = t[i].split("!");
			while (cont < this.estr.getListEst().size()) {
				// System.out.println(this.estr.getListEst().get(cont).getAbre());
				// System.out.println(ta[0]);
				if (!(this.estr.getListEst().get(cont).getAbre().contentEquals(ta[0]))) {
					// System.out.println("cria null");
					conteudo.add(null);
					cont++;
				} else {
					// System.out.println("sai for");
					cont++;
					break;
				}
			}
			String[] tipo = ta[1].split("#");
			for (int j = 1; j < tipo.length; j++) {
				String[] dif = tipo[j].split("@");
				if (dif.length > 1) {
					for (int k = 1; k < dif.length; k++) {
						String[] crit = new String[4];
						crit[0] = dif[0];
						String[] criterio = dif[k].split("=");
						crit[1] = criterio[0];
						crit[2] = criterio[1];
						if (criterio.length == 3) {
							String[] limite = criterio[2].split("&");
							crit[3] = limite[1];
						}
						listString.add(crit);
					}
				}
			}
			conteudo.add(listString);
		}

		return conteudo;
	}

	public Estrutura InserirCriteriosKey(ArrayList<List<String[]>> conteudo) {
		Estrutura copia = new Estrutura();
		ArrayList<AreaEstrutura> listArea = new ArrayList<AreaEstrutura>();
		AreaEstrutura areaEstruturaFormacao = null;
		ArrayList<CriterioEstrutura> listCritFormacao = null;
		// System.out.println(conteudo.size());
		for (int i = 0; i < conteudo.size(); i++) {
			List<String[]> list = conteudo.get(i);
			if (list != null) {
				areaEstruturaFormacao = new AreaEstrutura(this.estr.getListEst().get(i).getNome(),
						this.estr.getListEst().get(i).getAbre());
				listCritFormacao = new ArrayList<CriterioEstrutura>();
				int aux = 0;
				// System.out.println(list.size());
				for (int j = 0; j < list.size(); j++) {
					// System.out.println("## valor j " + j);
					// System.out.println("%%%%" + list.get(j)[0]);
					// System.out.println("%%%%" + aux);
					// System.out.println("%%%%" +
					// this.estr.getListEst().get(i).getListCrit().size());
					for (int k = aux; k < this.estr.getListEst().get(i).getListCrit().size(); k++) {
						// System.out.println(
						// list.get(j)[0] + " " +
						// this.estr.getListEst().get(i).getListCrit().get(k).getAbre());

						if (this.estr.getListEst().get(i).getListCrit().get(k).getAbre()
								.contentEquals(list.get(j)[0])) {
							ArrayList<TipoEstrutura> listTipoEstru = new ArrayList<TipoEstrutura>();
							CriterioEstrutura criterioEstrutura = new CriterioEstrutura(
									this.abreNome.get(list.get(j)[0]), list.get(j)[0]);
							int limitevalor = list.get(j)[3] == null ? -1 : Integer.parseInt(list.get(j)[3]);
							TipoEstrutura tipoEstrutura = new TipoEstrutura(this.abreNome.get(list.get(j)[1]),
									Integer.parseInt(list.get(j)[2]), list.get(j)[1], limitevalor);
							listTipoEstru.add(tipoEstrutura);
							if (j + 1 < list.size()) {
								// System.out.println("&&&&&");
								if (list.get(j + 1)[0].contentEquals(list.get(j)[0])) {
									for (int p = j + 1; (list.get(p)[0].contentEquals(list.get(j)[0])); p++) {
										// System.out.println(list.get(p)[0] + " ***** " + list.get(j)[0]);
										criterioEstrutura = new CriterioEstrutura(this.abreNome.get(list.get(p)[0]),
												list.get(j)[0]);
										limitevalor = list.get(p)[3] == null ? -1 : Integer.parseInt(list.get(p)[3]);
										tipoEstrutura = new TipoEstrutura(this.abreNome.get(list.get(p)[1]),
												Integer.parseInt(list.get(p)[2]), list.get(p)[1], limitevalor);
										listTipoEstru.add(tipoEstrutura);

										if (!(p + 1 < list.size()))
											break;
									}
									k++;
								}

								// if (list.get(j + 1)[0].contentEquals(list.get(j)[0])) {
								// criterioEstrutura = new CriterioEstrutura(this.abreNome.get(list.get(j +
								// 1)[0]),
								// list.get(j)[0]);
								// limitevalor = list.get(j + 1)[3] == null ? -1
								// : Integer.parseInt(list.get(j + 1)[3]);
								// tipoEstrutura = new TipoEstrutura(this.abreNome.get(list.get(j + 1)[1]),
								// Integer.parseInt(list.get(j + 1)[2]), list.get(j + 1)[1], limitevalor);
								// listTipoEstru.add(tipoEstrutura);
								// k++;
								// }
							}
							criterioEstrutura.addListTipo(listTipoEstru);
							listCritFormacao.add(criterioEstrutura);
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

	public void PreencherAndConOriCo(CriterioEstrutura crit, ArrayList<CriterioEstrutura> listCritFormacao) {
		ArrayList<TipoEstrutura> list = new ArrayList<TipoEstrutura>();
		TipoEstrutura tipo = new TipoEstrutura("Orientação", "AnCosOri");
		list.add(tipo);
		crit.addListTipo(list);
		list = new ArrayList<TipoEstrutura>();
		tipo = new TipoEstrutura("Andamento", "And");
		list.add(tipo);
		tipo = new TipoEstrutura("Concluido", "Con");
		list.add(tipo);
		crit.addListTipo(list);
		list = new ArrayList<TipoEstrutura>();
		tipo = new TipoEstrutura("Orientação", "Ori");
		list.add(tipo);
		tipo = new TipoEstrutura("Coorientação", "Coo");
		list.add(tipo);
		crit.addListTipo(list);
		list = new ArrayList<TipoEstrutura>();
		tipo = new TipoEstrutura("Orientação Andamento", "OriAnd");
		list.add(tipo);
		tipo = new TipoEstrutura("Coorientação Andamento", "CooAnd");
		list.add(tipo);
		tipo = new TipoEstrutura("Orientação Concluida", "OriCon");
		list.add(tipo);
		tipo = new TipoEstrutura("Coorientação Concluida", "CooCon");
		list.add(tipo);
		crit.addListTipo(list);
		listCritFormacao.add(crit);
	}

	public void PreencherAndConOriSub(CriterioEstrutura crit, ArrayList<CriterioEstrutura> listCritFormacao) {
		ArrayList<TipoEstrutura> list = new ArrayList<TipoEstrutura>();
		TipoEstrutura tipo = new TipoEstrutura("Orientação", "AnCosOri");
		list.add(tipo);
		crit.addListTipo(list);
		list = new ArrayList<TipoEstrutura>();
		tipo = new TipoEstrutura("Andamento", "And");
		list.add(tipo);
		tipo = new TipoEstrutura("Concluido", "Con");
		list.add(tipo);
		crit.addListTipo(list);
		list = new ArrayList<TipoEstrutura>();
		tipo = new TipoEstrutura("Orientação", "Ori");
		list.add(tipo);
		tipo = new TipoEstrutura("Coorientação", "Coo");
		list.add(tipo);
		crit.addListTipo(list);
		list = new ArrayList<TipoEstrutura>();
		tipo = new TipoEstrutura("Orientação Andamento", "OriAnd");
		list.add(tipo);
		tipo = new TipoEstrutura("Orientação Concluida", "OriCon");
		list.add(tipo);
		tipo = new TipoEstrutura("Coorientação Concluida", "CooCon");
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
