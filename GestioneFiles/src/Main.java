	import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
	import java.io.IOException;
	
	public class Main {
		
		public void inserisciRigaInFile(String filename, String stringa, int numeroRiga) {
			
		}
		
		public void funzioneACaso() {
			int k = 0;
		}
		
		public static void main(String[] args) {
		
			String n = null;
		  File myObj = new File("filediprova.txt");
	  
	  System.out.println("File name: " + myObj.getName());
	  System.out.println("Absolute path: " + myObj.getAbsolutePath());
	  System.out.println("Writeable: " + myObj.canWrite());
	  System.out.println("Readable " + myObj.canRead());
	  System.out.println("File size in bytes " + myObj.length());
	
	  
	  try {
		  
		  FileWriter scrittore = new FileWriter("files/filediprova.txt");
		  scrittore.write("Files in Java might be tricky, but it is fun enough!");
		  scrittore.append("\nCiao Serena!");
	
		  scrittore.close();
		  
		} catch (IOException e) {
			System.out.println("Eccezione!");
			System.out.println(e);
		}
					
	  try {
		  FileReader lettore = new FileReader("files/filediprova.txt");

		  boolean leggiAncora = true;
		  
		  while( leggiAncora ) {
			  
			  int c_int = lettore.read();
			  
			  if(c_int == -1 ) {
				  leggiAncora = false;
			  }else {
				  char c = (char) c_int;
				  System.out.println("="+c);				  
			  }
			  
		  }
		  
		  lettore.close();
	  }
	  
      catch (IOException e) {
    	  System.out.println("Eccezione!!!!"+e);
      }
	  
	  
	  // LEGGO RIGA PER RIGA
	  try {
		  FileReader lettore = new FileReader("files/filediprova.txt");

		  BufferedReader lettore_buffered = new BufferedReader(lettore);
		  
		  /*
		   * 
		   boolean fileNonTerminato = true
		   while (fileNonTerminato) {
		   	String riga = lettore_buffered.readLine();
		   	
		   	if(riga != null) {
		   		stampo riga
		   	}
		   	else{
		   		fileNonTerminato = false;
		   	}
		   	 
		   }
		  
		   * 
		   * */
		  String line;
		  while (( line = lettore_buffered.readLine()) != null) {  
			  System.out.println(line);
		  
		  }
		  
		  lettore_buffered.close();
	  }
      catch (IOException e) {
    	  System.out.println("Eccezione!!!!"+e);
      }	  
	  
	}

	}
