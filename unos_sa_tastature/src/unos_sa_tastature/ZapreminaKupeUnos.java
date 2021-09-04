package unos_sa_tastature;

public class ZapreminaKupeUnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		double h;
		System.out.println("Unesite poluprecnik osnove kupe i visinu kupe");
		r = TextIO.getDouble();
		h = TextIO.getDouble();
		double v;
		float k;
		k = (float) 1 / 3;
		v = k * r * r * h * Math.PI;
		System.out.println("Zapremina kupe zadatog poluprecnika i visine je");
		System.out.printf("% 3.2f", v);

	}

}
