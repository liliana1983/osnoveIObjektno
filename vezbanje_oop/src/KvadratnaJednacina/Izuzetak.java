package KvadratnaJednacina;

public class Izuzetak {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/**
		 * Vraca veci od dva korena kvadratne jednacine A*x*x + B*x + C = 0, ako ona ima
		 * korena. Ako je A == 0 ili je diskriminanta B*B - 4*A*C negativna onda se
		 * generise izuzetak tipa IllegalArgumentException.
		 */
		double a = 1, b = 1, c = 1, d;
		try {
			d = koren(a, b, c);
		System.out.println("Koren je : " + d);}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	static public double koren( double A, double B, double C ) 
		throws IllegalArgumentException {
		if (A == 0) {
		throw new IllegalArgumentException("A ne moze biti nula!");
		}
		else {
		double disk = B*B - 4*A*C;
		if (disk < 0)
		throw new IllegalArgumentException("Diskriminanta manja od nule!");
		return (-B + Math.sqrt(disk)) / (2*A);
		}
	}}
