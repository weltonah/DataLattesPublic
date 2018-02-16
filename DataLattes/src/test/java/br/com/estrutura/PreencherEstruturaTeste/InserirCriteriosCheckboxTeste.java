package br.com.estrutura.PreencherEstruturaTeste;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.estrutura.AreaEstrutura;
import br.com.estrutura.CriterioEstrutura;
import br.com.estrutura.Estrutura;
import br.com.estrutura.PreencherEstrutura;

public class InserirCriteriosCheckboxTeste {

	@Test
	public void teste() {
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		Estrutura Expect = preencherEstrutura.getEstr();
		ArrayList<List<String>> conteudoExpect = new ArrayList<List<String>>();
		for (int i = 0; i < 6; i++) {
			AreaEstrutura area = Expect.getListEst().get(i);
			List<String> listString = new ArrayList<String>();
			for (CriterioEstrutura criterioEstrutura : area.getListCrit()) {
				String str = criterioEstrutura.getAbre();
				listString.add(str);
			}
			conteudoExpect.add(listString);
		}
		Estrutura Result = preencherEstrutura.InserirCriteriosCheckbox(conteudoExpect);
		for (int i = 0, j = 0; i < 6; i++) {
			AreaEstrutura area = Result.getListEst().get(i);
			j = 0;
			for (CriterioEstrutura criterioEstrutura : area.getListCrit()) {
				// System.out.println(conteudoExpect.get(i).get(j) + " " +
				// criterioEstrutura.getAbre());
				assertEquals(conteudoExpect.get(i).get(j), criterioEstrutura.getAbre());
				j++;
			}
		}
		
		

	}


}
