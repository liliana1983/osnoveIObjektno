package elektronsko_poslovanje;

import java.util.Arrays;

public class Poslasticarnica extends Prodavnica implements Imenovanje {
	@Override
	public String toString() {
		return "Poslasticarnica [imeKompanije=" + imeKompanije + ", stavkaMenija=" + Arrays.toString(stavkaMenija)
				+ "]";
	}

	private String imeKompanije;

	private String[] stavkaMenija = { "Sladoled", "Torta", "Krofna", "Kafa", "Caj", "Limunada" };

	public Poslasticarnica(String imeKompanije, int maxBrKlijenata) {
		super(maxBrKlijenata, maxBrKlijenata);
		this.imeKompanije = imeKompanije;
	}

	@Override
	public String pribaviImeProdavnice() {
		return imeKompanije;
	}

	@Override
	public void postaviImeProdavnice(String ime) {
		this.imeKompanije = ime;
	}

	@Override
	public String[] uzmiIzInventara() {
		return stavkaMenija;
	}

	@Override
	public void nabaviInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal " + artikal);
	}

	@Override
	public int obracunajPlate(SpisakZaposlenih spisakZaposlenih) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float prikaziStanjeRacuna() {
		// TODO Auto-generated method stub
		return 0;
	}

}
