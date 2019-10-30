package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 
 * GESTIONE PACKAGE
 * 
 * COMPILAZIONE A MANO
 * 
 * */


public class Main {
	
	public static void main(String[] args) {
	
		/*
			Cosa sono le Collections? come dice il nome, una collezione è un gruppo di oggetti (dello stesso tipo).
			Il Java Collection Framework consiste in una serie di classi che permettono di poter utilizzare differenti tipi di 
			collezioni come ad esempio: liste, insiemi, mappe, stacks, code.
			
			Queste classi “ready-to-use” risolvono una serie di problemi comuni nella gestione di gruppi di oggetti. 
			
			I metodi che queste classi espongono consentono di inserire, rimuovere, aggiornare, ordinare, cercare etc
			
			N.B.
				- LE CLASSI DEL FRAMEWORK COLLECTION SONO DIVISE IN CLASSI BASE/INTERFACCIA E CLASSI FIGLIO/IMPLEMENTAZIONE (LE CLASSI INTERFACCIA NON POSSONO ESSERE ISTANZIATE)
				- LE CLASSI DEL FRAMEWORK COLLECTION SONO "GENERICS" (OVVERO SI DEVE SPECIFICARE IL TIPO DI DATO ALL'INTERNO DELLE PARENTESI ANGOLATE < >)
				- LE CLASSI DEL FRAMEWORK COLLECTION NON POSSONO GESTIRE TIPI PRIMITIVI (int, float, char). USARE Integer, Float, Char
					
		*/
		
		
		
		/* 
		     CLASSE BASE/INTERFACCIA List => 
		             						COLLEZIONE ORDINATA DI ELEMENTI. (L'ORDINE E' INDIPENDENTE DAL VALORE DEGLI ELEMENTI)
		             						
		             						CLASSI FIGLIO/IMPLEMENTAZIONE: 
		             														* ArrayList
		             														* Stack
		             														* ...
		 
		*/
		List<String> lista = new ArrayList<String>();
		
		ArrayList<String> lista1 = new ArrayList<String>();

		System.out.println("Aggiungo l'elemento Ciao in posizione 0");
		lista1.add("Ciao");

		System.out.println("L'elemento in posizione 0 è: "+lista1.get(0));
		
		System.out.println("Aggiungo l'elemento B");
		lista1.add("B");

		System.out.println("Aggiungo l'elemento C in posizione 0");
		lista1.add(0, "C");

		
		System.out.println("Il numero di elementi nella lista è: "+lista1.size());
		
		System.out.println("Stampo la lista:");
	    for (int i = 0; i < lista1.size(); i++) {
	    	
	        System.out.print(lista1.get(i)+" ");
	        
	      }
		System.out.println();

		
		System.out.println("Rimuovo l'elemento in posizione 0");
		String rimossa = lista1.remove(0);
		System.out.println("Elemento rimosso: "+rimossa);

		System.out.println("Stampo la lista:");
		for (int i = 0; i < lista1.size(); i++) {
	        System.out.print(lista1.get(i)+" ");
	      }
		System.out.println();
		
		// UTILIZZO DEGLI ITERATORI
		System.out.println("Stampo la lista usando un iteratore:");
		
		Iterator<String> iter = lista1.iterator(); 
		
		while (iter.hasNext()) { 
		
			String elem = iter.next();
            System.out.print(elem + " "); 
        
		} 	
		
		System.out.println("L'arrayList contiene il valore Ciao ? "+lista1.contains("Ciao"));

		
		System.out.println();
		System.out.println();
		
		
		
		
	
		/* 
	     CLASSE BASE/INTERFACCIA Set => 
	             						COLLEZIONE NON ORDINATA DI ELEMENTI. 
	             						NON PERMETTE DI AVERE ELEMENTI DUPLICATI
	             						
	             						CLASSI FIGLIO/IMPLEMENTAZIONE: 
	             														* HashSet
																		* ..
		*/		
		HashSet<Integer> insiemeDiInteri = new HashSet<Integer>();
		
		insiemeDiInteri.add(10);
		insiemeDiInteri.add(10);
		insiemeDiInteri.add(20);
		
		System.out.println("Stampo l'insieme usando un iteratore:");
	
		Iterator<Integer> iter2 = insiemeDiInteri.iterator();
		
		while(iter2.hasNext()) {
			Integer elem = iter2.next();
			System.out.println(elem + " ");
		}
		
		
		System.out.println("L'insieme contiene il valore 10 ? "+insiemeDiInteri.contains(10));
		
		
		
		
	
		
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		/* 
		     CLASSE BASE/INTERFACCIA Map => 
		             						COLLEZIONE DI ELEMENTI CHIAVE=VALORE (CHIAMATE Entry)
		             						NON PERMETTE DI AVERE CHIAVI DUPLICATE
		             						
		             						CLASSI FIGLIO/IMPLEMENTAZIONE: 
		             														* HashMap
																			* ..
		*/		
		Map<String,Integer> prodottiInMagazzino = new HashMap<String,Integer>();
		
		System.out.println("Aggiungo due Entry alla mappa");

		prodottiInMagazzino.put("Spazzolino", 5);
		prodottiInMagazzino.put("Dentifricio", 10);

		prodottiInMagazzino.put("Spazzolino", 500);

		
		System.out.println("Stampo la mappa usando un iteratore:");

		Iterator<   Entry<String, Integer>    > it = prodottiInMagazzino.entrySet().iterator();
		
		while (it.hasNext()) {
			
			Entry<String, Integer> pair = it.next();
			
			System.out.println(pair.getKey() + " = " + pair.getValue());
			
		}
		
		
		System.out.println("La mappa contiene la chiave Spazzolino? "+prodottiInMagazzino.containsKey("Spazzolino"));
		
		System.out.println("Modifico il valore associato alla chiave Spazzolino");
		prodottiInMagazzino.replace("Spazzolino", 100);
	
		System.out.println("Il nuovo valore associato alla chiave Spazzolino è "+prodottiInMagazzino.get("Spazzolino"));
	}
	
}
