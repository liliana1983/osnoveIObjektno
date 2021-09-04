package oop_uvod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poruka prvaPoruka = new poruka();
		prvaPoruka.tekst = "Zdravo Svete!";
		prvaPoruka.postaviTekst("Zdravo OOP svete!");
		prvaPoruka.pribaviTekst();
		poruka p,p1,p2,p3;
		p=new poruka();
		p1= new poruka();
		p2=p1;
		p3=null;
		p.tekst="Ljiljana";
		p1.tekst="Ljiljana";
		
	}

}
