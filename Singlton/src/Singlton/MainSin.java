package Singlton;

public class MainSin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Singlton s1= Singlton.pribaviInstancu();
	Singlton s2= Singlton.pribaviInstancu();
	Singlton s3= Singlton.pribaviInstancu();
	s1.str="Pozdrav!";
	s1=s2;
	s2.str="pozdrav dragi moji polaznici";

	System.out.println(s1);
		}
	}

