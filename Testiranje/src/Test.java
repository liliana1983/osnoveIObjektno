import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Klijent k1 = new Klijent("Marko", "Markovic","Vojvodjanskoj9","062589");
		Klijent k2 = new Klijent("Sara", "Saric", "Puskinova_2","062584");
		Klijent k3=new Klijent("Ljiljana", "Curcic", "Krajiska97", "064369");
	//	k1.toString();
		//System.out.println(k1);
		ListaKlijenata prvi= new ListaKlijenata();
		prvi.ucitajListu("Klijenti.txt");
		prvi.dodajKlijenta(k2);
		prvi.upisiListu("NoviKlijenti.txt");
		prvi.pronadjiKlijenta("Marko");
		System.out.println(prvi.pronadjiKlijenta("Marko"));
		prvi.brisanjeKlijenata(k3);
		prvi.upisiListu("NoviKlijenti.txt");
		
	}

}
