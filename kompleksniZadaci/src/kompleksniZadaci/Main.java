package kompleksniZadaci;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Klijent k1 = new Klijent("Milos","Gucunski","1505979");
		Klijent k2=new Klijent ("Ljiljana","Curcic","2812983");
		k1.getBrojRacuna().setStanje(5000);
		k2.getBrojRacuna().setStanje(2000);
		k1.getBrojRacuna().setAktivan(true);
		k2.getBrojRacuna().setAktivan(true);
		k1.getBrojRacuna().setValuta("dinar");
		k2.getBrojRacuna().setValuta("dinar");
		Banka erste=new Banka();
		erste.klijenti.add(k1);
		erste.klijenti.add(k2);
		erste.izvrsiInternuTransakciju(k1, k2, 1000);
		
	}

}
