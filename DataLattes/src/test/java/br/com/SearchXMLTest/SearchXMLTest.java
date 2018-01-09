package br.com.SearchXMLTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

import br.com.converter.SearchXML;

//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@SpringBootTest
public class SearchXMLTest {
	
	private static Document xmlfile;
	private static SearchXML searchXML;
	
//    @Autowired
//    private MockMvc mvc;
//
//    @MockBean
//    private StorageService storageService;
	
    @BeforeClass
    public static void shouldSaveUploadedFile() throws Exception {
    	File file = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
    	DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        xmlfile = docBuilder.parse(file);
        searchXML = new SearchXML(xmlfile);
    }
    
    @Test
    public void NomeCompleto() throws XPathExpressionException {
    	assertEquals("Jairo Francisco de Souza", searchXML.NomeCompleto());
    	
    }
    @Test
    public void NomeCitacao() throws XPathExpressionException {
    	assertEquals("SOUZA, J. F.", searchXML.NomeCitacao());
    	
    }
    @Test
    public void IDLattes() throws XPathExpressionException {
    	assertEquals("4516605108233899", searchXML.IDLattes());
    }
    @Test
    public void ResumoCV() throws XPathExpressionException {
    	assertEquals("Possui graduação em Ciência da "
    			+ "Computação pela Universidade Federal de Juiz de "
    			+ "Fora (2004), mestrado em Engenharia de Sistemas e "
    			+ "Computação pela Universidade Federal do Rio de "
    			+ "Janeiro (2007) e doutorado em Informática pela "
    			+ "PUC-RJ, ambos na linha de Banco de Dados. "
    			+ "É professor do Departamento de Ciência da "
    			+ "Computação da Universidade Federal de Juiz de"
    			+ " Fora e participa de pesquisas sobre Recuperação "
    			+ "de Informação, Resolução de Identidade e "
    			+ "Representação do Conhecimento.", searchXML.ResumoCV());
    }
    @Test
    public void UltimaAtualizacao() throws XPathExpressionException {
    	assertEquals("18052017", searchXML.UltimaAtualizacao());
    }
    @Test
    public void DedicaoExclusiva() throws XPathExpressionException {
    	assertTrue(searchXML.DedicaoExclusiva());
    }
    
    

    

}
