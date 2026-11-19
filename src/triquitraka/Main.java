package triquitraka;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[][] game = new char[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<game.length;i++) {	
		System.out.println("Ingrese el numero de fila de 0 a 2: ");
		int fila = sc.nextInt();
		System.out.println("Ingrese el numero de columna de 0 a 2: ");
		int columna = sc.nextInt();
		char cruz = game[fila][columna];
	    cruz = 'X';
	    	if(cruz != 0) {
	    		System.out.println("-----------------------");
	    		System.out.println("  "+cruz+"   |        |       ");
	    		System.out.println("-----------------------");
	    		System.out.println("      |        |       ");
	    		System.out.println("-----------------------");
	    		System.out.println("      |        |       ");
	    		System.out.println("-----------------------");	
	    	}else if(cruz != 0){
	    		System.out.println("-----------------------");
	    		System.out.println("  "+cruz+"   |        |       ");
	    		System.out.println("-----------------------");
	    		System.out.println("  "+cruz+"   |        |       ");
	    		System.out.println("-----------------------");
	    		System.out.println("      |        |       ");
	    		System.out.println("-----------------------");
	    	}else if(cruz != 0){
	    		System.out.println("-----------------------");
	    		System.out.println("  "+cruz+"   |        |       ");
	    		System.out.println("-----------------------");
	    		System.out.println("  "+cruz+"   |        |       "); 
	    		System.out.println("-----------------------");
	    		System.out.println("  "+cruz+"   |        |       "); 
	    		System.out.println("-----------------------");
	    	}
	    	
		}
	}
}