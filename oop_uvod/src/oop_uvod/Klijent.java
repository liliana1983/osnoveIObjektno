package oop_uvod;

public class Klijent extends Osoba {
	private double saldo, Stanje;
	String Banka, Racun;

	Klijent(String ime, String prezime, int starost, String Banka, String Racun, double Stanje) {
		super(ime, prezime, starost);
		this.Racun = Racun;
		this.Stanje = Stanje;

	}

	public double getStanje() {
		return Stanje;
	}

	public void setStanje(double stanje) {
		Stanje = stanje;
	}

	public String getBanka() {
		return Banka;
	}

	public void setBanka(String banka) {
		Banka = banka;
	}

	public String getRacun() {
		return Racun;
	}

	public void setRacun(String racun) {
		Racun = racun;
	}

	public boolean smanjiSaldo(double iznos) {
		boolean uspeo = false;
		if (iznos < Stanje) {
			this.Stanje -= iznos;
			uspeo = true;
		} else
			System.out.println("Ne moze se izvrsiti transakcija");
		return uspeo;
	}

	public void povecajSaldo(double iznos) {
		this.Stanje += iznos;
	}

	static public boolean transfer(Klijent k1, Klijent k2, double iznos) {
		boolean uspeo = false;
		uspeo = k1.smanjiSaldo(iznos);
		if (uspeo) {
			k2.povecajSaldo(iznos);
		}
		return uspeo;
	}

	public void ispisStanja() {
		super.predstaviSe();
		System.out.println(
				" imao je na racunu " + Racun + " iznos od " + Stanje + " dinara, a nakon transfera ima " + Stanje);
	}

}
