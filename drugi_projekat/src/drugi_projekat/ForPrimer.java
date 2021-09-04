package drugi_projekat;

public class ForPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1;
		int i = 1, suma = 0;
		System.out.println("Program za racunanje sume prvih N prirodnih brojeva.");
		System.out.println("Unesite N: ");
		
		do {
		N = TextIO.getlnInt();
		if (N < 1)
		System.out.println("N mora biti veci od 0. Unesite ponovo N: ");} 
		while (N < 1);
		
		while (i <= N){
			suma = suma + i;
			i++; //uzrokuje da (i <= broj) konvergira nuli
			}
			
		//for (i = 1; i <= N ; i++) {
		//suma += i;
		System.out.println("Suma prvih " + N + " prirodnih brojeva je: " + suma + ".");
	}
}

