package br.com.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.Modelo.CriterioCheck;
import br.com.Modelo.DadosCriterio;

@Controller
public class AnaliseController {
	@RequestMapping("/inserirChave")
	public String inserirChave() {
		return "analise/inserirChave";
	}
	@RequestMapping("/criterio")
	public String criterio(@RequestParam("key") String key) {
		ArrayList<CriterioCheck> listCriterio = new ArrayList<CriterioCheck>();
		String[] t = key.split ("%");
		
		System.out.println(Arrays.toString(t));
		for(int i=0; i<t.length;i++) {
			//ano
			if(i==0) {
				String[] aux = t[i].split (">");
				CriterioCheck ano = new CriterioCheck("Ano");
				DadosCriterio dadosCri = new DadosCriterio(aux[0],aux[1],aux[2]);
				ano.addDadosCriterio(dadosCri);
				listCriterio.add(ano);
				continue;
			}
			String[] ta = t[i].split ("!");
			System.out.println(Arrays.toString(ta));
			CriterioCheck Classifi = new CriterioCheck(ta[0]);
			System.out.println(ta[0]);
			String[] tipo = ta[i].split ("#");
			for(int j=1; j<tipo.length;j++) {
				String[] criterio = tipo[j].split("=");
				System.out.println(Arrays.toString(criterio));
				String[] limite = criterio[2].split("&");
				System.out.println(criterio[0]);
				System.out.println(criterio[1]);
				System.out.println(limite[1]);
				DadosCriterio dadosCri = new DadosCriterio(criterio[0],criterio[1],limite[1]);
				Classifi.addDadosCriterio(dadosCri);
			}
			listCriterio.add(Classifi);
		}
			
		
		
		return "analise/criterio";
	}
	@RequestMapping("/upload")
	public String upload() {
		
		return "analise/upload";
	}
}
