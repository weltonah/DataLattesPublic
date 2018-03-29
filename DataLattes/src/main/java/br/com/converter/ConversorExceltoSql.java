package br.com.converter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ConversorExceltoSql {

	public static void main(String[] args) throws UnsupportedEncodingException {
		File file = new File("/home/welton/Downloads" + "/qualis" + "utf82" + ".csv");
		try {
			// Le o arquivo por linha separado por ; e ENTER(\n)
			Scanner scanner = new Scanner(new FileReader(file)).useDelimiter("\";\"|\n");
			// Pula linha
			int i=0;
			String a1 = scanner.next().replaceAll("\"", "").replaceAll("-", "");
			String a2 = scanner.next().replaceAll("\"", "").replaceAll("  ", " ");
			String a3 = scanner.next().replaceAll("\"", "").replaceAll("  ", " ");
			String a4 = scanner.next().replaceAll("\"", "");

			while (scanner.hasNext()) {
				// Pega o nome
				a1 = scanner.next().replaceAll("\"", "").replaceAll("-", "");
				a2 = scanner.next().replaceAll("\"", "").replaceAll("  ", " ");
				a3 = scanner.next().replaceAll("\"", "").replaceAll("  ", " ");
				a4 = scanner.next().replaceAll("\"", "").replaceAll("  ", " ");

				String text = " INSERT INTO Qualis (ISSN, TITULO,AREA, ESTRATO) \n " + "VALUES ('" + a1 + "', '" + a2
						+ "', '" + a3 + "', '" + a4 + "'); ";
				System.out.println(text);


				i++;
			}
		} catch (FileNotFoundException ex) {
		}

	}

}
