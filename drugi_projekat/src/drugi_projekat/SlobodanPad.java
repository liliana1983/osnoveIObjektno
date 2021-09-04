package drugi_projekat;

public class SlobodanPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double g = 10;
		double v0 = 0.0;
		double t = 10.0;
		double x = 0;
		double h = .5 * g * t *t;
		/* Izracunavanje. */
		h +=  v0 *t;
		h +=  x;
		/* Ispisivanje rezultata. */
		System.out.print("Od pocetka slobodnog pada telo je za vreme od");
		System.out.print(t);
		System.out.print(" sekundi je ");
		System.out.print("preslo "+ h);
		System.out.print("m.");
		}

}
