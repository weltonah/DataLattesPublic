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
	public String escolherValorCriterio(@RequestParam("formacao") List<Integer> formacao,
			@RequestParam("ProdArt") List<Integer> ProdArt, @RequestParam("ProdTec") List<Integer> ProdTec,
			@RequestParam("OriBanc") List<Integer> OriBanc, @RequestParam("ProdBibl") List<Integer> ProdBibl) {

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
