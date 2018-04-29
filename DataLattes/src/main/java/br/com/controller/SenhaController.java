package br.com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.SearchXML.AnaliseDados;
import br.com.converter.ConverterFile;
import br.com.converter.DownloadCsv;
import br.com.estrutura.Estrutura;
import br.com.estrutura.PreencherEstrutura;

@Controller
public class SenhaController {
	private String path = "views/";
	@Autowired
	private PreencherEstrutura preencherEstrutura;

	@RequestMapping("/escolherCriterio")
	public String escolherCriterio(Model model) {
		model.addAttribute("estr", this.preencherEstrutura.getEstr());
		return this.path + "senha/escolherCriterio";
	}

	@RequestMapping(value = "/escolherValorCriterio", method = RequestMethod.POST)
	public String escolherValorCriterio(Model model,
			@RequestParam(value = "formacao", required = false) List<String> formacao,
			@RequestParam(value = "ProdTec", required = false) List<String> ProdTec,
			@RequestParam(value = "ProdArt", required = false) List<String> ProdArt,
			@RequestParam(value = "ProdBibl", required = false) List<String> ProdBibl,
			@RequestParam(value = "Orien", required = false) List<String> Orien,
			@RequestParam(value = "Banc", required = false) List<String> Banc,
			@RequestParam(value = "DeEx", required = false) List<String> DeEx,
			@RequestParam(value = "ParEvento", required = false) List<String> ParEvento) {
		ArrayList<List<String>> conteudo = new ArrayList<List<String>>();
		conteudo.add(formacao);
		conteudo.add(ProdTec);
		conteudo.add(ProdArt);
		conteudo.add(ProdBibl);
		conteudo.add(Orien);
		conteudo.add(Banc);
		conteudo.add(DeEx);
		conteudo.add(ParEvento);
		Estrutura estcrit = this.preencherEstrutura.InserirCriteriosCheckbox(conteudo);
		model.addAttribute("estcrit", estcrit);
		return this.path + "senha/escolherValorCriterio";
	}

	@RequestMapping(value = "/criterio", method = RequestMethod.POST)
	public String criterio(@RequestParam("file") MultipartFile file, Model model, HttpSession session)
			throws IOException {
		File xmlfile = new File(file.getOriginalFilename());
		xmlfile.createNewFile();
		String key = new String(file.getBytes());
		xmlfile.delete();
		String[] t = key.split("%");
		String[] aux = t[0].split(">");
		int anoInicio = !(aux[1].contentEquals("")) ? Integer.parseInt(aux[1]) : 1900;
		int anoFim = Integer.parseInt(aux[2]);
		ArrayList<List<String[]>> conteudo = this.preencherEstrutura.decifrarChave(key);
		Estrutura SessaoCriteriosKey = this.preencherEstrutura.InserirCriteriosKey(conteudo);
		SessaoCriteriosKey.setAnoFim(anoFim);
		SessaoCriteriosKey.setAnoInicio(anoInicio);
		model.addAttribute("SessaoCriteriosKey", SessaoCriteriosKey);
		session.setAttribute("conteudo", conteudo);
		session.setAttribute("anoFim", anoFim);
		session.setAttribute("anoInicio", anoInicio);
		return this.path + "analise/criterio";
	}

	@RequestMapping("/analise")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, HttpSession session,
			RedirectAttributes redirectAttributes, Model model) throws IOException {
		File xmlfile = new File(file.getOriginalFilename());
		xmlfile.createNewFile();
		FileOutputStream fos = new FileOutputStream(xmlfile);
		fos.write(file.getBytes());
		fos.close();
		ArrayList<List<String[]>> conteudo = (ArrayList<List<String[]>>) session.getAttribute("conteudo");
		Estrutura SessaoCriteriosKey = this.preencherEstrutura.InserirCriteriosKey(conteudo);


		SessaoCriteriosKey.setAnoFim((int) session.getAttribute("anoFim"));
		SessaoCriteriosKey.setAnoInicio((int) session.getAttribute("anoInicio"));
		new AnaliseDados().preencherEstruturaAnaliseXml(SessaoCriteriosKey,
				ConverterFile.ConverterFileToDocument(xmlfile));
		xmlfile.delete();
		model.addAttribute("SessaoCriteriosKey", SessaoCriteriosKey);
		session.setAttribute("SessaoCriteriosKey", SessaoCriteriosKey);
		return this.path + "analise/analise";
	}

	@RequestMapping("/DownloadCSV")
	public void criterioChave(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Estrutura SessaoCriteriosKey = (Estrutura) session.getAttribute("SessaoCriteriosKey");
		DownloadCsv.criarArquivo(request, session, response, SessaoCriteriosKey);
	}

	@RequestMapping("/criterioChave")
	public String criterioChave() {

		return this.path + "senha/criterioChave";
	}

	@RequestMapping("/chaveGerada")
	public String chaveGerada() {
		return this.path + "senha/chaveGerada";
	}

}
