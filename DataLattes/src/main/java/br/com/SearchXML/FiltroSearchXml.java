package br.com.SearchXML;

import java.util.ArrayList;

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

	public ArrayList<ItemAnalisado> PreencherItemBolean(boolean flag, 
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

	public ArrayList<ItemAnalisado> PreencherItemProducao(ArrayList<Producao> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemOrientacao(ArrayList<Orientacao> listArray, 
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoOri(ArrayList<Orientacao> listArray,
			 Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if ((limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
					&& (((Orientacao) tipo).getCampAux().contentEquals("ORIENTADOR_PRINCIPAL")))
				item = new ItemAnalisado(valorContabilizado, false, tipo);
			else {
				item = new ItemAnalisado(valorContabilizado, true, tipo);
				limite--;
			}
			listItem.add(item);
		}
		return listItem;
	}

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoCoo(ArrayList<Orientacao> listArray,
			 Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if ((limite == 0 || (this.anofim < tipo.getAno() || this.anoinicio > tipo.getAno()))
					&& (((Orientacao) tipo).getCampAux().contentEquals("CO_ORIENTADOR")))
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
			 Document xmlfile, TipoEstrutura ObjecttipoEstrutura,
			String tipoString) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if (((Orientacao) tipo).getCampAux2().contentEquals(tipoString)) {
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

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoOriTipo(ArrayList<Orientacao> listArray,
			 Document xmlfile, TipoEstrutura ObjecttipoEstrutura,
			String tipoString) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if ((((Orientacao) tipo).getCampAux2().contentEquals(tipoString))
					&& (((Orientacao) tipo).getCampAux().contentEquals("ORIENTADOR_PRINCIPAL"))) {
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

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoOriAndSubTipo(ArrayList<Orientacao> listArray,
			 Document xmlfile, TipoEstrutura ObjecttipoEstrutura,
			String tipoString) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if ((((Orientacao) tipo).getCampAux2().contentEquals(tipoString))
					&& (((Orientacao) tipo).getCampAux().contentEquals("ORIENTADOR_PRINCIPAL"))) {
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

	public ArrayList<ItemAnalisado> PreencherItemOrientacaoCooTipo(ArrayList<Orientacao> listArray,
			 Document xmlfile, TipoEstrutura ObjecttipoEstrutura,
			String tipoString) {
		ArrayList<ItemAnalisado> listItem = new ArrayList<ItemAnalisado>();
		int limite = ObjecttipoEstrutura.getLimite();
		int valorContabilizado = ObjecttipoEstrutura.getValor();
		for (ObjetoCriterio tipo : listArray) {
			ItemAnalisado item;
			if ((((Orientacao) tipo).getCampAux2().contentEquals(tipoString))
					&& (((Orientacao) tipo).getCampAux().contentEquals("CO_ORIENTADOR"))) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo5(ArrayList<Tipo5> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo4(ArrayList<Tipo4> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemFormacaoAnd(ArrayList<Formacao> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemFormacaoCon(ArrayList<Formacao> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemFormacaoAndCon(ArrayList<Formacao> listArray,
			 Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemFormacao(ArrayList<Formacao> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo6Cole(ArrayList<Tipo6> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo0Nac(ArrayList<Tipo0> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo0(ArrayList<Tipo0> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo1(ArrayList<Tipo1> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo0Int(ArrayList<Tipo0> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo2Or(ArrayList<Tipo2> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo2Pu(ArrayList<Tipo2> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo2(ArrayList<Tipo2> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo6Ind(ArrayList<Tipo6> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo6(ArrayList<Tipo6> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo8(ArrayList<Tipo8> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo3(ArrayList<Tipo3> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo3Nac(ArrayList<Tipo3> listArray,
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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

	public ArrayList<ItemAnalisado> PreencherItemTipo3Inte(ArrayList<Tipo3> listArray, 
			Document xmlfile, TipoEstrutura ObjecttipoEstrutura) {
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
