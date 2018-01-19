package br.com.controller;

import java.util.List;

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
		System.out.println(ck.getFormacao().size());
		model.addAttribute("ck", ck);
		return "senha/escolherCriterio";
	}
	@RequestMapping("/criterioChave")
	public String criterioChave(@RequestParam("checkbox") List<String> person) {
		System.out.println(person.size());
		System.out.println(person.get(0));
		
		return "senha/criterioChave";
	}
	@RequestMapping("/chaveGerada")
	public String chaveGerada() {
		return "senha/chaveGerada";
	}
	
}
