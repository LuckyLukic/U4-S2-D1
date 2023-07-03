package Esercizio2;

import java.util.Scanner;

public class Esercizio2 {
	
	public static void main(String[] args) {
		
		int km;
		int litri;
		
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Inserisci i Kilometri totali");
		km = scanner.nextInt();
		scanner.nextLine();
		
		if (km == 0) {
			System.out.println("non hai percorso km");
		}
		
		System.out.println("Inserisci i Kilometri totali");
		litri = scanner.nextInt();
		scanner.nextLine();
		
		if (km == 0) {
			throw new ArithmeticException("non puoi inserire 0");
		}
		
		
		
		
		System.out.println(" hai una media di" + " " + km/litri + " " + "KM/LT");
		
	}

}
