package oop_uvod;

public class ZaposleniMain {
	
	static final int BRZAPOSLENI = 3;

	public static void main(String[] args) {

		Zaposleni[] z = new Zaposleni[BRZAPOSLENI];
		
		z[0] = new Zaposleni("Jovan", "Jovanic",55,10);
		z[1] = new Zaposleni("Marko", "Markovic",23,20);
		z[2] = new Zaposleni("Sara", "Saric", 62,15);
		
		for (int i = 0; i < BRZAPOSLENI; i++) {
			z[i].predstaviSe();}
		
	//	for (int i = 0; i < BRZAPOSLENI - 1; i++) {
		//	for (int j = i + 1; j < BRZAPOSLENI; j++) {
		//		if (z[i].racunanjePlate() > z[j].racunanjePlate()) {
			//		Zaposleni p = z[i];
		//		//	z[i] = z[j];
			//		z[j] = p;
			//	}				
	//		}
//}
		
		for (int i = 0; i < BRZAPOSLENI; i++) {
			z[i].stampajPoene();}
				
	}
}


