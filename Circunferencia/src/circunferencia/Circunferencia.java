package circunferencia;

import java.util.Scanner;

public class Circunferencia {
		
		// Radio y perímetro de circunferencia
		
		public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in); //Creación de un objeto Scanner
			double radio;
			double areaCirculo;
			double perimetro;
			
			System.out.println("Ingrese el radio: ");
			
		       radio=teclado.nextDouble();
		       
		       System.out.println("El radio introducido es: "+ radio);
		       
		       areaCirculo = 2 * Math.PI *radio*radio;
		       perimetro = Math.PI*2*radio;
		       
		       System.out.println("El area es: "+ areaCirculo);
		       
		       System.out.println("El perimetro es: "+ perimetro);
		       
		       	teclado.close();


	}

}
