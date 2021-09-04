package kompleksniZadaci;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SpisakKlijenata implements RadSaFajlovima,RadSaKlijentima{
private ArrayList<Klijent> spisak;
Klijent noviKlijent;
SpisakKlijenata(){
	
}
	@Override
	public void ucitajListu(String imeFajla) {
		Scanner s = null;
		ArrayList<Klijent> spisak = new ArrayList<Klijent>();
		try {
			s = new Scanner(new File(imeFajla));
			do {
				String ime = s.next();
				String prezime = s.next();
				String jmbg = s.next();
				Klijent noviKlijent = new Klijent(ime, prezime, jmbg);
				spisak.add(noviKlijent);
			} while (s.hasNext());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
		this.spisak = spisak;
	}

	@Override
	public void upisiListu(String imeFajla) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(imeFajla));
			for (Klijent noviKlijent : this.spisak)
				pw.println(noviKlijent.getIme() + " " + noviKlijent.getPrezime() + " " + noviKlijent.getJmbg());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		
	}

	
	@Override
	public void brisanjeKlijenata(Klijent imeOsobe) {
		Klijent brisaniGari = new Klijent();
		if (brisaniGari.getIme().equals(imeOsobe))
			spisak.remove(brisaniGari);
		
	}
	@Override
	public void dodajKlijenta(Klijent k) {
		spisak.add(k);
		
	}
	@Override
	public Klijent pronadjiKlijenta(String jmbg) {
		Klijent pronadjiGarija = new Klijent();
		for (int i = 0; i < spisak.size(); i++)
			if (pronadjiGarija.getJmbg().equals(jmbg))
				return pronadjiGarija;
		return null;
	}

}
