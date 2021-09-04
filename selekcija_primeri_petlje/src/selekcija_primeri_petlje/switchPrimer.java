package selekcija_primeri_petlje;

public class switchPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ocena;
System.out.println("Unesite ocenu: ");
ocena = TextIO.getInt();
switch (ocena) {
	case 1: System.out.println("Nedovoljan");
			break;
	case 2: System.out.println("dovoljan");
			break;
	case 3: System.out.println("Dobar");
			break;
	case 4: System.out.println("Vrlo dobar");
			break;
	case 5: System.out.println("Odlican");
			break;
	default: System.out.println("Ocena mora biti izmedju 1 i 5");
}
	}

}
