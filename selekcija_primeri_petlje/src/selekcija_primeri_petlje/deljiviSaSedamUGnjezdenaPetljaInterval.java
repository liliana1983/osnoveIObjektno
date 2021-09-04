package selekcija_primeri_petlje;

public class deljiviSaSedamUGnjezdenaPetljaInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program za odredjivanje brojeva deljivih sa 7");
		int n = 0,k=-1, a = 0;
		System.out.println("Unesite brojeve u opsegu 6-142:");
		System.out.println("Za kraj uneti broj -1");
		while (a != -1) {
			do {
			a = TextIO.getlnInt();
			
			if (((a<6) || (a>142))&&(a!=-1)) {
				System.out.println("Broj mora biti u opsegu 6-142!");
				}			
			}
			while (((a<6) || (a>142))&&(a!=-1)); 
			k++;
			if (a % 7 == 0) 
				n++;
		}
		
		System.out.println("Uneto je " + k + " brojeva od kojih su "+ n+" deljivi sa 7");
		
		System.out.println("Sto je u procentima " + 100.*n/k + " %");
		
	
	}

}
