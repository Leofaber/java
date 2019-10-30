package com.inheritance;

public class Moto extends Veicolo{

	public Moto(int numeroCilindri, int numeroRuote, String targa) {
		super(numeroRuote, targa);
		this.numeroCilindri = 2;
	}
	
	public int numeroCilindri;

}
