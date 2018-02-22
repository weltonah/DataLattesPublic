package br.com.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.estrutura.Estrutura;
import br.com.estrutura.PreencherEstrutura;

@Controller
@MultipartConfig(maxFileSize = 5000, maxRequestSize = 5000)
public class SenhaController {

	@Autowired
	private PreencherEstrutura preencherEstrutura;

	@RequestMapping("/escolherCriterio")
	public String escolherCriterio(Model model) {
		model.addAttribute("estr", this.preencherEstrutura.getEstr());
		return "senha/escolherCriterio";
	}

	@RequestMapping("/escolherValorCriterio")
	public String escolherValorCriterio(Model model,
			@RequestParam(value = "formacao", required = false) List<String> formacao,
			@RequestParam(value = "ProdTec", required = false) List<String> ProdTec,
			@RequestParam(value = "ProdArt", required = false) List<String> ProdArt,
			@RequestParam(value = "ProdBibl", required = false) List<String> ProdBibl,
			@RequestParam(value = "Orien", required = false) List<String> Orien,
			@RequestParam(value = "Banc", required = false) List<String> Banc,
			@RequestParam(value = "DeEx", required = false) List<String> DeEx) {
		ArrayList<List<String>> conteudo = new ArrayList<List<String>>();
		conteudo.add(formacao);
		conteudo.add(ProdTec);
		conteudo.add(ProdArt);
		conteudo.add(ProdBibl);
		conteudo.add(Orien);
		conteudo.add(Banc);
		conteudo.add(DeEx);
		Estrutura estcrit = this.preencherEstrutura.InserirCriteriosCheckbox(conteudo);
		model.addAttribute("estcrit", estcrit);
		return "senha/escolherValorCriterio";
	}

	@RequestMapping(value = "/criterio", method = RequestMethod.POST)
	public String criterio(@RequestParam("file") MultipartFile file, Model model, HttpSession session)
			throws IOException {
		File xmlfile = new File(file.getOriginalFilename());
		xmlfile.createNewFile();
		String key = new String(file.getBytes());
		System.out.println(key);
		xmlfile.delete();
		String[] t = key.split("%");
		String[] aux = t[0].split(">");
		int anoInicio = !(aux[1].contentEquals("")) ? Integer.parseInt(aux[1]) : 1900;
		int anoFim = Integer.parseInt(aux[2]);
		ArrayList<List<String[]>> conteudo = this.preencherEstrutura.decifrarChave(key);
		// for (List<String[]> list : conteudo) {
		// System.out.println("%%%$%$");
		// if (list != null)
		// for (String[] strings : list) {
		// System.out.println(Arrays.toString(strings));
		// }
		// }

		Estrutura SessaoCriteriosKey = this.preencherEstrutura.InserirCriteriosKey(conteudo);
		SessaoCriteriosKey.setAnoFim(anoFim);
		SessaoCriteriosKey.setAnoInicio(anoInicio);
		// for (AreaEstrutura listAre : SessaoCriteriosKey.getListEst()) {
		// System.out.println("******** " + listAre.getNome() + " ******");
		// for (CriterioEstrutura listcrit : listAre.getListCrit()) {
		// System.out.println("&&&&&& " + listcrit.getCriterio() + " &&&&");
		// for (ArrayList<TipoEstrutura> listTipo : listcrit.getListTipo()) {
		// for (TipoEstrutura listtipoEstrutura : listTipo) {
		// System.out.println("[" + listtipoEstrutura.getNomeTipo() + "," +
		// listtipoEstrutura.getAbre()
		// + ", " + listtipoEstrutura.getValor() + ", " + listtipoEstrutura.getLimite()
		// + "]");
		// }
		// }
		// }
		// }
		model.addAttribute("SessaoCriteriosKey", SessaoCriteriosKey);
		session.setAttribute("SessaoCriteriosKey", SessaoCriteriosKey);
		return "analise/criterio";
	}

	@RequestMapping("/criterioChave")
	public String criterioChave() {

		return "senha/criterioChave";
	}

	@RequestMapping("/chaveGerada")
	public String chaveGerada() {
		return "senha/chaveGerada";
	}

}
