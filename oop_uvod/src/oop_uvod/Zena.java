package oop_uvod;

public class Zena extends Osoba{
String devojackoPrezime;
Zena(){}
Zena(String ime, String prezime,String devojackoPrezime){
}

public String getDevojackoPrezime() {
	return devojackoPrezime;
}
public void setDevojackoPrezime(String devojackoPrezime) {
	this.devojackoPrezime = devojackoPrezime;
}

public void predstaviSe() {
	System.out.println("Ime: " + getIme() +
	" Prezime: " + getPrezime()+
	" devojacko preime je " + getDevojackoPrezime());
	}
}
