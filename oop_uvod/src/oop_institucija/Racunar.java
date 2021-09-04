package oop_institucija;

public class Racunar {
	private String oznakaProcesora;
	private double radniTakt, indeksPerformansi;
	private int kapacitetMemorije;

	Racunar() {
	}

	Racunar(String p, double r, int k) {
		oznakaProcesora = p;
		radniTakt = r;
		kapacitetMemorije = k;
	}
	

	public String getOznakaProcesora() {
		return oznakaProcesora;
	}

	public void setOznakaProcesora(String oznakaProcesora) {
		this.oznakaProcesora = oznakaProcesora;
	}

	public double getRadniTakt() {
		return radniTakt;
	}

	public void setRadniTakt(double radniTakt) {
		this.radniTakt = radniTakt;
	}

	public int getKapacitetMemorije() {
		return kapacitetMemorije;
	}

	public void setKapacitetMemorije(int kapacitetMemorije) {
		this.kapacitetMemorije = kapacitetMemorije;
	}

	public double racunanjeIndeksa() {
		indeksPerformansi = 100 * radniTakt + kapacitetMemorije;
		indeksPerformansi=Math.round(indeksPerformansi);
		return indeksPerformansi;
	}

	void stampajIndeksPerformansi() {
		System.out.println("Racunar sa oznakom procesora "+this.getOznakaProcesora()+ " Ima indeks performansi "+this.racunanjeIndeksa());
	}

		
	}
