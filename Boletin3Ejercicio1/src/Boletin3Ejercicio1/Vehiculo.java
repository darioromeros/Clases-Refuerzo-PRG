package Boletin3Ejercicio1;

public class Vehiculo {
	private String matricula;
	private String tipo;
	private int velocidad;
	private Conductor conductor;
	
	public Vehiculo(String matricula, String tipo, int velocidad, Conductor conductor) {
		this.matricula = matricula;
		this.tipo = tipo;
		this.velocidad = velocidad;
		this.conductor = conductor;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	
}
