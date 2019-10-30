package com.inheritance;

public class Macchina extends Veicolo{

	public Macchina() {
		
	}
	public Macchina(String casaAutomobilistica, int numeroRuote, String targa) {
		super(numeroRuote, targa);
		this.casaAutomobilistica = casaAutomobilistica;
	}

	public String casaAutomobilistica;
	
	public void chiudiBaule() {
		System.out.println("Il baoole della macchina con targa "+this.targa+" è stato chiuso.");
	}

}
