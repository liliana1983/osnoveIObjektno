package vezbanje_za_ispit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import poslovanjeRestorana.Klijent;

public class CitanjeFajla {
	public void ucitajFajl(String imeFajla) {
		Scanner s = null;
		ArrayList<Programer> spisak = new ArrayList<Programer>();
		try {
			s = new Scanner(new File(imeFajla));
			while (s.hasNext()) {
				String ime = s.next();
				String prezime = s.next();
				int starost = s.nextInt();
				String iskustvo = s.next();
				double plata=s.nextDouble();
				Programer noviGari = new Programer(ime, prezime, starost, iskustvo,plata);
				spisak.add(noviGari);
			} 
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
		this.spisak = spisak;
	}

}
