import java.util.Scanner;

public class MayorOMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in); //Creaci�n de un objeto Scanner
		int numero1;
		int numero2;
		int resto;
		
		System.out.println("Introduzca primer n�mero: ");
		
		numero1=teclado.nextInt();
		
		System.out.println("Introdzca segundo n�mero: ");
		
		numero2=teclado.nextInt();
		
		if (numero1 > numero2)
			  System.out.println("El n�mero 1 es mayor que el n�mero 2");

		if (numero1 < numero2)
			  System.out.println("El n�mero 1 es menor que el n�mero 2");

		if (numero1 == numero2)
			  System.out.println("El n�mero 1 es igual al n�mero 2");
	}

}
