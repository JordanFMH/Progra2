package com.clase.herencia;

public class Manager extends Employee{
	
	private int teamSize;
	
	/*public Manager(String name, String addres, String phoneNumber, float experience, int age, int teamSize) {
		super(name, addres, phoneNumber, experience, age);
		this.teamSize = teamSize;
	}*/
	
	@Override //SOBREESCRIBIENDO EL MÉTODO
	public void setAsistance() {
		System.out.println("El jefe está registrando su asistencia...");
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
