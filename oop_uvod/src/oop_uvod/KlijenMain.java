package oop_uvod;

public class KlijenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Klijent k1 = new Klijent("Milos", "Gucu",42, "Vojvodjanska","392566",5000.0);
		Klijent  k2 = new Klijent("Ljiljana", "Curcic",38,"Erste","21223", 10000.0);
		k1.ispisStanja();
		k2.ispisStanja();
		k1.transfer(k1, k2, 1000);
		k1.ispisStanja();
		k2.ispisStanja();

		
	}

}
