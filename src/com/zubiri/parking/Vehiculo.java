package com.zubiri.parking;

import java.util.Scanner;

public abstract class Vehiculo {

	String matricula=null;
	int numRuedas = 0;
	boolean motor = false;
	String marca = null;
	
	
	public Vehiculo(){}
	
	public Vehiculo (String matricula, int numRuedas, boolean motor, String marca) {		
		if (this.check(matricula)) {
			this.matricula=matricula;
		}
		else {
			System.out.println("Matrícula errónea.");
		}
		this.numRuedas = numRuedas;
		this.motor = motor;
		this.marca = marca;
	}
	
	public Vehiculo (Scanner sc) {
		
		System.out.println("Introduce matricula: ");
		String mat=sc.next();
		while (this.check(mat) != true) {
			System.out.println("Matrícula errónea.");
			System.out.println("Introduce una nueva matrícula: ");
			mat=sc.next();
		}
		setMatricula(mat);
		
		System.out.println("Numero de ruedas del vehiculo:");
		this.setNumRuedas(sc.nextInt());
		
		System.out.println("Tiene motor el vehiculo");
		this.setMotor(sc.nextBoolean());
		
		System.out.println("de que marca es el vehiculo");
		this.setMarca(sc.next());
	} 
		
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (this.check(matricula) == true) {
			this.matricula = matricula;
		}
	}
	
	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public boolean getMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void mostrarVehiculo () {
		System.out.println("\tMatricula:" + this.getMatricula());
		System.out.println("\tNumero de Ruedas:" + this.getNumRuedas());
		System.out.println("\tMotor:" + this.getMotor());
		System.out.println("\tMarca: " + this.getMarca());
		System.out.println("\t");
	}

	public boolean equalsIgnoreCase(int index) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public String formattedVehiculo() {
		
		String VehiculoStr = 
				"MATRICULA:" + this.matricula + "\n" +
				"NUMERO DE RUEDAS:" + this.numRuedas + "\n" + 
				"MOTOR:" + this.motor  + "\n" +
				"MARCA:" + this.marca  + "\n" ;
				
				return VehiculoStr;
		
	}
	
	//Métodos para comprobar entrada de matrícula correcta
	protected boolean isNumber (char n) {
		if (n=='0' | n=='1' | n=='2' | n=='3' | n=='4' | n=='5' | n=='6' | n=='7' | n=='8' | n=='9') {		
			return true;
		}
		else {
			return false;
		}
	}
		
	protected boolean isLetter (char l) {
		int ascii=(int)l;
		if ( (ascii > 65 && ascii < 90) || (ascii > 97 && ascii <122)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	protected boolean check(String _string) {
		if (_string.length() == 7) {
			for (int i = 0; i < 4; i++) {
				boolean result=this.isNumber(_string.charAt(i));
				if (result == false) {
					return false;
				}
			}
			for (int j = 4; j < 7; j++) {
				boolean letters=this.isLetter(_string.charAt(j));
				if (letters == false) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
}
