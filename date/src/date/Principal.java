package date;

public class Principal {

	public static void main(String[] args) {
		Date miFecha = new  Date(2, 3, 2020);
		Date miFechaDefault = new Date();
		
		int resultado = 3;
		
		String cadena = "mi String!";
		
		System.out.println(miFecha);
		
		System.out.println(miFechaDefault);
		
		miFecha.aumentarMes(12);
		
		System.out.println(miFecha);
		
		miFecha.aumentarMes(7);
		
		System.out.println(miFecha);
				
		miFecha.aumentarMes(25);
		
		System.out.println(miFecha);
	}

}
