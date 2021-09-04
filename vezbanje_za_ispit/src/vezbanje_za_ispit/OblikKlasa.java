package vezbanje_za_ispit;

public abstract class OblikKlasa {
	protected String boja;
	protected String tip;
	protected int brojStrana;
	
	OblikKlasa(){}
	OblikKlasa(String boja,String tip,int brojStrana){
		this.boja=boja;
		this.tip=tip;
		this.brojStrana=brojStrana;
		
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public int getBrojStrana() {
		return brojStrana;
	}
	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}
public abstract double povrsina();
public abstract double obim();
}
