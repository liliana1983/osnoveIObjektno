package oop_institucija;

public class institucijaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Osoba zakonskiZastupnik= new Osoba ("Srdjan", "Kolakovic",62);
institucija ftn = new institucija("FTN", "Trg Dositeja Obradovica 6, Novi Sad", "123456", zakonskiZastupnik);
		
		ftn.dodajUcionicu("A1", "amfiteatar", 300, 200.0, false);
		ftn.dodajUcionicu("MI A-21", "racunarska", 32, 50.0, true);
		ftn.dodajRacunarUUcionicu("MI A-21", "Intel", 2.0, 16);
		ftn.dodajRacunarUUcionicu("MI A-21", "AMD", 3.0, 32);
		ftn.dodajZaposlenog("Dusan", "Gajic", 38, 4);
		ftn.dodajZaposlenog("Dinu", "Dragan", 42, 6);
		ftn.prikaziPodatke();
		
	}

}
