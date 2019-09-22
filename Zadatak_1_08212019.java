package Domaci_08212019;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		// Korisnik ucitava niz od n elemenata niza, kao i neko broj br.
		// Program ispisuje elemente niza deljive brojem br.
		Scanner boban = new Scanner(System.in);
		System.out.println("Unosiso duzinu niza N:");
		int n = boban.nextInt();

		System.out.println("Neki broja A: ");
		int a = boban.nextInt();

		int[] niz = new int[n];

		System.out.print("Uneti elemente u niz; ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = boban.nextInt();
		}
		System.out.print("Brojevi deljivi sa A: ");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % a == 0)
				System.out.print(" " + niz[i]);
		}

	}

}
