package com.clase.arreglos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean jugador1= true;
		
		Tablero tablero = new Tablero();
		tablero.imprimirTablero();
		
		Scanner sc = new Scanner(System.in);
		char caracter;
		while(true) {
			if(jugador1) {
				System.out.println("Turno de Jugador 1");
				caracter = 'X';
				jugador1 = false;
				
			}else {
				System.out.println("Turno de Jugador 2");	
				caracter = 'O';
				jugador1 = true;
			}
			System.out.println("Ingrese la fila: ");
			int fila = sc.nextInt();
			System.out.println("Ingrese la columna: ");
			int columna = sc.nextInt();
			tablero.asignarValor(fila, columna,caracter);
			System.out.println("");
			tablero.imprimirTablero();
			tablero.comprobarGandor(caracter);
		}
		
	}

}
