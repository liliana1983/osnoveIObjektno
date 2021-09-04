package definisanje_nizova;

public class minElementNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXEL = 20;
		int X[]= new int [MAXEL];
		int n;
		int i;
		int min;
		int pozicija = 0;
		 int j;
		System.out.println("Unesite broj clanova niza");
		do {
			n=TextIO.getInt();
			if (n<1 || n>12)
			System.out.println("broj clanova mora biti veci od jedan a manji od 12"); 
		}while (n<1 || n>12);
	System.out.println("Unesite clanove niza");
	for (i=0;i<n;i++)
		X[i]=TextIO.getInt();
	min =X[0];
	for(j=1;j<n;j++)
		if(min>X[j])
			{min = X[j];
		pozicija=j;}
	System.out.println("Najmanji clan niza je " + min + "pozicija minimuma je"+(pozicija+1));
	
	
		
	}

}
