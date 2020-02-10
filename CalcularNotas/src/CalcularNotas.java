import java.util.Scanner;

public class CalcularNotas {

	public static void main(String[] args) {
		/*   Calcular notas e indicar
		entre 0 y <5 suspenso
		Entre 5 y <7 aprobado
		Entre 8 y <10 sobresaliente
		=10 matricula de honor  */
		
		
		Scanner teclado = new Scanner (System.in); //Creación de un objeto Scanner
		
		double nota;
		Boolean esSuspenso;
		Boolean esAprobado;
		Boolean esNotable;
		Boolean esSobresaliente;
		Boolean esMatricula;
		
		System.out.println("Introduzca la nota: ");
		
		nota=teclado.nextDouble();
		
		esSuspenso = nota<5;
		esAprobado = nota>=5 && nota<7;
		esNotable = nota<5;
		esSobresaliente = nota >=8 && nota<10;
		esMatricula = nota==10;
		
		if(nota<5) {
			System.out.println("Suspenso");
		}
		if(nota>=5 && nota<6) {
			System.out.println("Aprobado");
		}
		
		System.out.println("Sobresaliente");
	}

}
