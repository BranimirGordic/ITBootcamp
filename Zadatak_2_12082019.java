package domaci;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n. Koristiti jednu petlju.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti vrednost N: ");
		int n = sc.nextInt();
		int br = 0;
		int sum = 0;
		int p = 1;
		while (br <= n) {

			if (br % 2 == 0) {
				sum += br;
				br += 1;
			}

			else  {

				p *= br;
				br += 1;
			}
			
		}
		System.out.println("Zbir parnih br: " +sum);
		System.out.println("Zbir neparnih br: " +p);
	}
}
