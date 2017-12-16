package br.com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AnaliseController {
	@RequestMapping("/inserirChave")
	public String inserirChave() {
		return "analise/inserirChave";
	}
	@RequestMapping("/criterio")
	public String criterio() {
		return "analise/criterio";
	}
	@RequestMapping("/upload")
	public String upload() {
		
		return "analise/upload";
	}
}
