package definisanje_nizova;

public class parNepar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int MAXEL = 12;
int X[]= new int [MAXEL];
int n;
System.out.println("Unesite broj clanova niza");
do {
	n=TextIO.getInt();
	if (n<1 || n>12)
	System.out.println("broj clanova mora biti veci od jedan a manji od 12"); 
}while (n<1 || n>12);
int a[]=new int [n];
int b[]=new int [n];
int i;
System.out.println("unesi clanove niza X");
for (i=0;i<n;i++)
	X[i]=TextIO.getInt();
System.out.println(X[i]);
for (i=0; i<n;i++) {
	if (X[i]%2==0) { 
		a[i]=X[i];
	System.out.println(a[i]);}
		else {
			b[i]=X[i];
	System.out.println(b[i]);}}
	System.out.println("i X[i] a[i] b[i]");
for (i=0;i<n;i++) {
		System.out.println();
		System.out.print(i+"  "+ X[i]+"  "+a[i]+ "  "+ b[i]);}
}
	}


