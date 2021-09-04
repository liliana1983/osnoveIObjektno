package potprogrami;

public class nizoviSuma {
	static final int MAXELNIZA = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1;
		int[] nizPrirodnihBrojeva = new int[MAXELNIZA];
		int izbor;
		String str1="da";
		String str2;
		System.out.println("Program za rad sa nizom.");
		
		N = unosBrojaElemNiza();
		unosElemNiza(N, nizPrirodnihBrojeva);
		
	do {	System.out.println("izaberite operaciju 1.suma niza. 2.srednja vrednost niza, 3. maksimum niza, 4. minimum niza ");
		izbor=TextIO.getInt();
				switch (izbor) {
				case 1:
					sumaVrednostNiza(N,nizPrirodnihBrojeva);
					System.out.println("Suma elemenata niza iznosi" +sumaVrednostNiza(N,nizPrirodnihBrojeva));
					break;
				case 2:
					srednjaVrednostNiza (N, nizPrirodnihBrojeva);
						System.out.println("Srednja vrednost niza iznosi  " + srednjaVrednostNiza(N, nizPrirodnihBrojeva));
						break;
				case 3:
					 maksimumVrednostiNiza (N, nizPrirodnihBrojeva);
					System.out.println("Maximalna vrednost niza je " + maksimumVrednostiNiza(N, nizPrirodnihBrojeva));
					break;
				case 4:
					minVrednostNiza (N, nizPrirodnihBrojeva);
					System.out.println("Minimalna vrednost niza je " + minVrednostNiza(N, nizPrirodnihBrojeva));
					break;
				default:
					System.out.println("Niste odabrali ni jednu od ponudjenih opcija");
					
				}
		System.out.println("\nDa li zelite da ponovo unesete opciju da/ne");
		str2 = TextIO.getlnWord();
	} while (str1.equalsIgnoreCase(str2));}
	

	static int unosBrojaElemNiza(){
		int brojEl = 0;
		System.out.println("Unesite N:");
		brojEl = TextIO.getlnInt();
		return brojEl;}

	static void unosElemNiza(int n, int[] nizElem) {
		int i = 0;
		for (i = 0; i < n; i++) {
			System.out.print("Unesite " + (i + 1) + ". element niza: ");
			nizElem[i] = TextIO.getlnInt();
		}
		System.out.println();
	}

	static int sumaVrednostNiza(int n, int[] nizElem) {
		int suma = 0;
		int i = 0;
		for (i = 0; i < n; i++)
			suma += nizElem[i];
		return suma;}
	
	static double srednjaVrednostNiza(int n, int[] nizElem) {
			double srVrednost = sumaVrednostNiza(n, nizElem) / n;
			return srVrednost;
		}

	static int maksimumVrednostiNiza(int n,int[]nizElem) {
		int i =0;
		int max=nizElem[0];
		for(i=1;i<n;i++)
			if(max<nizElem[i])
				{max = nizElem[i];}
		return max;
	}
	static int minVrednostNiza(int n, int[] nizElem) {
		int min = nizElem[0];
		for (int i = 1; i < n; i++) {
			if (min > nizElem[i])
				min = nizElem[i];
		}
		return min;
}
	}

