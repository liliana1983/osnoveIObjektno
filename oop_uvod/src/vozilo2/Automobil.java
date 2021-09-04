package vozilo2;

public class Automobil extends Vozilo {
	private int brojVrata;
	public static int maxBrzina=100;
	public static int minBrzina=0;
	Automobil(String marka, String tip, String registracija, int godiste, Osoba vlasnik, int brojVrata, 
			  boolean radi, String tipMotor, int snaga, int kubikaza,int stepenPrenosa, double brzina){
		super(marka, tip, registracija, godiste, vlasnik, radi, tipMotor, snaga, kubikaza, stepenPrenosa, brzina);
		this.brojVrata = brojVrata;
		ukljuci();
		iskljuci();
		povecajPrenos();
		smanjiPrenos();
		ubrzaj(brzina);
		uspori(brzina);
	}
	public int getBrojVrata() {
		return brojVrata;
	}
	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	@Override
	public boolean ukljuci() {
		popAgregat.ukljuci();
		return popAgregat.pribaviRadi();
	}
	@Override
	public boolean iskljuci() {
		popAgregat.iskljuci();
		return !popAgregat.pribaviRadi();
	}
	public void stampajPodatke() {
		System.out.println(getMarka() + " " + 
			getTip() + " " + 
			getGodiste() + " " + 
	 		getRegistracija() + " " +
			getBrojVrata() + " " +
	 		vlasnik.getIme() + " " + 
			vlasnik.getPrezime());
		this.popAgregat.stampajPodatke();
	}

}
