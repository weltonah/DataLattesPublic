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
import br.com.estrutura.DadosCurricular;
import br.com.estrutura.ItemAnalisado;
import br.com.estrutura.TipoEstrutura;

public class FiltroSearchXml {
	private int anofim;
	private int anoinicio;

	public FiltroSearchXml(int anofim, int anoinicio) {
		super();
		this.anofim = anofim;
		this.anoinicio = anoinicio;
	}

	public DadosCurricular PreencherDadosCurricular(Document xmlfile) {
		SearchXMLDadosGerais searchXMLDadosGerais = new SearchXMLDadosGerais(xmlfile);
		String nome;
		try {
			nome = searchXMLDadosGerais.NomeCompleto();
			String endereco = "";
			String resumo = searchXMLDadosGerais.ResumoCV();
			String idLattes = searchXMLDadosGerais.IDLattes();
			String ultAtualizacao = searchXMLDadosGerais.UltimaAtualizacao();
			DadosCurricular dadosCurricular = new DadosCurricular(nome, endereco, resumo, idLattes, ultAtualizacao);
			return dadosCurricular;
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public ArrayList<ItemAnalisado> PreencherItemBolean(boolean flag, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		ItemAnalisado item;
		if (flag)
			item = new ItemAnalisado("Producao", -1, new Producao("Possui Dedicação exclusiva", 2000));
		else {
			item = new ItemAnalisado("Producao", 0, new Producao("Não possui Dedicação exclusiva", 2000));
		}
		listItem.add(item);
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemProducao(ArrayList<Producao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Producao", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Producao", 2, tipo);
				else {
					item = new ItemAnalisado("Producao", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacao(ArrayList<Orientacao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Orientacao", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Orientacao", 2, tipo);
				else {
					item = new ItemAnalisado("Orientacao", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoOri(ArrayList<Orientacao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if ((((Orientacao) tipo).getCampAux().contentEquals("ORIENTADOR_PRINCIPAL"))) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Orientacao", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Orientacao", 2, tipo);
					else {
						item = new ItemAnalisado("Orientacao", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoCoo(ArrayList<Orientacao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if ((((Orientacao) tipo).getCampAux().contentEquals("CO_ORIENTADOR"))) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Orientacao", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Orientacao", 2, tipo);
					else {
						item = new ItemAnalisado("Orientacao", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoTipo(ArrayList<Orientacao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura, String tipoString) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Orientacao) tipo).getCampAux2().contentEquals(tipoString)) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Orientacao", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Orientacao", 2, tipo);
					else {
						item = new ItemAnalisado("Orientacao", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoOriTipo(ArrayList<Orientacao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura, String tipoString) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Orientacao) tipo).getCampAux2().contentEquals(tipoString)
					&& (((Orientacao) tipo).getCampAux().contentEquals("ORIENTADOR_PRINCIPAL"))) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Orientacao", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Orientacao", 2, tipo);
					else {
						item = new ItemAnalisado("Orientacao", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}



	public ArrayList<ItemAnalisado> PreencherItemOrientacaoCooTipo(ArrayList<Orientacao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura, String tipoString) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Orientacao) tipo).getCampAux2().contentEquals(tipoString)
					&& (((Orientacao) tipo).getCampAux().contentEquals("CO_ORIENTADOR"))) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Orientacao", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Orientacao", 2, tipo);
					else {
						item = new ItemAnalisado("Orientacao", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo5(ArrayList<Tipo5> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Tipo5", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Tipo5", 2, tipo);
				else {
					item = new ItemAnalisado("Tipo5", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo4(ArrayList<Tipo4> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Tipo4", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Tipo4", 2, tipo);
				else {
					item = new ItemAnalisado("Tipo4", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemFormacaoAnd(ArrayList<Formacao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Formacao) tipo).getStatus().contentEquals("EM_ANDAMENTO")) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Formacao", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Formacao", 2, tipo);
					else {
						item = new ItemAnalisado("Formacao", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemFormacaoCon(ArrayList<Formacao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Formacao) tipo).getStatus().contentEquals("CONCLUIDO")) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Formacao", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Formacao", 2, tipo);
					else {
						item = new ItemAnalisado("Formacao", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
			
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemFormacaoAndCon(ArrayList<Formacao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Formacao) tipo).getStatus().contentEquals("CONCLUIDO")
					|| ((Formacao) tipo).getStatus().contentEquals("EM_ANDAMENTO")) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Formacao", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Formacao", 2, tipo);
					else {
						item = new ItemAnalisado("Formacao", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemFormacao(ArrayList<Formacao> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Formacao", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Formacao", 2, tipo);
				else {
					item = new ItemAnalisado("Formacao", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo6Cole(ArrayList<Tipo6> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Producao) tipo).getAutores().size() > 1) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Tipo6", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Tipo6", 2, tipo);
					else {
						item = new ItemAnalisado("Tipo6", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo0Nac(ArrayList<Tipo0> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Producao) tipo).getCampAux2().contentEquals("NACIONAL")) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Tipo0", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Tipo0", 2, tipo);
					else {
						item = new ItemAnalisado("Tipo0", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo0(ArrayList<Tipo0> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Tipo0", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Tipo0", 2, tipo);
				else {
					item = new ItemAnalisado("Tipo0", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo1(ArrayList<Tipo1> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Tipo1", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Tipo1", 2, tipo);
				else {
					item = new ItemAnalisado("Tipo1", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
			
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo0Int(ArrayList<Tipo0> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Producao) tipo).getCampAux2().contentEquals("INTERNACIONAL")) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Tipo0", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Tipo0", 2, tipo);
					else {
						item = new ItemAnalisado("Tipo0", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo2Or(ArrayList<Tipo2> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Tipo6) tipo).getNatureza().contentEquals("LIVRO_ORGANIZADO_OU_EDICAO")) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Tipo2", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Tipo2", 2, tipo);
					else {
						item = new ItemAnalisado("Tipo2", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo2Pu(ArrayList<Tipo2> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Tipo6) tipo).getNatureza().contentEquals("LIVRO_PUBLICADO")) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Tipo2", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Tipo2", 2, tipo);
					else {
						item = new ItemAnalisado("Tipo2", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo2(ArrayList<Tipo2> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Tipo2", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Tipo2", 2, tipo);
				else {
					item = new ItemAnalisado("Tipo2", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo6Ind(ArrayList<Tipo6> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Producao) tipo).getAutores().size() == 1) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Tipo6", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Tipo6", 2, tipo);
					else {
						item = new ItemAnalisado("Tipo6", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo6(ArrayList<Tipo6> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Tipo6", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Tipo6", 2, tipo);
				else {
					item = new ItemAnalisado("Tipo6", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo8(ArrayList<Tipo8> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Tipo8", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Tipo8", 2, tipo);
				else {
					item = new ItemAnalisado("Tipo8", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo3(ArrayList<Tipo3> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();

		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
				item = new ItemAnalisado("Tipo3", 1, tipo);
			} else {
				if (limite == 0)
					item = new ItemAnalisado("Tipo3", 2, tipo);
				else {
					item = new ItemAnalisado("Tipo3", 0, tipo);
					limite--;
				}
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo3Nac(ArrayList<Tipo3> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;

			if (((Tipo3) tipo).getCampAux().contentEquals("Brasil")) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Tipo3", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Tipo3", 2, tipo);
					else {
						item = new ItemAnalisado("Tipo3", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemTipo3Inte(ArrayList<Tipo3> listArray, Document xmlfile,
			TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (!((Tipo3) tipo).getCampAux().contentEquals("Brasil")) {
				if (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()) {
					item = new ItemAnalisado("Tipo3", 1, tipo);
				} else {
					if (limite == 0)
						item = new ItemAnalisado("Tipo3", 2, tipo);
					else {
						item = new ItemAnalisado("Tipo3", 0, tipo);
						limite--;
					}
				}
				listItem.add(item);
			}
		}
		return listItem;
	}
}
