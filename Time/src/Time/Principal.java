package Time;

public class Principal {

	public static void main(String[] args) {
		
		Time miTiempo = new Time(2, 23, 57);
		
		miTiempo.getHoras();
		
		System.out.println("horas: " + miTiempo.getHoras());
		
		miTiempo.setHoras(5);
		
		System.out.println("nuevas horas: " + miTiempo.getHoras());
		
		String cadena = miTiempo.toString();
		
		System.out.println("toString de horas: " + cadena);
		
		Time miOtroTiempo = new Time(2,4, 0);
		
		miTiempo.aumentarMinutos(50);
		
		System.out.println("Minutos Aumentados: " + miTiempo);
		
	}

}