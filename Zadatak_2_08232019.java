package Domaci_08232019;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava tri cela broja i
		// metodu koja ispisuje brojeve od prvog do drugog (ukljucujuci i njih)
		// koji su deljivi trecim
		Scanner sc = new Scanner(System.in);
		System.out.println("uneti 3 cela broja:");
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		delj(a, b, c);
	}

	public static void delj(int a, int b, int c) {
		
		for (int i=a; i<= b; i++) {
			
			if(i%c==0)
				System.out.print(" "+i);
			
			}
		
		
}
}