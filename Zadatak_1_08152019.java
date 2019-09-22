package Domaci0815;

import java.util.Scanner;

public class Zadatak_1_08152019 {

	public static void main(String[] args) {
		// Napisati program - meni - za izracunavanje i ispis povrsina geometrijskih tela
		//(kocke, kvadra, valjka, lopte). 
		//Koristiti do while petlju i switch grananje. Za izlaz koristiti nulu (0).
		Scanner sc = new Scanner(System.in);
		
		int izbor;
		
		do {
			System.out.println("Izaberi nesto od ponudjenog:");
			System.out.println("0 - izlaz");
			System.out.println("1 - Kocka");
			System.out.println("2 - Pavougaonik");
			System.out.println("3 - Valjak");
			System.out.println("4 - Lopta");
			izbor = sc.nextInt();
			double a,b,p,r,h;
			switch (izbor) {
			case 1:
				System.out.println("Uneti stranicu A : ");
			a=sc.nextDouble();
			System.out.println("Povrsina kocke: "+(p=a*a));
			break;
			case 2:
				a=sc.nextDouble();
				b=sc.nextDouble();
				System.out.println("Povrsina pravougaonika: "+(p=a*b));
				break;
			case 3:
				r=sc.nextDouble();
				h=sc.nextDouble();
				System.out.println("Povrsina valjka: "+((2*r*r*3.14)+(2*r*3.14*h)));
				break;
			case 4:
				r=sc.nextDouble();
				System.out.println("Povrsina kruga: "+ (p=4*r*r*3.14));
				break;
				default:
					System.out.println("Los Unos!");
				case 0: 
					System.out.println("Izlaz");
			}
		
	}while(izbor != 0);

}
}