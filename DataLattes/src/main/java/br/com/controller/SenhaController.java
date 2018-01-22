package br.com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.Modelo.CriteriosCheckBox;

@Controller
public class SenhaController {
	@RequestMapping("/escolherCriterio")
	public String escolherCriterio(Model model) {
		CriteriosCheckBox ck = new CriteriosCheckBox();
		model.addAttribute("ck", ck);
		return "senha/escolherCriterio";
	}

	@RequestMapping("/escolherValorCriterio")
	public String escolherValorCriterio(Model model,@RequestParam("formacao") List<String> formacao,
			@RequestParam("ProdArt") List<String> ProdArt, @RequestParam("ProdTec") List<String> ProdTec,
			@RequestParam("OriBanc") List<String> OriBanc, @RequestParam("ProdBibl") List<String> ProdBibl, @RequestParam("DadosGerais") List<String> DadosGerais) {
		formacao.remove(0);
		ProdArt.remove(0);
		ProdTec.remove(0);
		OriBanc.remove(0);
		ProdBibl.remove(0);
		DadosGerais.remove(0);
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
