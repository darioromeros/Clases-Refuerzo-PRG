import java.util.Scanner;

public class CrearArraydeTama�o {

	public static void main(String[] args) {
		/* 1 Introduce un entero
		 * 2 Crear un array de ese tama�o
		 * 3 rellenar el array con valores del usuario.
		 * 4 Imprimir dichos valores.
		 */
		
		Scanner teclado = new Scanner (System.in); //Creaci�n de un objeto Scanner
		
		System.out.println("Introduzca la longitud del array: ");
		
		int longitud = teclado.next.Int();
		
		int miArray[] = new int[longitud];
		
		for (int posicion = 0; posicion < longitud; posicion++) {
			System.out.println("Introduzca el valor: ");
			int valor = teclado.nextInt();
			miArray[posicion] = valor;
			
		
		for (int posicion = 0; posicion < longitud; posicion++) {
				System.out.println("el valor introducido: " + miArray[posicion]);
				
		}
	}

}
