package oop_oblik;

public class Krug extends Oblik implements Figura {
	double poluprecnik;

	Krug() {
	}

	Krug(String boja, String tip, int brojStrana, double poluprecnik) {
		super(boja, tip, brojStrana);
		this.poluprecnik = poluprecnik;
		racunajObim();
		racunajPovrsinu();
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

@Override
	public void racunajPovrsinu() {
		povrsina = poluprecnik * poluprecnik * Math.PI;
		povrsina = Math.round(povrsina);

	}
@Override
public
	void racunajObim() {
		super.obim = Math.round(poluprecnik * 2 * Math.PI);

	}

	@Override
	void stampajPodatke() {
		System.out.println(getTip() + " ima boju " + getBoja() + " poluprecnika " + getPoluprecnik()
				+ " centimetara i ima povrsinu " + povrsina + " centimetara kvadratnih"+" i ima obim "+ obim+" centimetara");
	}
}
