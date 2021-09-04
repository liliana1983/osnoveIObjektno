package oop_uvod;

public class Student extends Osoba {
	
		private double test1, test2, prosek,brojIndeksa; 
		Student(String ime, String prezime,int starost, int brojIndeksa,double t1, double t2){
			super(ime,prezime,starost);
			this.brojIndeksa=brojIndeksa;
			this.test1 = t1;
			this.test2 = t2;
			}

		public double getBrojIndeksa() {
			return brojIndeksa;
		}

		public void setBrojIndeksa(double brojIndeksa) {
			this.brojIndeksa = brojIndeksa;
		}

		void poeni(double t1, double t2) {
			test1 = t1;
			test2 = t2;
		}

		void prosekIspita() { 
			prosek = (test1 + test2) / 2;
		}

		void stampajPoene() {
			System.out.println("Student " + ime + " " + prezime + " - prosecan broj poena: " + prosek);
		}
	}

