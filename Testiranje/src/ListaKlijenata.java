

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaKlijenata implements RadSaFajlovima, RadSaKlijentima {
	private ArrayList<Klijent> spisak;
	Klijent noviKlijent;

	ListaKlijenata() {

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
				String adresa = s.next();
				String telefon = s.next();
				Klijent noviGari = new Klijent(ime, prezime, adresa, telefon);
				spisak.add(noviGari);
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
			for (Klijent noviGari : this.spisak)
				pw.println(noviGari.getIme() + " " + noviGari.getPrezime() + " " + noviGari.getTelefon() + " "
						+ noviGari.getAdresa());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}

	@Override
	public void brisanjeKlijenata(Klijent brisaniGari) {
		pronadjiKlijenta(brisaniGari.getTelefon());
		spisak.remove(brisaniGari);
	}

	@Override
	public void dodajKlijenta(Klijent k) {
		spisak.add(k);

	}

	@Override
	public Klijent pronadjiKlijenta(String telefon) {
		Klijent pronadjenGari = null;
		for (int i = 0; i < spisak.size(); i++) 
			if (spisak.get(i).getTelefon().equals(telefon))
				pronadjenGari=spisak.get(i);
				return pronadjenGari;
	}

}
