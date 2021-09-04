import java.util.Scanner;

public class NajvecaCifraCetvorocifrenogBroja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,d,n,max;
Scanner unos=new Scanner(System.in);
System.out.println("Unesite cetvorocifreni broj ");
n=unos.nextInt();
n=Math.abs(n);
if (n<1000 || n>9999) {
	System.out.println("Niste uneli cetvorocifren broj");
}
a=n%10;
b=(n%10)%10;
c=(n%100)%10;
d= (n/1000);
/*odredjuje se maksimalna cifra u cetvorocifrenom broju*/
max=a;
if(b>max)
	max=b;
if(c>max)
	max=c;
if(d>max)
	max=d;
System.out.println("Najveca cifra ovog cetvorocifrenog broja je "+max);
	}

}
