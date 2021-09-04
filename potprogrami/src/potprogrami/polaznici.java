package potprogrami;

public class polaznici {
	static int MAXPOLAZNIKA = 25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] listaPolaznika = new String[MAXPOLAZNIKA][4];
		int brPolaznika = 0;
		String str1="da";
		String str2;
		String [] vrstaSorta= {"ime","prezime", "jmbg","grad"};
		System.out.println("-- Program za unos i sortiranje liste polaznika --");
		brPolaznika = unosBrojaPolaznika();
		unosPolaznika(listaPolaznika, brPolaznika);
		do{
			sortiranje(listaPolaznika,brPolaznika);
			prikazPolaznika(listaPolaznika, brPolaznika, vrstaSorta);
		
			System.out.println("Ako zelite da ponovite sortiranje po drugom parametru ukucajte da");
		str2=TextIO.getWord();
		
		}while(str1.equalsIgnoreCase(str2));
		
	}

	static int unosBrojaPolaznika() {
		int brojEl = 0;
		System.out.println("Unesite broj polaznika (maksimalno 40):");
		brojEl = TextIO.getlnInt();
		return brojEl;
	}

	static void unosPolaznika(String[][] polaznici, int brPolaznika) {
		int i = 0;
		System.out.println("------------------------------------------------");
		for (i = 0; i < brPolaznika; i++) {
			System.out.println("Unesite podatke za " + (i + 1) + ". polaznika:");
			System.out.print("Ime:\t\t");
			polaznici[i][0] = TextIO.getlnWord();
			System.out.print("Prezime:\t");
			polaznici[i][1] = TextIO.getlnWord();
			;
			System.out.print("JMBG:\t\t");
			polaznici[i][2] = TextIO.getlnWord();
			;
			System.out.print("Grad:\t\t");
			polaznici[i][3] = TextIO.getlnWord();
			;
			System.out.println("-------------------------------------------------");
		}
	}

	static void sortiranje(String[][] polaznici, int brPolaznika) {
		int i, j;
		System.out.println(
				"Izaberite po kom kriterijumu zelite da se izvrsi sortiranje: 1. po imenu, 2. po prezimenu, 3. po jmbg, 4, po gradu");
		int izbor;
		izbor = TextIO.getInt();
		for (i = 0; i < brPolaznika - 1; i++)
			for (j = i + 1; j < brPolaznika; j++)
				if (polaznici[i][izbor-1].compareTo(polaznici[j][izbor-1]) > 0)
					zamena(polaznici, i, j);
	}

	static void zamena(String[][] polaznici, int koga, int kim) {
		int i = 0;
		String podatakOPolazniku;
		for (i = 0; i < 4; i++) {
			podatakOPolazniku = polaznici[koga][i];
			polaznici[koga][i] = polaznici[kim][i];
			polaznici[kim][i] = podatakOPolazniku;
		}
	}

	static void prikazPolaznika(String[][] polaznici, int brPolaznika, String[] vrstaSorta) {
		int i;
		System.out.println("Lista polaznika sortirana prema " + vrstaSorta + ":");
		System.out.println("--------------------------------------------------");
		for (i = 0; i < brPolaznika; i++) {
			System.out.println("R.br:\t\t_" + (i + 1) + "_");
			System.out.println("Ime:\t\t" + polaznici[i][0]);
			System.out.println("Prezime:\t" + polaznici[i][1]);
			System.out.println("JMBG:\t\t" + polaznici[i][2]);
			System.out.println("Grad:\t\t" + polaznici[i][3]);
			System.out.println("--------------------------------------------------");
		}
	}
}
