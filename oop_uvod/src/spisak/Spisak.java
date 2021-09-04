package spisak;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Spisak {
	private ArrayList<Osoba> spisak;

	Spisak() {
	}

	void ucitajListu(String imeFajla) {
		Scanner s = null;
		ArrayList<Osoba> spisak = new ArrayList<Osoba>();
		try {
			s = new Scanner(new File(imeFajla));
			do {
				String ime = s.next();
				String prezime = s.next();
				String jmbg = s.next();
				Osoba noviPolaznik = new Osoba(ime, prezime, jmbg);
				spisak.add(noviPolaznik);
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

	public void sortirajListu() {
		Collections.sort(this.spisak, new MojKomparator());
	}

	public void stampajListu() {
		System.out.println(Arrays.toString(this.spisak.toArray()));
	}

	public void upisiListu(String imeFajla) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(imeFajla));
			for (Osoba polaznik : this.spisak)
				pw.println(polaznik.getIme() + " " + polaznik.getPrezime() + " " + polaznik.getJmbg());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
