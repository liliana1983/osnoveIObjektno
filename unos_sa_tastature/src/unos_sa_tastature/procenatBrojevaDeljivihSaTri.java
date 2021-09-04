package unos_sa_tastature;

import java.util.Scanner;


public class procenatBrojevaDeljivihSaTri {
public static int MAXELNIZA=62;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i,j, N ;
		  int br=0;
		  int [] niz=new int[MAXELNIZA];
		  double procenat=0;
		  Scanner sc= new Scanner(System.in);
		 
		  do {	 
			  System.out.println("Unesite broj prirodnih brojeva");
			  N= sc.nextInt();
			  
			  for (i = 0; i<N; i++) {
			 	 System.out.println("Unesite " + (i+1) + ".element niza:\t");
			 	 niz[i] = sc.nextInt();}
			 	System.out.println("Vasi uneti brojevi su sledeci : "+ niz[i]);
			  for (i = 0; i <= N; i++) 
		            if (niz[i] % 3 == 0) {
		                br = br + 1;}
		            System.out.println("Ukupno brojeva deljivih sa brojem 3 u ovom intervalu je: " + br);
			  
			  } while (N<0);
			  procenat= (br/N)*100;
				  	
	       
	 System.out.println("procenat brojeva deljivih sa 3 u opsegu (15,62) je: "+ procenat+"%");
	}

}