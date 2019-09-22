package domaci08162019;

import java.util.Scanner;

public class Zadatak_2_08162019 {
	// for petlja
	// izracunati sumu prirodnin brojeva u intervalu od 1 do n koji nisu deljivi sa
	// 3.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti vrednost N:");
		int n = sc.nextInt();
		int sum = 0;

		for (int br = 1; br < n; br++) {
			if (br%3 !=0) {
				//System.out.println("broj "+ br);
				sum+=br;
				//System.out.println("suma "+ sum);
			}
				
		}
		System.out.println(sum);
	}

}
