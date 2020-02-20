
public class Empleado {

	private int id;
	private String nombre;
	private String apellido;
	private double salario;
	
	//Contructores
	
	public Empleado() {
		System.out.println("Constructor vacio");
	}


public Empleado(String nombre, String apellido, double salario) {
	System.out.println("Constructor con datos");
	this.nombre = nombre;
	this.apellido = apellido;
	this.salario = salario;

	}

public Empleado(Int id, String nombre, String apellido, double salario) {
	System.out.println("Constructor con datos");
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.salario = salario;

	}
	//getters y setters
	public double getSalary() {
	return this.salario;
	}
}