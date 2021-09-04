package unos_sa_tastature;

public class OtporUnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l;
		double d;
		double ro;
		ro = 1.588e-8;
		System.out.println("Unesite duzinu provodnika i precnik provodnika u metrima");
		l = TextIO.getDouble();
		d = TextIO.getDouble();
		double r;
		r = ro * 4 * l / (d * d * Math.PI);
		System.out.println("Otpornost provodnika date duzine i precnika poprecnog preseka je ");
		System.out.printf("%3.8f", r);

	}

}
