package com.clase.herencia;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.getLastName();
		manager.setAge(18);
		manager.setAsistence();
		manager.reportProjectStatus();
		Programmer programmer = new Programmer();
		programmer.getLastName();
		programmer.setAsistence();
		programmer.writeCode();
	}	
}