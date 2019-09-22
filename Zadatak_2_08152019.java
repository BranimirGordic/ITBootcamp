package Domaci0815;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		// Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		// (Na internetu istraziti sta je Fibonacijev niz!!!)
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost N!");
		int n= sc.nextInt(); //do kog broja ce mi ici niz!
		System.out.println("Fibonacijev niz");
		int a = 0;
		System.out.print(a+" ");
		int b = 1;
		
		
		
		for(int br=1; br<=n; ++br) {
			
			int sum= a + b;
			
			a= b;
			
			b=sum;
			
			System.out.print(a+ " ");
		}
			

	}
}