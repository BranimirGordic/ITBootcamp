package Test2;
// Stomatolog je covek kojeg je moguce ispisati u formatu: S_COVEK
public class Stomatolog extends Covek {

	public Stomatolog(String ime, String prezime, String jMBG) {
		super(ime, prezime, jMBG);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("S").append("_").append(super.toString());
		return sb.toString();
	}
	

}
