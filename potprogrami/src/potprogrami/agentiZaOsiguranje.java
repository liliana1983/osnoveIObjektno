package potprogrami;

public class agentiZaOsiguranje {
	static final  int MAXVRSTA = 3;
	static final int MAXKOLONA = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str1 = "Unesite broj ponudjeni u meniju";
		int izbor;
		double matrica[][] = new double[MAXVRSTA][MAXKOLONA];
		int g = 7;
		int d = 0;
		do {
			System.out.println(str1);
			prikaziMeni();
			izbor = napraviIzbor(str1, d, g);
			switch (izbor) {
			case 1:
				unosElemMatrice(matrica);
				ispisElemMatrice(matrica);
				break;
			case 2:
				izmenaUnosa(matrica);
				break;
			case 3:
				sortiranjeDani(matrica);
				break;
			case 4:
				sortiranjeKategorije(matrica);
				break;
			case 5:
				prihodDnevniNajmanji(matrica);
				break;
			case 6:
				prihodMesecniUkupan(matrica);
				break;
			case 7:
				prihodProsekMesecni(matrica);
				break;

			}
		} while (izbor != 0);
	}

	static int napraviIzbor(String poruka, int dole, int gore) {
		int vrati = 0;
		do {
			vrati = TextIO.getInt();
			if ((vrati < dole) || (vrati > gore))
				System.out.println("Morate uneti vrednost u opsegu (" + dole + "-" + gore + ")");

		} while ((vrati < dole) || (vrati > gore));
		return vrati;
	}

	static void prikaziMeni() {
		System.out.println("Unesite 1 Za unos i ispis ostvarenog prihoda za zadatu kategoriju i dan u mesecu\n"
				+ "Unesite 2 za izmenu oprihoda za zadatu kategoriju osiguranja i dan u mesecu\n"
				+ "Unesite 3 za prikaz rezultata sortiran po kategorijama osiguranja za izabrani dan\n"
				+ "Unesite 4 za prikaz rezultata sortiran po danima u mesecu za izabranu kategoriju\n"
				+ "Unesite 5 ako zelite da prikaz najmanjeg ostvarenog prihoda\n"
				+ "Unesite 6 ukoliko zelite prikaz ukupnog mesecnog prihoda za svaku kategoriju\n"
				+ "Unesite 7 ukoliko zelite da vidite koliko iznosi prosecni mesecni prihod");
	}

	static void unosElemMatrice(double[][] matElem) {
		int i = 0, j = 0;
		System.out.println("Unesite elemente matrice: ");
		for (i = 0; i < MAXVRSTA; i++)
			for (j = 0; j < MAXKOLONA; j++) {
				System.out.print("X[" + (i + 1) + " , " + (j + 1) + "]" + "-->");
				matElem[i][j] = TextIO.getDouble();
			}

		System.out.println();
	}

	static void ispisElemMatrice(double[][] matElem) {
		int i = 0, j = 0;
		for (i = 0; i < MAXVRSTA; i++) {
			for (j = 0; j < MAXKOLONA; j++) {

				System.out.print(matElem[i][j] + " ");
			}
			System.out.println();
		}

	}

	static void izmenaUnosa(double[][] matElem) {
		int i = 0, j = 0, izborReda, izborKolone;
		do {
			System.out.print("koji elementa matrice zelite da izmenite? unesite redni broj kategorije i redni broj dana");
			izborReda = napraviIzbor( "", 0,MAXVRSTA);
			izborKolone = napraviIzbor("", 0, MAXKOLONA);
			System.out.println("Unesite vrednost datog elementa");
			matElem[izborReda - 1][izborKolone - 1] = TextIO.getDouble();
			for (i = 0; i < MAXVRSTA; i++) {
				for (j = 0; j < MAXKOLONA; j++) {

					System.out.print(matElem[i][j] + "  ");
				}

				System.out.println();
			}
		} while (izborReda != 0 || izborKolone != 0);

	}

	static void sortiranjeDani(double[][] matElem) {
		int i = 0;
		//System.out.println("Izaberite dan  od mogucih 30 za koji zelite da vidite rezultate po kategorijama ");
		int dan;
		dan = napraviIzbor("Izaberite dan  od mogucih 30 za koji zelite da vidite rezultate po kategorijama",1,MAXKOLONA);
		System.out.println("Za " + dan + ". dan rezultat po kategorijama je:");
		for (i = 0; i < MAXVRSTA; i++)
			System.out.println(matElem[i][dan - 1]);
	}

	static void sortiranjeKategorije(double[][] matElem) {
	int i=0,j = 0;
		//System.out.println("Izaberite kategoriju od mogucih 5 za koju zelite da vidite prihod izlistan za 30 dana");
		int kategorija;
		kategorija = napraviIzbor("Izaberite kategoriju od mogucih 5 za koju zelite da vidite prihod izlistan za 30 dana",1,MAXVRSTA);
		System.out.println("Za " + kategorija + ".  rezultat po danima je:");
		for(j=0;j<MAXKOLONA;j++)
			System.out.println(matElem[kategorija-1][j]);
		
	}

	static void prihodDnevniNajmanji(double[][] matElem) {
		int pozicija = 0;
		double min_zbir=0;
		for (int j = 0; j < 30; j++) {
			
			double  trenutni_zbir = 0;
			for (int i = 0; i < 5; i++) {
				trenutni_zbir += matElem[i][j];
				if (j==0) {
					min_zbir=trenutni_zbir;
				}
				if (trenutni_zbir < min_zbir) {
					min_zbir = trenutni_zbir;
					pozicija = j;
				}

			}
		}

		System.out.println("Dan sa minimalnim prihodom je :" + (pozicija + 1) + " i iznosi" + min_zbir);
	}

	static void prihodMesecniUkupan(double[][] matElem) {
		double trenutni_zbir = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 30; j++) {
				trenutni_zbir += matElem[i][j];
			}
			System.out.println("Mesecni prihod je:" + trenutni_zbir);}
		

	}

	static void prihodProsekMesecni(double[][] matElem) {
		double S = 0;
		int i, j;
		for (j = 0; j < 30; j++)
			for (i = 0; i < 5; i++)
				S = S + matElem[i][j];
		double AS;
		AS = S / MAXKOLONA;
		System.out.println("Prosecni mesecni prihod je :" + (AS));
	}
//	static void sortiranje(double[][]matElem) {
	//	int i, j;
	//	System.out.println(
	//			"Izaberite po kom danu zelite da izvrsite sortiranje");
	//	int izbor;
	//	izbor = TextIO.getInt();
	//	for (i = 0; i < 5; i++)
	//		for (j = i + 1; j < 30; j++)
	//			if (matElem[i][izbor-1].compareTo(matElem[j][izbor-1]) > 0)
	//				zamena(matElem, i, j);
	//}

//	static void zamena(double[][] polaznici, int koga, int kim) {
//		int i = 0;
//		String podatakOPolazniku;
	//	for (i = 0; i < 4; i++) {
	//		podatakOPolazniku = polaznici[koga][i];
		//	polaznici[koga][i] = polaznici[kim][i];
		//	polaznici[kim][i] = podatakOPolazniku;
	//	}
	//}
}
