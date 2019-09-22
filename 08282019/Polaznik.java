package Ucionica_08282019_Domaci;

//	Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
//	Polaznik poseduje i identifikacioni broj  koji se moze dohvatiti. 
//	Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. 
//	Polaznik se ispisuje u obliku: IME_PREZIME{ID}.

public class Polaznik {
	
	private static int IDB=0; //indetifikacioni broj!
	private String ime;
	private String prezime;//get
	private int id;
	public Polaznik(String ime, String prezime) {
		this.ime=ime;
		this.prezime=prezime;
		id= ++IDB;
		
	}
	public static int getIDB () {
		return IDB;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getId() {
		return id;
	}
	public String toIspis () {
		return ime+ "_" + prezime +"{"+id+"}";
		
	}
	
	
}
