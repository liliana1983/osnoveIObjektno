package selekcija_primeri_petlje;

import java.util.Scanner;

public class PrebrojatiBrojeveKojiNisuDeljiviSa7UIntervalu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
System.out.println("Unesite donju granicu intervala: ");
int k=sc.nextInt();
System.out.println("Unesite gornju granicu ");
int n=sc.nextInt();
int i ,br=0;
for (i=k;i<=n;i++) {
	if(i%7 !=0)
		br=br+1;
}System.out.println("ukupan broj brojeva koji nisu deljivi sa 7 u ovom intervalu je " +br);
	br=0;
	for (i = k; i <= n; i++) {
        if (i % 7 == 0) 
                br = br + 1;
        }
        System.out.println("Dok je broj deljivih sa sedam: " + br);
    }
}
