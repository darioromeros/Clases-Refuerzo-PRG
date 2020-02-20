
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

public Empleado(int id, String nombre, String apellido, double salario) {
	System.out.println("Constructor con datos");
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.salario = salario;

	}
	//getters
	public double getSalario() {
	return this.salario;
	}
	
	//Setter
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//toString
	public String toString() {
		return "soy el empleado" + this.nombre + "cobro " + this.salario + " $";
	}
}