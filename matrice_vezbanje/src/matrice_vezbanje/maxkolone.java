package matrice_vezbanje;

public class maxkolone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int kolona = 10;
		final int red = 10;
		int k = 1;
		int r = 1;
		int i = 0, j = 0;
		int max_zbir = 0, trenutni_zbir, pozicija = 0;
		int matrica[][] = new int[red][kolona];
		int max = matrica[0][0];
		System.out.println("Unesite broj redova i broj kolona");
		r = TextIO.getInt();
		k = TextIO.getInt();
		System.out.println("ucitaj clanove matrice:");
		for (i = 0; i < r; i++) {
			for (j = 0; j < k; j++) {
				System.out.print("X[" + (i + 1) + " , " + (j + 1) + "]" + "-->");
				matrica[i][j] = TextIO.getInt();
			}
		}

		for (i = 0; i < r; i++) {
			for (j = 0; j < k; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		for (j = 0; j < k; j++) {
			trenutni_zbir = 0;
			for (i = 0; i < r; i++) {
				trenutni_zbir += matrica[i][j];
				
					if (trenutni_zbir > max_zbir)
						{max_zbir = trenutni_zbir;
					pozicija = j;}
				
			}
		}

		System.out.println("Indeks kolone sa maksimalnim zbirom je:" + (pozicija+1));
	}
}
