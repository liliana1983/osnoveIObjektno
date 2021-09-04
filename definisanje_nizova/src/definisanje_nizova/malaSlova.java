package definisanje_nizova;

public class malaSlova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char MAXEL = 15;
		char X[]= new char [MAXEL];
		int n;
		n=1;
		char a[]= new char[MAXEL];
		char b[] = new char[MAXEL];
		System.out.println("Unesite broj clanova niza");
		do {
			n=TextIO.getInt();
			if (n<1 || n>15)
			System.out.println("broj clanova mora biti veci od jedan a manji od 15"); 
		}while (n<1 || n>15);
		int i;
		System.out.println("unesi clanove niza X");
		for (i=0;i<n;i++)
			{X[i]=TextIO.getChar();
		b[i] = Character.toLowerCase(X[i]);}
		for (i=0;i<n;i++)
			if(X[i]==b[i])
			{a[i]=X[i];
			System.out.println(a[i]);}
	}

}
