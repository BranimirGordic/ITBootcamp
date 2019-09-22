import java.util.Scanner;

public class Zadatak_3c_08132019 {

	public static void main(String[] args) {
		/*
		 * c) Napisati program koji ce sabrati sve brojeve od k do n (k i n uneti preko
		 * konzole). Program treba da ispise zbir.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti K i N: ");
		int k = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		if (k > n) {
			System.out.println("Uslov je neprihvatljiv ");

		} else {
			while (k < n) {
				sum += k;
				k += 1;

			}
			System.out.println("Zbir brojeva od K do N je: " + sum);
		}
				/* Nisam nalazio drugo resenje za ovaj zadatak, a verujem da postoji
				 * 
				 */
	}
}