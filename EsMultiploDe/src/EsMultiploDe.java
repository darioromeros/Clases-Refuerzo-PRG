import java.util.Scanner;

public class EsMultiploDe {

	public static void main(String[] args) {
		// Comprobar si un n�mero es m�ltiplo de otro.
		
		Scanner teclado = new Scanner (System.in); //Creaci�n de un objeto Scanner
		int numero1;
		int numero2;
		int resto;
		Boolean esMultiplo;
		
		System.out.println("Introduzca primer n�mero: ");
		
		numero1=teclado.nextInt();
		
		System.out.println("Introdzca segundo n�mero: ");
		
		numero2=teclado.nextInt();
		
		resto = numero1%numero2;
		
		esMultiplo = resto == 0;
		
		if (esMultiplo) {
			  System.out.println(numero1 + " es m�ltiplo de " + numero2);
		}else {
			  System.out.println(numero1 + " NO es m�ltiplo de " + numero2);
		}

	}

}
