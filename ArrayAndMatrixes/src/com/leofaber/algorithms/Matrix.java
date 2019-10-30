package com.leofaber.algorithms;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
/*   
	  Un array bidimensionale (matrice) si può definire e allocare con la sintassi:
        
         tipoElementi[][] nomeMatrice = new tipoElementi[dim1][dim2];
       
      ad esempio:
          
         double[][] matrice = new double[10][20];

      Possiamo immaginare che la prima dimensione indichi il numero di righe e la seconda il numero di 
      colonne. Il valore di matrice.length sarà la lunghezza della prima dimensione (numero di righe), 
      mentre matrice[i].length, dove i è un qualsiasi valore lecito per il primo indice, indica la misura 
      della seconda dimensione (numero di colonne) 
	
	  Pertanto, per accedere agli elementi della matrice si utilizza la seguente sintassi:
	  
	  	matrice[indice-di-riga][indice-di-colonna]
	 
	 
	  E' possibile accedere ad ogni elemento della matrice durante un'iterazione usando i cicli for.
	  
		                 indici di colonna
		                  j=0  j=1  j=2  
		      
	indici di riga i=0     1    2    3
				   i=1     4    5    6
				   i=2     7    8    9 
		 
	    
	     for(int i = 0; i < 3; i++) {    ==> con il 'for' esterno si scorre sulle righe...
	     
	        for(int j = 0; j < 3; j++) {   ==> con il 'for' interno si scorre sulle colonne della riga
	        
	        	matrice[i][j]
	        }
	     }
	     
	     Iterazioni del loop:
	     
	     1) i=0, j=0      => matrice[0][0]   
	     2) i=0, j=1      => matrice[0][1]
	     3) i=0, j=2	  => matrice[0][2]	
	     
	     4) i=1, j=0
	     5) i=1, j=1
	     6) i=1, j=2
	     
	     7) i=2, j=0
	     8) i=2, j=1
	     9) i=3, j=2
	     
 	
 	Inizializzazione di un array bidimensionale:

		analogamente a quanto visto per gli array monodimensionali, un array bidimensionale può essere inizializzato contestualmente alla sua definizione come segue:

    	// in questo esempio l'array mat avrà 3 righe e 4 colonne
   
    	int[][] mat = {{5, 3, 6, 12}, {1, 3, 3, 2}, {0, 0, 3, 14}};
    
	*/
		int righe;
		int colonne;

		Scanner scan = new Scanner(System.in);

		System.out.println("Inserisci il numero di righe della matrice:");
		righe = scan.nextInt();
		
		System.out.println("Inserisci il numero di colonne della matrice:");
		colonne = scan.nextInt();
		
		int [][] matrice = new int [righe][colonne];
		
		int numero_di_elementi = righe*colonne;
		
		System.out.println("Inserisci i "+numero_di_elementi+" valori della matrice:");
		for(int i = 0; i < righe; i++) {
			for(int j = 0; j < colonne; j++ ) {
				matrice[i][j] = scan.nextInt();
			}
		}
		
		System.out.println(numero_di_elementi+" valori inseriti!");
		
		// TODO 1
		// print_matrix_on_console(..)
		
		// TODO 2
		// find_maximum(..)

		// TODO 3
		// print_row(..)

		// TODO 4
		// print_column(..)

		// TODO 5
		// sum_elements_of_matrix(..)
		
		// TODO 6
		// sum_elements_of_diagonal(..)
	}

};
// TODO 1
/*
 * Creare una funzione con nome 'print_matrix_on_console'. La funzione deve stampare sulla 
 * console la matrice di numeri in questo formato:
 *  
 *   x y z 
 *   i j k 
 *   m n l 
 *   
 *   suggerimento: utilizzare il carattere speciale \n per andare a capo dopo aver stampato la riga
 */

// TODO 2
/*
 * Creare una funzione 'find_maximum'. La funzione accetta una matrice in input e deve cercare il massimo 
 * numero presente nella matrice, stampare sulla console il valore del massimo e la sua posizione (riga e colonna)
 * sulla console e restituire il valore del massimo come output.
 */

//TODO 3
/*
* Creare una funzione 'print_row'. La funzione accetta una matrice e un indice di riga (numero intero) in input.
* La funzione deve restituire al chiamante il valore booleano 'false' se l'indice di riga eccede le dimensioni
* della matrice. Esempio: dimensione matrice 3x3 => indici di riga [0,1,2] 
* 
* Se l'indice di riga non eccede le dimensioni della matrice, la funzione deve stampare gli elementi della riga
* della matrice individuata dall'indice di riga passato in input e infine deve ritornare il valore booleano true. 
* 
*/

//TODO 4
/*
* Creare una funzione 'print_column'. La funzione accetta una matrice e un indice di colonna (numero intero) in input.
* La funzione deve restituire al chiamante il valore booleano 'false' se l'indice di colonna eccede le dimensioni
* della matrice. Esempio: dimensione matrice 3x3 => indici di riga [0,1,2] 
* 
* Se l'indice di colonna non eccede le dimensioni della matrice, la funzione deve stampare gli elementi della 
* colonna della matrice individuata dall'indice di colonna passato in input e infine deve ritornare il valore 
* booleano true. 
* 
*/

//TODO 5
/*
 * Creare una funzione 'sum_elements_of_matrix' che accetti una matrice in input e ritorni in output la somma 
 * di tutti gli elementi della matrice. Il chiamante deve stampare infine questo numero.
*/   

// TODO 6
/*
 * Creare una funzione 'sum_elements_of_diagonal' che accetti una matrice in input e (assumendo che la matrice
 * sia quadrata) ritorni la somma di tutti gli elementi presenti nella diagonale pricipale. 
*/

   

