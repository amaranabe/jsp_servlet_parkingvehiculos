package com.zubiri.parking;

import java.util.Scanner;

public class Coche extends Vehiculo {

	boolean automatico = false;
	int consumo100km = 0;
	
	
	
	public boolean isAutomatico() {
		return automatico;
	}

	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}

	public int getConsumo100km() {
		return consumo100km;
	}

	public void setConsumo100km(int consumo100km) {
		this.consumo100km = consumo100km;
	}

	
	public Coche(String matricula, int numRuedas, boolean motor, String marca, boolean automatico, int consumo100km) {
		super (matricula, numRuedas,motor,marca);
		this.automatico = automatico;
		this.consumo100km = consumo100km;
	}
	
	public Coche (Scanner sc) throws Exception{
		
		super(sc);
		System.out.println("Escribe si es automatico");
		this.setAutomatico(sc.nextBoolean());
		System.out.println("Escribe el comsumo 100km");
		this.setConsumo100km(sc.nextInt());
	}	
	
	
	//Constructores
	
	//M�todos getter y setter
				
	//Otros m�todos
    double calcConsumo(int numKm, double precioGasoil) {
    	
    	double consumoTotal = 0;
    	
    	
    	return consumoTotal;
    }
    
}
