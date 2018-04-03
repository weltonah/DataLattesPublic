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
	// QualisEntidade obj = new QualisEntidade("ISSN", "titulo");
	//
	// Optional<Qualis> qualis = this.qualisRepository
	// .findById(obj);
	// System.out.println(qualis.get().toString());
	// return "analise/upload";
	// }

	@RequestMapping("/upload")
	public String upload() {

		return "analise/upload";
	}

	// @RequestMapping("/Onto")
	// public String onto() {
	//
	// return "analise/uploadOnto";
	// }
	//
	// @RequestMapping("/uploadOnto")
	// public String uploadFileToOntology(@RequestParam("file") MultipartFile[]
	// uploadingFiles) {
	// try {
	// for (MultipartFile uploadedFile : uploadingFiles) {
	// System.out.println(uploadedFile.getOriginalFilename());
	// File xmlfile = new File(uploadedFile.getOriginalFilename());
	//
	// xmlfile.createNewFile();
	//
	// FileOutputStream fos = new FileOutputStream(xmlfile);
	// fos.write(uploadedFile.getBytes());
	// fos.close();
	//
	// this.preencherOntologia.inserirFile(xmlfile);
	//
	// xmlfile.delete();
	// }
	// // this.preencherOntologia.imprimir();
	// // File xmlfile = new File(file.getOriginalFilename());
	// // File xmlfile = new
	// // ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
	// // xmlfile.createNewFile();
	// // this.preencherOntologia.inserirFile(xmlfile);
	// // xmlfile.delete();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return "arquivofile";
	// }

}
