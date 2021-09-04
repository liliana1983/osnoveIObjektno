package drugi_projekat;

public class OtpornostProvodnika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double l; /* duzina provodnika u metrima*/
l= 0.2;
double r;
r =0.03; /*poluprecnik provodnika u metrima*/
final double ro;
ro = 1.588e-8D; /*svojstvo materijala od koga je sacinjen provodnik*/
double otpor;
otpor = ro*l/(r*r*3.14);
System.out.println("Otpor provodnika duzine " + l + "m" + " i poluprecnika r " + r + '\n'  + " m napravljenog od bakra" + " iznosi" + otpor);


	}

}
