package definisanje_nizova;

public class nizPrirodnihBrojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAXELNIZA = 50;
 int NizPrirodnihBrojeva[]= new int [MAXELNIZA];
 int i;
 int max = NizPrirodnihBrojeva[0];
 int pozicija = 0;
 int j;
 int N;
 do {	 
 System.out.println("Unesite broj prirodnih brojeva");
 N = TextIO.getInt();
  if (N<1 || N>50) 
	  System.out.println("N mora biti vece od 1 a manje od 50");
 
 for (i = 0; i<N; i++) {
	 System.out.println("Unesite " + (i+1) + ".element niza:\t");
	 NizPrirodnihBrojeva[i] = TextIO.getInt();}
 
 for (j =1; j<N; j++)
	 if (NizPrirodnihBrojeva [j]>max) {
		 max = NizPrirodnihBrojeva[j];
		 pozicija =j;}
 System.out.println("najveci broj je: " + max + " i on se nalazi na poziciji: " + pozicija);
 } while (N<0);
	 }
	}


