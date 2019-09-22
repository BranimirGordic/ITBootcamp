package dan2;

import java.util.Scanner;

public class Zadatak0908Prvi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti broj: ");
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("Broj je paran ");
		} else {
			System.out.println("Broj je neparan");

		}
	}
}
