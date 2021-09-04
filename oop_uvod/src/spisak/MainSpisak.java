package spisak;

public class MainSpisak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Spisak polaznici = new Spisak();
			polaznici.ucitajListu("ulazSpisak.txt");
			polaznici.stampajListu();
			polaznici.sortirajListu();
			polaznici.stampajListu();
			polaznici.upisiListu("uredjeniSpisak.txt");
			}
			
	}


