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

	public void readFile(String file,String delimiter,List<Versenyzo> lista) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));){
			
			br.readLine();
			while(br.ready()) {
				lista.add(new Versenyzo(br.readLine().split(delimiter)));
			}
			
			
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Sikeres fájl olvasás");
		
	}
	
	public void writeFile(Map<String, Integer> lista) throws IOException {
		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("orszagok.csv"),"UTF-8");
		for (Map.Entry<String,Integer> orszagLetszam : lista.entrySet()) {
			  
			  if (orszagLetszam.getValue()>1) {
				  
				  writer.write(orszagLetszam.getKey()+";"+orszagLetszam.getValue()+"\n");
				  
			  }
			  
		  }
		writer.close();
		
	}
}
