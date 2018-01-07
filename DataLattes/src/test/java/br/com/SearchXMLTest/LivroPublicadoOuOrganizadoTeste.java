package br.com.SearchXMLTest;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathExpressionException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.w3c.dom.Document;

import br.com.Modelo.Producao;
import br.com.converter.SearchXML;

public class LivroPublicadoOuOrganizadoTeste {
	private static Document xmlfile;
	private static SearchXML searchXML;
	private static ArrayList<Producao> listprod;

	// @Autowired
	// private MockMvc mvc;
	//
	// @MockBean
	// private StorageService storageService;

	@BeforeClass
	public static void shouldSaveUploadedFile() throws Exception {
		File file = new ClassPathResource("static/testFile/Jorgecurriculo.xml").getFile();
		DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		xmlfile = docBuilder.parse(file);
		searchXML = new SearchXML(xmlfile);
		listprod = searchXML.LivroPublicadoOuOrganizar();
	}
	
	@Test
    public void ArtigoCompletoPublicado() throws XPathExpressionException {
    	
    	for(Producao prod : listprod) {
    		System.out.println("titulo " + prod.getTitulo());
    		System.out.println("ano " + prod.getAno());
    		System.out.println("ISSN " + prod.getIssn());
    		System.out.println("natureza " + prod.getNatureza());
    		System.out.println("Tipo " + prod.getTipo());
    		ArrayList<String[]> autores = prod.getAutores();
    		for(String[] s: autores) {
    			System.out.println("autor :" + s[0]);
    			System.out.println("citacao :" + s[1]);
    		}
    	}
    	
    	
    	assertEquals("18052017","sd");
    }

	@Test
	public void primeiroTitulo() throws XPathExpressionException {
		assertEquals("Improving software agent communication with structural ontology alignment methods",
				listprod.get(0).getTitulo());
	}
	@Test
	public void PrimeiroAno() throws XPathExpressionException {
		assertEquals("2010",
				listprod.get(0).getAno());
	}
	@Test
	public void PrimeiroISSN() throws XPathExpressionException {
		assertEquals("15541045",
				listprod.get(0).getIssn());
	}
	@Test
	public void Primeiranatureza() throws XPathExpressionException {
		assertEquals("COMPLETO",
				listprod.get(0).getNatureza());
	}
	@Test
	public void PrimeiraPrimeiroAutornatureza() throws XPathExpressionException {
		assertEquals("Jairo Francisco de Souza",
				listprod.get(0).getAutores().get(0)[0]);
	}
	@Test
	public void PrimeiraPrimeiroAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("SOUZA, J. F.",
				listprod.get(0).getAutores().get(0)[1]);
	}
	@Test
	public void PrimeiraUltimoAutornatureza() throws XPathExpressionException {
		assertEquals("Sean Wolfgang Matsui Siqueira",
				listprod.get(0).getAutores().get(4)[0]);
	}
	@Test
	public void PrimeiraUltimoAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("SIQUEIRA, S. W. M.",
				listprod.get(0).getAutores().get(4)[1]);
	}
	@Test
	public void ultimoTitulo() throws XPathExpressionException {
		assertEquals("Management of Scientific Experiments in Computational Modeling: Challenges and Perspectives",
				listprod.get(6).getTitulo());
	}
	@Test
	public void ultimoAno() throws XPathExpressionException {
		assertEquals("2012",
				listprod.get(6).getAno());
	}
	@Test
	public void ultimoISSN() throws XPathExpressionException {
		assertEquals("19842902",
				listprod.get(6).getIssn());
	}
	@Test
	public void ultimonatureza() throws XPathExpressionException {
		assertEquals("COMPLETO",
				listprod.get(6).getNatureza());
	}
	@Test
	public void ultimoPrimeiroAutornatureza() throws XPathExpressionException {
		assertEquals("Regina Maria Maciel Braga Villela",
				listprod.get(6).getAutores().get(0)[0]);
	}
	@Test
	public void ultimoPrimeiroAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("BRAGA, R. M. M.",
				listprod.get(6).getAutores().get(0)[1]);
	}
	@Test
	public void ultimoUltimoAutornatureza() throws XPathExpressionException {
		assertEquals("Kate Revoredo",
				listprod.get(6).getAutores().get(5)[0]);
	}
	@Test
	public void ultimoUltimoAutorcitacaonatureza() throws XPathExpressionException {
		assertEquals("REVOREDO, K.",
				listprod.get(6).getAutores().get(5)[1]);
	}

}
