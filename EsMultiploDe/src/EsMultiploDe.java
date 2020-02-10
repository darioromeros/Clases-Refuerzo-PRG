import java.util.Scanner;

public class EsMultiploDe {

	public static void main(String[] args) {
		// Comprobar si un número es múltiplo de otro.
		
		Scanner teclado = new Scanner (System.in); //Creación de un objeto Scanner
		int numero1;
		int numero2;
		int resto;
		Boolean esMultiplo;
		
		System.out.println("Introduzca primer número: ");
		
		numero1=teclado.nextInt();
		
		System.out.println("Introdzca segundo número: ");
		
		numero2=teclado.nextInt();
		
		resto = numero1%numero2;
		
		esMultiplo = resto == 0;
		
		if (esMultiplo) {
			  System.out.println(numero1 + " es múltiplo de " + numero2);
		}else {
			  System.out.println(numero1 + " NO es múltiplo de " + numero2);
		}

	}

}
