import java.util.Scanner;

public class MayorOMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in); //Creación de un objeto Scanner
		int numero1;
		int numero2;
		int resto;
		
		System.out.println("Introduzca primer número: ");
		
		numero1=teclado.nextInt();
		
		System.out.println("Introdzca segundo número: ");
		
		numero2=teclado.nextInt();
		
		if (numero1 > numero2)
			  System.out.println("El número 1 es mayor que el número 2");

		if (numero1 < numero2)
			  System.out.println("El número 1 es menor que el número 2");

		if (numero1 == numero2)
			  System.out.println("El número 1 es igual al número 2");
	}

}
