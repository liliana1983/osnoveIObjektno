import java.util.Scanner;

public class AkcijaZaDinar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos= new Scanner(System.in);
double min;
double artikal1;
double artikal2;
double artikal3;
double cenaBezPopusta,cenaSaPopustom;
System.out.println("Unesite cene tri artikla: ");
artikal1=unos.nextDouble();
artikal2=unos.nextDouble();
artikal3=unos.nextDouble();
/*Racunamo minimum 3 broja jer se artikal koji je najmanji
 * prodaje za jedan dinar*/
min= artikal1;
if(min>artikal2)
	min=artikal2;
if (min>artikal3)
	min=artikal3;
cenaBezPopusta=artikal1+artikal2+artikal3;
System.out.println("Cena bez popusta iznosi : "+cenaBezPopusta);
cenaSaPopustom= artikal1+artikal2+artikal3-min +1;
System.out.println("Cena sa popustom iznosi:  "+cenaSaPopustom);


	}

}
