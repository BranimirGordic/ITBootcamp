package domaci;

import java.util.Scanner;

public class Zadatak_1_12082019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce ispisati poruku “Hello World!” 10 puta. Koristiti
		 * while petlju.
		 */
		Scanner sc = new Scanner(System.in);
		

		
		
		int k=10;
		int a=0;
		while (a < k) {
			System.out.println("Hello World");

			k -= 1;
		}
	}
}
