import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main{

	//metodo
	public static boolean addLineToFile(String fileInput, String lineStr, int nr, String fileOutput){

		ArrayList <String> righe = new ArrayList <String>();
		boolean contenuto = true;

		if(nr<1){
			System.out.println("Errore. Inserisci nr deve essere > 0");
			return false;
		}

		FileReader lettore;
		BufferedReader lettore2;

		try{
			lettore = new FileReader("file.txt");
			lettore2 = new BufferedReader(lettore);
		}catch(FileNotFoundException e){
			System.out.println("errore");
			return false;
		}

		
		while(contenuto){

			String temp;
			
			// ho messo il try catch solo prima e dopo l'istruzione readLine()
			try{
				temp = lettore2.readLine();
			}catch(IOException e){
				System.out.println("errore");
				return false;
			}

			if(temp == null){ 
				contenuto = false;
			}else{
				righe.add(temp);
			}
		}
		
		
		System.out.println("Il contenuto del file di input è:");
		for(int i = 0; i<righe.size(); i++){
			System.out.println(righe.get(i));
		}

		
		try{
			lettore2.close();
		}catch(Exception e){
			System.out.println("errore");
		}

		//se la riga da inseire va oltre le dimensioni dell'arrayList
		if(nr>righe.size()){
			System.out.println("la riga da inserire va oltre le dimensioni dell'arrayList");

			int num = nr-righe.size();
			for(int i = 0; i<num; i++){
				righe.add("");
			}
			System.out.println("Ho aggiunto " + num + " elementi.Le dimensioni dell'array ora sono"	+ righe.size());
		}
		
		
		// UTILIZZO SET INVECE DI ADD, passando nr-1 e non nr 
		righe.set(nr-1, lineStr);

		
		//aggiungo i + al posto delle righe vuote ==> ANCHE QUI UTILIZZO SET() 
		for(int j = 0; j<righe.size(); j++){
			if(righe.get(j).equals("")){
				righe.set(j, "+");
			}
		}

		System.out.println("Scrivo le seguenti righe:");
		for(int i = 0; i<righe.size(); i++){
			System.out.println(righe.get(i));
		}
		System.out.println("sul file: "+fileOutput);

		
		

		try{

			FileWriter scrittore = new FileWriter(fileOutput);

			for(int i = 0; i < righe.size(); i++){
				String temp = righe.get(i);
				scrittore.write(temp+"\n");
			}
			scrittore.close();

		}catch(IOException e){
			System.out.println("errore");
			return false;
		}

		return true;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//System.out.println("Nome file:");
		//String nomeFile = input.nextLine();

		/*//creazione del file
		PrintWriter file = null;
		try{
			file = new PrintWriter(nomeFile);
		}catch(FileNotFoundException e){
			System.out.println("Errore");
		}
		
		System.out.println("Inserire elementi");
		String riga = "";
		
		for(int i = 0; i<3; i++){
			riga = input.nextLine();
			file.println(riga);
		}
		file.close();
		
		//aggiungo dati
		try{
			file = new PrintWriter(new FileOutputStream(nomeFile, true));
		}catch(FileNotFoundException e){
			System.out.println("errore");
		}
		*/

		System.out.println("Inserire riga:");
		String lineStr = input.nextLine();
		System.out.println("Posizione:");
		int nr = input.nextInt();

		boolean tuttok = addLineToFile("file.txt", lineStr, nr, "./fileDiOutput.txt");
		System.out.println("E' tutto ok? "+tuttok);

	}
} 