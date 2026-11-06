package com.clase;

public class Test {
	public static void swap(Persona p1, Persona p2) {
		Persona temp = new Persona(p1.getName());
		p1.setName(p2.getName());
		p2.setName(temp.getName());
		
		/*String temp = p1.getName();
		p1.setName(p2.getName());
		p2.setName(temp);*/				//VALOR
		
		/*Persona temp = p1;
		p1.setName(p2.getName());
		p2.setName(temp.getName());*/	//REFERENCIA
	}
}