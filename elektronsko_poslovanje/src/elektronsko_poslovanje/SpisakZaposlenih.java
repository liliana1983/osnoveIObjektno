package elektronsko_poslovanje;

public class SpisakZaposlenih {

	private int maxBrojZaposlenih = 100;
	private Zaposleni[] nazivZaposlenog;
	private int trenutniBrojZaposlenih;

	SpisakZaposlenih() {
	}

	SpisakZaposlenih(int maxBrojZaposlenih) {
		this.maxBrojZaposlenih = maxBrojZaposlenih;
		this.nazivZaposlenog = new Zaposleni[maxBrojZaposlenih];
		this.trenutniBrojZaposlenih = 0;
	}

	public void dodajZaposlenog(Zaposleni nazivZaposlenog) {
		if (trenutniBrojZaposlenih < maxBrojZaposlenih) {
			this.nazivZaposlenog[this.trenutniBrojZaposlenih++] = nazivZaposlenog;
			System.out.println("Uspesno dodat zaposleni " + nazivZaposlenog + "!");
		} else {
			System.out.println("Nema vise mesta!");
		}
	}

	public int nadjiZaposlenog(String ime, String prezime) {
		for (int i = 0; i < this.trenutniBrojZaposlenih; i++)
			if (this.nazivZaposlenog[i].getIme().equals(ime) && this.nazivZaposlenog[i].getPrezime().equals(prezime))
				return i;
		System.out.println("Nije pronadjen zaposleni tog imena i prezimena");
		return -1;

	}

	public void sortirajZaposlene() {
		for (int i = 0; i < maxBrojZaposlenih - 1; i++) {
			for (int j = i + 1; j < maxBrojZaposlenih; j++) {
				if (nazivZaposlenog[i].getIme().compareToIgnoreCase(nazivZaposlenog[j].getIme()) < 0) {
					Zaposleni temp = nazivZaposlenog[i];
					nazivZaposlenog[i] = nazivZaposlenog[j];
					nazivZaposlenog[j] = temp;
				}				
			}
		}
	}

	/*private boolean izbaciZaposlenog(int index) {

		if (index == -1)
			return false;

		for (int i = index; i < trenutniBrojZaposlenih - 1; i++)
			nazivZaposlenog[i] = nazivZaposlenog[i + 1];

		trenutniBrojZaposlenih--;

		return true;
	}*/
	public void izbrisiZaposlenog (Zaposleni nazivZaposlenog) {
		int i , otpusteni=-1;
		for (i=0;i<this.trenutniBrojZaposlenih; i++) {
			if (this.nazivZaposlenog[i]==nazivZaposlenog)
				otpusteni=i;
		}
		if (otpusteni>=0) {
			for (i=otpusteni;i<this.trenutniBrojZaposlenih-1;i++) {
				this.nazivZaposlenog[i]=this.nazivZaposlenog[i+1];
			}
			trenutniBrojZaposlenih=trenutniBrojZaposlenih-1;
		}else System.out.println("Zaposleni "+nazivZaposlenog.getIme()+ " "+nazivZaposlenog.getPrezime()+ " nije pronadjen");
	}

	public void stampaj(String label) {

		System.out.println(label + ", spisak : ");

		for (int i = 0; i < trenutniBrojZaposlenih; i++)
			System.out.println(nazivZaposlenog[i]);

		System.out.println();
	}
}


