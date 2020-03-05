package Point;

public class Principal {

	public static void main(String[] args) {
		Point pointA = new Point(2,4);
		Point pointB = new Point(5,1);
		
		double distance;
		
		System.out.println("mi punto A es: " + pointA);
		System.out.println("mi punto B es: " + pointB);
		
		distance = pointA.calculateDistance(pointB);
		
		System.out.println(distance);
			

	}

}
