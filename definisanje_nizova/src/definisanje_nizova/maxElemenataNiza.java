package definisanje_nizova;

public class maxElemenataNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXEL = 20;
		int X[]= new int [MAXEL];
		int n;
		int i;
		int max;
		int pozicija;
		pozicija=0;
		int j;
		System.out.println("Unesite broj clanova niza");
		do {
			n=TextIO.getInt();
			if (n<1 || n>20)
			System.out.println("broj clanova mora biti veci od jedan a manji od 20"); 
		}while (n<1 || n>20);
	System.out.println("Unesite clanove niza");
	for (i=0;i<n;i++)
		X[i]=TextIO.getInt();
	max =X[0];
	for(j=1;j<n;j++)
		if(max<X[j])
			{max = X[j];
		pozicija=j;}
	System.out.println("Najveci clan niza je " + max+ " njegova pozicija je " + pozicija);
	}

}
