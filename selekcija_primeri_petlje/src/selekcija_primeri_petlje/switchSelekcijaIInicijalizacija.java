package selekcija_primeri_petlje;

public class switchSelekcijaIInicijalizacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int status;
String potez;
System.out.println("unesite broj od 0 do 3");
status =TextIO.getInt();
switch (status) {
		case 0: potez="pomerio gore";	
		System.out.println(potez);
		break;
		case 1: potez= "pomerio dole";
		System.out.println(potez);
		break;
		case 2: potez="pomerio levo";
		System.out.println(potez);
		break;
		case 3: potez="pomerio desno";
		System.out.println(potez);
		default: potez= "nije pomerio"; 
		System.out.println(potez);
}
	}

}
