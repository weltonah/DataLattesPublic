package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SenhaController {
	@RequestMapping("/escolherCriterio")
	public String escolherCriterio() {
		return "senha/escolherCriterio";
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
