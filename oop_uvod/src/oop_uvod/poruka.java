package oop_uvod;

public class poruka {
 protected String tekst;
void postaviTekst(String noviTekst) {
	tekst=noviTekst;
}
 void pribaviTekst() {
	System.out.println(tekst);
}
String pribaviTekst1() {
	return tekst;
}
}
