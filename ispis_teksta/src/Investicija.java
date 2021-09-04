
public class Investicija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double investicija;
		double stopa;
		double zarada;
		investicija = 1000;
		stopa = 0.027;
		zarada = investicija*stopa;
		investicija = investicija + zarada;
		System.out.println("za godinu dana zaradjeno je : " + zarada + "dinara ." +'\n' + "Ukupna vrednost investicije je sada : " + investicija + "dinara.");
		
	}

}
