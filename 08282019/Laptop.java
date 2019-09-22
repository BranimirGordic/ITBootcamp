package Ucionica_08282019_Domaci;

	//Laptop poseduje polaznika i marku koji se zadaju prilikom kreiranja.
	//Marka moze samo da se dohvati. 
	//Laptop takdje moze da menja polaznika ili da ostane bez polaznika.
	//Moze da se ispise u obliku: MARKA{POLAZNIK}

public class Laptop   {
	
	private Polaznik polaznik ;
	private String marka; //get
	
	public Laptop( String marka, Polaznik polaznik) {
		this.polaznik=polaznik;
		this.marka=marka;
	}
	public String getMarka() {
		return marka;
	}
	public Polaznik getPolaznik() {
		return polaznik;
	}
	public void izbaciPolaznika () {
		polaznik = null;
	}
	public String ispisi() {
		String s;
		if (polaznik== null) {
			s="Nema polaznika";
		} else {
			s=polaznik.toIspis();
		}
		return marka + "{"+s+"}" ;
	}
}
