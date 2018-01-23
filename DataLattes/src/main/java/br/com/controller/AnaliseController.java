package br.com.controller;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnaliseController {
	@RequestMapping("/inserirChave")
	public String inserirChave() {
		return "analise/inserirChave";
	}
	@RequestMapping("/criterio")
	public String criterio(@RequestParam("key") String key) {
		String[] t = key.split ("%");
		
		System.out.println(Arrays.toString(t));
		for(int i=0; i<t.length;i++) {
			String[] ta = t[i].split ("*");
			for(int j=0; j<ta.length;j++) {
				System.out.println(ta[j]);
			}
			
		}
			
		
		
		return "analise/criterio";
	}
	@RequestMapping("/upload")
	public String upload() {
		
		return "analise/upload";
	}
}
