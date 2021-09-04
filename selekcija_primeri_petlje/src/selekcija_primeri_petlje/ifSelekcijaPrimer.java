package selekcija_primeri_petlje;

public class ifSelekcijaPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ocena;
do {
	
System.out.println("Program za ispis uspeha na osnovu unete ocene.");
System.out.print("Unesite ocenu: ");
ocena = TextIO.getlnInt();}
while(ocena<1 || ocena>5);
if (ocena==1)
	System.out.println("Nedovoljan");
else if (ocena == 2)
	System.out.println("Dovoljan");
else if (ocena==3)
	System.out.println("Dobar");
else if (ocena==4)
	System.out.println("Vrlo dobar");
else 
	System.out.println("Odlican");
	}

}
