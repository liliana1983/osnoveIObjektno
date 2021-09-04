
public class PrebrojavanjeSlova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int brSlova = 0;
		int ukPojSlova;
		char slovo;
		int i;

		System.out.println("Unesite zeljeni tekst: ");
		System.out.println();
		str = TextIO.getlnString();
		str = str.toUpperCase();
		System.out.println("Vas red teksta sadrzi sledeca slova");
		System.out.println();
		for (slovo = 'A'; slovo <= 'Z'; slovo++) {
			ukPojSlova = 0;
			for (i = 0; i < str.length(); i++) {
				if (slovo == str.charAt(i)) {
					if (ukPojSlova < 1)
						System.out.print(slovo + "(" + i);
					ukPojSlova++;
					if (ukPojSlova > 1)
						System.out.print(", " + i);

				}

			}
			if (ukPojSlova > 0)
				System.out.print(")");
			brSlova++;
		}
		System.out.println("Otkriveno je " + brSlova + " razlicitih slova.");
	}



}
