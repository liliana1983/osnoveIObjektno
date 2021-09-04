package kompleksniZadaci;

public class Transakcija {
private Klijent primalac;
private Klijent posiljalac;
private float iznos;
private boolean interna;
Transakcija(){
	
}
public Transakcija(Klijent primalac, Klijent posiljalac, float iznos, boolean interna) {
	super();
	this.primalac = primalac;
	this.posiljalac = posiljalac;
	this.iznos = iznos;
	this.interna = interna;
}
public Klijent getPrimalac() {
	return primalac;
}

public Klijent getPosiljalac() {
	return posiljalac;
}

public float getIznos() {
	return iznos;
}

public boolean isInterna() {
	return interna;

}
}
