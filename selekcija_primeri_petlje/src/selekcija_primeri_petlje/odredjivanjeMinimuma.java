package selekcija_primeri_petlje;

public class odredjivanjeMinimuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Odredjivanje minimuma bez niza:
		int N = -1;
	  int broj;
	  int minimum = 101;
	  int i = 0;
	  int pozicija = 0;

	  do {
	    System.out.println("Unesite koliko brojeva zelite da poredite:");
	    N = TextIO.getInt();
	    if (N <= 0)
	      System.out.println("Uneta vrednost mora biti veca od 0!");
	  }while(N <= 0);
	   
	  for (i = 1; i <= N; i++) {
	    do {
	      System.out.println("Unesite " + i + ". broj:");
	      broj = TextIO.getInt();
	      if ((broj < -10)||(broj > 100))
					System.out.println("Uneta vrednost mora biti veca od -10 i manja od 101");
	    }while((broj < -10)||(broj > 100));
	    if (broj < minimum) {
				minimum = broj;
				pozicija = i;
	    }
	  }
	  System.out.println(pozicija + ". broj " + minimum + " je najmanji broj koji ste uneli.");
	}

}
