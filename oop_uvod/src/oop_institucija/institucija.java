package oop_institucija;

public class institucija extends Zaposleni {
	static final int maxBr = 20;
	private String naziv;
	private String Adresa;
	private String maticniBroj;
	private Osoba zakonskiZastupnik;
	private Ucionica[] spisakUcionica;
	private Zaposleni[] spisakZaposlenih;
	private int brojUcionica, brojZaposlenih;

	institucija() {
	}

	institucija(String naziv, String Adresa, String maticniBroj, Osoba zakonskiZastupnik) {
		this.naziv = naziv;
		this.Adresa = Adresa;
		this.maticniBroj = maticniBroj;
		this.zakonskiZastupnik = zakonskiZastupnik;
		this.spisakUcionica = new Ucionica[maxBr];
		this.spisakZaposlenih = new Zaposleni[maxBr];
		this.brojZaposlenih = 0;
		this.brojUcionica = 0;

	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return Adresa;
	}

	public void setAdresa(String adresa) {
		Adresa = adresa;
	}

	public String getMaticniBroj() {
		return maticniBroj;
	}

	public void setMaticniBroj(String maticniBroj) {
		this.maticniBroj = maticniBroj;
	}

	public Osoba getZakonskiZastupnik() {
		return zakonskiZastupnik;
	}

	public void setZakonskiZastupnik(Osoba zakonskiZastupnik) {
		this.zakonskiZastupnik = zakonskiZastupnik;
	}

	public Ucionica[] getSpisakUcionica() {
		return spisakUcionica;
	}

	public Zaposleni[] getSpisakZaposlenih() {
		return spisakZaposlenih;
	}


	public int getBrojUcionica() {
		return brojUcionica;
	}

	public int getBrojZaposlenih() {
		return brojZaposlenih;
	}
public boolean dodajUcionicu (String oznaka, String tip, int brMesta, double Povrsina,boolean racunarska ) {
	if (brojUcionica==maxBr)
		return false;
	if (racunarska) {
		spisakUcionica[brojUcionica++]=new racunarskaUcionica(oznaka,tip,brMesta,Povrsina);
	}else {
		spisakUcionica[brojUcionica++]=new Ucionica (oznaka, tip, brMesta,Povrsina);
	}return true;
}

	public boolean dodajZaposlenog (String ime, String prezime, int starost, double koefRadnogMesta) {
		if (brojZaposlenih==maxBr)
			return false;
		spisakZaposlenih[brojZaposlenih++]=new Zaposleni (ime,prezime,starost,koefRadnogMesta);
		return true;
	}
	private Ucionica nadjiUcionicu (String oznaka) {
		for (int i=0;i<brojUcionica;i++) {
			if (spisakUcionica[i].getOznaka().equals(oznaka))
					return spisakUcionica[i];}
			return null;
	}
	public boolean dodajRacunarUUcionicu (String oznaka, String procesor, double radniTakt,int kapacitetMemorije) {
		Ucionica u=nadjiUcionicu(oznaka);
		if (u==null)
			return false;
		if (!(u instanceof racunarskaUcionica)) {
			System.out.println("Racunari se mogu dodati samo u racunarsku ucionicu!");
			return false;
		}
		racunarskaUcionica ru=(racunarskaUcionica) u;
		ru.dodajRacunar(new Racunar (procesor,radniTakt,kapacitetMemorije));
		return true;
	}
	public void stampanje() {
		System.out.println("Naziv: "+ naziv + "\nadresa: "+Adresa+ "\nmaticni broj" +maticniBroj+"."+ "\nZakonski zastupnik: "+ zakonskiZastupnik.getIme()+ " "+ zakonskiZastupnik.getPrezime()+ " "+zakonskiZastupnik.getStarost());
	}
	public void prikaziPodatke() {
		this.stampanje();
		System.out.println("Spisak zaposlenih: ");
		System.out.println("Broj zaposlenih je: " + brojZaposlenih);
		for(int i=0;i<brojZaposlenih;i++) {
			spisakZaposlenih[i].stampajPoene();}
		System.out.println("Broj ucionica je: "+ brojUcionica);
		System.out.println("Spisak ucionica: ");
		for(int i=0;i<brojUcionica;i++) {
			spisakUcionica[i].stampajUcionicu();}
	}
}

