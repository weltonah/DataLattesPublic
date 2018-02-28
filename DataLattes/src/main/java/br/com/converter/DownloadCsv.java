package br.com.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.util.FileCopyUtils;

import br.com.estrutura.AreaEstrutura;
import br.com.estrutura.CriterioEstrutura;
import br.com.estrutura.Estrutura;
import br.com.estrutura.TipoEstrutura;

public class DownloadCsv {

	public static void criarArquivo(HttpServletRequest request, HttpSession session, HttpServletResponse response,
			Estrutura sessaoCriteriosKey) {
		File file = new File(System.getProperty("user.dir") + "relatorio.csv");
		try {

			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), "CP1252"));
			StringBuilder sb = new StringBuilder();
			sb.append(sessaoCriteriosKey.getDadosCurricular().getNome());
			sb.append(';');
			sb.append("Nota total " + sessaoCriteriosKey.getNotatotal());
			sb.append('\n');
			pw.write(sb.toString());
			for (AreaEstrutura areaEstrutura : sessaoCriteriosKey.getListEst()) {
				sb = new StringBuilder();
				sb.append('\n');
				pw.write(sb.toString());
				sb = new StringBuilder();
				sb.append(areaEstrutura.getNome());
				sb.append('\n');
				pw.write(sb.toString());
				sb = new StringBuilder();
				sb.append("TIPO");
				sb.append(';');
				sb.append("(Válidos /Total)");
				sb.append(';');
				sb.append("Valor Por item");
				sb.append(';');
				sb.append("pontuacao total");
				sb.append('\n');
				pw.write(sb.toString());
				for (CriterioEstrutura criterioEstrutura : areaEstrutura.getListCrit()) {
					for (ArrayList<TipoEstrutura> listTipo : criterioEstrutura.getListTipo()) {
						for (TipoEstrutura tipoEstrutura : listTipo) {
							sb = new StringBuilder();
							sb.append(criterioEstrutura.getCriterio() + " " + tipoEstrutura.getNomeTipo());
							sb.append(';');
							sb.append(tipoEstrutura.ItemValidos() + "/" + tipoEstrutura.getItemAnalisados().size());
							sb.append(';');
							sb.append(tipoEstrutura.getValor());
							sb.append(';');
							sb.append(tipoEstrutura.getValorTotalContabilizado());
							sb.append('\n');
							pw.write(sb.toString());

						}
					}
				}
				sb = new StringBuilder();
				sb.append(';');
				sb.append(';');
				sb.append("Valor total por area:");
				sb.append(';');
				sb.append(areaEstrutura.getValorTotalArea());
				sb.append('\n');
				pw.write(sb.toString());
			}
			pw.close();

			if (file != null) {
				response.setContentType("text/csv");
				response.setHeader("Content-Disposition", "attachment; filename=Relatorio.csv");
				FileCopyUtils.copy(new FileInputStream(file), response.getOutputStream());
				file.delete();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}



	}

}
