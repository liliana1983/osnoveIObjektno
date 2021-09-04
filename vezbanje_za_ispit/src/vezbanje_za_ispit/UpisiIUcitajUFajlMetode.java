package vezbanje_za_ispit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import poslovanjeRestorana.Klijent;
//**********************************************
public class UpisiIUcitajUFajlMetode {
	public void unosTxt(BufferedReader datoteka) {
		try {
			ime = datoteka.readLine();
			prezime = datoteka.readLine();
			jmbg = datoteka.readLine();
			tekuciRacun = datoteka.readLine();
			koefSS = Double.parseDouble(datoteka.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void upisTxt(BufferedWriter datoteka, double cenaRada) {
		try {
			datoteka.write(ime);
			datoteka.newLine();
			datoteka.write(prezime);
			datoteka.newLine();
			datoteka.write(tekuciRacun);
			datoteka.newLine();
			datoteka.write(Double.valueOf(izracunajPlatu(cenaRada)).toString());
			datoteka.newLine();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
//***********************************************************	
	try {
		ulaz=new FileReader("Spisak.txt");
		bafUlaz=new BufferedReader(ulaz);
		izlaz= new FileWriter ("Plate.txt");
		bafIzlaz= new BufferedWriter (izlaz);
		cenaRada= Double.parseDouble(bafUlaz.readLine());
		n=Integer.parseInt(bafUlaz.readLine());
		for (int i =0;i<n;i++) {
			znak=bafUlaz.readLine();
			Radnik r;
			if (znak.startsWith("+")) {
				r= new AktivanRadnik();
			}else {
				r=new RadnikNaBolovanju();
				
			}
			r.unosTxt(bafUlaz);;
			r.upisTxt(bafIzlaz, cenaRada);
		}
		System.out.println("Platni spisak je uspesno kreiran!");
	}catch (IOException e) {
		System.out.println(e.getMessage());
	}finally {
		if (bafUlaz !=null) {
			bafUlaz.close();
		}
		if (bafIzlaz!=null) {
			bafIzlaz.close();
		}
		if(izlaz !=null) {
			izlaz.close();
		}
	}
//****************************************************************************************
	public void ucitajFajl(String imeFajla) {
		Scanner s = null;
		ArrayList<Klijent> spisak = new ArrayList<Klijent>();
		try {
			s = new Scanner(new File(imeFajla));
			do {
				String ime = s.next();
				String prezime = s.next();
				String adresa = s.next();
				String telefon = s.next();
				Klijent noviGari = new Klijent(ime, prezime, adresa, telefon);
				spisak.add(noviGari);
			} while (s.hasNext());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
		this.spisak = spisak;
	}
//**************************************************************
	public void upisiUFajl(String imeFajla) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(imeFajla));
			for (Klijent noviGari : this.spisak)
				pw.println(noviGari.getIme() + " " + noviGari.getPrezime() + " " + noviGari.getTelefon() + " "
						+ noviGari.getAdresa());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
