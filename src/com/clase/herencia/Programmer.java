package com.clase.herencia;

public class Programmer extends Employee{
	
	private  String[] progammingLanguajes;
	
	/*public Programmer(String name, String addres, String phoneNumber, float experience, int age, String[] progammingLanguajes) {
		super(name, addres, phoneNumber, experience,age);
		this.progammingLanguajes = progammingLanguajes;
	}*/
	
	public String[] getProgammingLanguajes() {
		return progammingLanguajes;
	}

	public void setProgammingLanguajes(String[] progammingLanguajes) {
		this.progammingLanguajes = progammingLanguajes;
	}
	
	public void writeCode() {
		System.out.println("Escribiendo código...");
	}
}