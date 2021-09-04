package oop_oblik;

public abstract class Oblik {
	private String boja;
	private String tip;
	private int brojStrana;
	protected double povrsina, obim;

	Oblik() {
	}

	Oblik(String boja, String tip, int brojStrana) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;

	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getBrojStrana() {
		return brojStrana;
	}

	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}

	void promenaBoje(String novaBoja) {
		this.boja = novaBoja;
}

	void stampajPodatke() {
		System.out.println(tip + " ima boju " + boja + " i broj stranica " + brojStrana);
	}
}
