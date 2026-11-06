package com.clase;

public class Aula {
	private int cantidadAlumnos =0;
	private String idAula ="";
	private int porcentajeAsistencia;
	String nombreProfesor ="";
	
	public Aula(String idAula) {
		this.idAula = idAula;
	}
	
	/*public void setIdAula(String idAula) {
		this.idAula = idAula;
	}*/
	
	public String getIdAula() {
		return this.idAula;
	}
	
	public void setCantidadAlumnos(int cantidadAlumnos) {
		this.cantidadAlumnos = cantidadAlumnos; 
	}
	
	public int getCantidadAlumnos() {
		return cantidadAlumnos;
	}
	
	private int calcularAsistencia() {
		return 0;
	}
	
	public int getPorcentajeAistencia() {
		return calcularAsistencia();
	}
}