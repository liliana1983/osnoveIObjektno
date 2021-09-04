package definisanje_nizova;

public class apsolutnaVrednost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXEL = 40;
		int X[]= new int [MAXEL];
		int i;
		int n;
		System.out.println("Unesite broj clanova niza");
		do {
			n=TextIO.getInt();
			if (n<1 || n>40)
			System.out.println("broj clanova mora biti veci od jedan a manji od 40"); 
		}while (n<1 || n>40);
		
		System.out.println("unesi clanove niza X");
		
		for (i=0;i<n;i++)
			X[i]=TextIO.getInt();
		
		for (i=0;i<n;i++) {
				X[i]=Math.abs(X[i]);
		
		System.out.println(X[i]);}
	}

}
