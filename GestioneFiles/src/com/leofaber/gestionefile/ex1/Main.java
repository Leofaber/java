package com.leofaber.gestionefile.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


	public static void main(String[] args) {

		String n = null;
		File myFile = new File("files/filediprova.txt");

		System.out.println("File name: " + myFile.getName());
		System.out.println("Absolute path: " + myFile.getAbsolutePath());
		System.out.println("Writeable: " + myFile.canWrite());
		System.out.println("Readable " + myFile.canRead());
		System.out.println("File size in bytes " + myFile.length());

		FileWriter scrittore;
		
		try {

			scrittore = new FileWriter(myFile);	
			scrittore.write("Files in Java might be tricky, but it is fun enough!");
			scrittore.append("\nCiao Serena!");
			scrittore.close();

		} catch (IOException e) {
			System.out.println("Eccezione!");
			System.out.println(e);
		}

		
		// Un FileReader può leggere un carattere alla volta
		FileReader lettore = null;
		
		try {
			lettore = new FileReader(myFile);
		}
		catch (IOException e) {
			System.out.println("Eccezione!!!!"+e);
		}
		
		boolean fileNonTerminato = true;	

		while( fileNonTerminato ) {
			
			int carattere_int = 0;
			
			try {
				carattere_int = lettore.read(); // leggo un carattere in codifica numerica
			}
			catch (IOException e) {
				System.out.println("Eccezione!!!!"+e);
			}
			
			if(carattere_int == -1 ) { // se leggo -1 significa che ho finito il file
				
				fileNonTerminato = false;
				
			}else {
				char c = (char) carattere_int; // converto il carattere in char 
				System.out.println("="+c);				  
			}

		}
		
		try {
			lettore.close();
		}
		catch (IOException e) {
			System.out.println("Eccezione!!!!"+e);
		}			


		// Un BufferedReader può leggere riga per riga
		
		FileReader lettore_semplice;
		BufferedReader lettore_bufferizzato = null;
		
		try {
			
			lettore_semplice = new FileReader(myFile);

			lettore_bufferizzato = new BufferedReader(lettore_semplice);
		}
		catch (IOException e) {
			System.out.println("Eccezione!!!!"+e);
		}	  

		
		
		fileNonTerminato = true;
		   
		while (fileNonTerminato) {
			
		   	String riga = null; 
		   	
		   	try {
		   		riga = lettore_bufferizzato.readLine();
		   	}
			catch (IOException e) {
				System.out.println("Eccezione!!!!"+e);
			}	  		   	

		   	if(riga != null) {
		   		System.out.println("Riga: "+riga);
		   	}
		   	else{
		   		fileNonTerminato = false;
		   	}

		}

		try {
			lettore_bufferizzato.close();
		}
		catch (IOException e) {
			System.out.println("Eccezione!!!!"+e);
		}			
		
	}

}
