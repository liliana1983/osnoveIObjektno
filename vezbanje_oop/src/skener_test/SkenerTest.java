package skener_test;

import java.util.Scanner;

class SkenerTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite Vas JMBG: ");
		String jmbg = sc.next();
		System.out.println("Unesite Vase ime: ");
		String ime = sc.next();
		System.out.println("Unesite Vasu platu: ");
		double plata = sc.nextDouble();
		System.out.println("JMBG:" + jmbg + " Ime:" + ime + " Plata:" + plata);
		sc.close();
	}
}