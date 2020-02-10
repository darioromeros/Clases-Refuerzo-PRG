import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in); //Creación de un objeto Scanner
		
		int operando1, operando2, operacion;
		int resultado = 0;
		
		System.out.println("Introducir el primer operando: ");
		
		operando1 = teclado.nextInt();
		
		System.out.println("Introducir el segundo operando: ");
		
		operando2 = teclado.nextInt();
		
		
		//MENU
		
		System.out.println("MENU");
		System.out.println("1  - Sumar");
		System.out.println("2. - Restar");
		System.out.println("3. - Multiplicar");
		System.out.println("4. - Dividir");
		
		operacion = teclado.nextInt();
		
		boolean esSuma = operacion == 1;
		boolean esResta = operacion == 2;
		boolean esMultiplicar = operacion == 3;
		boolean esDivision = operacion == 4;
		
		
		//Suma
		if(esSuma) {
			resultado = operando1 + operando2;
		}
		
		System.out.println("El resultado es: " + resultado);
		
		if(esResta) {
			resultado = operando1 - operando2;
		}
		
		System.out.println("El resultado es: " + resultado);
		
		if(esMultiplicar) {
			resultado = operando1 * operando2;
		}
		
		System.out.println("El resultado es: " + resultado);
		
		if(esDivision) {
			resultado = operando1 / operando2;
		}
		
		System.out.println("El resultado es: " + resultado);
		
	}
}
