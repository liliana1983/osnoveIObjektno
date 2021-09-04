package kompleksniZadaci;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Banka implements RadSaKlijentima, RadSaTransakcijama {
	 ArrayList<Klijent> klijenti;
	 ArrayList<Transakcija> transakcije;

	public Banka() {
		super();
		this.klijenti = new ArrayList<Klijent>();
		this.transakcije = new ArrayList<Transakcija>();
	}

	

	@Override
	public boolean izvrsiInternuTransakciju(Klijent posiljalac, Klijent primalac, float iznos) {
float stanjePosiljalac=posiljalac.getBrojRacuna().getStanje();
float stanjePrimalac=primalac.getBrojRacuna().getStanje();
if(stanjePosiljalac>=iznos) {
	posiljalac.getBrojRacuna().setStanje(stanjePrimalac-iznos);
	primalac.getBrojRacuna().setStanje(stanjePrimalac+iznos);
	transakcije.add(new Transakcija(primalac,posiljalac,iznos,true));
	return true;
}else {	System.out.println("Nema dovoljno sredstava kod posiljaoca");
	}

		return false;
	}

	@Override
	public void brisanjeKlijenata(Klijent imeOsobe) {
		Klijent brisaniGari = new Klijent();
		if (brisaniGari.getIme().equals(imeOsobe))
			klijenti.remove(brisaniGari);

	}

	@Override
	public void dodajKlijenta(Klijent k) {
		klijenti.add(k);

	}

	@Override
	public Klijent pronadjiKlijenta(String jmbg) {
		Klijent pronadjiGarija = null;
		for (int i = 0; i < klijenti.size(); i++)
			if (pronadjiGarija.getJmbg().equals(jmbg))
				return pronadjiGarija;
		return null;
	}

}
