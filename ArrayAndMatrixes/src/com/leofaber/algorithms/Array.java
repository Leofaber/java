package com.leofaber.algorithms;

import java.util.Scanner;

public class Array {

	
	public static void main(String[] args) {
		
		// oggetto di tipo 'Scanner'
		Scanner scan = new Scanner(System.in);
		
		// variabile che uso per dimensionare l'array
		final int how_many = 5;
		
		// l'array di interi
		int[] array_of_numbers = new int[how_many];
		
		// utilizzo il metodo nextInt() per acquisire un numero da tastira e lo
		// inserisco in posizione i-esima all'interno dell'array.
		System.out.println("Inserisci "+how_many+" numeri:");
		for(int i = 0; i < how_many; i++) {
			array_of_numbers[i] = scan.nextInt();
		}
		
		// chiamo il metodo find_minimum() passando l'array di numeri come input del metodo 
		int m = find_minimum(array_of_numbers);
			
		// stampo il valore del minimo
		System.out.println("The minimum is: "+m);

	}
	
	
	// la funzione per trovare il minimo
	public static int find_minimum(int[] arr) {
		
		// 'minimum' is initialized with the first element of the array.
		int minimum = arr[0];
		
		// i=1 => starting from the second element of the array.
		for(int i = 1; i < arr.length; i++) {
			
			// if the i-th element of the array is lower than the current minimum. 
			if ( arr[i] < minimum ) {
				// the minimum is updated.
				minimum = arr[i];
			}
		}
				
		return minimum;
	}
}	
	
	
	
	
	// TODO 1
	/* Creare un metodo con nome 'check_odd' che accetti un numero intero e restituisca il valore booleano 
	 * 'true' se il numero in input è pari, 'false' se il numero in input è dispari.
	 * ( suggerimento: utilizzare l'operatore resto % per capire se un numero è pari o no ) 
	 */
	
	// TODO 2
	/* Creare un metodo con nome 'count_odds' che conti quanti numeri pari sono presenti all'interno dell'array.
	 * Si deve usare il metodo 'check_odd' per verificare che un numero sia pari oppure no.
	 * Chiamare il metodo e stampare il risultato sulla console.
	 */
	
	// TODO 3
	/* Scrivere un metodo che accetti un vettore di interi e ne restituisca uno nuovo, contenente
	 * i numeri del vettore in input ma in ordine inverso.
	 */	
	
	// TODO 4
	/* Scrivere un metodo che accetti un vettore di interi e ne restituisca uno nuovo, contenente
	 * i numeri pari del vettore in input. Il nuovo vettore deve avere una dimensione uguale al 
	 * numero di numeri pari del vettore in input.
	 * 
	 */
		


