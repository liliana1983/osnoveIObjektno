package drugi_projekat;

public class EnumDemo {
	enum Dan { PONEDELJAK, UTORAK, SREDA, CETVRTAK, PETAK, SUBOTA, NEDELJA}
	enum Mesec { JANUAR, FEBRUAR, MART, APRIL, MAJ, JUN, JUL, AUGUST, SEPTEMBAR, OKTOBAR,
	NOVEMBAR, DECEMBAR }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dan danRodjenja; // promenljiva tipa Dan.
		Mesec mesecRodjenja; // promenljiva tipa Mesec.
		danRodjenja = Dan.SUBOTA; // dodela vrednosti promenljivoj tipa Dan.
		mesecRodjenja = Mesec.FEBRUAR; // dodela vrednosti promenljivoj tipa Mesec.
		System.out.println("Moj znak je vodolija, jer sam ja rodjen u " + mesecRodjenja + "u.");
		System.out.println("To je "+ (mesecRodjenja.ordinal() + 1) + ". mesec godine."); // zasto +1
		System.out.println("Dan kada sam se rodio je " + danRodjenja + ".");
		System.out.println( danRodjenja + " je " + (danRodjenja.ordinal()+1) + ". dan nedelje.");
		
	}

}
