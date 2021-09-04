package drugi_projekat;

public class JednacinaStanja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 1;

double V;
V= 3; /* zapremina mora biti data u metrima kubnim */
double T;
T = 273F;/* temperatura mora biti zadata u Kelvinima*/
float R;
R = 8.314472F; /* R je univerzalna gasna konstanta*/
double p;

p = (n*R*T)/V; /* jednacina stanja idealnog gasa */ 
System.out.println("pritisak gasa na temperaturi od 273" + '\n' + "Kelvina, zapremine 3 metra kubna i kolicine jednog mola je " +p);
	}

}
