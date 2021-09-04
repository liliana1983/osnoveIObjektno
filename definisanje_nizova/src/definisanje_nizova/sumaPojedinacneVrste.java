package definisanje_nizova;

public class sumaPojedinacneVrste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAXVRSTA =10;
		final int MAXKOLONA=20;
		int Nvr=1;
		int Nko = 1; 
		int i; 
		int j;
		float srvr;
		srvr = 0;
		int[][]MatricaPrirodnihBrojeva = new int [MAXVRSTA][MAXKOLONA];
		System.out.println("Program za racunanje srednje vrednosti elemenata matrice prirodnih brojeva. \n\n");
		System.out.println("Unesite broj vrsta i kolona: \t");
		Nvr=TextIO.getInt();
		Nko=TextIO.getInt();
		for (i=0;i<Nvr;i++)
			for(j=0;j<Nko;j++) {
				System.out.println("Unesite element matrice na koordinati [" +(i+1)+"][" +(j+1)+"]:\t");
				MatricaPrirodnihBrojeva[i][j]=TextIO.getInt();}
		for (i=0; i<Nvr;i++)
			for(j=0;j<Nko;j++)
				srvr +=MatricaPrirodnihBrojeva[i][j];
		srvr /=(Nvr*Nko);
		System.out.println("Srednja vrednost elemenata matrice iznosi " +srvr +".");
	}

}
