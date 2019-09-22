package Domaci_08232019;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava niz od n celih brojeva i dve metode.
		// Prva metoda vraca proizvod elemenata na neparnim pozicijama,
		// a druga vraca zbir parnih elemenata niza.
		Scanner sc = new Scanner(System.in);
		System.out.println("Ucitaj duzinu niza: ");
		int n=sc.nextInt();
		int[] niz= new int[n];
		System.out.print("Elementi niza: ");
		elementiNiza(niz);
		
		System.out.println("Proizvod elemenata na neparnim pozicijama: "+proizvodElemenata(niz));
		System.out.println("Zbir parnih elemenata niza: "+zbirParnih(niz));
	}
	
	public static void elementiNiza(int[] niz) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i< niz.length; i++) {
			niz[i]=sc.nextInt();
			
			}
		
		}
	public static int proizvodElemenata(int[] niz) {
		int proizvod = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 != 0)
				proizvod *= niz[i];

		}
			
		
		return proizvod;
	}
	public static int zbirParnih(int[] niz) {
		int sum = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0)
				sum += niz[i];
			}
		
		return sum;
	}
}
