package br.com.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.Ontology.PreencherOntologia;

@Controller
public class AnaliseController {

	@Autowired
	private PreencherOntologia preencherOntologia;

	@RequestMapping("/inserirChave")
	public String inserirChave() {
		return "analise/inserirChave";
	}

	@RequestMapping("/upload")
	public String upload() {

		return "analise/upload";
	}

	@RequestMapping("/uploadFileToOntology")
	public String uploadFileToOntology(@RequestParam("file") MultipartFile file) throws IOException {
		File xmlfile = new File(file.getOriginalFilename());
		xmlfile.createNewFile();
		this.preencherOntologia.inserirFile(xmlfile);
		xmlfile.delete();
		return "arquivofile";
	}

}
