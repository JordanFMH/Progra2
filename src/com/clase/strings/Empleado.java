package com.clase.strings;

public class Empleado {
	private final String name;
	private final String lastname;
	
	public Empleado(String name, String lastName) {
		this.name = name;
		this.lastname = lastName;
	}
	
	/*public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}*/

	public String getName() {
		return this.name;
	}

	public String getLastName() {
		return this.lastname;
	}
	
}