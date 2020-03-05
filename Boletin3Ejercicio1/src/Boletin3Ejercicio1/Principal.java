package Boletin3Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Conductor miConductor  = new Conductor("Antonio", "22222222-A");
		
		Vehiculo miVehiculo = new Vehiculo("4444-TTF", "turismo", 190, miConductor);
		
		System.out.println(miVehiculo.getConductor().nombre);
		
		Conductor miotroConductor = miVehiculo.getConductor();
		
		String miNombre = miOtroConductor.nombre;
		
		System.out.println(miNombre);
	}

}
