package com.clase.strings;

public record EmpleadoRecord(String name, String lastname) {
	
	public EmpleadoRecord(String name, String lastname) { //CONSTRUCTOR CANONICO
		this.name = name;
		this.lastname = lastname;
		System.out.println("Iniciando constructor canonico");
	}
	
	/*public EmpleadoRecord {
		name = name;
		lastname = lastname;
	}*/
	
	public EmpleadoRecord(String nombreEmpleado) { //CONSTRUCTOR NO-CANONICO(Personalizado)
		this(nombreEmpleado,"Sin apellido"); //Debe estar en la primer linea de código del constructor.
		System.out.println("Iniciando constructor no canonico");
	}
}