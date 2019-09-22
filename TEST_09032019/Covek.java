package Test2;
// Covek poseduje naziv, jedinstveni automatski identifikator, JMBG i novac.

// Naziv i JMBG se zadaju prilikom kreiranja.

// Svi sadrzani podaci mogu samo da se dohvate. 

// Novac moze da se doda i da se oduzme, 

// gde je povratna vrednost indikator uspesnosti oduzimanja novca.

// Moze da se sastavi tekstualni zapis u obliku: IME_PREZIME[ID:JMBG:NOVAC]

public class Covek {
	private String ime, prezime;
	private static int IDR = 0;
	private int id;
	private String JMBG;
	private double novac;

	public Covek(String ime, String prezime, String jMBG) {
		super();
		this.ime=ime;
		this.prezime=prezime;
		JMBG = jMBG;
		this.id=IDR++;
		novac=0;
	}

	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public double getNovac() {
		return novac;
	}

	public void setNovac(double novac) {
		this.novac = novac;
	}


	public static int getIDR() {
		return IDR;
	}

	public int getId() {
		return id;
	}

	public String getJMBG() {
		return JMBG;
	}
	public boolean dodatiNovac (double pare) {
		if(novac>0) {
			novac+=pare;
			return true;
		}
		return false;
	}
	public boolean oduzetiNovac (double pare) {
		if(novac>=pare) {
			novac-=pare;
			return true;
		}
		return false;
	}

	//IME_PREZIME[ID:JMBG:NOVAC]
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(ime).append("_").append(prezime).append("[");
		sb.append(id).append(":").append(JMBG).append(":");
		sb.append(novac).append("]");
		return sb.toString();
	}
	

}
