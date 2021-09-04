package definisanje_nizova;

public class obrnutiRedosled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXEL = 20;
		int X[]= new int [MAXEL];
		int n;
		int i;
		System.out.println("Unesite broj clanova niza");
		do {
			n=TextIO.getInt();
			if (n<1 || n>20)
			System.out.println("broj clanova mora biti veci od jedan a manji od 20"); 
		}while (n<1 || n>20);	
		System.out.println("unesi clanove niza X");
		for (i=0;i<n;i++)
			X[i]=TextIO.getInt();
		System.out.println("obrnuti redosled niza: ");
		for (i=n-1; i>=0;i--)
			System.out.println(X[i]);
	}

}
