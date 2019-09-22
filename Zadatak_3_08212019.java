package Domaci_08212019;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		// rastuci.
		// Primer1 niza: 3 54 123 18
		// Ispis: Niz nije rastuci.
		// Primer2 niza: 71 422 1001 5050
		// Ispis: Niz je rastuci.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi duzinu niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];

		System.out.print("Elementi niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		System.out.print("Ispisi da li je niz rastuci ili nije: ");

		boolean a = true;
		for (int i = 0; i < n - 1; i++) {
			if (niz[i] >= niz[i + 1]) {
				a = false;
				break;
			}

		}
		if (a != true)
			System.out.print("Niz nije  rastuci!");

		else
			System.out.print("Niz je rastuci!");

	}

}
