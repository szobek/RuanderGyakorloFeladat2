package forma1;

import java.util.List;
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
}
