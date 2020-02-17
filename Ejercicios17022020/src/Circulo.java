
public class Circulo {

	double radio;
	String color;
	
	public double getArea() {
		// logica asociada a calcular area
		System.out.println("El primer metodo");
		double area = Math.PI * radio * radio;
		return area;
		
	public double getArea(double radio) {
		// logica asociada a calcular area
		System.out.println("El segundo metodo")
		double area = Math.PI * radio * radio;
		return area;
	}
	
}
