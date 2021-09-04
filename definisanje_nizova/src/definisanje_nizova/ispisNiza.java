package definisanje_nizova;

public class ispisNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int maxel =50;
		int niz []= new int [maxel];
		int n = 1;
System.out.println("Unesite broj clanova niza");
 n = TextIO.getInt();
int i;
for (i=0;i<n;i++)
	System.out.println("Unesite" +(i+1)+"element niza:\t");
	niz[i]=TextIO.getInt();
do {
System.out.println(niz[i]);
} while (i<n);
	}

}
