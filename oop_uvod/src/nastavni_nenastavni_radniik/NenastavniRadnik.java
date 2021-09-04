package nastavni_nenastavni_radniik;

public class NenastavniRadnik extends Zaposleni {
String radnoMesto;
int godineStaza;
NenastavniRadnik(){}
NenastavniRadnik(String ime, String prezime, int starost, double koefRadnogMesta, String radnoMesto,int godineStaza){
	super(ime,prezime,starost,koefRadnogMesta);
	this.radnoMesto=radnoMesto;
	this.godineStaza=godineStaza;
}
public String getRadnoMesto() {
	return radnoMesto;
}
public void setRadnoMesto(String radnoMesto) {
	this.radnoMesto = radnoMesto;
}
public int getGodineStaza() {
	return godineStaza;
}
public void setGodineStaza(int godineStaza) {
	this.godineStaza = godineStaza;
}
@Override
public void predstaviSe() {
	System.out.println(getIme()+" "+getPrezime()+" "+ getRadnoMesto()+" "+ getGodineStaza() );
}
 @Override
 public double racunanjePlate() {
	plata = 30000+getGodineStaza()*500;
	return plata;
 }
@Override
public String toString() {
	return "NenastavniRadnik [radnoMesto=" + radnoMesto + ", godineStaza=" + godineStaza + "]";
}
}
