package com.clase.arreglos.taller1;

import java.util.Random;

public class Clase {
	{
		Random r = new Random();
		maxima = r.nextInt(20, 35);
	}
	private final String nombre;
	private final int inscritos;
	private final int maxima;
	
	
	public String Nombre() {
		return this.nombre;
	}
	public int Inscritos() {
		return this.inscritos;
	}
	public int Maxima() {
		return this.maxima;
	}
	public Clase(String nombre, int inscritos) {
		this.nombre = nombre;
		
		if(maxima < inscritos) {
			System.out.println("El numero de alumnos en "+this.nombre+" no puede axceder a : "+maxima);
			this.inscritos = maxima;
		}else {
			this.inscritos = inscritos;
		}
		
	}
	@Override
	public String toString() {
		return "El curso de "+this.nombre+" tiene "+this.inscritos+" alumnos.";
	}
}