package nastavni_nenastavni_radniik;

public class Zaposleni extends Osoba{

private	double koefRadnogMesta;
protected double plata; 
Zaposleni (){}
Zaposleni(String ime, String prezime, int starost, double koefRadnogMesta)
{super (ime,prezime,starost);}


	 void koef(double t1) {
		this.koefRadnogMesta = t1;
	
	}

	double racunanjePlate() {
		return  plata;
	}
		
	
	
@Override
	public void predstaviSe() {
		System.out.println("Zaposleni " + ime + " " +prezime  + " - iznos plate " + plata);
	}
}




