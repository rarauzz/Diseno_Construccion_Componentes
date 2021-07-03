package com.diseno.bl.lambda;

public class LambdaResponse {
	private String nombre;
	private String apellidos;
	private int edad;
	private double peso;
	private double masaMuscular;
	
	
	
	public LambdaResponse(String nombre, String apellidos, int edad, 
			double peso, double masaMuscular) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.peso = peso;
		this.masaMuscular = masaMuscular;
	}
	
	
	public LambdaResponse() {
		this.nombre = "*";
		this.apellidos = "*";
		this.edad = -1;
		this.peso = -1;
		this.masaMuscular = -1;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getMasaMuscular() {
		return masaMuscular;
	}


	public void setMasaMuscular(double masaMuscular) {
		this.masaMuscular = masaMuscular;
	}


}