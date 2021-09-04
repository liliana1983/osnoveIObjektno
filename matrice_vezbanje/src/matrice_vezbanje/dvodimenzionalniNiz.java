package matrice_vezbanje;

public class dvodimenzionalniNiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int kolona = 10;
		final int red = 10;
		int k = 1;
		int r = 1;
		int i = 0, j = 0, s = 0;
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
		System.out.println("Clanovi na glavnoj dijagonali su: ");
		for (i = 0; i < r; i++)
			for (j = 0; j < k; j++)
				if (i == j)
					System.out.println(matrica[i][j] + " ");
		System.out.println();
		for (i = 0; i < r; i++) {
			for (j = 0; j < k; j++)
				s = s + matrica[i][j];
		}
		System.out.println("Suma clanova : " + s);
		for (i = 0; i < r; i++) {
			for (j = 0; j < k; j++) {
				if (max < matrica[i][j])
					max = matrica[i][j];
			}
		}
		System.out.println("Najveci clan matrice : "+max);
	}
}
