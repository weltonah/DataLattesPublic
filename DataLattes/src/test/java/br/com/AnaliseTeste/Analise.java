package br.com.AnaliseTeste;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import br.com.SearchXML.AnaliseDados;
import br.com.converter.ConverterFile;
import br.com.estrutura.Estrutura;
import br.com.estrutura.PreencherEstrutura;

public class Analise {

	@Test
	public void teste() throws IOException {
		PreencherEstrutura preencherEstrutura = new PreencherEstrutura();
		preencherEstrutura.Init();
		String key = "Ano>>2018%For!#Gr@AnCos=8=#Es@AnCos=9=#Me@And=3=@Con=2=#Do@AnCos=3=#PDo@AnCos=2=#LDo@Con=4=#CuTePr@AnCos=23=&2&#MePr@AnCos=12=#ReMe@AnCos=32=#Ape@AnCos=11=#MBA@AnCos=23=%PrTec!#Tr@Con=23=#CuRe@Con=3=#CuPr@Con=53=#Sof@Con=2=#Pa@NaIn=32=#DeTe@Con=23=#Mac@Con=4=#ToCiIn@Con=7=#PrTe@Con=8=#ProuTe@Con=4=#TrTe@Con=1=#ApTr@Con=21=#CaMaSi@Con=45=#CuMiCuDu@Con=45=#PrMaDi@Con=78=#Edi@Con=41=#MaObAr@Con=141=#Maq@Con=54=#OrEv@Con=12=#CPRTV@Con=45=#RePe@Con=33=#TeMiSo@Con=55=%PrArt!#CrPa@InCo=8=#ApObAr@InCo=7=#ApPrRTV@InCo=5=#ArMu@InCo=4=#CoMu@InCo=1=#ObArVi@InCo=2=#So@InCo=3=#TrArCe@InCo=5=#TrArVi@InCo=7=#Mu@InCo=5=%PrBli!#TrEv@NaIn=4=#ArPu@Con=5=#ArAcPu@Con=6=#TeJoRe@Con=2=#CaLi@Con=7=#OrLi@Con=10=#PuLi@Con=55=#PrPoLi@Con=45=%Orien!#OrMe@AnCosOri=42=#OrDo@AnCosOri=12=#OrPoDo@AnCosOri=11=#OrEsAp@AnCosOri=10=#OrGr@AnCosOri=55=#OrInCi@AnCosOri=78=%Banc!#BaMe@Par=78=#BaDo@Par=45=#BaQu@Par=22=#BaEsAp@Par=11=#BaGr@Par=55=#BaPrTi@Par=77=#BaCoPu@Par=99=#BaLDo@Par=99=#BaAvCu@Par=88=%CrGe!#DeEx@PoDeEx=5=%";
		String[] t = key.split("%");
		String[] aux = t[0].split(">");
		int anoInicio = !(aux[1].contentEquals("")) ? Integer.parseInt(aux[1]) : 1900;
		int anoFim = Integer.parseInt(aux[2]);
		ArrayList<List<String[]>> conteudo = preencherEstrutura.decifrarChave(key);
		Estrutura SessaoCriteriosKey = preencherEstrutura.InserirCriteriosKey(conteudo);
		SessaoCriteriosKey.setAnoFim(anoFim);
		SessaoCriteriosKey.setAnoInicio(anoInicio);
		File xmlfile = new ClassPathResource("static/testFile/Jairocurriculo.xml").getFile();
		new AnaliseDados().preencherEstruturaAnaliseXml(SessaoCriteriosKey,
				ConverterFile.ConverterFileToDocument(xmlfile));

		// for (AreaEstrutura listAre : SessaoCriteriosKey.getListEst()) {
		// System.out.println("******** " + listAre.getNome() + " ******");
		// for (CriterioEstrutura listcrit : listAre.getListCrit()) {
		// System.out.println("&&&&&& " + listcrit.getCriterio() + " &&&&");
		// for (ArrayList<TipoEstrutura> listTipo : listcrit.getListTipo()) {
		// for (TipoEstrutura listtipoEstrutura : listTipo) {
		// System.out.println(listtipoEstrutura.getItemAnalisados().size());
		// System.out.println("[" + listtipoEstrutura.getNomeTipo() + "," +
		// listtipoEstrutura.getAbre()
		// + ", " + listtipoEstrutura.getValor() + ", " + listtipoEstrutura.getLimite()
		// + "]");
		// for (ItemAnalisado itemAnalisado : listtipoEstrutura.getItemAnalisados()) {
		// System.out.println("valor contabilizado" +
		// listtipoEstrutura.getValorTotalContabilizado());
		// //System.out.println("nome" + itemAnalisado.getItem().getTitulo());
		// }
		// }
		// }
		// }
		// }
	}
}
