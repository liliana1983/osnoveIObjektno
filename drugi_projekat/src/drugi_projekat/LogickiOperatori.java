package drugi_projekat;

public class LogickiOperatori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true, b = false;
		/* Negacija. */
		System.out.print("Negacija od true je: "); System.out.println(!a);
		System.out.print("Negacija od false je: "); System.out.println(!b);
		/* I operacija. */
		System.out.print("true I false je: "); System.out.println(a && b);
		System.out.print("true I true je: "); System.out.println(a && a);
		System.out.print("false I false je: "); System.out.println(b && b);
		/* ILI operacija. */
		System.out.print("true ILI false je: "); System.out.println(a || b);
		System.out.print("true ILI true je: "); System.out.println(a || a);
		System.out.print("false ILI false je: "); System.out.println(b || b);
		/* Eksluzivno ILI operacija. */
		System.out.print("true EXILI false je: "); System.out.println(a ^ b);
		System.out.print("true EXILI true je: "); System.out.println(a ^ a);
		System.out.print("false EXILI false je: "); System.out.println(b ^ b);
		
	}

}
