package Domaci_08232019;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava ceo broj n.
		// Taj broj n se prosledjuje metodi koja formira i vraca
		// ceo broj koji predstavlja inverzan broj.
		// Glavni program nakon toga ispisuje taj inverzan broj.

		Scanner sc = new Scanner(System.in);
		System.out.println("Ucitaj boj N: ");
		int n = sc.nextInt();
		System.out.println("Inverzan borj broja N: "+ +invBroj(n));

	}

	public static int invBroj(int n) {
		int br = 0;
		while (n != 0) {
			int c = n % 10;
			br *= 10;
			br += c;
			n /= 10;
		}
		return br;

	}
}
