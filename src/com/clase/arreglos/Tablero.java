package com.clase.arreglos;

public class Tablero {
	int dimension = 5;
	private final char[][] tablero = new char [dimension][];

	public void inicializar() {
		tablero[0] = new char[4];
		tablero[1] = new char[5];
		tablero[2] = new char[3];
		tablero[3] = new char[2];
		tablero[4] = new char[1];
	}
	public void imprimirTablero() {
		//System.out.println("+---+---+---+");
		
		for(int i=0;i<tablero.length;i++) {
			System.out.print("|");
			
			for(int j=0;j<tablero[i].length;j++) {
				System.out.print(" "+tablero[i][j]+" |");
			}
			System.out.println();
			
			//System.out.println("+---+---+---+");
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
	/*
	public boolean comprobarGanador(char caracter) {
		boolean filaCompleta = true;
		boolean ganador = false;
		
		//COMPROBAR FILA
		for (int i=0; i < tablero.length; i++) {
			filaCompleta = true;
		}
		return true;
	}*/
}