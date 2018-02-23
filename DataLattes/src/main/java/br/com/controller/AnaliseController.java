package br.com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.SearchXML.AnaliseDados;
import br.com.converter.ConverterFile;
import br.com.estrutura.Estrutura;

@Controller
public class AnaliseController {
	@RequestMapping("/inserirChave")
	public String inserirChave() {
		return "analise/inserirChave";
	}

	@RequestMapping("/upload")
	public String upload() {

		return "analise/upload";
	}
	@RequestMapping("/analise")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, HttpSession session,
			RedirectAttributes redirectAttributes, Model model) throws IOException {
		// this.storageService.store(file);
		// File xmlfile = this.storageService.load(file.getOriginalFilename()).toFile();

		File xmlfile = new File(file.getOriginalFilename());
		xmlfile.createNewFile();

		FileOutputStream fos = new FileOutputStream(xmlfile);
		fos.write(file.getBytes());
		fos.close();

		Estrutura SessaoCriteriosKey = (Estrutura) session.getAttribute("SessaoCriteriosKey");
		new AnaliseDados().preencherEstruturaAnaliseXml(SessaoCriteriosKey,
				ConverterFile.ConverterFileToDocument(xmlfile));
		// xmlfile.delete();
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
}
