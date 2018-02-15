package br.com.controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.SearchXML.AnaliseDados;
import br.com.converter.ConverterFile;
import br.com.estrutura.Estrutura;
import br.com.storage.StorageFileNotFoundException;
import br.com.storage.StorageService;

@Controller
public class FileUploadController {

	private final StorageService storageService;

	@Autowired
	public FileUploadController(StorageService storageService) {
		this.storageService = storageService;
	}

	@RequestMapping("/analise")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, HttpSession session,
			RedirectAttributes redirectAttributes, Model model) {
		this.storageService.store(file);
		File xmlfile = this.storageService.load(file.getOriginalFilename()).toFile();
		Estrutura SessaoCriteriosKey = (Estrutura) session.getAttribute("SessaoCriteriosKey");
		new AnaliseDados().preencherEstruturaAnaliseXml(SessaoCriteriosKey,
				ConverterFile.ConverterFileToDocument(xmlfile));
		// for (AreaEstrutura listAre : SessaoCriteriosKey.getListEst()) {
		// System.out.println("******** " + listAre.getNome() + " ******");
		// for (CriterioEstrutura listcrit : listAre.getListCrit()) {
		// System.out.println("&&&&&& " + listcrit.getCriterio() + " &&&&");
		// for (ArrayList<TipoEstrutura> listTipo : listcrit.getListTipo()) {
		// for (TipoEstrutura listtipoEstrutura : listTipo) {
		// System.out.println(listtipoEstrutura.getItemAnalisados().size());
		// System.out.println("[" + listtipoEstrutura.getNomeTipo() + "," +
		// listtipoEstrutura.getAbre()
		// + ", " + listtipoEstrutura.getValor() + ", " + listtipoEstrutura.getLimite()
		// + "]");
		// for (ItemAnalisado itemAnalisado : listtipoEstrutura.getItemAnalisados()) {
		// System.out.println("valor contabilizado" +
		// itemAnalisado.getValorContabilizado());
		// System.out.println("nome" + itemAnalisado.getItem().getTitulo());
		//
		// }
		// }
		// }
		// }
		// }

		model.addAttribute("SessaoCriteriosKey", SessaoCriteriosKey);
		return "analise/analise";
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}

}
