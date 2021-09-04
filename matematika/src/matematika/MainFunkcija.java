package matematika;

public class MainFunkcija {

	public static void main(String[] args) {
		/*
		 * U test klasi definisati dve promenljive tipa interfejsa Funkcija, jednu
		 * referencirati na objekat tipa LinearnaFunkcija, a drugu na tip
		 * KvadratnaFunkcija. Parametre funkcija učitati iz datoteka
		 * funkcijaLinearna.txt (u datoteci su zapisani parametri a i b) i
		 * funkcijaKvadratna.txt (u datoteci su zapisani parametru a, b i c). Potom
		 * upisati nule funkcija (ukoliko postoje) u izlazne datoteke nuleLinearne.txt i
		 * nuleKvadratne.txt, respektivno.
		 */
		Funkcija prava = new LinearnaFunkcija();
		Funkcija parabola = new KvadratnaFunkcija();

		prava.ucitajParametre("funkcijaLinearna.txt");

		prava.izracunajNule();
		prava.ispisiFunkciju();
		prava.izracunajVrednost(5);

		prava.upisiNuleFunkcije("nuleLinearne.txt");

		parabola.ucitajParametre("funkcijaKvadratna.txt");

		parabola.ispisiFunkciju();
		parabola.izracunajVrednost(3);
		parabola.izracunajNule();

		parabola.upisiNuleFunkcije("nuleKvadratne.txt");

	}
}
