package com.clase.arreglos;

public class Main2 {
	public static void main(String[] args) {
		boolean[][] asistencia; //ERROR DE COMPILACION
		
		asistencia [0] = new boolean[4]; //YOGA
		asistencia [1] = new boolean[2]; //TAICHI
		asistencia [2] = new boolean[5]; //BAILOTERAPIA
		
		for(int i=0; i<asistencia.length; i++) {
			for(int j=0; j<asistencia[i].length; j++) {
				asistencia[i][j] = true;
			}
		}
		//asistencia[1][3] = false; //ERROR DE EJECUCION
		asistencia[1][1] = false;
	}
}