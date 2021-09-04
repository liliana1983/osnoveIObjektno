
public class KolikoPutaSePojavljujeSlovo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
int ukSlova=0;
char slovo;
int i;
int ukPojSlova=0;
System.out.println("Unesite jedan red teksta: ");
str=TextIO.getlnString();
str = str.toUpperCase();

System.out.print("   ");
for (slovo='A';slovo<='Z'; slovo ++) {
	for(i=0;i<str.length();i++) {
		if(slovo==str.charAt(i)) {
			ukPojSlova++;
		}
	}if (ukPojSlova>0) {
		System.out.println(slovo + "("+ukPojSlova+")");
		ukSlova++;
		ukPojSlova=0;
	}
}
System.out.println();
System.out.println("Otkriveno je "+ ukSlova+" razlicitih slova.");
	}

}
