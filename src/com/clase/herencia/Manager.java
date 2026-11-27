package com.clase.herencia;

public class Manager extends Employee{
	
	private int teamSize;
	
	static {
		counter=counter+1;
		System.out.println("Valor estático de counter (hijo): "+counter);
	}
	{
		counter=counter-1;
		System.out.println("Valor incialización de counter (hijo): "+counter);
	}
	/*public Manager(String name, String addres, String phoneNumber, float experience, int age, int teamSize) {
		super(name, addres, phoneNumber, experience, age);
		this.teamSize = teamSize;
	}*/
	public Manager() {
		System.out.println("Constrcutor (hijo)");
	}
	
	@Override //SOBREESCRIBIENDO EL MÉTODO
	public void setAsistance() {
		System.out.println("El jefe está registrando su asistencia...");
		System.out.println(counter);
	}
	
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	
	public void reportProjectStatus() {
		System.out.println("Generando reporte...");
	}
}
