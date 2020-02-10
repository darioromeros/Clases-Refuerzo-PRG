package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in); //Creación de un objeto Scanner
		
		System.out.println("Introduce un número: ");
		
		int numero = teclado.nextInt();
		
		System.out.println("El numero introducido es: "+ numero);
		
        

	}

}
