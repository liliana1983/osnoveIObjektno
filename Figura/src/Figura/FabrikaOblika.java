package Figura;

public class FabrikaOblika {
	// metod pribaviOblik dobavlja oblik zeljenog tipa
	public Figura pribaviOblik(String tipOblika) {
		if (tipOblika == null) {
			return null;
		}
		if (tipOblika.equalsIgnoreCase("KRUG")) {
			return new Krug();
		} else if (tipOblika.equalsIgnoreCase("PRAVOUGAONIK")) {
			return new Pravougaonik();
		} else if (tipOblika.equalsIgnoreCase("KVADRAT")) {
			return new Kvadrat();
		}
		return null;
	}
}