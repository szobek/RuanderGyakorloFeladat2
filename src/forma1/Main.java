package forma1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
static List<Versenyzo> versenyzok = new ArrayList<Versenyzo>();
	public static void main(String[] args) {
		Feladatok feladatok= new Feladatok();
		feladatok.olvasas(versenyzok);
		feladatok.adatok(versenyzok);
		feladatok.rajtszam(versenyzok);
		feladatok.listGbrs(versenyzok);
	}

}
