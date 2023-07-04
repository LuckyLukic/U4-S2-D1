package Esercizio2;

import java.util.Scanner;

public class Esercizio2 {
	
	
	public static void main(String[] args) {
		
		int km;
		int litri = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Inserisci i Kilometri totali");
		km = Integer.parseInt(scanner.nextLine());
			
		try {
			
		if (km == 0) {
			System.out.println("non hai percorso km");
			
		} else {
			
			System.out.println("Inserisci i litri totali");
			litri = Integer.parseInt(scanner.nextLine());
			
		}
		
		
		if (km == 0) {
			throw new ArithmeticException ("non puoi inserire 0");
		}
		
		System.out.println(" hai una media di" + " " + km/litri + " " + "KM/LT");
		
		}
		
		 catch (ArithmeticException e) {
			 e.printStackTrace();
		 }
		
		scanner.close();
		
	}

}
