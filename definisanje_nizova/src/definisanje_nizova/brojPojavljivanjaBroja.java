package definisanje_nizova;

public class brojPojavljivanjaBroja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXEL = 20;
		int X[]= new int [MAXEL];
		int n;
		int j;
		j=0;
		System.out.println("Unesite broj clanova niza");
		do {
			n=TextIO.getInt();
			if (n<1 || n>12)
			System.out.println("broj clanova mora biti veci od jedan a manji od 12"); 
		}while (n<1 || n>12);
		int br;
		System.out.println("unesite broj br");
		br= TextIO.getInt();
		int i;
		System.out.println("unesi clanove niza X");
		for (i=0;i<n;i++)
			X[i]=TextIO.getInt();
for(i=0;i<n;i++)
	{if (br==X[i])
			System.out.println("Broj postoji u nizu");}
		
		for (i=0;i<n;i++)
			if(br==X[i]) {
				j=j+1;}
				System.out.println("broj br se pojavljuje" + j+"puta");
				
			}
	}


