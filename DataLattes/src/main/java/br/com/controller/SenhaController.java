package br.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
			@RequestParam(value = "ProdArt", required = false) List<String> ProdArt,
			@RequestParam(value = "ProdTec", required = false) List<String> ProdTec,
			@RequestParam(value = "OriBanc", required = false) List<String> OriBanc,
			@RequestParam(value = "ProdBibl", required = false) List<String> ProdBibl,
			@RequestParam(value = "DadosGerais", required = false) List<String> DadosGerais) {

		model.addAttribute("formacaoList", formacao);
		model.addAttribute("ProdArtList", ProdArt);
		model.addAttribute("ProdTecList", ProdTec);
		model.addAttribute("OriBancList", OriBanc);
		model.addAttribute("ProdBiblList", ProdBibl);
		model.addAttribute("DadosGeraisList", DadosGerais);
		return "senha/escolherValorCriterio";
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
