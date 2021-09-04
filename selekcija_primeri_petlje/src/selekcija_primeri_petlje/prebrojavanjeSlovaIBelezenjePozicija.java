package selekcija_primeri_petlje;

public class prebrojavanjeSlovaIBelezenjePozicija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prebrojavanje slova i belezenje pozicija na kojima se slovo sve nalazi: 
		String str;  		// linija teksta koju unosi korisnik.
		int ukSlova; 		// ukupan broj razlicitih slova u str tekstu.
		int ukPojSlova; // ukupan broj pojavljivanja jednog slova u str tekstu.
		char slovo;  		// Slovo iz alfabeta.
		int i;       		// indeks slova u nizu karaktera string str.
		System.out.println("Unesite jedan red teskta:");
		str = TextIO.getln();
		str = str.toUpperCase();
		ukSlova = 0;
		System.out.println("Vas red teksta sadrzi sledeca slova:");
		System.out.println();
		System.out.print("   ");

			for ( slovo = 'A'; slovo <= 'Z'; slovo++ ) {
				ukPojSlova = 0;
				for ( i = 0; i < str.length(); i++ ) {
					if ( slovo == str.charAt(i) ) {					// ako je pronasao slovo
						if (ukPojSlova < 1)										// ako je pronasao to slovo prvi put
							System.out.print(slovo + "("+ i);		// ispisi slovo, otvori zagradu i ispisi prvi koordinatu, ne mozemo staviti
																									// zarez jer ne znamo da li ima jos pojava slova, niti mozemo zatvoriti 
																									// zagradu iz istog razloga
						ukPojSlova++; 												// povecamo broj koji broji koliko puta se pojavilo to slovo
						if (ukPojSlova > 1)										// ako nije prva pojava tog slova 
							System.out.print(","+ i);					  // za svaku sledecu pojavu slova, ispisi zaraz (jer ide iza prvog) 
																									// i njegovu koordinatu
					}
				}
				if (ukPojSlova > 0) {											// ako je oktrio slovo
					System.out.print(") ");									// moramo zatvoriti zagradu oko ispisa koordinata (našao je sigurno jedno slovo
																									// tako da je sigurno otvorio zagradu
					ukSlova++;
				}
			}      
			System.out.println();
			System.out.println();
			System.out.println("Otkriveno je " + ukSlova + " razlicitih slova.");

	}

}
