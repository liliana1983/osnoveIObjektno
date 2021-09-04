package definisanje_nizova;

public class prosecnaVrednost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXEL = 20;
		int X[]= new int [MAXEL];
		int n;
		int i;
		double S=0;
		System.out.println("Unesite broj clanova niza");
		do {
			n=TextIO.getInt();
			if (n<1 || n>12)
			System.out.println("broj clanova mora biti veci od jedan a manji od 12"); 
		}while (n<1 || n>12);
	System.out.println("Unesite clanove niza");
	for (i=0;i<n;i++)
		X[i]=TextIO.getInt();
	for (i=0;i<n;i++)
		S=S+X[i];
	double AS;
	AS=S/n;
	System.out.println("Aritmeticka sredina elemenata niza je : " +AS);
		
	}

}
