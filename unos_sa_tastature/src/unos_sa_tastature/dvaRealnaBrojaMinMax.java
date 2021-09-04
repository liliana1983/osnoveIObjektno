package unos_sa_tastature;

public class dvaRealnaBrojaMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double min, max;
		double rez;
		System.out.println("Unesite dva realna broja a i b");
		a = TextIO.getDouble();
		b = TextIO.getDouble();
		min = (a < b) ? a : b;
		max = (a > b) ? a : b;
		rez = (min + 0.5) / (1 + max * max);
		System.out.printf("%2.2f", rez);
	}

}
