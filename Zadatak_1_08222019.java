package Domaci_08222019;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		// Napisati program u kom se unose 3 realna broja
		// i poziva i ispisuje dve metode(u mainu).
		// Prva metoda vraca proizvod unetih brojeva.
		// Druga metoda ispisuje najmanji od unesenih brojeva.

		Scanner oko = new Scanner(System.in);
		System.out.print("Uneti 3 realna broja");
		double a,b,c;
		a=oko.nextDouble();
		b= oko.nextDouble();
		c= oko.nextDouble();
		System.out.print("proizvdo 3 realna braoja: "+prviMetod(a,b,c));
		System.out.println();
		System.out.print("Najmanji unet broj je: " +drugiMetod(a,b,c));
		
	}
	public static double prviMetod(double x, double y, double z) {
		double p=x*y*z;
		return p;
		
	}
	public static double drugiMetod(double x, double y, double z) {
		if(x<y && x<z) {
		//	System.out.println(x);
			return x;
		} else if (y<x && y<z) {
		//	System.out.println(y);
			return y;
		} else if (z<x && z<y) {
		//	System.out.println(z);
			return z;
		}
		return z;
		
	}
	

}

