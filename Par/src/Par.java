import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		// Es par o impar y avisar
		
		Scanner teclado = new Scanner (System.in); //Creación de un objeto Scanner
		int numero;
		int resto;
		
		System.out.println("Ingrese un número: ");
		
		numero = teclado.nextInt();
		
		resto = numero % 2;
		
		if(resto == 0) {
			System.out.println("El número es PAR");
		} else {
			System.out.println("El número es IMPAR");
		}

	}

}
