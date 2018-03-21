package br.com.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.Ontology.PreencherOntologia;

@Controller
public class AnaliseController {
	// @Autowired
	// private QualisRepository qualisRepository;
	@Autowired
	private PreencherOntologia preencherOntologia;

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

	@RequestMapping("/Onto")
	public String uploadFileToOntology() throws IOException {
		// File xmlfile = new File(file.getOriginalFilename());
		File xmlfile = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		xmlfile.createNewFile();
		this.preencherOntologia.inserirFile(xmlfile);
		xmlfile.delete();
		return "arquivofile";
	}

}
