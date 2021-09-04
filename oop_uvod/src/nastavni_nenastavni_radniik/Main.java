package nastavni_nenastavni_radniik;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nastavnik n = new Nastavnik("Tika", "Tikic", 45, 1.0,"redovni profesor", 10);
		Asistent a = new Asistent("Mika", "Mikic", 30, 1.0, "dr Dinu Dragan", 2);
		NenastavniRadnik nr = new NenastavniRadnik("Zika", "Zikic", 56, 1.0, "domar", 26);
		
		System.out.println(n);
		System.out.println("Nastavnikova plata : " + n.racunanjePlate());
		
		System.out.println(a);
		System.out.println("Asistentova plata : " + a.racunanjePlate());
		
		System.out.println(nr);
		System.out.println("Radnicka plata : " + nr.racunanjePlate());
	}

	}


