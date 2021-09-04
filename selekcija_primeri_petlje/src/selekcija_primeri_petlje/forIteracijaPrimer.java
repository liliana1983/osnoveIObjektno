package selekcija_primeri_petlje;

public class forIteracijaPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N = 1;
int i,suma =0;
System.out.println("Program za racunanje sume prvih N prirodnih brojeva.");
System.out.println("unesite N: ");
do {
	N = TextIO.getInt();
	if (N<1)
		System.out.println("N mora biti veci od 0. Unesite ponovo N: ");
} while (N<1);
	for (i=1; i<=N; i++)
		suma +=i;
	System.out.println("suma prvih" + N + "prirodnih brojeva je: " + suma + ".");

	}

}
