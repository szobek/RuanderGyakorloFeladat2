package forma1;

public class Versenyzo {
	private int rajtszam;
	private String countryCode;
	private String name;

	public Versenyzo(int rajtszam, String countryCode, String name) {
		super();
		this.rajtszam = rajtszam;
		this.countryCode = countryCode;
		this.name = name;
	}

	public Versenyzo(String[] csvLine) {
		this.rajtszam = Integer.parseInt(csvLine[0]);
		this.countryCode=csvLine[1];
		this.name = csvLine[2];
	}

	@Override
	public String toString() {
		return "Versenyzõ rajtszáma: " + rajtszam + ", országkódja: " + countryCode + ", neve: " + name;
	}

	public int getRajtszam() {
		return rajtszam;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getName() {
		return name;
	}

}
