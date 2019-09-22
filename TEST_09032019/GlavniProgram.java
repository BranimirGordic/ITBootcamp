package Test2;

import java.io.ObjectInputStream.GetField;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Covek s1= new Stomatolog("Branimir", "Gordic", "001");
		Covek s2= new Stomatolog("Milos", "Sreckovic", "002");
		Covek s3= new Stomatolog("Ana", "Radojic", "003");
		
		Covek p1= new Pacijent("Dusan", "Bobicic", "004");
		Covek p2= new Pacijent("Jelena", "Obradovic", "005");
		Covek p3= new Pacijent("Nebojisa", "Uskokovic", "006");
		
		p1.dodatiNovac(500);
		s1.dodatiNovac(600);
		p1.oduzetiNovac(399);
		s1.oduzetiNovac(200);
		
		System.out.println(s1.toString());
		System.out.println(p1.toString());
	}

}
