package Domaci_08212019;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		// Napisati program koji ucitava duzinu niza,
		// niz i ispisuje niz inverznim redosledom.
		Scanner oko = new Scanner(System.in);
		System.out.print("Ucitati duzinu niz: ");
		
		int n = oko.nextInt();
		int[] niz = new int[n];
		
		System.out.print("Elementi niza: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = oko.nextInt();
		}
		System.out.print("Ispisi elemente niza inverzni redosledom: ");
	//	for (int i= n;0<=i-1; i--) {
	//		System.out.print(" " +niz[i-1]);      DA LI JE SVE JEDNO KAKO CEMO FORMULISATI ISPIS
    //	}										TJ DA LI JE NEKO RESENJE BOLJE (PRAVILNIJE)?
		for ( int i=n-1; 0<i;i--) {
			System.out.print(" "+niz[i]);
		}
			}
}	

				



