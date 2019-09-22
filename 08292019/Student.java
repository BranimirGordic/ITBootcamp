package Dom0829;

// Student je covek koji se kreira sa brojem indeksa
//i ima  trenutnu godinu studija i trenutni prosek.
//Sva polja mogu samo da se dohvate.
//Studenta ispisati u formatu:
//Ime_Prezime[godina rodjenja] je student ___ (god studija) godine studija sa prosekom____ (trenutni prosek).
public class Student extends Covek {

	private int brInd;
	public int godStud;
	public double prosek;

	public Student(String ime, String prezime, int godinaRodj, int brInd, int godStud, double prosek) {
		super(ime, prezime, godinaRodj);
		this.brInd = brInd;
		this.godStud = godStud;
		this.prosek = prosek;
	}

	public int getBrInd() {
		return brInd;
	}

	public int getGodStud() {
		return godStud;
	}

	public double getProsek() {
		return prosek;
	}// Ime_Prezime[godina rodjenja] je student ___ (god studija) godine studija sa
		// prosekom____ (trenutni prosek).

	public String ispisi2() {
		return ime + "_" + prezime + "[" + godinaRodj + "]" + "je student" + "___" + godStud + "godine studija sa prosekom " + "__"
				+ prosek;
	}

}
