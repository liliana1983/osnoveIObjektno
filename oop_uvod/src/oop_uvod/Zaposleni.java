package oop_uvod;

public class Zaposleni extends Osoba{


private	double koefRadnogMesta,plata; 
Zaposleni (){}
Zaposleni(String ime, String prezime, int starost, double koefRadnogMesta)
{super (ime,prezime,starost);}


	 void koef(double t1) {
		this.koefRadnogMesta = t1;
	
	}

	void racunanjePlate() { 
		plata = 2500*koefRadnogMesta;
	
	}

	public void stampajPoene() {
		System.out.println("Zaposleni " + ime + " " +prezime  + " - iznos plate " + plata);
	}
}


