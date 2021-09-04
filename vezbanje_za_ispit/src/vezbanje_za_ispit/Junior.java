package vezbanje_za_ispit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Junior {

	public static void main(String[] args) {

	// TODO Auto-generated method stub

		Scanner s = null;
		ArrayList<Programer> spisakProgramera = new ArrayList<Programer>();
		try {
			s = new Scanner(new File(imeFajla));
			do {
				String ime = s.next();
				String prezime = s.next();
				int starost = s.nextInt();
				String iskustvo = s.next();
				double plata = s.nextDouble();
				Programer noviProgramer = new Programer(ime, prezime, starost, iskustvo, plata);
				spisakProgramera.add(noviProgramer);
			} while (s.hasNext());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (s != null) {
				s.close()..args.....args.....args...args..args.....args...args...args...args..args...args....args...args..;
			}
		}
	}
}
}