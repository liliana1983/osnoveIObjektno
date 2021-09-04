package spisak;

public class Osoba {
	protected String ime;
	protected String prezime;
	protected String jmbg;
	
	Osoba() {
		// TODO Auto-generated constructor stub
	}
	Osoba(String ime, String prezime, String jmbg) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}
	
	public String getIme() {
		return this.ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg= jmbg;
	}
	
	public void predstaviSe() {
		System.out.println("Zdravo! Ja sam " + this.ime + " " + this.prezime + ". Moj jmbg je  "+ this.jmbg);
	}
}
