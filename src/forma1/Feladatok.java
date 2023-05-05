package forma1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Feladatok {
	public void olvasas(List<Versenyzo> versenyzok) {
		System.out.println("2. feladat");

		new FileHandling().readFile("rajtszamok.csv", ";", versenyzok);
	}

	public void adatok(List<Versenyzo> versenyzok) {
		System.out.println("3. feladat");
		System.out.println(versenyzok.size() + "db adat van");
	}

	public void rajtszam(List<Versenyzo> versenyzok) {
		System.out.println("4. feladat");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Adja meg a rajtszámot");
		int rajtszam = Integer.parseInt(scanner.nextLine());
		int i = 0;
		while (i < versenyzok.size() && rajtszam != versenyzok.get(i).getRajtszam()) {
			i++;
		}
		if(i<versenyzok.size()) {
			System.out.println(versenyzok.get(i).toString());
		}else {
			System.out.println("Nincs ilyen");
		}
	}
	
	public void listGbrs(List<Versenyzo> versenyzok) {
		System.out.println("5. feladat");
		List<Versenyzo> angolok = new ArrayList<Versenyzo>();
		for(Versenyzo versenyzo:versenyzok) {
			if(versenyzo.getCountryCode().equals("GBR")) {
				angolok.add(versenyzo);
			}
		}
		System.out.println("Az angol versenyzõk mennyisége: "+angolok.size()+", és a neveik:");
		for(Versenyzo angol:angolok) {
			System.out.println(angol.getName());
		}
	}
	
	public void startName(List<Versenyzo> versenyzok) {
		System.out.println("6. feladat");
		for(Versenyzo versenyzo:versenyzok) {
			if(versenyzo.getName().split(" ")[1].charAt(0)=='H') {
				System.out.println(versenyzo.getName()+" "+versenyzo.getRajtszam());
			}
		}
		
	}
	
	public void writeFile(List<Versenyzo> versenyzok) {
		Map<String, Integer> lista = new HashMap<String,Integer>();
		for (Versenyzo versenyzo : versenyzok) {
			  
			  if (lista.containsKey(versenyzo.getCountryCode())) {
				  
				  lista.replace(versenyzo.getCountryCode(), lista.get(versenyzo.getCountryCode())+1);
				  
			  }
			  else {
				  
				  lista.put(versenyzo.getCountryCode(), 1);
			  }
			  
		  }
		try {
			new FileHandling().writeFile(lista);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fájlba írás kész");
	}
	
}
