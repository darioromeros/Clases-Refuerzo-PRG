package Time;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time miTiempo = new Time(2, 23, 45);
		
		miTiempo.getHoras();
		
		System.out.println("horas" + miTiempo.getHoras());
		
		miTiempo.setHoras(5);
		
		System.out.println("nuevas horas: " + miTiempo.getHoras());
		
		String cadena = miTiempo.toString();
		
		System.out.println("toString de horas: " + cadena);
		
	}

}
