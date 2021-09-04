package selekcija_primeri_petlje;

public class FibonaciNiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2;
		int[] fibo = new int[10];
		fibo[0] = 1;
		fibo[1] = 1;
		for (i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			System.out.print(fibo[i]);}
		
	}
}
