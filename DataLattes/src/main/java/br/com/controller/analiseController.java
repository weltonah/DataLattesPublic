package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class analiseController {
	@RequestMapping("/inserirChave")
	public String inserirChave() {
		return "analise/inserirChave";
	}
	@RequestMapping("/criterio")
	public String criterio() {
		return "analise/criterio";
	}
	@RequestMapping("/upload")
	public String upload() {
		
		return "analise/upload";
	}
	@RequestMapping("/analise")
	public String analise(@RequestParam("file") MultipartFile summary) {
		if(summary.isEmpty())
			System.out.println("Ola mundo");
		else
		System.out.println(summary.getName()	+	";"+summary.getOriginalFilename());
		
		return "analise/analise";
	}
}
