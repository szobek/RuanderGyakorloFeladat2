package forma1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
static List<Versenyzo> versenyzok = new ArrayList<Versenyzo>();
	public static void main(String[] args) {
		System.out.println("2. feladat");

		new FileHandling().readFile("rajtszamok.csv", ";", versenyzok);
		System.out.println("3. feladat");
		System.out.println(versenyzok.size()+"db adat van");
		System.out.println("4. feladat");
		Scanner scanner = new Scanner(System.in);
		
	}

}
