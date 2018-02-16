package br.com.estrutura.PreencherEstruturaTeste;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.estrutura.PreencherEstrutura;

public class decifrarChaveTeste {

	@Test
	public void TesteBasicoFormacao() {
		String key = "Ano>>2018%For!#Gr@AnCos=10=#Es@And=55=@Con=32=#Me@AnCos=3=&4&#Do@And=1=&2&@Con=3=&4&#PDo@AnCos=5=&6&#LDo@Con=5=#CuTePr@And=7=@Con=8=#MePr@AnCos=89=#ReMe@AnCos=4=&6&#Ape@AnCos=36=#MBA@And=3=&4&@Con=6=&9&%";
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		ArrayList<List<String[]>> arrayResult = preencherEstrutura.decifrarChave(key);
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "Gr", "AnCos", "10", "null" };
		list.add(aux);
		aux = new String[4];
		aux[0] = "Es";aux[1] = "And";aux[2] = "55";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Es";aux[1] = "Con";aux[2] = "32";aux[3] = "null";
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
		aux[0] = "LDo";aux[1] = "Con";aux[2] = "5";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "CuTePr";aux[1] = "And";aux[2] = "7";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "CuTePr";aux[1] = "Con";aux[2] = "8";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "MePr";aux[1] = "AnCos";aux[2] = "89";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ReMe";aux[1] = "AnCos";aux[2] = "4";aux[3] = "6";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Ape";aux[1] = "AnCos";aux[2] = "36";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "MBA";aux[1] = "And";aux[2] = "3";aux[3] = "4";
		list.add(aux);
		aux = new String[4];
		aux[0] = "MBA";aux[1] = "Con";aux[2] = "6";aux[3] = "9";
		list.add(aux);
		int i = 0;
		for (String[] string : arrayResult.get(0)) {
			// System.out.println(Arrays.toString(list.get(i)) + " " +
			// Arrays.toString(string));
			assertEquals(Arrays.toString(list.get(i)), Arrays.toString(string));
			i++;
		}
	}
	
	@Test
	public void TesteBasicoProdTec() {
		String key = "Ano>>2018%PrTec!#Tr@Con=1=#CuRe@Con=2=#CuPr@Con=3=#Sof@Con=4=#Pa@Nac=5=@Int=6=#DeTe@Con=1=&1&#Mac@Con=2=&2&#ToCiIn@Con=3=&3&#PrTe@Con=4=&4&#ProuTe@Con=5=&5&#TrTe@Con=6=&6&#ApTr@Con=1=#CaMaSi@Con=2=#CuMiCuDu@Con=3=#PrMaDi@Con=4=#Edi@Con=5=#MaObAr@Con=6=#Maq@Con=1=&1&#OrEv@Con=2=&2&#CPRTV@Con=3=&3&#RePe@Con=4=&4&#TeMiSo@Con=5=&5&%";
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		ArrayList<List<String[]>> arrayResult = preencherEstrutura.decifrarChave(key);
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "Tr", "Con", "1", "null" };
		list.add(aux);
		aux = new String[4];
		aux[0] = "CuRe";aux[1] = "Con";aux[2] = "2";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "CuPr";aux[1] = "Con";aux[2] = "3";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Sof";aux[1] = "Con";aux[2] = "4";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Pa";aux[1] = "Nac";aux[2] = "5";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Pa";aux[1] = "Int";aux[2] = "6";aux[3] = "null";
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
		aux[0] = "ApTr";aux[1] = "Con";aux[2] = "1";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "CaMaSi";aux[1] = "Con";aux[2] = "2";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "CuMiCuDu";aux[1] = "Con";aux[2] = "3";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "PrMaDi";aux[1] = "Con";aux[2] = "4";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Edi";aux[1] = "Con";aux[2] = "5";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "MaObAr";aux[1] = "Con";aux[2] = "6";aux[3] = "null";
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
		int i = 0;
		for (String[] string : arrayResult.get(1)) {
			// System.out.println(Arrays.toString(list.get(i)) + " " +
			// Arrays.toString(string));
			assertEquals(Arrays.toString(list.get(i)), Arrays.toString(string));
			i++;
		}
	}
	
	@Test
	public void TesteBasicoProdArt() {
		String key = "Ano>>2018%PrArt!#CrPa@InCo=12=#ApObAr@Ind=44=@Col=55=#ApPrRTV@InCo=1=&2&#ArMu@Ind=4=&5&@Col=6=&7&#CoMu@InCo=8=&9&#ObArVi@Ind=2=@Col=1=#So@InCo=1=#TrArCe@InCo=2=#TrArVi@Ind=7=&5&@Col=7=&4&#Mu@InCo=10=%";
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		ArrayList<List<String[]>> arrayResult = preencherEstrutura.decifrarChave(key);
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "CrPa", "InCo", "12", "null" };
		list.add(aux);
		aux = new String[4];
		aux[0] = "ApObAr";aux[1] = "Ind";aux[2] = "44";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ApObAr";aux[1] = "Col";aux[2] = "55";aux[3] = "null";
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
		aux[0] = "ObArVi";aux[1] = "Ind";aux[2] = "2";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ObArVi";aux[1] = "Col";aux[2] = "1";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "So";aux[1] = "InCo";aux[2] = "1";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "TrArCe";aux[1] = "InCo";aux[2] = "2";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "TrArVi";aux[1] = "Ind";aux[2] = "7";aux[3] = "5";
		list.add(aux);
		aux = new String[4];
		aux[0] = "TrArVi";aux[1] = "Col";aux[2] = "7";aux[3] = "4";
		list.add(aux);
		aux = new String[4];
		aux[0] = "Mu";aux[1] = "InCo";aux[2] = "10";aux[3] = "null";
		list.add(aux);
		int i = 0;
		for (String[] string : arrayResult.get(2)) {
			// System.out.println(Arrays.toString(list.get(i)) + " " +
			// Arrays.toString(string));
			assertEquals(Arrays.toString(list.get(i)), Arrays.toString(string));
			i++;
		}
	}
	
	@Test
	public void TesteBasicoProdBibli() {
		String key = "Ano>>2018%PrBli!#TrEv@Nac=1=@Int=2=#ArPu@Con=3=#ArAcPu@Con=4=#TeJoRe@Con=1=&1&#CaLi@Con=2=&2&#OrLi@Con=3=&3&#PuLi@Con=4=&4&#PrPoLi@Con=5=&5&%";
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		ArrayList<List<String[]>> arrayResult = preencherEstrutura.decifrarChave(key);
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "TrEv", "Nac", "1", "null" };
		list.add(aux);
		aux = new String[4];
		aux[0] = "TrEv";aux[1] = "Int";aux[2] = "2";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ArPu";aux[1] = "Con";aux[2] = "3";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "ArAcPu";aux[1] = "Con";aux[2] = "4";aux[3] = "null";
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
		int i = 0;
		for (String[] string : arrayResult.get(3)) {
			// System.out.println(Arrays.toString(list.get(i)) + " " +
			// Arrays.toString(string));
			assertEquals(Arrays.toString(list.get(i)), Arrays.toString(string));
			i++;
		}
	}
	
	@Test
	public void TesteBasicoOrien() {
		String key = "Ano>2000>2018%Orien!#OrMe@AnCosOri=1=#OrDo@And=2=@Con=3=#OrPoDo@Ori=4=@Coo=5=#OrEsAp@OriAnd=6=@OriCon=7=@CooCon=8=#OrGr@Ori=9=&7&@Coo=1=&6&#OrInCi@And=2=&5&@Con=3=&4&%";
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		ArrayList<List<String[]>> arrayResult = preencherEstrutura.decifrarChave(key);
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "OrMe", "AnCosOri", "1", "null" };
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrDo";aux[1] = "And";aux[2] = "2";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrDo";aux[1] = "Con";aux[2] = "3";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrPoDo";aux[1] = "Ori";aux[2] = "4";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrPoDo";aux[1] = "Coo";aux[2] = "5";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrEsAp";aux[1] = "OriAnd";aux[2] = "6";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrEsAp";aux[1] = "OriCon";aux[2] = "7";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "OrEsAp";aux[1] = "CooCon";aux[2] = "8";aux[3] = "null";
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
		int i = 0;
		for (String[] string : arrayResult.get(4)) {
			// System.out.println(Arrays.toString(list.get(i)) + " " +
			// Arrays.toString(string));
			assertEquals(Arrays.toString(list.get(i)), Arrays.toString(string));
			i++;
		}
	}
	
	@Test
	public void TesteBasicoBanc() {
		String key = "Ano>>2018%Banc!#BaMe@Par=1=#BaDo@Par=2=#BaQu@Par=3=#BaEsAp@Par=4=#BaGr@Par=5=#BaPrTi@Par=1=&1&#BaCoPu@Par=2=&2&#BaLDo@Par=3=&3&#BaAvCu@Par=4=&4&%";
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		ArrayList<List<String[]>> arrayResult = preencherEstrutura.decifrarChave(key);
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "BaMe", "Par", "1", "null" };
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaDo";aux[1] = "Par";aux[2] = "2";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaQu";aux[1] = "Par";aux[2] = "3";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaEsAp";aux[1] = "Par";aux[2] = "4";aux[3] = "null";
		list.add(aux);
		aux = new String[4];
		aux[0] = "BaGr";aux[1] = "Par";aux[2] = "5";aux[3] = "null";
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
		int i = 0;
		for (String[] string : arrayResult.get(5)) {
			// System.out.println(Arrays.toString(list.get(i)) + " " +
			// Arrays.toString(string));
			assertEquals(Arrays.toString(list.get(i)), Arrays.toString(string));
			i++;
		}
	}
	
	@Test
	public void TesteBasicoDadosGerais() {
		String key = "Ano>>2018%CrGe!#DeEx@PoDeEx=12=%";
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		ArrayList<List<String[]>> arrayResult = preencherEstrutura.decifrarChave(key);
		List<String[]> list = new ArrayList<String[]>();
		String[] aux = { "DeEx", "PoDeEx", "12", "null" };
		list.add(aux);
		int i = 0;
		for (String[] string : arrayResult.get(6)) {
			// System.out.println(Arrays.toString(list.get(i)) + " " +
			// Arrays.toString(string));
			assertEquals(Arrays.toString(list.get(i)), Arrays.toString(string));
			i++;
		}
	}
	
	
	

	

}
