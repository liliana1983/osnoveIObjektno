package vozilo2;

public abstract class Vozilo extends Osoba implements Voznja {
	static final int maxBrzina = 200;
	static final int minBrzina = 0;
	static final int maxPrenosa = 5;
	protected String marka;
	protected String tip;
	protected String registracija;
	protected int godiste;
	protected Osoba vlasnik;
	protected Motor popAgregat;
	protected int stepenPrenosa;
	protected double brzina;

	Vozilo(String marka, String tip, String registracija, int godiste, Osoba vlasnik, boolean radi, String tipMotor,
			int snaga, int kubikaza, int stepenPrenosa, double brzina) {
		this.marka = marka;
		this.tip = tip;
		this.registracija = registracija;
		this.godiste = godiste;
		this.vlasnik = vlasnik;
		this.stepenPrenosa = stepenPrenosa;
		this.brzina = 0;

		this.popAgregat = new Motor(radi, tipMotor, snaga, kubikaza);
		ukljuci();
		iskljuci();
		smanjiPrenos();
		povecajPrenos();
		ubrzaj(brzina);
		uspori(brzina);
	}

	public double getBrzina() {
		return brzina;
	}

	public void setBrzina(double brzina) {
		this.brzina = brzina;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public Osoba getVlasnik() {
		return vlasnik;
	}

	public boolean pokreniVozilo() {
		popAgregat.ukljuci();
		return popAgregat.pribaviRadi();
	}

	public boolean zaustaviVozilo() {
		popAgregat.iskljuci();
		return !popAgregat.pribaviRadi();
	}

	protected void prenosVlasnistva(Osoba noviVlasnik) {
		this.vlasnik = noviVlasnik;
	}
@Override
	public void povecajPrenos() {
		if (stepenPrenosa == maxPrenosa)
			System.out.println("Smanjite prenos");

		stepenPrenosa++;
	}
@Override
	public void smanjiPrenos() {
		if (stepenPrenosa == 0)
			System.out.println("Povecaj prenos");

		stepenPrenosa--;
	}
@Override
	public void ubrzaj(double b) {

		if (brzina == minBrzina) {
			System.out.println("Vozilo nije u pokretu.");
		}

		brzina += b;
	}
@Override
	public void uspori(double b) {
		if (brzina == maxBrzina)
			brzina -= b;
	}

	

	protected void stampajPodatke() {
		System.out.println(getMarka() + " " + getTip() + " " + getGodiste() + " " + getRegistracija() + " "
				+ vlasnik.getIme() + " " + vlasnik.getPrezime());
	}

}
