package matrice_vezbanje;

public class prodavnicaZarada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int red = 7;
		int r = 1;
		int i = 0, j = 0;
		int max_zbir, trenutni_zbir = 0, pozicija = 0;
		max_zbir = 0;
		String daniNedelje[] = { "ponedeljak", "utorak", "sreda", "cetvrtak", "petak", "subota", "nedelja" };
		final int kolona = daniNedelje.length;
		int matrica[][] = new int[red][kolona];
		System.out.println("Unesite broj prodavnica");
		r = TextIO.getInt();
		System.out.println("unesite zaradu na dnevnom nivou po danima, pocevsi od ponedeljka:");
		for (i = 0; i < r; i++) {
			for (j = 0; j < kolona; j++) {
				System.out.print("X[" + (i + 1) + " , " + (j + 1) + "]" + "-->");
				matrica[i][j] = TextIO.getInt();
			}
		}
		for (i = 0; i < r; i++) {
			for (j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

		for (j = 0; j < kolona; j++) {
			trenutni_zbir = 0;
			for (i = 0; i < r; i++) {
				trenutni_zbir += matrica[i][j];
				
					if (trenutni_zbir > max_zbir)
						{max_zbir = trenutni_zbir;
					pozicija = j;}
				
			}
		}
		System.out.println("Najveca zarada je bila: " + (pozicija+1)+". dan u nedelji");

	}
}
