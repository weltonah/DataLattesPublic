package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnaliseController {
	@RequestMapping("/inserirChave")
	public String inserirChave() {
		return "analise/inserirChave";
	}

	
	

	@RequestMapping("/upload")
	public String upload() {
		
		return "analise/upload";
	}
}
