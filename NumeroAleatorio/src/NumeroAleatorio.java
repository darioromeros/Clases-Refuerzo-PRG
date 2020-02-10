
public class NumeroAleatorio {

	public static void main(String[] args) {
		// Numero aleatorio entre 0 y 100 y lo imprime

		int numeroAleatorio;
		
		numeroAleatorio = (int) (Math.random()*100+1);
	
		System.out.println("El número aleatorio es: "+ numeroAleatorio);
		
		
	}

}
