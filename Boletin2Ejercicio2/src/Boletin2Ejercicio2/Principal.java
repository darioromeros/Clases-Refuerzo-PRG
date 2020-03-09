package Boletin2Ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	/*	Menu miMenu = new Menu ();
		
		miMenu.imprimirMenu(); */
		
		//metodo estático
		Menu.imprimirMenu();
		
		Scanner teclado = new Scanner(System.in);
		
		int option = teclado.nextInt();
		
		//atributo estatico
	//	System.out.println("el numero pi es" + Math.PI);
		
		Triangulo miTriangulo = new Triangulo(3, 4, "rojo");
		
		System.out.println("el color es: " + miTriangulo.getColor());
	}

}
