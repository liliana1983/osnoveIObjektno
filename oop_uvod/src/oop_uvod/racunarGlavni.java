package oop_uvod;

public class racunarGlavni {
	static final int brr = 7;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racunar komp[] = new Racunar[brr]; //pravimo niz objekata tipa Racunar
		int i, j;
		Racunar tmp;
		komp[0] = new Racunar("komp1", 8.02, 9);//dodeljujemo svakom clanu niza vrednosti, parametara (string, double, int)
		komp[1] = new Racunar("komp2", 2.3, 2);
		komp[2] = new Racunar("komp3", 3.6, 3);
		komp[3] = new Racunar("komp4", 4.7, 4);
		komp[4] = new Racunar("komp5", 5.9, 5);
		komp[5] = new Racunar("komp6", 1.3, 5);
		komp[6] = new Racunar("komp7", 2.5, 4);
		for (i = 0; i < brr; i++) {				//iz klase Racunar pozivamo racunanjeIndeksa() za sve clanove niza
			komp[i].racunanjeIndeksa();
		}

		for (i = 0; i < brr - 1; i++) {					//nova promenljiva tmp je tipa Racunar i sluzi kao pomocna promenljiva 
			for (j = i + 1; j < brr; j++)
				if (komp[i].racunanjeIndeksa() > komp[j].racunanjeIndeksa()) {
					tmp = komp[i];
					komp[i] = komp[j];					//sortiranje
					komp[j] = tmp;
				}
		}
		System.out.println();

		System.out.println("Racunari sortirani u rastucem nizu po indeksu performansi:\n");

		for (i = 0; i < brr; i++) {
			komp[i].stampajIndeksPerformansi();					//nakon sortiranja stampamo 
		}
	}

}
