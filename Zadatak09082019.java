package domaci;

import java.util.Scanner;

public class Zadatak09082019 {

	public static void main(String[] args) {
		System.out.println("Uneti Geometrisko telo");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		Double a, b, r, p;

		switch (s) {
		case "Pravougaonik":
			System.out.println("Unesi stranicu A:");
			a = sc.nextDouble();
			System.out.println("Unesi stranicu B:");
			b = sc.nextDouble();

			p = a * b;
			System.out.println("Povrsina pravougaonika je: " + p);

			break;

		case "Kvadrat":
			System.out.println("Unesi stranicu kvadrata A: ");
			a = sc.nextDouble();

			p = a * a;
			System.out.println("Povrsina kvadrata je: " + p);

			break;

		case "Krug":
			System.out.println("Unesi poluprecnik: ");
			r = sc.nextDouble();

			p = r * r * 3.14;
			System.out.println("Povrsina kruga je:" + p);

			break;
		default:
			System.out.println("Greska");
		}

	}

}
