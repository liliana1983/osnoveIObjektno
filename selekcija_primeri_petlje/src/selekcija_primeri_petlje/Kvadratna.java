package selekcija_primeri_petlje;

public class Kvadratna {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;/* koeficijenti*/
	    double D; /*diskriminanta*/
		double x1; /*resenja x1 i x2*/
		double x2;
		double realni;		 /*u slucaju D<0 smo morali da razdvojimo realni i imaginarni deo resenja
		 					pa smo ih i definisali prethodno a nakon toga spajali u x1 i x2*/
	    double imaginarni;
	    String str1="da"; /*promenljivu string smo iskoristili kod upita da li korisnik zeli da unese nove parametre*/
	    String str2;
	    do {
		System.out.print("Unesite koeficijente a, b i c:");
		
		a = TextIO.getDouble();
		b = TextIO.getDouble();
		c = TextIO.getDouble();
		
		/* Proveravamo da li je kvadratna jednacina korektno zadata */
	    if (a == 0)
		if (b == 0)    /* prvi slucaj a==0 && b==0 && c==0 */
		if (c == 0)
		 System.out.print("Jednacina ima beskonacno mnogo resenja\n");  /* prvi slucaj a==0 && b==0 && c==0  jer se dobija iskaz koji je uvek tacan 0=0 i jednacina je neodredjena*/
	 else {																
		System.out.print("Jednacina nema resenja\n");/* slucaj a==0 && b==0 && c!=0  jednacina nema resenje jer se dobija sa leve strane c a sa desne 0, ova varijanta je nemoguca jer je taj iskaz uvek netacan*/
	 } else {											/* slucaj a==0 && b!=0 */
		 x1 = -c / b;   /* slucaj a==0 && b!=0 koeficijent pored kvadratnog clana je nula i nasa jednacina postaje linearna b*x+c=0 */
		 System.out.println("Jednacina je linearna i ima jedno resenje");
		System.out.println(x1);
		}
	else {
		D = b * b - 4 * a * c; /* slucaj a!=0 ukoliko je a razlicito od nule mozemo nastaviti sa izracunavanjem resenja */
		if (D < 0) {				/* posto nam je diskriminanta manja od nule, ispod korena cemo dobiti negativan broj, tako da smo rastavili nase x1 i x2 na realni i imaginarni deo*/
		    realni = -b/(2*a);
		    imaginarni = Math.sqrt(-(b*b-4*a*c))/(2*a); /*kako f-ja Math.sqrt ne moze da izracuna negativan koren dodala sam predznak minus koji mu menja znak da dobijemo realan broj*/
		System.out.println("Resenja jednacine su kompleksno konjugovani brojevi\n x1 =");
		System.out.printf("%.2f",realni);
		System.out.print("+i");						/*pomislila sam da Math. ima "poziv" za imaginarnu jedinicu ili da i mogu definisati kao i=sqrt(-1) medjutim fora nije uspela, pa sam improvizovala da dobijem resenje u obliku z=x+iy*/
		System.out.printf("%.2f",imaginarni);
		System.out.println ("\n x2=");
		System.out.printf("%.2f",realni);
		System.out.print("-i");
		System.out.printf("%.2f",imaginarni);
		
} else if (D > 0)            /*ako je diskriminanta veca od nule dobijamo dva realna resenja*/
		{x1 = (-b + Math.sqrt(D)) / (2 * a);
		 x2 = (-b - Math.sqrt(D)) / (2 * a);
		System.out.printf("Jednacina ima dva razlicita realna resenja %.2f ", "i %.2f\n", x1, x2);
		} 
		else {
		 x1 = (-b) / (2 * a);								/*ukoliko je diskriminanta jednaka nuli, imamo samo -b/2*a, slucajevi gde se jednacina moze napisati kao kvadrat binoma*/
		System.out.printf("Jednacina ima dva jednaka realna resenja, odnosno dvostruku nulu %.2f\n", x1);
		}
	}
		
	System.out.println("\nUkoliko zelite da ponovite unos koeficijenata, ukucajte da");
	str2=TextIO.getlnWord();}
	    while (str1.equals(str2));			/*ukoliko je uneti string da jednak sa prethodno definisanim vraca nazad korisnika na pocetak da unese koeficijente*/
	}
}

	
	


