package Boletin2Ejercicio2;

public class Triangulo extends FiguraGeometrica {
	
	double altura;
	double base;
	
	public Triangulo(double altura, double base, String color) {
		
		super(color);
		this.altura = altura;
		this.base = base;
	}
	
	public double calcularArea() {
		return (altura * base) / 2;
	}
	
	public String toString() {
		return super.toString() + " mi altura es: " + this.altura + " mi base es: " + this.base;
	}
}
