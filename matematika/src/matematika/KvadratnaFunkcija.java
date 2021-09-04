package matematika;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class KvadratnaFunkcija implements Funkcija {
	/*
	 * Klasu KvadratnaFunkcija (za predstavljanje funkcija oblika y=a*x^2+b*x+c)
	 * koja takođe implementira interfejs Funkcija.
	 */
	private double a, b, c, x, d;
	private double nule[] = new double[2];// obzirom na to da mi je metoda izracunaj nule double,
											// a imamo dve nule, kako return vraca samo jednu vrednost

	KvadratnaFunkcija() { 					// morala sam smisliti kako da upakuje dve nule, zbog toga
	} 										// sam napravila niz nula, i stavila da je maks elemenata 2


	public double izracunajVrednost(double x) {
		double y;
		y = Math.round(a * Math.pow(x, 2) + b * x + c);
		System.out.println("f(" + x + ")=" + y);
		return y;
	}

	@Override
	public boolean proveriRealneNule() {			 // zadatak je bio samo da proverimo da li su realne nule
		d = b * b - 4 * a * c; 					// ako je diskriminanta veca ili jednaka od nule nule su realne
		if (this.d >= 0) {				// za razliku od prvog domaceg ovde nisam htela da diskutujem da li su
			return true; 				// realne a razlicite ili realne i iste
		}else
			return false;
	}

	@Override
	public double[] izracunajNule() {
		if (this.d >= 0) {
			double x1 = Math.round((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			double x2 = Math.round((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			nule[0] = x1;
			nule[1] = x2;
			System.out.println("x1=" + nule[0] + " " + "x2=" + nule[1]);
			return nule; 				// imaginarne nule nismo zapisivali, iako bismo mogli kao i u prvom domacem
		} else 							// ispisati i racunati imaginarni i realni deo zasebno
			return null; 				// eksplicitno stoji u tekstu zadatka:upisati nule funkcija (ukoliko postoje)
	}

	@Override
	public void ucitajParametre(String imeFajla) {
		Scanner s = null;
		try {
			s = new Scanner(new File(imeFajla));
			a = s.nextDouble();
			@SuppressWarnings("unused")
			Scanner d = s.skip(Pattern.compile("."));
			b = s.nextDouble();
			c = s.nextDouble();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	@Override
	public void upisiNuleFunkcije(String imeFajla) {
		PrintWriter pw = null;
		try {
			if (proveriRealneNule()) { 						// ovim se osiguravam da mi stampa samo realne nule
				pw = new PrintWriter(new FileOutputStream(imeFajla));
				for (double nule : this.izracunajNule())
					pw.println(nule + " su nule funkcije ");
			} else {
				String s = "nule su imaginarne";
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}

	@Override
	public void ispisiFunkciju() {
		System.out.println("f(x)=" + a + "x^2+" + b + "x+" + c);
	}

}
