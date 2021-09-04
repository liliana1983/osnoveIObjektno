package vezbanje_za_ispit;

public class Programer extends Osoba implements Iterator {
private String iskustvo;
private double plata;
Programer(){}
Programer(String ime,String prezime,int starost,String iskustvo,double plata){
	super(ime,prezime,starost);
	this.iskustvo=iskustvo;
	this.plata=plata;
}
public String getIskustvo() {
	return iskustvo;
}
public void setIskustvo(String iskustvo) {
	this.iskustvo = iskustvo;
}
public double getPlata() {
	return plata;
}
public void setPlata(double plata) {
	this.plata = plata;
}
}
