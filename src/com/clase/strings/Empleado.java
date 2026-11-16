package com.clase.strings;

public class Empleado {
	private /*final*/ String name;
	private /*final*/ String lastname;
	
	public Empleado() {
		
	}
	
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

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	/*public String getWelcome(String name) {
		return "Hello my friend: "+name;
	}
	
	public float getWeight(int pounds) {
		float k = 0.45f;
		return pounds * k;
	}*/
}