package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnaliseController {
	// @Autowired
	// private QualisRepository qualisRepository;
	// @Autowired
	// private PreencherOntologia preencherOntologia;

	@RequestMapping("/inserirChave")
	public String inserirChave() {
		return "analise/inserirChave";
	}

	// @RequestMapping("/teste")
	// public String teste() {
	// QualisEntidade obj = new QualisEntidade("2236-6695", "A BARRIGUDA: REVISTA
	// CIENTÍFICA");
	// Qualis qualiss = new Qualis(obj, "B4");
	// this.qualisRepository
	// .save(qualiss);
	//
	// Optional<Qualis> qualis = this.qualisRepository
	// .findById(obj);
	// System.out.println(qualis.isPresent());
	// return "analise/upload";
	// }

	@RequestMapping("/upload")
	public String upload() {

		return "analise/upload";
	}

	// @RequestMapping("/uploadFileToOntology")
	// public String uploadFileToOntology(@RequestParam("file") MultipartFile file)
	// throws IOException {
	// File xmlfile = new File(file.getOriginalFilename());
	// xmlfile.createNewFile();
	// this.preencherOntologia.inserirFile(xmlfile);
	// xmlfile.delete();
	// return "arquivofile";
	// }

}
