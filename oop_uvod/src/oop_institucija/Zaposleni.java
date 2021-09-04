package oop_institucija;

public class Zaposleni extends Osoba{

static final int brojDana=30;
private	double koefRadnogMesta,plata; 
Zaposleni (){}
Zaposleni(String ime, String prezime, int starost, double koefRadnogMesta)
{super (ime,prezime,starost);
this.koefRadnogMesta=koefRadnogMesta;
this.plata=plata;}


	 void koef(double t1) {
		this.koefRadnogMesta = t1;
	
	}

	double racunanjePlate() { 
		plata = koefRadnogMesta*brojDana*100;
	return plata;
	}

	public void stampajPoene() {
		System.out.println("Zaposleni " + this.getIme() + " " +this.getPrezime()  +" "+ this.getStarost()+" ima platu "+ this.racunanjePlate());
	
	}
}


