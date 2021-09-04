package drugi_projekat;

public class WhileNaredba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int broj = 1, i = 1, fakt = 1;
		System.out.println("Program za racunanje faktorijala unetog broja.");
		System.out.println("Unesite broj: ");
		do{
			broj= TextIO.getlnInt();
			if (broj < 0)
			System.out.println("Broj mora biti veci ili jednak 0. Unesite ponovo broj: ");
				} 
		while (broj <0);
		i= broj;
		
		while (i > 1){
		fakt *= i;
		i--; //uzrokuje da (i <= broj) konvergira nuli
		}
		System.out.println("Faktorijal broja " + broj + " je: " + fakt + ".");
	}

}
