package Boletin2Ejercicio2;

public class Triangulo extends FiguraGeometrica {
	
	double altura;
	double base;
	
	public Triangulo(double altura, double base, String color) {
		
		super(color);
		this.altura = altura;
		this.base = base;
	}
	
	public double calcularAres() {
		return (altura * base) / 2;
	}
}
