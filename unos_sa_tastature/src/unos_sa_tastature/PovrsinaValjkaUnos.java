package unos_sa_tastature;

public class PovrsinaValjkaUnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		double h;
		double p;
		System.out.println("Unesite poluprecnik valjka i visinu valjka u metrima");
		r = TextIO.getlnDouble();
		h = TextIO.getlnDouble();
		p = 2 * r * (r + h) * Math.PI;
		System.out.println("Povrsina valjka datog poluprecnika i visine je: ");
		System.out.printf("%3.6f", p);
	}

}
