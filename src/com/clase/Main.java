package com.clase;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Persona p1 = new Persona("John");
		System.out.println("Persona 1: "+p1.getName());
		Persona p2 = new Persona("Paul");
		System.out.println("Persona 1: "+p2.getName());
		
		Test.swap(p1, p2);
		
		System.out.println("Persona 1: "+p1.getName());
		System.out.println("Persona 1: "+p2.getName());
		
		/*Potencia p = new Potencia();
		p.potencia(p.a);
		System.out.println("Valor de la variable de instancia: "+p.a);*/
		
		/*Aula aula = new Aula("A3-22");
		System.out.println(aula.getIdAula());
		aula.setCantidadAlumnos(21);*/
		
		//Employee e = new Employee();
	
		//e.asignarDatos("Pedro", "Perez");
		//System.out.println(e.name);
		
		/*Scanner sc = new Scanner(System.in); 
		User a = new User();

		System.out.println("Ingrese Nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese Apellido");
		String apellido = sc.nextLine();
		System.out.println("Ingrese Cedula");
		String cedula = sc.nextLine();
		
		a.ingresarDatosUser(nombre, apellido, cedula);
		System.out.println("Ingrese Servicio");
		String servicio = sc.nextLine();
		
		a.generarServicio(servicio);
		a.imprimirInfo();
		
		System.out.println("Acerquese al cubiculo: "+a.asignarCubiculo(1));*/
		
	}
}