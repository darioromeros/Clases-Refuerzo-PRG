package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in); //Creaci�n de un objeto Scanner
		
		System.out.println("Introduce un n�mero: ");
		
		int numero = teclado.nextInt();
		
		System.out.println("El numero introducido es: "+ numero);
		
        

	}

}
