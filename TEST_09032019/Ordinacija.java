package Test2;

import java.util.ArrayList;
import java.util.List;

// Ordinacija poseduje naziv, listu stomatologa, listu pacijenata,
// cenu usluge kao i stanje racuna.
// Naziv i cena  se zadaju prilikom kreiranja i mogu samo da se dohvate.

//	Moze da se naplati usluga pacijentima,
//  ali ukoliko neki pacijent ne poseduje dovoljno novca
// ispisuje se poruka: “PACIJENT ide u zatvor”.
// Ordinacija takodje moze da isplati platu stomatolozima u zadatom iznosu,
// a povratna vrednost je indikator da li je plata uspesno isplacena

public class Ordinacija {
	private String nazivOrdinacije;
	private List<Stomatolog> zubar;
	private List<Pacijent> musterija;
	private double cenaUsluge;
	private double stanjeRacuna;

	public Ordinacija(String nazivOrdinacije, double cenaUsluge) {
		super();
		this.nazivOrdinacije = nazivOrdinacije;
		this.cenaUsluge = cenaUsluge;
		this.zubar = new ArrayList<>();
		this.musterija = new ArrayList<>();
		this.stanjeRacuna = 0;

	}

	public String getNazivOrdinacije() {
		return nazivOrdinacije;
	}

	public double getCenaUsluge() {
		return cenaUsluge;
	}
	// Moze da se naplati usluga pacijentima,
		// ali ukoliko neki pacijent ne poseduje dovoljno novca
		// ispisuje se poruka: “PACIJENT ide u zatvor”.

		public String naplatiUslugu(Pacijent m) {
			if (m.getNovac()< cenaUsluge) {
				return "PACIJENT ide u zatvor!";
			}								
			m.oduzetiNovac(cenaUsluge);
			return "NAPLACENO";
		}
		// Ordinacija takodje moze da isplati platu stomatolozima u zadatom iznosu,
		// a povratna vrednost je indikator da li je plata uspesno isplacena

	
		public boolean isplataPlatu(double plata) {
			if (plata * zubar.size()>= stanjeRacuna) {
				return true;
			} else				
				return false;
		}

		public double getStanjeRacuna() {
			return stanjeRacuna;
		}

	// Moze da se dodati/ukloni doktor.
	// Moze da se doda/ukloni pacijent.
	// Moze da se dohvati broj pacijenata/doktora.

	public void dodajStomatologa(Stomatolog z) {
		zubar.add(z);
	}

	public void ukoniStomatologa(Stomatolog z) {
		zubar.remove(z);
	}

	public int brStomatologa() {
		return zubar.size();
	}

	public void dodajPacijenta(Pacijent m) {
		musterija.add(m);
	}

	public void ukoniPacijenta(Pacijent m) {
		musterija.remove(m);
	}

	public int brPacijenta() {
		return musterija.size();

	}

	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(nazivOrdinacije).append(":").append("CENA").append("\n");
		
		for (Stomatolog z : zubar) {
			sb.append(z).append("\n");
		}
		
		sb.append("PACIJENT").append("\n");
				for (Stomatolog z : zubar) {
					sb.append(z).append("\n");
				}
		return sb.toString();
	}
}
			
/*		
	public void ispisiStomatologa() {
		System.out.println("NAZIV : CENA");
		for (Stomatolog z : zubar) {
			System.out.println(z);
		}
	}

	public void ispisiPacijenta() {
		System.out.println("PACIJENTI");
		for (Pacijent m : musterija) {
			System.out.println(m);
		}

	}
*/

