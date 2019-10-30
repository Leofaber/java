package com.inheritance;

public class Veicolo {
	
	public Veicolo() {
		
	}
	
	public Veicolo(int numeroRuote, String targa) {
		this.numeroRuote = numeroRuote;
		this.targa = targa;
		this.acceso = false;
	}
	
	public int numeroRuote;
	public String targa;
	public boolean acceso;
	
	public void accendi() {
		System.out.println("Il veicolo con "+this.numeroRuote+" ruote e targa "+this.targa+" è stato acceso");
		this.acceso = true;
	}
	
}
