package elektronsko_poslovanje;

public abstract class Prodavnica implements Imenovanje,Finansije  {

	protected SpisakKlijenata spisakKlijenata;
	protected SpisakZaposlenih spisakZaposlenih;
	private float stanjeRacuna;
	
	Prodavnica() {}
	
	Prodavnica(int maxBrojKlijenata, int maxBrojZaposlenih){
		this.spisakKlijenata = new SpisakKlijenata(maxBrojKlijenata);
	this.spisakZaposlenih=new SpisakZaposlenih(maxBrojZaposlenih);
	obracunajPlate(spisakZaposlenih);
	}
	
	public float getStanjeRacuna() {
		return stanjeRacuna;
	}

	public void setStanjeRacuna(float stanjeRacuna) {
		this.stanjeRacuna = stanjeRacuna;
	}
	public int obracunajPlate(Zaposleni[] spisakZaposlenih) {
		return -1;
	}
	public float isplatiPorez(Zaposleni[] spisakZaposlenih) {
		return (float) -1.0;
	}

	public void izracunajPDV() {
		System.out.println("Stopa PDV je 20%!");
	}
	
	public abstract String[] uzmiIzInventara();
	
	public abstract void nabaviInventar(String artikal);
	
}
