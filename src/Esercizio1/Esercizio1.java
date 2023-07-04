package Esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
	
	public static void main(String[] args) {
		
		int[] myArray = new int[5];
		Scanner scanner = new Scanner(System.in);
		boolean vero = true;
		
		for (int i= 0; i < myArray.length; i++ ) {
			Random random = new Random();
			
			myArray[i] = random.nextInt(10);
			
		} 
		
		
		try {
		
		do {
		
		System.out.println(Arrays.toString(myArray));
		
		System.out.println("inserisci un numero");
		int numero = scanner.nextInt();
		scanner.nextLine();
		
		
			
		
        if (numero < 1 || numero > 10) {
			
			if (numero == 0) {
				System.out.println("gioco terminato");
				vero = false;
				break;
			}
			
			throw new ArithmeticException("number not supported, must be between, 1 and 10, or 0 to terminate");
			
        }
		
		System.out.println("inserisci la posizione");
		int posizione = scanner.nextInt();
		scanner.nextLine();
		
		if (posizione < 1 || posizione > 5) {
		  
			throw new ArithmeticException("number must be metween 1 and 5");
		}
		
		myArray[posizione] = numero-1;
		
		}
		
		while(vero); 
			
			System.out.println(Arrays.toString(myArray));
			
		}
		
		catch (Error e) {
			
			e.printStackTrace();
			
		}
		
		scanner.close();
		
	}
	}
        




