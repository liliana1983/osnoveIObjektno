package matrice_vezbanje;

import java.util.Scanner;

public class ManipulacijaMatricom {
	final static int MAXVRSTA = 10;
	final static int MAXKOLONA = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sumVrsta = new int[MAXVRSTA];
		int[] sumKolona = new int[MAXKOLONA];
		int Nvr = 1;
		int Nkol = 1;
		int i, j;
		int maxi, maxj;
		int[][] matrica = new int[MAXVRSTA][MAXKOLONA];
		System.out.println("Program za manipulaciju matricom prirodnih brojeva.\n\n");
		System.out.println("Unesite broj vrsta:\t");
		Scanner sc = new Scanner(System.in);
		Nvr = sc.nextInt();
		System.out.println("Unesite broj kolona:\t");
		Nkol = sc.nextInt();
		for (i = 0; i < Nvr; i++)
			for (j = 0; j < Nkol; j++) {
				System.out.println("Unesite element matrice na koordinati [" + (i + 1) + "][" + (j + 1) + "]:\t");
				matrica[i][j] = sc.nextInt();
			}
		System.out.println();
		System.out.println();
		System.out.println("elementi matrice po vrstama su:");
		for (i = 0; i < Nvr; i++) {
			for (j = 0; j < Nkol; j++) {
				System.out.print(" " + matrica[i][j] + " ");
			}
			System.out.println();

		}
		maxi = 0;
		maxj = 0;
		for (i = 0; i < Nvr; i++)
			for (j = 0; j < Nkol; j++)
				if (matrica[maxi][maxj] < matrica[i][j]) {
					maxi = i;
					maxj = j;
				}
		System.out.println("Maksimalna vrednost elemenata matrice iznosi " + matrica[maxi][maxj] + " i nalazi se u "
				+ (maxi + 1) + "vrsti i " + (maxj + 1) + " koloni.");
		System.out.println();
		System.out.println();
		for (i = 0; i < Nvr; i++) {
			for (j = 0; j < Nkol; j++)
				sumVrsta[i] += matrica[i][j];
			System.out.println("Suma elemenata " + (i + 1) + " vrste je : " + sumVrsta[i] + ".");
		}
		System.out.println();

		for (j = 0; j < Nkol; j++) {
			for (i = 0; i < Nvr; i++)
				sumKolona[j] += matrica[i][j];
			System.out.println("suma elemenata " + (j + 1) + " kolone je: " + sumKolona[j] + ".");
		}
		System.out.println();
		int pozMaksPoKoloni = 0;
		for (i = 0; i < Nvr; i++)
			if (sumKolona[i] > sumKolona[pozMaksPoKoloni])
				pozMaksPoKoloni = i;
		System.out.println("Najveca je suma po koloni: " + (pozMaksPoKoloni + 1) + "i ona iznosi: "
				+ sumKolona[pozMaksPoKoloni] + ".");
		System.out.println();
		int pozMinUVrsti;
		int kojaVrsta;
		do {
			System.out.println("Unesite vrstu ciji minimum trazimo: \t");
			kojaVrsta = sc.nextInt();
		} while ((kojaVrsta < 1) || (kojaVrsta > Nvr));
		kojaVrsta--;
		pozMinUVrsti = 0;
		for (j = 1; j < Nkol; j++)
			if (matrica[kojaVrsta][pozMinUVrsti] > matrica[kojaVrsta][j])
				pozMinUVrsti = j;
		System.out.println("Najmanja vrednost u " + (kojaVrsta + 1) + ". vrsti se nalazi u " + (pozMinUVrsti + 1)
				+ ".koloni i iznosi: " + matrica[kojaVrsta][pozMinUVrsti] + ".");

	}
}
