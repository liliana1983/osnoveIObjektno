package kompleksniZadaci;

public class Racun {
private	float stanje;
	private boolean aktivan;
	String valuta;

	Racun() {}

Racun(float stanje, boolean aktivan,String valuta){
	this.stanje=stanje;
	this.aktivan=aktivan;
	this.valuta=valuta;
}

public float getStanje() {
	return stanje;
}

public void setStanje(float stanje) {
	this.stanje = stanje;
}

public boolean isAktivan() {
	return aktivan;
}

public void setAktivan(boolean aktivan) {
	this.aktivan = aktivan;
}

public String getValuta() {
	return valuta;
}

public void setValuta(String valuta) {
	this.valuta = valuta;
}
}