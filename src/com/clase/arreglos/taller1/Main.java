package com.clase.arreglos.taller1;

public class Main {
	public static void main(String[] args) {
		Clase a1 = new Clase("Matematicas",18);
		Clase a2 = new Clase("Fisica",25);
		Clase a3 = new Clase("Quimica",20);
		Clase b1 = new Clase("Matematicas",32);
		Clase b2 = new Clase("Fisica",15);
		Clase b3 = new Clase("Quimica",28);
		Clase b4 = new Clase("Biologia",32);
		Clase b5 = new Clase("Historia",32);
		Clase b6 = new Clase("Geografia",32);
		Clase c1 = new Clase("Literatura",18);
		Clase c2 = new Clase("Artes",25);
		Clase c3 = new Clase("Botanica",20);
		Clase c4 = new Clase("Programacion",34);
		System.out.println();
		System.out.println("Sucursal 0");
		System.out.println(a1.toString()+" Cantidad máxima de incritos "+a1.Maxima());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println("Sucursal 1");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println(b4.toString());
		System.out.println(b5.toString());
		System.out.println(b6.toString());				
		System.out.println("Sucursal 2");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
		Clase [][] sucursal = new Clase[3][];
		
		sucursal[0] = new Clase[5]; 
		sucursal[0][0] = a1;
		sucursal[0][1] = a2;
		sucursal[0][2] = a3;
		sucursal[1] = new Clase[] {b1,b2,b3,b4,b5,b6,null};
		sucursal[2] = new Clase[] {c1,c2,c3,c4};
		
		for(int i=0;i<sucursal.length;i++) {
			System.out.println("Sucursal "+i);
			for(int j=0;j<sucursal[i].length;j++) {
				if(sucursal[i][j] !=null) {
					System.out.println(sucursal[i][j].toString()+", cantidad máxima: "+sucursal[i][j].Maxima());
				}
			}
		}
		
	}
}