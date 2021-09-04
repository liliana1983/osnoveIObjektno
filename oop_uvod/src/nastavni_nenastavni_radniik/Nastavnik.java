package nastavni_nenastavni_radniik;

public class Nastavnik extends Zaposleni {
String zvanje;
int brojSciRadova;

Nastavnik(String ime,String prezime, int starost, double koefRadnogMesta,String zvanje,int brojSciRadova){
	super(ime,prezime,starost,koefRadnogMesta);
	this.zvanje=zvanje;
	this.brojSciRadova=brojSciRadova;
}

public String getZvanje() {
	return zvanje;
}

public void setZvanje(String zvanje) {
	this.zvanje = zvanje;
}

public int getBrojSciRadova() {
	return brojSciRadova;
}

public void setBrojSciRadova(int brojSciRadova) {
	this.brojSciRadova = brojSciRadova;
}
@Override
public void predstaviSe() {
	System.out.println(getIme()+" "+getPrezime()+" "+ getZvanje()+" "+ getBrojSciRadova() );
}@Override
public double racunanjePlate() {
	plata = 60000+getBrojSciRadova()*3000;
	 return plata;
}

@Override
public String toString() {
	return "Nastavnik [zvanje=" + zvanje + ", brojSciRadova=" + brojSciRadova + "]";
}

}
