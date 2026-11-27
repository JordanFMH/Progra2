package com.clase.herencia;

public class Programmer extends Employee{
	
	private  String[] progammingLanguajes;
	{
		counter=counter-1;
		System.out.println("Valor incialización de counter (programmer): "+counter);
	}
	/*public Programmer(String name, String addres, String phoneNumber, float experience, int age, String[] progammingLanguajes) {
		super(name, addres, phoneNumber, experience,age);
		this.progammingLanguajes = progammingLanguajes;
	}*/
	
	public Programmer() {
		System.out.println("Constructor (programmer)");
	}
	
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