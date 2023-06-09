package forma1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

public class FileHandling {

	public void readFile(String file, String delimiter, List<Versenyzo> lista) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));) {

			br.readLine();
			while (br.ready()) {
				lista.add(new Versenyzo(br.readLine().split(delimiter)));
			}

		} catch (UnsupportedEncodingException e) {
			System.out.println("Rossz f�jl k�dol�s");
		} catch (FileNotFoundException e) {
			System.out.println("Nincs ilyen f�jl!!");
		} catch (IOException e) {
			System.out.println("I/O hiba");
		}

		System.out.println("Sikeres f�jl olvas�s");

	}

	public void writeFile(Map<String, Integer> lista) throws IOException {
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("orszagok.csv"), "UTF-8");
		for (Map.Entry<String, Integer> orszagLetszam : lista.entrySet()) {

			if (orszagLetszam.getValue() > 1) {

				writer.write(orszagLetszam.getKey() + ";" + orszagLetszam.getValue() + "\n");

			}

		}
		writer.close();

	}
}
