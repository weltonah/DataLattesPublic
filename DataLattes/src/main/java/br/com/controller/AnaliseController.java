package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnaliseController {
	@RequestMapping("/inserirChave")
	public String inserirChave() {
		return "analise/inserirChave";
	}

	@RequestMapping(value = "/criterio", method = RequestMethod.POST)
	public String criterio(@RequestParam("key") String key, Model model) {
		// ArrayList<CriterioCheck> listCriterio = new ArrayList<CriterioCheck>();
		// String[] t = key.split("%");
		//
		// System.out.println(Arrays.toString(t));
		// String[] aux = t[0].split(">");
		// DadosCriterio dadosano = new DadosCriterio(aux[0], aux[1]);
		// dadosano.setLimite(aux[2]);
		// for (int i = 1; i < t.length; i++) {
		// String[] ta = t[i].split("!");
		// System.out.println(Arrays.toString(ta));
		// CriterioCheck Classifi = new CriterioCheck(ta[0]);
		// System.out.println(ta[0]);
		// String[] tipo = ta[i].split("#");
		// for (int j = 1; j < tipo.length; j++) {
		// String[] dif = tipo[j].split("@");
		// System.out.println(Arrays.toString(dif));
		// DadosCriterio dadosCri = null;
		// if (dif.length > 1) {
		// String nome = dif[0];
		// for (int k = 1; k < dif.length; k++) {
		// String[] criterio = dif[k].split("=");
		// dadosCri = new DadosCriterio(nome + criterio[0], criterio[1]);
		// System.out.println(Arrays.toString(criterio));
		// if (criterio.length == 3) {
		// String[] limite = criterio[2].split("&");
		// dadosCri.setLimite(limite[1]);
		// }
		// Classifi.addDadosCriterio(dadosCri);
		// }
		// } else {
		// String[] criterio = tipo[j].split("=");
		// dadosCri = new DadosCriterio(criterio[0], criterio[1]);
		// if (criterio.length == 3) {
		// String[] limite = criterio[2].split("&");
		// dadosCri.setLimite(limite[1]);
		// }
		// Classifi.addDadosCriterio(dadosCri);
		// }
		//
		// }
		// listCriterio.add(Classifi);
		// }
		// System.out.println(listCriterio.size());
		// model.addAttribute("List", listCriterio);
		// model.addAttribute("Ano", dadosano);
		return "analise/criterio";
	}
	
	
	@RequestMapping("/upload")
	public String upload() {
		
		return "analise/upload";
	}
}
