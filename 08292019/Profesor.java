package Dom0829;

import java.util.ArrayList;
import java.util.List;

// Profesor je covek koji ima titulu i listu predmeta na kojima drzi nastavu.
//Predmeti mogu da se dodaju i oduzimaju iz liste.
//Profesora ispisati u formatu:
//Ime_Prezime[godina rodjenja] je ___(titula)  koji drzi nastavu na: <lista predmeta>.
public class Profesor extends Covek {
	private String titula;
	List<String> predmeti;
	public Profesor(String ime, String prezime, int godinaRodj, String titula) {
		super(ime, prezime, godinaRodj);
		this.titula=titula;
		predmeti= new ArrayList<>();
	}
	public String getTitula() {
		return titula;
	}
	public String getPredmeti (int i) {
		return predmeti.get(i);
	}
	public void dodajPredmet (String predmet1) {
		 predmeti.add(predmet1);
	}
	public void oduzmiPredmt (String predmet1) {
		predmeti.remove(predmet1);
	}

	public String lista() {
		predmeti.add("Fizika");
		predmeti.add("Matematika");
		predmeti.add("Hemija");
		
		String s="";
		for(String predmet:predmeti) {
			s+= predmet+ " ";
			
		}
		return s;
		}
	public String ispisi3() {
		return ime+"_"+prezime+ "["+godinaRodj+"]"
				+"je"+"__"+titula+ " koji drzi nastavu na: "+ lista();
	}
	//Ime_Prezime[godina rodjenja] je ___(titula)  koji drzi nastavu na: <lista predmeta>.
	
	


}
