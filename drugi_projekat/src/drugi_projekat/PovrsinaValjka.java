package drugi_projekat;

public class PovrsinaValjka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double r; /*poluprecnik valjka*/
r = 0.02; /* metara*/
double h; /*visina valjka*/
h = 0.10; /*metara*/
 double p; /*povrsina valjka*/ 
 
 p = 2*r*(r+h)*Math.PI;  /*povrsina valjka izracunata po formuli*/
 
 System.out.println("Povrsina valjka poluprecnika " + r + " metara"+ " i visine " + h + " metar"+ '\n'+ "iznosi " + p + "metara kvadratnih");
 
	}

}
