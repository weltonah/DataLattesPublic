package br.com.estrutura.PreencherEstruturaTeste;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.estrutura.Estrutura;
import br.com.estrutura.PreencherEstrutura;

public class InserirCriteriosKeyTeste {

	@Test
	public void TesteBasicoFormacao() {
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
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
		ArrayList<List<String[]>> arrayString = new ArrayList<List<String[]>>();
		arrayString.add(list);
		int i = 0;
		Estrutura estrutura = preencherEstrutura.InserirCriteriosKey(arrayString);


	}
}
