package domaci08162019;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// while
		// 	Izracunati sumu parnih prirodnih brojeva u intervalu od 1 do n.
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti  N");
		
		int n= sc.nextInt();
		int sum=0;
		int br=1;
		while( br<=n) {
			if (br%2==0) 
			
			
			sum+=br;
			br++;
			
				
			
			}
		System.out.println("Konacna suma " +sum);
	}

}
