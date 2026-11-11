package com.clase.strings;

public class Main {

	public static void main(String[] args) {
		//Apuntan al mismo espacio de memoria en el string pool
		String prefijo1 = "Alerta";
		String prefijo2 = "Alerta"; //pool
		
		//Objeto inmutable inncecesario por redundancia de objeto.
		String prefijo3 = new String("Alerta"); //memory
		prefijo3.concat("Roja");
		
		//Esto no genera espacio en memoria ya que solo imprimimos.
		System.out.println("Esto es una prueba de Strings");
		
		//No crea nuevos espacio de memoria.
		System.out.println(prefijo1 + prefijo2);
		System.out.println(prefijo1 +" "+ prefijo2);
		
		System.out.println(prefijo1 == prefijo3);
		
		String log = " ";
		log = "Evento ";
		for(int i=0; i<100000; i++) {
			log = log;
		}
		
		
		String prefijo5 = new String("Alerta"); //memory
		prefijo5.concat(" ");
		prefijo5.concat(" roja");
		System.out.println(prefijo5);
		
		Empleado emp = new Empleado("Jaime","Vargas");
		
		final StringBuilder logBuilder = new StringBuilder("Alerta");
		logBuilder.append(" ");
		logBuilder.append("naranja");
		logBuilder.append(" ");
		logBuilder.append(emp);
		
		logBuilder.insert(15, "Empleado: ");
		
		System.out.println(logBuilder);
		
		logBuilder.delete(15, 25);
		System.out.println(logBuilder);
		logBuilder.reverse();
		System.out.println(logBuilder);
	}

}