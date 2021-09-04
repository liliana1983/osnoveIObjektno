package elektronsko_poslovanje;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poslasticarnica p1 = new Poslasticarnica("Carigrad",1000);
		 Picerija p2= new Picerija("uron","meni");
		p1.nabaviInventar("sladoled");
		p2.nabaviInventar("Madjarica");
		p2.toString();
		System.out.print(p2.toString());
	}

	}
