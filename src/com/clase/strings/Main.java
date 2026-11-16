package com.clase.strings;

public class Main {

	public static void main(String[] args) {
		int[] b = new int[4];
		
		b[0] = 3;		
		int c = b[0];
		b[0] = 4;
		
		System.out.println(c);
		System.out.println(b[0]);
		
		int[] b1 = new int[] {1,8,14};
		
		Empleado[] emps = new Empleado[3];
		
		/*Empleado em1 = new Empleado("Juan","Perez");
		emps[0] = em1;
		
		Empleado em2 = em1; //new Empleado("Maria","Velazco");
		em2.setName("Maria");
		emps[0] = em2;
		emps[0] = em1;*/
		emps[0] = new Empleado("Juan","Perez");
		emps[0].getLastName();
		System.out.println(emps[1]);
		System.out.println(emps[1].getName());
		System.out.println(emps[1].getLastName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int limite = 100;
		
		Empleado emp = new Empleado();
		emp.getWelcome("James");
		
		float peso = emp.getWeight(180);
		//emp = null;
		StringBuilder persona = new StringBuilder();
		persona.append(emp.getName());
		persona.append(" su peso es: ");
		persona.append(peso);
		
		System.out.println(persona);*/
		
		/*
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
		System.out.println(logBuilder);*/
		
		/*final EmpleadoRecord empr= new EmpleadoRecord("John","Martinez"); //Al utilizar records, la instancia de la clase, los paramatros son final.
		System.out.println(empr.name());
		
		
		final Empleado emp = new Empleado("John","Martinez");
		System.out.println(emp.getName());*/
		
		/*final EmpleadoRecord empr= new EmpleadoRecord("John");
		System.out.println(empr);*/
	}

}