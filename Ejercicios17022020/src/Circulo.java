
public class Circulo {

	double radio;
	String color;
	
	//Primer constructor
	
	public Circulo () {
		System.out.println("inicializando el objeto");
		this.color = "verde";
	}
	
	public Circulo (double radio) {
		System.out.println("Inicializando el objeto con radio");
		this.radio = radio;
	}
	
	public Circulo(double radio, String color) {
		System.out.println("Inicializando el objeto con radio y color");
		this.radio = radio;
		this.color = color;
	}
	
	public double getArea() {
		// logica asociada a calcular area
		System.out.println("El primer metodo");
		double area = Math.PI * radio * radio;
		return area;
	}
		
	public double getArea(double radio) {
		// logica asociada a calcular area
		System.out.println("El segundo metodo");
		double area = Math.PI * radio * radio;
		return area;
	}
	
}
