// package br.com.SearchXMLTest.formacao;
//
// import static org.junit.Assert.assertEquals;
//
// import java.io.File;
// import java.util.ArrayList;
//
// import javax.xml.parsers.DocumentBuilder;
// import javax.xml.parsers.DocumentBuilderFactory;
// import javax.xml.xpath.XPathExpressionException;
//
// import org.junit.BeforeClass;
// import org.junit.Test;
// import org.springframework.core.io.ClassPathResource;
// import org.w3c.dom.Document;
//
// import br.com.Modelo.Formacao;
// import br.com.SearchXML.SearchXMLFormacoes;
//
// public class PremioTeste {
// private static Document xmlfile;
// private static SearchXMLFormacoes searchXML;
// private static ArrayList<Formacao> listprod;
//
// // @Autowired
// // private MockMvc mvc;
// //
// // @MockBean
// // private StorageService storageService;
//
// @BeforeClass
// public static void shouldSaveUploadedFile() throws Exception {
// File file = new
// ClassPathResource("static/testFile/Jairocurriculoriginal.xml").getFile();
// DocumentBuilderFactory docBuilderFactory =
// DocumentBuilderFactory.newInstance();
// DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
// xmlfile = docBuilder.parse(file);
// searchXML = new SearchXMLFormacoes(xmlfile);
// listprod = searchXML.Premio();
// }
//
// @Test
// public void Nome() throws XPathExpressionException {
// assertEquals("Best paper na 12a Conferência Ibero-americana WWW/Internet",
// listprod.get(0)[0]);
// }
//
//
// @Test
// public void ano() throws XPathExpressionException {
// assertEquals(2014, listprod.get(0).getAno());
// }
//
//
// @Test
// public void inst() throws XPathExpressionException {
// assertEquals("IADIS", listprod.get(0)[2]);
// }
//
//
//
// }