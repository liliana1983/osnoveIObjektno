package unos_sa_tastature;

public class JednacinaStanjaIdealnogGasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		double v;
		int t;
		System.out.println("Kolicina gasa " + n + " mol");
		System.out.println("Unesite zapreminu gasa u metrima kubnim i temperaturu gasa u kelvinima");
		v = TextIO.getDouble();
		// System.out.println("Unesite temperaturu gasa u kelvinima");
		t = TextIO.getlnInt();
		double R;
		R = 3.314472F;
		System.out.printf("%2.2f ", R);
		System.out.print("je vrednost univerzalne gasne konstante R");
		double p;
		p = n * R * t / v;
		System.out.println('\n' + "Pritisak idealnog gasa na zadatoj temperaturi i zadate zapremine je ");
		System.out.printf("%7.2f", p);
		System.out.println(" paskala");
	}

}
