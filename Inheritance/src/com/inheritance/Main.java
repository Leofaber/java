package com.inheritance;

public class Main {

	public static void main(String[] args) {

		// 1 - UNA CLASSE RAPPRESENTA UN NUOVO TIPO DI DATO!!!
		
		// m1 è una variabile di tipo "Macchina", inizializzata con un oggetto di tipo "Macchina"
		Macchina macchina1 = new Macchina("Ferrari", 4, "FA332AT");
		
		// m1 è di tipo Macchina pertanto ha un metodo chiudiBaoole()
		macchina1.chiudiBaule();		
				
		// m1 eredita dalla classe Veicolo il metodo accendi()
		macchina1.accendi();

	

		System.out.println("");
		
		
		
		// 2 - UN OGGETTO DI TIPO MACCHINA E' ANCHE UN OGGETTO DI TIPO VEICOLO!!!
		
		// m1 è una variabile di tipo "Veicolo", inizializzata con un oggetto di tipo "Macchina"		
		Veicolo macchina2 = new Macchina("Ferrari", 4, "KD223WE");
		
		macchina2.accendi();

		
		System.out.println("");
		
		
		// 3 - GRAZIE ALL'EREDITARIETA' E' POSSIBILE GESTIRE OGGETTI DI TIPO "DIVERSO" ALL'INTERNO DELLA STESSA COLLEZIONE!!!
			
		Veicolo[] arrayDiVeicoli = new Veicolo[2];
		
		Moto moto1 = new Moto(3,2,"LK121DD");
		Macchina macchina3 = new Macchina("Ferrari", 4, "KD223WE");
		
		arrayDiVeicoli[0] = moto1;
		arrayDiVeicoli[1] = macchina3;
		
		for(int i = 0; i < arrayDiVeicoli.length; i++) {
			arrayDiVeicoli[i].accendi();
		}
		
		
		// 4 - UNA CLASSE TI DEFINISCE UN GRUPPO DI FUNZIONALITA' ALL'INTERNO DI UNO STESSO OGGETTO
	}

}
