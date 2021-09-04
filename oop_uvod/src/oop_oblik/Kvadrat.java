package oop_oblik;

public class Kvadrat extends Oblik implements Figura {
	double duzinaStranice;

	Kvadrat() {
	}

	Kvadrat(String boja, String tip, int brojStrana, double duzinaStranice) {
		super(boja, tip, brojStrana);
		this.duzinaStranice = duzinaStranice;
		racunajObim();
		racunajPovrsinu();
	}

	public double getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(double duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}
@Override
public	void racunajPovrsinu() {
		super.povrsina = duzinaStranice * duzinaStranice;
	}
	@Override
	public void racunajObim() {
		this.obim = 4 * this.duzinaStranice;
		obim = Math.round(obim);

	}

	@Override
	void stampajPodatke() {
		System.out.println(super.getTip() + " ima boju " + super.getBoja() + " i " + super.getBrojStrana() + " stranice"
				+ " duzine " + this.duzinaStranice + " centimetra i ima povrsinu " + povrsina
				+ " centimetara kvadratnih"+ " i ima obim "+ obim+" centimetara");
	}
}
