package elektronsko_poslovanje;

public class SpisakKlijenata {
	private Osoba[] nazivKlijenta;
	private int trenutniBrojKlijenata;
	private int maxBrojKlijenata;
	
	SpisakKlijenata(){}
	
	SpisakKlijenata(int maxBrojKlijenata){
		this.maxBrojKlijenata = maxBrojKlijenata;
		this.trenutniBrojKlijenata = 0;
		this.nazivKlijenta = new Osoba[maxBrojKlijenata];
	}
	
	public String nadjiKlijenta(Osoba nazivKlijenta) {
		int i;
		for (i = 0; i < this.trenutniBrojKlijenata; i++) {
			if (this.nazivKlijenta[i] == nazivKlijenta) {
				return (this.nazivKlijenta[i].getIme() +" "+ this.nazivKlijenta[i].getPrezime());
			}
		}
		return ("Klijent nije pronadjen!");
	}
	
	public void dodajKlijenta(Osoba nazivKlijenta) {
		if (trenutniBrojKlijenata < maxBrojKlijenata) {
			this.nazivKlijenta[this.trenutniBrojKlijenata++] = nazivKlijenta;
			System.out.println("Uspesno dodat klijent " +nazivKlijenta+"!");
		}
		else{
			System.out.println("Nema vise mesta u spisku klijenata!");
		}
	}
}
