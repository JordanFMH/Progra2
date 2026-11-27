package com.clase.herencia;

public class Employee {
	private String name;
	private String lastName;
	private String addres;
	private String phoneNumber;
	private float experience;
	private int age;
	public static int counter = 0;
	static {
		counter=counter+1;
		System.out.println("Valor estático de counter (padre): "+counter);
	}
	{
		counter=counter+1;
		System.out.println("Valor incialización de counter (padre): "+counter);
	}
	/*public Employee(String name, String addres, String phoneNumber, float experience, int age) {
		this.name = name;
		this.addres = addres;
		this.phoneNumber = phoneNumber;
		this.experience = experience;
		this.age = age;
	}*/
	
	public Employee() {
		System.out.println("Contructor (padre)");
	}
	
	public void setAsistance() {
		System.out.println("Registrando asistencia...");
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=18) {
			this.age = age;
		}else {
			System.out.println("Edad inválida, debe tener más de 20 años");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	
}