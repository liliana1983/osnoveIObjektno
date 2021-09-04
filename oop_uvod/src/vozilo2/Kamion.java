package vozilo2;

public class Kamion extends Vozilo {
	private int brojOsovina;

	Kamion(String marka, String tip, String registracija, int godiste, Osoba vlasnik, int brojOsovina, boolean radi, String tipMotor, int snaga, int kubikaza, int stepenPrenosa, double brzina){
		super(marka, tip, registracija, godiste, vlasnik, radi, tipMotor, snaga, kubikaza, stepenPrenosa, brzina);
		this.brojOsovina = brojOsovina;
		ukljuci();
		iskljuci();
		povecajPrenos();
		smanjiPrenos();
		
	}

	public int getBrojOsovina() {
		return brojOsovina;
	}

	public void setBrojOsovina(int brojOsovina) {
		this.brojOsovina = brojOsovina;
	}
	
	public void stampajPodatke() {
		super.stampajPodatke();
		System.out.println(getMarka() + " " + 
			getTip() + " " + 
			getGodiste() + " " + 
	 		getRegistracija() + " " +
			getBrojOsovina() + " " +
	 		vlasnik.getIme() + " " + 
			vlasnik.getPrezime());
		this.popAgregat.stampajPodatke();
	}

	@Override
	public boolean ukljuci() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean iskljuci() {
		// TODO Auto-generated method stub
		return false;
	}
}
