package br.com.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import br.com.DAO.OntologyDAO;
import br.com.Modelo.Resultado;

public class Converter {
	
	private Document xmlfile;
	private SearchXML searchXML;
	
	public Converter(File file) throws Exception{
		this.searchXML = new SearchXML();
		String nome = file.getName();
        InputStream stream;
        ZipFile zf = null;
        Resultado result = null;
        if(nome.contains(".zip")){
            zf = new ZipFile(file);
            ZipEntry ze = zf.entries().nextElement();
            stream = zf.getInputStream(ze);
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            this.xmlfile = docBuilder.parse(stream);
            ze.clone();
            zf.close();
        }
        else{
            stream = new FileInputStream(file);
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            this.xmlfile = docBuilder.parse(stream);
        }
        stream.close();
	}
		
	public void ConstruirCriterios(String Key) {
		
	}
	
	
	
	
	
	
	
}
