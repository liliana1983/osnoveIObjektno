
public class MaksimalnaVrednostNiza {
final static int MAXELNIZA=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N=1;
int i;
int NizPrirodnihBrojeva[]=new int [MAXELNIZA];
int maks;
int pozMaks;
maks=NizPrirodnihBrojeva[0];
pozMaks=0;
System.out.println("Program za racunanje maksimalnog elementa u nizu prirodnih brojeva.");
System.out.print("Unesite N:\t");
 N=TextIO.getInt();
 for (i=0;i<N;i++) {
	 System.out.println("Unesite "+(i+1)+ ". element niza: \t");
	 NizPrirodnihBrojeva[i]=TextIO.getInt();
 }
 for (i=0;i<N;i++) {
	 if(maks<NizPrirodnihBrojeva[i]) {
		 maks=NizPrirodnihBrojeva[i];
		 pozMaks=i;
	 }
 }System.out.println("Najveca vrednost, "+maks+", ima"+(pozMaks+1)+". element niza.");
	}

}
