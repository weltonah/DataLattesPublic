package br.com.estrutura.PreencherEstruturaTeste;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.estrutura.AreaEstrutura;
import br.com.estrutura.CriterioEstrutura;
import br.com.estrutura.Estrutura;
import br.com.estrutura.PreencherEstrutura;
import br.com.estrutura.TipoEstrutura;

public class InserirCriteriosKeyTeste {

	@Test
	public void TesteBasicoFormacao() {
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "Gr", "AnCos", "10", null };
		list.add(aux);
		aux = new String[4];
		aux[0] = "Es";aux[1] = "And";aux[2] = "55";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "Es";aux[1] = "Con";aux[2] = "32";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "Me";aux[1] = "AnCos";aux[2] = "3";aux[3] = "4";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Do";aux[1] = "And";aux[2] = "1";aux[3] = "2";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Do";aux[1] = "Con";aux[2] = "3";aux[3] = "4";
		list.add(aux);
		aux = new String[4];
		aux[0] = "PDo";aux[1] = "AnCos";aux[2] = "5";aux[3] = "6";
		list.add(aux);
		aux = new String[4];
		aux[0] = "LDo";aux[1] = "Con";aux[2] = "5";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "CuTePr";aux[1] = "And";aux[2] = "7";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "CuTePr";aux[1] = "Con";aux[2] = "8";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "MePr";aux[1] = "AnCos";aux[2] = "89";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "ReMe";aux[1] = "AnCos";aux[2] = "4";aux[3] = "6";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Ape";aux[1] = "AnCos";aux[2] = "36";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "MBA";aux[1] = "And";aux[2] = "3";aux[3] = "4";
		list.add(aux);
		aux = new String[4];
		aux[0] = "MBA";aux[1] = "Con";aux[2] = "6";aux[3] = "9";
		list.add(aux);
		ArrayList<List<String[]>> arrayString = new ArrayList<List<String[]>>();
		arrayString.add(list);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		int i = 0;
		Estrutura estrutura = preencherEstrutura.InserirCriteriosKey(arrayString);
		AreaEstrutura arealist = estrutura.getListEst().get(0);
		assertEquals("For", arealist.getAbre());
		for (CriterioEstrutura criterioEstrutura : arealist.getListCrit()) {
			assertEquals(list.get(i)[0], criterioEstrutura.getAbre());
			// System.out.println(list.get(i)[0] + " " + criterioEstrutura.getAbre());
			for (ArrayList<TipoEstrutura> list2 : criterioEstrutura.getListTipo()) {
				for (TipoEstrutura tipoEstrutura : list2) {
					// System.out.println(list.get(i)[1] + " " + tipoEstrutura.getAbre());
					assertEquals(list.get(i)[1], tipoEstrutura.getAbre());
					i++;
				}
			}
		}
	}
	@Test
	public void TesteBasicoProdTec() {
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "Tr", "Con", "1", null };
		list.add(aux);
		aux = new String[4];
		aux[0] = "CuRe";aux[1] = "Con";aux[2] = "2";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "CuPr";aux[1] = "Con";aux[2] = "3";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "Sof";aux[1] = "Con";aux[2] = "4";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "Pa";aux[1] = "Nac";aux[2] = "5";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "Pa";aux[1] = "Int";aux[2] = "6";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "DeTe";aux[1] = "Con";aux[2] = "1";aux[3] = "1";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Mac";aux[1] = "Con";aux[2] = "2";aux[3] = "2";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ToCiIn";aux[1] = "Con";aux[2] = "3";aux[3] = "3";
		list.add(aux);
		aux = new String[4];
		aux[0] = "PrTe";aux[1] = "Con";aux[2] = "4";aux[3] = "4";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ProuTe";aux[1] = "Con";aux[2] = "5";aux[3] = "5";
		list.add(aux);
		aux = new String[4];
		aux[0] = "TrTe";aux[1] = "Con";aux[2] = "6";aux[3] = "6";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ApTr";aux[1] = "Con";aux[2] = "1";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "CaMaSi";aux[1] = "Con";aux[2] = "2";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "CuMiCuDu";aux[1] = "Con";aux[2] = "3";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "PrMaDi";aux[1] = "Con";aux[2] = "4";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "Edi";aux[1] = "Con";aux[2] = "5";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "MaObAr";aux[1] = "Con";aux[2] = "6";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "Maq";aux[1] = "Con";aux[2] = "1";aux[3] = "1";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrEv";aux[1] = "Con";aux[2] = "2";aux[3] = "2";
		list.add(aux);
		aux = new String[4];
		aux[0] = "CPRTV";aux[1] = "Con";aux[2] = "3";aux[3] = "3";
		list.add(aux);
		aux = new String[4];
		aux[0] = "RePe";aux[1] = "Con";aux[2] = "4";aux[3] = "4";
		list.add(aux);
		aux = new String[4];
		aux[0] = "TeMiSo";aux[1] = "Con";aux[2] = "5";aux[3] = "5";
		list.add(aux);
		ArrayList<List<String[]>> arrayString = new ArrayList<List<String[]>>();
		arrayString.add(null);
		arrayString.add(list);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		int i = 0;
		Estrutura estrutura = preencherEstrutura.InserirCriteriosKey(arrayString);
		AreaEstrutura arealist = estrutura.getListEst().get(0);
		assertEquals("PrTec", arealist.getAbre());
		for (CriterioEstrutura criterioEstrutura : arealist.getListCrit()) {
			assertEquals(list.get(i)[0], criterioEstrutura.getAbre());
			// System.out.println(list.get(i)[0] + " " + criterioEstrutura.getAbre());
			for (ArrayList<TipoEstrutura> list2 : criterioEstrutura.getListTipo()) {
				for (TipoEstrutura tipoEstrutura : list2) {
					// System.out.println(list.get(i)[1] + " " + tipoEstrutura.getAbre());
					assertEquals(list.get(i)[1], tipoEstrutura.getAbre());
					i++;
				}
			}
		}
	}
	
	@Test
	public void TesteBasicoProdArt() {
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "CrPa", "InCo", "12", null };
		list.add(aux);
		aux = new String[4];
		aux[0] = "ApObAr";aux[1] = "Ind";aux[2] = "44";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "ApObAr";aux[1] = "Col";aux[2] = "55";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "ApPrRTV";aux[1] = "InCo";aux[2] = "1";aux[3] = "2";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ArMu";aux[1] = "Ind";aux[2] = "4";aux[3] = "5";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ArMu";aux[1] = "Col";aux[2] = "6";aux[3] = "7";
		list.add(aux);
		aux = new String[4];
		aux[0] = "CoMu";aux[1] = "InCo";aux[2] = "8";aux[3] = "9";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ObArVi";aux[1] = "Ind";aux[2] = "2";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "ObArVi";aux[1] = "Col";aux[2] = "1";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "So";aux[1] = "InCo";aux[2] = "1";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "TrArCe";aux[1] = "InCo";aux[2] = "2";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "TrArVi";aux[1] = "Ind";aux[2] = "7";aux[3] = "5";
		list.add(aux);
		aux = new String[4];
		aux[0] = "TrArVi";aux[1] = "Col";aux[2] = "7";aux[3] = "4";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Mu";aux[1] = "InCo";aux[2] = "10";aux[3] = null;
		list.add(aux);
		ArrayList<List<String[]>> arrayString = new ArrayList<List<String[]>>();
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(list);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		int i = 0;
		Estrutura estrutura = preencherEstrutura.InserirCriteriosKey(arrayString);
		AreaEstrutura arealist = estrutura.getListEst().get(0);
		assertEquals("PrArt", arealist.getAbre());
		for (CriterioEstrutura criterioEstrutura : arealist.getListCrit()) {
			assertEquals(list.get(i)[0], criterioEstrutura.getAbre());
			// System.out.println(list.get(i)[0] + " " + criterioEstrutura.getAbre());
			for (ArrayList<TipoEstrutura> list2 : criterioEstrutura.getListTipo()) {
				for (TipoEstrutura tipoEstrutura : list2) {
					// System.out.println(list.get(i)[1] + " " + tipoEstrutura.getAbre());
					assertEquals(list.get(i)[1], tipoEstrutura.getAbre());
					i++;
				}
			}
		}
	}
	
	@Test
	public void TesteBasicoProdBibli() {
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "TrEv", "Nac", "1", null };
		list.add(aux);
		aux = new String[4];
		aux[0] = "TrEv";aux[1] = "Int";aux[2] = "2";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "ArPu";aux[1] = "Con";aux[2] = "3";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "ArAcPu";aux[1] = "Con";aux[2] = "4";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "TeJoRe";aux[1] = "Con";aux[2] = "1";aux[3] = "1";
		list.add(aux);
		aux = new String[4];
		aux[0] = "CaLi";aux[1] = "Con";aux[2] = "2";aux[3] = "2";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrLi";aux[1] = "Con";aux[2] = "3";aux[3] = "3";
		list.add(aux);
		aux = new String[4];
		aux[0] = "PuLi";aux[1] = "Con";aux[2] = "4";aux[3] = "4";
		list.add(aux);
		aux = new String[4];
		aux[0] = "PrPoLi";aux[1] = "Con";aux[2] = "5";aux[3] = "5";
		list.add(aux);
		ArrayList<List<String[]>> arrayString = new ArrayList<List<String[]>>();
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(list);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		int i = 0;
		Estrutura estrutura = preencherEstrutura.InserirCriteriosKey(arrayString);
		AreaEstrutura arealist = estrutura.getListEst().get(0);
		assertEquals("PrBli", arealist.getAbre());
		for (CriterioEstrutura criterioEstrutura : arealist.getListCrit()) {
			assertEquals(list.get(i)[0], criterioEstrutura.getAbre());
			// System.out.println(list.get(i)[0] + " " + criterioEstrutura.getAbre());
			for (ArrayList<TipoEstrutura> list2 : criterioEstrutura.getListTipo()) {
				for (TipoEstrutura tipoEstrutura : list2) {
					// System.out.println(list.get(i)[1] + " " + tipoEstrutura.getAbre());
					assertEquals(list.get(i)[1], tipoEstrutura.getAbre());
					i++;
				}
			}
		}
	}
	
	@Test
	public void TesteBasicoOrien() {
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "OrMe", "AnCosOri", "1", null };
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrDo";aux[1] = "And";aux[2] = "2";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrDo";aux[1] = "Con";aux[2] = "3";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrPoDo";aux[1] = "Ori";aux[2] = "4";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrPoDo";aux[1] = "Coo";aux[2] = "5";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrEsAp";aux[1] = "OriAnd";aux[2] = "6";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrEsAp";aux[1] = "OriCon";aux[2] = "7";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrEsAp";aux[1] = "CooCon";aux[2] = "8";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrGr";aux[1] = "Ori";aux[2] = "9";aux[3] = "7";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrGr";aux[1] = "Coo";aux[2] = "1";aux[3] = "6";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrInCi";aux[1] = "And";aux[2] = "2";aux[3] = "5";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrInCi";aux[1] = "Con";aux[2] = "3";aux[3] = "4";
		list.add(aux);
		ArrayList<List<String[]>> arrayString = new ArrayList<List<String[]>>();
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(list);
		arrayString.add(null);
		arrayString.add(null);
		int i = 0;
		Estrutura estrutura = preencherEstrutura.InserirCriteriosKey(arrayString);
		AreaEstrutura arealist = estrutura.getListEst().get(0);
		assertEquals("Orien", arealist.getAbre());
		for (CriterioEstrutura criterioEstrutura : arealist.getListCrit()) {
			assertEquals(list.get(i)[0], criterioEstrutura.getAbre());
			// System.out.println(list.get(i)[0] + " " + criterioEstrutura.getAbre());
			for (ArrayList<TipoEstrutura> list2 : criterioEstrutura.getListTipo()) {
				for (TipoEstrutura tipoEstrutura : list2) {
					// System.out.println(list.get(i)[1] + " " + tipoEstrutura.getAbre());
					assertEquals(list.get(i)[1], tipoEstrutura.getAbre());
					i++;
				}
			}
		}
	}
	
	@Test
	public void TesteBasicoBanc() {
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "BaMe", "Par", "1", null };
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaDo";aux[1] = "Par";aux[2] = "2";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaQu";aux[1] = "Par";aux[2] = "3";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaEsAp";aux[1] = "Par";aux[2] = "4";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaGr";aux[1] = "Par";aux[2] = "5";aux[3] = null;
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaPrTi";aux[1] = "Par";aux[2] = "1";aux[3] = "1";
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaCoPu";aux[1] = "Par";aux[2] = "2";aux[3] = "2";
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaLDo";aux[1] = "Par";aux[2] = "3";aux[3] = "3";
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaAvCu";aux[1] = "Par";aux[2] = "4";aux[3] = "4";
		list.add(aux);
		ArrayList<List<String[]>> arrayString = new ArrayList<List<String[]>>();
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(list);
		arrayString.add(null);
		int i = 0;
		Estrutura estrutura = preencherEstrutura.InserirCriteriosKey(arrayString);
		AreaEstrutura arealist = estrutura.getListEst().get(0);
		assertEquals("Banc", arealist.getAbre());
		for (CriterioEstrutura criterioEstrutura : arealist.getListCrit()) {
			assertEquals(list.get(i)[0], criterioEstrutura.getAbre());
			// System.out.println(list.get(i)[0] + " " + criterioEstrutura.getAbre());
			for (ArrayList<TipoEstrutura> list2 : criterioEstrutura.getListTipo()) {
				for (TipoEstrutura tipoEstrutura : list2) {
					// System.out.println(list.get(i)[1] + " " + tipoEstrutura.getAbre());
					assertEquals(list.get(i)[1], tipoEstrutura.getAbre());
					i++;
				}
			}
		}
	}
	
	@Test
	public void TesteBasicoDadosGerais() {
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "DeEx", "PoDeEx", "12", null };
		list.add(aux);
		ArrayList<List<String[]>> arrayString = new ArrayList<List<String[]>>();
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(null);
		arrayString.add(list);
		int i = 0;
		Estrutura estrutura = preencherEstrutura.InserirCriteriosKey(arrayString);
		AreaEstrutura arealist = estrutura.getListEst().get(0);
		assertEquals("CrGe", arealist.getAbre());
		for (CriterioEstrutura criterioEstrutura : arealist.getListCrit()) {
			assertEquals(list.get(i)[0], criterioEstrutura.getAbre());
			// System.out.println(list.get(i)[0] + " " + criterioEstrutura.getAbre());
			for (ArrayList<TipoEstrutura> list2 : criterioEstrutura.getListTipo()) {
				for (TipoEstrutura tipoEstrutura : list2) {
					// System.out.println(list.get(i)[1] + " " + tipoEstrutura.getAbre());
					assertEquals(list.get(i)[1], tipoEstrutura.getAbre());
					i++;
				}
			}
		}
	}
}
