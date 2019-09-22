package Domaci_08272019_Utorak;

public class Zadatak_1a_08272019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zadatak_1_08272019 k1 = new Zadatak_1_08272019("Knjiga 1. ","M.Sreckovic", 150, 2019);
		k1.setGodinaIzdanja();
		System.out.println(k1.getKnjiga()+ " "+ k1.getAutor()+" "+ k1.getStrane()+" "+k1.getGodinaIzdanja());		
		
		Zadatak_1_08272019 k2 = new Zadatak_1_08272019("Knjiga 2. ","Z.Vozarevic", 350, 2009);
		k2.setGodinaIzdanja();
		System.out.println(k2.getKnjiga()+ " "+ k2.getAutor()+" "+ k2.getStrane()+" "+k2.getGodinaIzdanja());
		
		Zadatak_1_08272019 k3 = new Zadatak_1_08272019("Knjiga 3. ","B.Gordic", 150, 2002);
		k3.setGodinaIzdanja();
		System.out.println(k3.getKnjiga()+ " "+ k3.getAutor()+" "+ k3.getStrane()+" "+k3.getGodinaIzdanja());
		
		
	}

}
