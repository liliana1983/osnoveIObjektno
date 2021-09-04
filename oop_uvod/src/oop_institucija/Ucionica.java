package oop_institucija;

public class Ucionica {
	protected String oznaka;
	protected String tip;
	protected int brMesta;
	protected double Povrsina;

	Ucionica() {
	}

	Ucionica(String oznaka, String tip, int brMesta, double Povrsina) {
		this.oznaka = oznaka;
		this.tip = tip;
		this.brMesta = brMesta;
		this.Povrsina=Povrsina;
	}

	public double getPovrsina() {
		return Povrsina;
	}

	public void setPovrsina(double povrsina) {
		Povrsina = povrsina;
	}

	public String getOznaka() {
		return oznaka;
	}

	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getBrMesta() {
		return brMesta;
	}

	public void setBrMesta(int brMesta) {
		this.brMesta = brMesta;
	}
	public void stampajUcionicu() {
		System.out.println("Ucionca oznake " + oznaka+ " tipa "+ tip+ " ima broj mesta " +brMesta+ " ima povrsinu "+ Povrsina);
	}
}
