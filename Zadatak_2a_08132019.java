package domaci;

import java.util.Scanner;

public class Zadatak_2a_08132019 {

	public static void main(String[] args) {
		/*
		 * a)Napisati program koji ce sabrati brojeve od 1 do 5.
		 *  Program treba da ispise zbir.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Sabrati brojeve od 1 do 5:");
		int a = 1, b = 5, sum = 0;

		while (a < b) {// da je receno ukjlucujuci 5 stavio bih <=?
			sum += a;
			a += 1;

		}
		System.out.println("Suma je " + sum);

	}

}
