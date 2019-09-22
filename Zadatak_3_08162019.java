package domaci08162019;

import java.util.Scanner;

// if
//ucitati 2 cela broja i izracunati im zbir,razlliku, ako je prvi veci od drugog,
//inace izracunati proivod i kolicnik.
public class Zadatak_3_08162019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c;
		System.out.println("Ucitati br A: ");
		int a = sc.nextInt();
		System.out.println("Ucitati br B: ");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("Zbir A i B:");
			c = a + b;
			System.out.println(+c);
			System.out.println("Razliku A i B:");
			c = a - b;
			System.out.println(+c);
		} else {
			System.out.println("Izracunati kolicnik: ");
			c = a / b;
			System.out.println(c);
			System.out.println("Izracunati proizvod: ");
			c = a * b;
			System.out.println(c);

		}
	}
}
