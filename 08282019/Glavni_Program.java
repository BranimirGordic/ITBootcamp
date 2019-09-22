package Ucionica_08282019_Domaci;



public class Glavni_Program {

	public static void main(String[] args) {
		Polaznik p1= new Polaznik ("Branimir", "Gordic");
		Laptop l1= new Laptop ("Sony", p1);
		System.out.println(p1.toIspis());
		System.out.println(l1.ispisi());
		l1.izbaciPolaznika();
		System.out.println(l1.ispisi());
		
		
	}

}
