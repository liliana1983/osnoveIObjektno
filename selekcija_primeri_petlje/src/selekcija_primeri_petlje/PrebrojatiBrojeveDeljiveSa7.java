package selekcija_primeri_petlje;

public class PrebrojatiBrojeveDeljiveSa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int i, br = 0;
		   
	        for (i = 1; i <= 15; i++) {
	            if (i % 7 == 0)
	                br = br + 1;
	        }
	        System.out.println("Ukupno brojeva deljivih sa broje 7 u ovom intervalu je: " + br);
	    }
	}


