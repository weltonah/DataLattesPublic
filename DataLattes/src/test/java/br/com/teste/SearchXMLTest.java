package br.com.teste;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.w3c.dom.Document;

import br.com.converter.SearchXML;
import br.com.storage.StorageService;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class SearchXMLTest {
	
	private Document xmlfile;
	private SearchXML searchXML;
	
    @Autowired
    private MockMvc mvc;

    @MockBean
    private StorageService storageService;
	
    @Before
    public void shouldSaveUploadedFile() throws Exception {
    	InputStream stream;
    	File file = new ClassPathResource("static/testFile/curriculo.xml").getFile();
    	stream = new FileInputStream(file);
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        this.xmlfile = docBuilder.parse(stream);
        stream.close();
        this.searchXML = new SearchXML(xmlfile);
    }
    
    @Test
    public void NomeCompleto() throws XPathExpressionException {
    	assertEquals("Jairo Francisco de Souza", searchXML.NomeCompleto());
    	
    }
    

}
