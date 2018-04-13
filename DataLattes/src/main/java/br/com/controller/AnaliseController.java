package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnaliseController {
	private String path = "views/";
	// @Autowired
	// private QualisRepository qualisRepository;
	// @Autowired
	// private PreencherOntologia preencherOntologia;

	@RequestMapping("/inserirChave")
	public String inserirChave() {
		return this.path + "analise/inserirChave";
	}

	@RequestMapping("/upload")
	public String upload() {

		return this.path + "analise/upload";
	}

	// @RequestMapping("/teste")
	// public String teste() {
	// QualisEntidade obj = new QualisEntidade("ISSN", "titulo");
	//
	// Optional<Qualis> qualis = this.qualisRepository
	// .findById(obj);
	// System.out.println(qualis.get().toString());
	// return "analise/upload";
	// }

}
