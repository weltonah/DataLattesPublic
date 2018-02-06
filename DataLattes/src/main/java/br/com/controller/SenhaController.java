package br.com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.estrutura.Estrutura;
import br.com.estrutura.PreencherEstrutura;

@Controller
public class SenhaController {

	@Autowired
	private PreencherEstrutura preencherEstrutura;

	@RequestMapping("/escolherCriterio")
	public String escolherCriterio(Model model) {
		model.addAttribute("estr", this.preencherEstrutura.getEstr());
		return "senha/escolherCriterio";
	}

	@RequestMapping("/escolherValorCriterio")
	public String escolherValorCriterio(Model model,
			@RequestParam(value = "formacao", required = false) List<String> formacao,
			@RequestParam(value = "ProdTec", required = false) List<String> ProdTec,
			@RequestParam(value = "ProdArt", required = false) List<String> ProdArt,
			@RequestParam(value = "ProdBibl", required = false) List<String> ProdBibl,
			@RequestParam(value = "OriBanc", required = false) List<String> OriBanc,
			@RequestParam(value = "DadosGerais", required = false) List<String> DadosGerais) {
		ArrayList<List<String>> conteudo = new ArrayList<List<String>>();
		conteudo.add(formacao);
		conteudo.add(ProdTec);
		conteudo.add(ProdArt);
		conteudo.add(ProdBibl);
		conteudo.add(OriBanc);
		conteudo.add(DadosGerais);
		Estrutura estcrit = this.preencherEstrutura.InserirCriteriosCheckbox(conteudo);

		model.addAttribute("estcrit", estcrit);
		return "senha/escolherValorCriterio";
	}

	@RequestMapping(value = "/criterio", method = RequestMethod.POST)
	public String criterio(@RequestParam("key") String key, Model model) {
		String[] t = key.split("%");
		String[] aux = t[0].split(">");
		int anoInicio = !(aux[1].contentEquals("")) ? Integer.parseInt(aux[1]) : 1950;
		int anoFim = Integer.parseInt(aux[2]);
		ArrayList<List<String[]>> conteudo = this.preencherEstrutura.decifrarChave(key);
		for (List<String[]> list : conteudo) {
			System.out.println("%%%$%$");
			if (list != null)
				for (String[] strings : list) {
					System.out.println(Arrays.toString(strings));
				}
		}

		Estrutura SessaoCriteriosKey = this.preencherEstrutura.InserirCriteriosKey(conteudo);
		SessaoCriteriosKey.setAnoFim(anoFim);
		SessaoCriteriosKey.setAnoInicio(anoInicio);

		// model.addAttribute("List", listCriterio);
		// model.addAttribute("Ano", dadosano);
		return "analise/criterio";
	}

	@RequestMapping("/criterioChave")
	public String criterioChave() {

		return "senha/criterioChave";
	}

	@RequestMapping("/chaveGerada")
	public String chaveGerada() {
		return "senha/chaveGerada";
	}

}
