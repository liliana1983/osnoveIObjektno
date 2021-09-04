package matematika;

public interface Funkcija {
/* Interfejs Funkcija koji sadrži sledećih pet metode: 
 * učitavanje parametara funkcije iz tekstualne datoteke - ucitajParametre,
 *  izračunavanje vrednosti funkcije u zadatoj tački - izracunajVrednost, 
 *  ispitivanje da li funkcija ima realne nule - proveriRealneNule, 
 *  nalaženje nula funkcije - izracunajNule i ispisivanje nula u tekstualnu datoteku - upisiNule.
 */
	double  izracunajVrednost(double x);
	boolean proveriRealneNule();
	double [] izracunajNule();	
	void ucitajParametre(String imeFajla);
	void upisiNuleFunkcije(String imeFajla);
	void ispisiFunkciju();
}
