package potprogrami;

public class poslovanjeBanke {
	static final int Poslovnice = 10; /* Broj poslovnica i broj meseci */
	static final int Meseci = 12; /* u svrhu testiranja programa ove vrednosti mozemo smanjiti */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Unesite broj ponudjeni u meniju:";
		int izbor;
		double matrica[][] = new double[Poslovnice][Meseci];/*
															 * matrica ima velicinu poslovnice*meseci, radi brzeg rada
															 * racunara i memorije meseci su nam u kolonama
															 */
		int g = 7;
		int d = 0;
		System.out.println(str1 + "\n");
		do {
			prikaziMeni(); /* Ovaj potprogram ispisuje meni za korisnika i prikazuje moguce opcije */
			izbor = napraviIzbor(d, g); /* u ovom potprogramu korisnik bira iz menija */
			switch (izbor) {
			case 1:
				unosElemMatrice(matrica); /* potprogram za unos prihoda za svaku poslovnicu i mesec */
				ispisElemMatrice(matrica); /* ovaj potprogram nam ispisuje matricu */
				break;
			case 2:
				izmenaUnosa(matrica);/*
										 * potprogram omogucava izmenu prihoda za izabranu poslovnicu i mesec i ispisuje
										 * nam izmenjenu matricu
										 */
				break;
			case 3:
				mesecPrihodSve(matrica);/* potprogram ispisuje prihode za izabranu poslovnicu za svih 12 meseci */
				break;
			case 4:
				mesecniPrihodPoslovnice(matrica);/* potprogram izlistava prihode u svim poslovnicama za dati mesec */
				break;
			case 5:
				prihodMesecniNajveci(matrica);/*
												 * potprogram racuna najveci mesecni prihod, prikazuje u kom mesecu je
												 * bio i njegovu vrednost
												 */
				break;
			case 6:
				prihodGodisnjiUkupan(matrica);/* potprogram izracunava ukupan prihod za sve poslovnice i celu godinu */
				break;
			case 7:
				prihodProsekPoslovnice(
						matrica);/*
									 * potprogram izracunava i ispisuje prosecni godisnji prihod za svaku poslovnicu
									 */
				break;
			default: System.out.println("Uneli ste nula, program prekida sa radom");
			}
		} while (izbor != 0);
	}

	static int napraviIzbor(int donjaGranica, int gornjaGranica) {
		int n = 0;
		do {
			n = TextIO.getInt();
			if ((n < donjaGranica)	|| (n > gornjaGranica))/* gornja granica je broj ponudjenih opcija u meniju, a donja je 1 */
				System.out.println("Morate uneti vrednost u opsegu (" + donjaGranica + "-" + gornjaGranica + ")");

		} while ((n < donjaGranica) || (n > gornjaGranica));
		return n;
	}

	static void prikaziMeni() {
		System.out.println("Unesite 1 Za unos i ispis ostvarenog prihoda za odredjenu poslovnicu i mesec u godini\n"
				+ "\nUnesite 2 za izmenu prihoda za odredjenu poslovnicu i mesec u godini\n"
				+ "\nUnesite 3 za prikaz mesecnih prihoda za izabranu poslovnicu\n"
				+ "\nUnesite 4 za prikaz prihoda pojedinacnih poslovnica za izabrani mesec\n"
				+ "\nUnesite 5 ako zelite prikaz meseca sa najvecim ukupnim prihodom\n"
				+ "\nUnesite 6 ukoliko zelite prikaz ukupnog godisnjeg prihoda\n"
				+ "\nUnesite 7 ukoliko zelite da vidite koliko iznosi prosecni prihod za svaku poslovnicu");
	}

	static void unosElemMatrice(double[][] matElem) {
		int i = 0, j = 0;
		System.out.println("Unesite elemente matrice: ");
		for (i = 0; i < Poslovnice; i++) /* unos pojedinacnih vrednosti */
			for (j = 0; j < Meseci; j++) {
				System.out.print("X[" + (i + 1) + " , " + (j + 1) + "]" + "-->");
				matElem[i][j] = TextIO.getDouble();
			}

		System.out.println();
	}

	static void ispisElemMatrice(double[][] matElem) {
		int i = 0, j = 0;
		for (i = 0; i < Poslovnice; i++) {
			for (j = 0; j < Meseci; j++) {

				System.out.print(matElem[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void izmenaUnosa(double[][] matElem) {
		int i = 0, j = 0, izborPoslovnice, izborMeseca;
		System.out.print("koji element matrice zelite da izmenite? unesite broj poslovnice i mesec");
		izborPoslovnice = TextIO.getInt();
		izborMeseca = TextIO.getInt();
		System.out.println("Unesite vrednost datog elementa");
		matElem[izborPoslovnice - 1][izborMeseca - 1] = TextIO.getDouble();
		ispisElemMatrice(matElem);
	}

	static void mesecPrihodSve(double[][] matElem) {
		int j = 0;
		System.out.println("Izaberite poslovnicu  od mogucih " + Poslovnice
				+ " za koju zelite da vidite prihode ostvarene svakog meseca ");
		int Poslovnica;
		Poslovnica = TextIO.getInt();
		System.out.println("Za " + Poslovnica + ". poslovnicu prihodi svakog meseca su:");
		for (j = 0; j < Meseci; j++)
			System.out.print(matElem[Poslovnica - 1][j] + "  ");
		System.out.println();
	}

	static void mesecniPrihodPoslovnice(double[][] matElem) {
		int i = 0;
		System.out.println("Izaberite mesec  od " + Meseci + " za koji zelite da vidite prihode po poslovnicama ");
		int mesec;
		mesec = TextIO.getInt();
		System.out.println("Za " + mesec + ". mesec, prihodi su sledeci:");
		for (i = 0; i < Poslovnice; i++) {
			System.out.println(matElem[i][mesec - 1]);
		}
		System.out.println("\n");
	}

	static void prihodMesecniNajveci(double[][] matElem) {
		int pozicija = 0, j, i;
		double max_zbir = 0;
		for (j = 0; j < Meseci; j++) {
			double trenutni_zbir = 0;
			for (i = 0; i < Poslovnice; i++) {
				trenutni_zbir += matElem[i][j];

				if (trenutni_zbir > max_zbir) {
					max_zbir = trenutni_zbir;
					pozicija = j;
				}

			}
		}

		System.out.println("Mesec sa najvecim prihodom je :" + (pozicija + 1) + ". i iznosi " + max_zbir + "\n\n");

	}

	static void prihodGodisnjiUkupan(double[][] matElem) {
		double trenutni_zbir = 0;
		for (int i = 0; i < Poslovnice; i++) {
			for (int j = 0; j < Meseci; j++) {
				trenutni_zbir += matElem[i][j];
			}
		}
		System.out.println("Ukupan godisnji prihod je:");
		System.out.printf("%6.2f", trenutni_zbir);
		System.out.println();

	}

	static void prihodProsekPoslovnice(double[][] matElem) {
		double S;
		double AS;
		int i;
		int j;
		for (i = 0; i < Poslovnice; i++) {
			S = 0;
			for (j = 0; j < Meseci; j++)
				S = S + matElem[i][j];
			AS = S / Meseci;
			System.out.print(" Mesecni prosek za " + (i + 1) + ". poslovnicu je: ");
			System.out.printf("%.2f\n", AS);
		}

	}
}
