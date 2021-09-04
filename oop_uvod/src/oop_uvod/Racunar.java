package oop_uvod;

/*Kreirati klasu Racunar sa atributima oznakaProcesora (tipa String),
  radniTakt (tipa double), kapacitetMemorije (tipa int), standardnim 
  konstruktorom i konstruktorom koji postavlja inicijalne vrednosti, 
  pristupnim metodama (get i set) za sve atribute, kao i metodom za 
  računanje indeksa performansi računara po formuli:
  indeksPerformansi = 100*radniTakt + kapacitetMemorije. 
  Implementirati i metod za prikaz u konzoli indeksa performansi računara.
  Potom testirati klasu kreiranjem sedam objekta u okviru metode main.
  Nakon kreiranja objekata primenom konstruktora, potrebno je izračunati i 
  prikazati rang listu računara uređenu po indeksu performansi u rastućem redosledu. */
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
		System.out.println("Racunar sa oznakom procesora "+oznakaProcesora+ " Ima indeks performansi "+racunanjeIndeksa());
	}

		
	}
