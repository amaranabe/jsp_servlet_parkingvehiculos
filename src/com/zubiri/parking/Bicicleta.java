/**
 * 
 */
package com.zubiri.parking;

import java.util.Scanner;

/**
 * @author xoni
 *
 */
public final class Bicicleta extends Vehiculo {

	int numPinones = 0;
	String tipo = null;
	
	public Bicicleta(String matricula, int numRuedas, boolean motor, String marca, int numPinones, String tipo) {
		super (matricula, numRuedas,motor,marca);
		this.numPinones = numPinones;
		this.tipo = tipo;
	}
	
	public Bicicleta (Scanner sc) throws Exception{
		
		super(sc);
		System.out.println("Escribe el numero de piñones");
		this.setNumPinones(sc.nextInt());
		System.out.println("Escribe el tipo de bicicleta");
		this.setTipo(sc.next());
	}	
	public int getNumPinones() {
		return numPinones;
	}
	public void setNumPinones(int numPinones) {
		this.numPinones = numPinones;
	}
	public String getTipo() {
		return tipo;
	}
public void setTipo(String tipo) throws Exception {
		
		switch (tipo){
		case "MONTA�A":
		case "monta�a":
		case "PASEO":
		case "paseo":
		case "CARRERAS":
		case "carreras":
			this.tipo = tipo;
			break;
		default:
			throw new Exception("TIPO DE BICICLETAS PERMITIDAS: monta�a, paseo, carreras");
	}
		
	}
	
public void mostrarBicicleta(){
	
	System.out.println("BICICLETA:");
	super.mostrarVehiculo();
	System.out.println("\tNumero de piñones: " + this.numPinones);
	System.out.println("\tTipo : " + this.tipo);
}
public String formattedVehiculo() {
	
	String BicicletaStr =  super.formattedVehiculo() +
			"NUMERO DE PIÑONES" + this.numPinones + "\n" + 
			"TIPO:" + this.tipo  + "\n" ;
			
			return BicicletaStr;
	
	
}
			
	//Otros m�todos
	
}
