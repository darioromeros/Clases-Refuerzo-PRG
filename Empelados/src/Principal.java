
public class Principal {

	public static void main(String[] args) {

	Empleado miEmpleado1 = new Empleado();
	
	Empleado miEmpleado2 = new Empleado(2, "Manolo", "Lopez", 1500);
	
	//Consultar el salario
	
	System.out.println(miEmpleado1.getSalario());
	
	//setear el salario
	miEmpleado1.setSalario(2000);
	
	miEmpleado2.setSalario(3000);
	//toString
	
	System.out.println(miEmpleado2);
		
	}

}
