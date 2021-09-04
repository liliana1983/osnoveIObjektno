package selekcija_primeri_petlje;

public class prebrojavanjeSlova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prebrojavanje slova: 
		  String str;  // linija teksta koju unosi korisnik.
		  int ukSlova; // ukupan broj razlicitih slova u str tekstu.
			int ukPojSlova = 0; // broji koliko se puta jedno slovo pojavljuje u tekstu
		  char slovo;  // Slovo iz alfabeta.
		  int i;      // indeks slova u nizu karaktera string str.
		  System.out.println("Unesite jedan red teskta:");
		  str = TextIO.getln();
		  str = str.toUpperCase();
		  ukSlova = 0;
		  System.out.println("Vas red teksta sadrzi sledeca slova:");
		  System.out.println();
		  System.out.print("  ");
		  for ( slovo = 'A'; slovo <= 'Z'; slovo++ ) { // prolaz kroz karaktere u ASCII tabeli
		    for ( i = 0; i < str.length(); i++ ) { // prolaz kroz string
		      if ( slovo == str.charAt(i) ) { 
		        ukPojSlova++;                    // za svako pojavljivanje slova u nizu karaktera povecava se vrednost brojaca
		      }            
		    }
				if (ukPojSlova > 0) {                             // ako je pronadjeno neko slovo ukPojSlova mora biti veci od nule
					System.out.print(slovo + "("+ukPojSlova+") ");  // ispis pronadjenog slova i koliko puta se ono pojavljuje u ulaznom stringu
		      ukSlova++;																			// povecanje ukupnog broja pronadjenih slova
		      ukPojSlova = 0;																	// da bi moglo da se broji koliko pojavljivanja 
		    }
		  }     
		  System.out.println();
		  System.out.println();
		  System.out.println("Otkriveno je " + ukSlova + " razlicitih slova.");
	}

}
