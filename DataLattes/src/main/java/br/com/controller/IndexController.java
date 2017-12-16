package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.DAO.OntologyDAO;

@Controller
public class IndexController{
	
	
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/teste")
	public String teste() {
		OntologyDAO ont = new OntologyDAO();
		ont.imprimir();
		return "index";
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/infoAjuda")
	public String infoAjuda() {
		return "info/infoAjuda";
	}
	@RequestMapping("/infoChave")
	public String infoChave() {
		return "info/infoChave";
	}
	@RequestMapping("/infoSobre")
	public String infoSobre() {
		return "info/infoSobre";
	}
	@RequestMapping("/infoFI")
	public String infoFI() {
		return "info/infoFI";
	}
	@RequestMapping("/infoXML")
    public String infoXML() {
		return "info/infoXML";
    }
}