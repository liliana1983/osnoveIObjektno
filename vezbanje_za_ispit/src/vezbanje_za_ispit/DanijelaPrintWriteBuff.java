package vezbanje_za_ispit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaKlijenata implements RadSaFajlovima, RadSaKlijentima {
	
	private ArrayList<Klijent> klijenti;
	
	public ListaKlijenata() {
		this.klijenti=new ArrayList<Klijent>();
	}
	
	
	public ArrayList<Klijent> getKlijenti() {
		return klijenti;
	}


	public void setKlijenti(ArrayList<Klijent> klijenti) {
		this.klijenti = klijenti;
	}


	@Override
	public void dodajKlijenta(Klijent k) {
		if(pronadjiKlijenta(k.getBrTel())==null) {
			klijenti.add(k);
			System.out.println("Uspesno dodat nov klijent u listu klijenata.");
		} 
		else System.out.println("Ovaj klijent vec postoji u listi klijenata.");
	}
	@Override
	public void obrisiKlijenta(Klijent k) {
		if(pronadjiKlijenta(k.getBrTel())!=null) {	
			klijenti.remove(k);
			System.out.println("Uspesno izbrisan klijent iz liste klijenata.");
		} 
		else System.out.println("Ovaj klijent ne postoji u listi klijenata.");
	}
	
	@Override
	public Klijent pronadjiKlijenta(String brTel) {
		for(Klijent k:klijenti) {
			if(k.getBrTel().equals(brTel))return k;
		}
		return null;
	}

//	@Override
//	public void ucitajIzFajla(String imeFajla) {
//		Scanner ulaz = null;
//		try {
//			ulaz = new Scanner(new File(imeFajla)).useDelimiter("---");
//			
//			while (ulaz.hasNext()){
////				Klijent k=new Klijent();
//				String ime=ulaz.next();
//				System.out.println(ime);
//				String prezime=ulaz.next();
//				System.out.println(prezime);
//				String ulica=ulaz.next();
//				System.out.println(ulica);
//				String broj=ulaz.next();
//				System.out.println(broj);
//				String brTel=ulaz.next();
//				System.out.println(brTel);
//							
//				Klijent k=new Klijent(ime, prezime,ulica, broj,brTel);
//				System.out.println(k);
//				dodajKlijenta(k);
//			}
//			
//				System.out.println("Lista uspesno procitana iz fajla: "+imeFajla);
//			
//		} catch (IOException e) {
//
//			System.out.println(e.getMessage());
//
//		} finally {
//
//			if (ulaz != null) {
//				ulaz.close();
//			}
//		}
//	}
	
	
	@Override
	public void ucitajIzFajla(String imeFajla) {
		
		// kreiramo BufferedReader objekat nad tvojim fajlom
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader(imeFajla));
			
			// kreiramo praznu liniju koju cemo da punimo trenutnom linijom iz fajla
			String line = null;
			
			// sve dok ne napunimo liniju praznom linijom idemo dalje
			while ((line = br.readLine()) != null) {
				
				// razdelimo liniju u tokene prema delimiteru
				String[] tokens = line.split("---");
				
				// poslednja linija moze da da nula tokena pa cemo proveriti da li se to desava
				if (tokens.length == 5)
					
					// koristimo metod koji si vec napisala, ne dodajemo direkt u listu
					dodajKlijenta(
							new Klijent(
									// trimujemo praznine sa pocetka i kraja tokena - mogu se desiti ponekad
									tokens[0].trim(), 
									tokens[1].trim(), 
									tokens[2].trim(), 
									tokens[3].trim(), 
									tokens[4].trim())
							);
			}
			
		} catch (IOException e) {
			System.err.println("Greska prilikom citanja fajla -> ");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.err.println("Greska prilikom zatvaranja fajla -> ");
				e.printStackTrace();
			}
		}
	}

	@Override
	public void upisiUFajl(String imeFajla) {
		PrintWriter izlaz = null;
		try {
			izlaz = new PrintWriter(new FileOutputStream(imeFajla));
			for(Klijent k:klijenti)
			{
				izlaz.println(k.stringZaFajl());
				}
			System.out.println("Lista uspesno upisana u fajl: "+imeFajla);
		
		} catch (IOException e) {

			System.out.println(e.getMessage());

		} finally {
			
			if (izlaz != null) {
				izlaz.close();
			}

		}

	}
	
public void stampaj() {
		System.out.println("Lista klijenata:");
		for ( Klijent k:klijenti) {
			System.out.println(k);
		}
	}
}