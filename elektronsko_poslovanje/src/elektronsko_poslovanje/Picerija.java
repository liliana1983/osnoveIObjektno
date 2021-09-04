package elektronsko_poslovanje;

public class Picerija extends Prodavnica {
	private String imeKompanije;
	private String[] ponudaHrane = { "Pica", "Cezar salata", "Lazanje", "Madjarica", "Voda", "Pivo" };

	Picerija() {
	}

	Picerija(String imeKompanije,String ponudaHrane) {
		this.imeKompanije = imeKompanije;
		postaviImeProdavnice(imeKompanije);
		pribaviImeProdavnice();}

	@Override
	public String pribaviImeProdavnice() {// TODO Auto-generated method stub
		return imeKompanije;
	}

	@Override
	public void postaviImeProdavnice(String imeProdavnice) {
		imeKompanije = imeProdavnice ;// TODO Auto-generated method stub

	}

	@Override
	public String[] uzmiIzInventara() {
		return ponudaHrane;// TODO Auto-generated method stub

	}

	@Override
	public void nabaviInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal " + artikal);// TODO Auto-generated method stub

	}

	@Override
	public int obracunajPlate(SpisakZaposlenih spisakZaposlenih) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float prikaziStanjeRacuna() {
		// TODO Auto-generated method stub
		return 0;
	}
}
