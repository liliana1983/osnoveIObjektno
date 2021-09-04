package nastavni_nenastavni_radniik;

public class Asistent extends Zaposleni{
 String mentor;
 int godinaDoktorskihStudija;
 Asistent (){}
 Asistent (String ime, String prezime, int starost, double koefRadnogMesta, String mentor,int godinaDoktorskihStudija){
	 super(ime,prezime,starost,koefRadnogMesta);
	 this.mentor=mentor;
	 this.godinaDoktorskihStudija=godinaDoktorskihStudija;
 }
@Override
public String toString() {
	return "Asistent [mentor=" + mentor + ", godinaDoktorskihStudija=" + godinaDoktorskihStudija + "]";
}
public String getMentor() {
	return mentor;
}
public void setMentor(String mentor) {
	this.mentor = mentor;
}
public int getGodinaDoktorskihStudija() {
	return godinaDoktorskihStudija;
}
public void setGodinaDoktorskihStudija(int godinaDoktorskihStudija) {
	this.godinaDoktorskihStudija = godinaDoktorskihStudija;
}
@Override
public void predstaviSe() {
	System.out.println(getIme()+" "+getPrezime()+" "+ getMentor()+" "+ getGodinaDoktorskihStudija() );
}
@Override
public double racunanjePlate() {
	plata = 40000+getGodinaDoktorskihStudija()*2000;
	 return plata;
}
}
