package definisanje_nizova;

public class sortirajNiz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXEL = 20;
		int X[]= new int [MAXEL];
		int n;
		int i,j;
		int b;
		int a[]= new int[MAXEL];
		System.out.println("Unesite broj clanova niza");
		do {
			n=TextIO.getInt();
			if (n<1 || n>20)
			System.out.println("broj clanova mora biti veci od jedan a manji od 20"); 
		}while (n<1 || n>20);
	System.out.println("Unesite clanove niza");
	for (i=0;i<n;i++)
		X[i]=TextIO.getInt();
	
      for(i=0;i<n-1;i++) {
    	  for (j=1;j<n;j++){
    	  if (X[i]>X[j])
    	  		{b= X[i];
    	  		X[i]=X[j];
    	  		X[j]=b;}}
      
	System.out.println("Sortirani niz po rastucem redosledu izgleda ovako: " );
	System.out.print("{");
	for (i=0;i<n;i++) {
		System.out.print(X[i]+ " ");
	}
	System.out.print("}");

}}}
