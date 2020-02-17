
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//INSTANCIACION
		
		Circulo miCirculo = new Circulo();
		Circulo miOtroCirculo = new Circulo();
		
		//ASIGNACION DE VALORES
		
		miCirculo.radio = 3;
		
		miOtroCirculo.radio = 7;
		
		miCirculo.color = "rojo";
		
		miOtroCirculo.color = "verde";
		
		//REFERENCIAR VALORES
		
		System.out.println("Mi primer círculo tiene radio: " + miCirculo.radio);
		
		//METODOS
		
		double area;
		
		area = miCirculo.getArea();
		
		System.out.println("El area del primer circulo es: " + area);

	}

}
