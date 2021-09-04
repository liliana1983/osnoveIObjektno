package matematika;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LinearnaFunkcija implements Funkcija {
	/*
	 * Klasu LinearnaFunkcija (za predstavljanje funkcija oblika y=a*x+b) koja
	 * implementira interfejs Funkcija.
	 */
	private double a;
	private double b;
	private double x;
	private double nule[]=new double [2];
	LinearnaFunkcija() {
	}

	public double izracunajVrednost(double x) {
		double y = a * x + b;
		System.out.println("f("+x+")="+y);
		return y;
	}

	@Override
	public void upisiNuleFunkcije(String imeFajla) {
		PrintWriter pw = null;
		try {
			if(proveriRealneNule())
				pw = new PrintWriter(new FileOutputStream(imeFajla));
			for (double nule : izracunajNule())					//stavila sam u petlju jer sam definisala niz nula
				pw.println(nule + " su nule funkcije ");		//ovde imamo samo jedan elemnt niza tako da je moglo i bez for petlje
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

	@Override
	public boolean proveriRealneNule() {
		if(a!=0) {
		System.out.println("Linearna funkcija uvek ima realne nule");//obzirom da nije u pitanju jednacina vec fja nikad nemamo varijantu da 
		return true;}												//je x=0/0 jer ako je y 0 x je 0, mozemo imati varijantu samo da je y=b sto nam daje pravu
		return false;												//koja je paralelna sa x osom i nema nule, ali nule linearne funkcije su uvek realne ukoliko postoje
	}

	public double[] izracunajNule() {
		double x = (-b) / a;
		System.out.println(x);
		return new double[] { x };
	}

	@Override
	public void ucitajParametre(String imeFajla) {
		Scanner s = null;
		try {
			s = new Scanner(new File(imeFajla));
				this.a = s.nextDouble();
				@SuppressWarnings("unused")
				Scanner d = s.skip(Pattern.compile(".")); //kako sam parametre a i b u fajlu pisala sa razmakom
				this.b = s.nextDouble();				// skip pattern mi omogucava da preskocim spejs izmedju 
		} catch (IOException e) {						//i da citam sledeci parametar (u zavisnosti od izgleda 
			System.out.println(e.getMessage());			//txt fajla mogu se koristiti razne metode za citanje linija)
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	@Override
	public void ispisiFunkciju() {
		System.out.println("f(x)=" + a + "x" + "+" + b);
	}

}
