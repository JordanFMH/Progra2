package com.clase.arreglos;

public class Tablero {
	int dimension = 3;
	private final char[][] tablero = new char [dimension][dimension];
	
	public void imprimirTablero() {
		System.out.println("+---+---+---+");
		for(int i=0;i<dimension;i++) {
			System.out.print("|");
			for(int j=0;j<dimension;j++) {
				System.out.print(" "+tablero[i][j]+" |");
			}
			System.out.println();
			System.out.println("+---+---+---+");
		}
	}
	public void asignarValor(int fila, int columna, char caracter){
		tablero[fila][columna]= caracter;
	}
	public boolean comprobarGandor(char caracter) {
		boolean filaCompleta = true;
		//Comprobar fila
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero.length;j++) {
				if(!(tablero[i][j] == (caracter))) {
					filaCompleta=false;
				}
			}
		}
		return filaCompleta;
	}
}
