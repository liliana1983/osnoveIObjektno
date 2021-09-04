package poslovanjeRestorana;

/**/

public class Jelo {
	private String imeJela;
	private String tip;
	private double cena;

	Jelo() {

	}

	Jelo(String imeJela, String tip, double cena) {
		this.imeJela = imeJela;
		this.tip = tip;
		this.cena = cena;

	}

	public String getImeJela() {
		return imeJela;
	}

	public String getTip() {
		return tip;
	}

	public double getCena() {
		return cena;
	}

}