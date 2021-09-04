package oop_uvod;

public class GlavnaKlasa {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Student prvi = new Student("Milos", "Gucu",19,101, 77.5, 65.5);
		Student drugi = new Student("Ljiljana", "Curcic",38,202, 38.5, 23.2);
		Zena treca= new Zena("Ljiljana","Curcic", "Curcic");

		/*
		 * Student prvi = new Student(); Student drugi = new Student();
		 * prvi.imePrezime("Milos", "Gucu"); drugi.imePrezime("Ljiljana", "Curcic");
		 * prvi.poeni(77, 65.5); drugi.poeni(38.5, 23.2);
		 */
		prvi.prosekIspita();
		drugi.prosekIspita();
		prvi.stampajPoene();
		drugi.stampajPoene();
		treca.predstaviSe();
	}
}
