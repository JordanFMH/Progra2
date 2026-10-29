package com;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		User a=new User();

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
		System.out.println("Acerquese al cubiculo: "+a.asignarCubiculo(1));
		
	}
}