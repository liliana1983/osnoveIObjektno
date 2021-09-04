package potprogrami;

public class radKelnera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXVRSTA = 10;
		final int MAXKOLONA = 8;
		String str1 = "da";
		String str2;
		int matrica[][] = new int[MAXVRSTA][MAXKOLONA];
		unosElemMatrice(matrica);
		ispisElemMatrice(matrica);
		izmenaUnosa(matrica);
		sortiranjeDani(matrica);
		sortiranjePice(matrica);
		do {
			System.out.println("Da li zelite da izmenite iznos za odredjeni sat i pice? da/ne");
			str2 = TextIO.getWord();
			if (str1.equalsIgnoreCase(str2))
				izmenaUnosa(matrica);
		} while (str1.equalsIgnoreCase(str2));

		do {
			System.out.println("Da li zelite da imate uvid u prihod po odredjenom satu za sva pica? da/ne");
			str2 = TextIO.getWord();
			if (str1.equalsIgnoreCase(str2))
				sortiranjeDani(matrica);
		} while (str1.equalsIgnoreCase(str2));

		do {
			System.out.println();
			System.out.println("Da li zelite da imate uvid u prihod po odredjenom picu za ceo radni dan? da/ne");
			str2 = TextIO.getWord();
			if (str1.equalsIgnoreCase(str2))
				sortiranjePice(matrica);
		} while (str1.equalsIgnoreCase(str2));
		prihodProsekSat(matrica);
		prihodDnevniNajveci(matrica);
		prihodDnevniUkupan(matrica);
	}

	/*
	 * for (i = 0; i < r; i++) { for (j = 0; j < k; j++) {
	 * System.out.print(matrica[i][j] + " "); } System.out.println(); }
	 * 
	 * for (j = 0; j < kolona; j++) { trenutni_zbir = 0; for (i = 0; i < r; i++) {
	 * trenutni_zbir += matrica[i][j];
	 * 
	 * if (trenutni_zbir > max_zbir) {max_zbir = trenutni_zbir; pozicija = j;}
	 * 
	 * } } System.out.println("Najveca zarada je bila: " +
	 * (pozicija+1)+". dan u nedelji");
	 */

	static void unosElemMatrice(int[][] matElem) {
		int i = 0, j = 0;
		System.out.println("Unesite elemente matrice: ");
		for (i = 0; i < 10; i++)
			for (j = 0; j < 8; j++) {
				System.out.print("X[" + (i + 1) + " , " + (j + 1) + "]" + "-->");
				matElem[i][j] = TextIO.getInt();
			}

		System.out.println();
	}

	static void ispisElemMatrice(int[][] matElem) {
		int i = 0, j = 0;
		System.out.println("1h 2h 3h 4h 5h 6h 7h 8h ");
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 8; j++) {

				System.out.print(matElem[i][j] + " ");
			}
			System.out.println();
		}

	}

	static void izmenaUnosa(int[][] matElem) {
		int i = 0, j = 0, izborReda, izborKolone;
		System.out.print("koji elementa matrice zelite da izmenite? unesite redni broj pica i redni broj dana");
		izborReda = TextIO.getInt();
		izborKolone = TextIO.getInt();
		System.out.println("Unesite vrednost datog elementa");
		matElem[izborReda - 1][izborKolone - 1] = TextIO.getInt();

		System.out.println("1h 2h 3h 4h 5h 6h 7h 8h ");

		for (i = 0; i < 10; i++) {
			for (j = 0; j < 8; j++) {

				System.out.print(matElem[i][j] + "  ");
			}

			System.out.println();
		}
	}

	static void sortiranjeDani(int[][] matElem) {
		int i = 0;
		System.out.println("Izaberite sat za koji zelite da vidite prihod za svako pice");
		int sat;
		sat = TextIO.getInt();
		System.out.println("Za " + sat + ". sat radnog vremena prihod po picima je:");
		for (i = 0; i < 10; i++)
			System.out.println(matElem[i][sat - 1]);
	}

	static void sortiranjePice(int[][] matElem) {
		int  j = 0;
		System.out.println("Izaberite pice za koje zelite da vidite prihod svakog sata");
		int pice;
		pice = TextIO.getInt();
		System.out.println("Za " + pice + ". prihod tokom radnog vremena po satu je: ");
		for (j = 0; j < 8; j++)
			System.out.print(matElem[pice - 1][j]);
	}

	static void prihodDnevniNajveci(int[][] matElem) {
		int pozicija = 0;
		for (int j = 0; j < 8; j++) {
			int trenutni_zbir = 0, max_zbir = 0;
			for (int i = 0; i < 10; i++) {
				trenutni_zbir += matElem[i][j];

				if (trenutni_zbir > max_zbir) {
					max_zbir = trenutni_zbir;
					pozicija = j;
				}

			}
		}

		System.out.println("Sat sa maksimalnim prihodom je:" + (pozicija + 1));
	}

	static void prihodDnevniUkupan(int[][] matElem) {
		int trenutni_zbir = 0;
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 10; i++) {
				trenutni_zbir += matElem[i][j];
			}
		}
		System.out.println("Dnevni prihod je:" + trenutni_zbir);

	}

	static void prihodProsekSat(int[][] matElem) {
		int S = 0, i, j;
		for (j = 0; j < 8; j++)
			for (i = 0; i < 10; i++)
				S = S + matElem[i][j];
		double AS;
		AS = S / 10;
		System.out.println("Prosek prihoda po satu je:" + (AS));
	}

	static void prihodPice(int[][] matElem) {
		int pozicija = 0;
		for (int i = 0; i < 10; i++) {
			int trenutni_zbir = 0, max_zbir = 0;
			for (int j = 0; j < 8; j++) {
				trenutni_zbir += matElem[i][j];

				if (trenutni_zbir > max_zbir) {
					max_zbir = trenutni_zbir;
					pozicija = i;
				}
			}
		}
		System.out.println("Pice sa maksimalnim prihodom je:" + (pozicija + 1));
	}
}
