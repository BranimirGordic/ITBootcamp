package Test2;
// Pacijent je covek kojeg je moguce ispisati u formatu: P_COVEK

public class Pacijent extends Covek {

	public Pacijent(String ime, String prezime, String jMBG) {
		super(ime, prezime, jMBG);
		
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("P").append("_").append(super.toString());
		return sb.toString();
	}
	

}
