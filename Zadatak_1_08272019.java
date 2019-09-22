package Domaci_08272019_Utorak;

public class Zadatak_1_08272019 {
	// Napisati klasu Knjige koja ima sledeca polja:
	// naziv knjige,
	// autora,
	// broj strana,
	// godinu izdanja.
	// Sva polja mogu da se dohvate, a godina izdanja moze i da se postavi.

	// Napisati glavni program koji kreira tri knjige i ispisuje sve njihove
	// podatke.

	private String knjiga;// get
	private String autor;// get
	private int strane;// get
	private int godinaIzdanja; // get, set

	public Zadatak_1_08272019(String knjiga, String autor, int strane, int godinaIzdanja) {
		this.knjiga = knjiga;
		this.autor = autor;
		this.strane = strane;
		this.godinaIzdanja = godinaIzdanja;
	}

	public String getKnjiga() {
		return knjiga;
	}

	public String getAutor() {
		return autor;
	}

	public int getStrane() {
		return strane;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public int setGodinaIzdanja() {
		return godinaIzdanja;
	}
}
