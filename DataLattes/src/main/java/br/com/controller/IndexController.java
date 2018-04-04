package br.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController{
	private String path = "views/";
	
	
	@RequestMapping("/")
	public String home() {
		return this.path + "index";
	}
	@RequestMapping("/index")
	public String index() {
		return this.path + "index";
	}
	@RequestMapping("/infoAjuda")
	public String infoAjuda() {
		return this.path + "info/infoAjuda";
	}
	@RequestMapping("/infoChave")
	public String infoChave() {
		return this.path + "info/infoChave";
	}
	@RequestMapping("/infoSobre")
	public String infoSobre() {
		return this.path + "info/infoSobre";
	}
	@RequestMapping("/infoFI")
	public String infoFI() {
		return this.path + "info/infoFI";
	}
	@RequestMapping("/infoXML")
    public String infoXML() {
		return this.path + "info/infoXML";
    }
}