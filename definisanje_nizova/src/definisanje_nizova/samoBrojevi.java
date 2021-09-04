package definisanje_nizova;

public class samoBrojevi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final char MAXEL = 15;
		char X[]= new char [MAXEL];
		int n;
		n=1;
		char a[]= new char[MAXEL];
		System.out.println("Unesite broj clanova niza");
		do {
			n=TextIO.getInt();
			if (n<1 || n>15)
			System.out.println("broj clanova mora biti veci od jedan a manji od 15"); 
		}while (n<1 || n>15);
		int i;
		System.out.println("unesi clanove niza X");
		for (i=0;i<n;i++)
			X[i]=TextIO.getChar();
		for (i=0;i<n;i++)
			if (X[i]>='0' && X[i]<='9')
				{a[i]=X[i];
			System.out.println(a[i]);}
		
				
			}
		
	}


