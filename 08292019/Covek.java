package Dom0829;

//Covek ima ime, prezime i godinu rodjenja.
//Ime i prezime mogu da se i dohvate i postave,
//dok godina rodjenja moze samo da se dohvati.
//Coveka ispisati u formatu: Ime_Prezime[godina rodjenja].
public class Covek {
	protected String ime;// g/s
	protected String prezime;// g/s
	protected int godinaRodj;// g

	public Covek(String ime, String prezime, int godinaRodj) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodj = godinaRodj;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodinaRodj() {
		return godinaRodj;
	}

	public String ispisi() {// Ime_Prezime[godina rodjenja].
		return ime + "_" + prezime + "[" + godinaRodj + "]";
	}

}
