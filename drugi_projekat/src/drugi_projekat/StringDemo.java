package drugi_projekat;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Program";
		String s2 = "iranje";
		String s3 = " i programski jezici";
		System.out.println("String s1: " + s1);
		s1 = s1 + s2;
		System.out.println("String s1 nakon prve konkatacije: " + s1);
		s1 = s1 + s3;
		System.out.println("String s1 nakon prve konkatacije: " + s1);
		System.out.println("String s1 konvertovan u mala slova: " + s1.toLowerCase());
		System.out.println("String s1 konvertovan u velika slova: " + s1.toUpperCase());
		System.out.println("Karakter na 3.oj poziciji u stringu s1: " + s1.charAt(2));
		System.out.println("Rezultat poredjenja stringova s1 i s3: " + s1.compareTo(s3));
		System.out.println("Rezultat poredjenja da li su stringovi s2 i s3 jednaki: " +
		s2.equals(s3));
		System.out.println("Podstring stringa s1 izmedju 4 i 10 karaktare je: " +
		s1.substring(3, 9));
		
		System.out.println (s1.length());
		
		String tekst1 = "Dobro ";
		String tekst2 = "Dosli";
		System.out.println (tekst1.length()); 
		String tekst3;
		tekst3 = tekst1 +tekst2;
		
		System.out.println(tekst3);
		System.out.println(tekst1.toLowerCase());
		
		System.out.println(tekst3.toUpperCase());
	}

}
