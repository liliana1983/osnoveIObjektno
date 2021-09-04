package definisanje_nizova;

public class maxMatrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXVRSTA = 10;
		final int MAXKOLONA = 20;
		int Nvr = 1, Nkol = 1, i = 0, j = 0;
		int max;
		int pozicijaVrste;
		pozicijaVrste = 0;
		int pozicijaKolone;
		pozicijaKolone = 0;
		int[][] Matrica = new int[MAXVRSTA][MAXKOLONA];
		System.out.println("Program za pronalazenje maksimuma u matrici i njegove pozicije u matrici.\n\n");
		System.out.println("Unesite broj vrsta:\t"); // prihvati broj vrsta i kolona
		Nvr = TextIO.getlnInt();
		System.out.println("\nUnesite broj kolona:\t");
		Nkol = TextIO.getlnInt();
		for (i = 0; i < Nvr; i++) // prihvati elemente matrice od korisnika
			for (j = 0; j < Nkol; j++) {
				System.out.println("Unesite element matrice na koordinati [" + (i + 1) + "][" + (j + 1) + "]:\t");
				Matrica[i][j] = TextIO.getlnInt();
			}
		max = Matrica[0][0];
		for (i = 0; i < Nvr; i++)
			for (j = 0; j < Nkol; j++) {
				if (max < Matrica[i][j]) {
					max = Matrica[i][j];
					pozicijaVrste = i;
					pozicijaKolone = j;
				}

				System.out.println("Maksimum u vrsti" + i + "je" + max + "na poziciji" + (pozicijaVrste + 1)
						+ (pozicijaKolone + 1));
			}

	}

}
