package Point;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public double calculateDistance(int x, int y) {
		double distance;
		
		int legA = Math.abs(this.y - y);
		int legB = Math.abs(this.x - x);
		
		distance = Math.sqrt(legA * legA + legB * legB);
		
		return distance;
	}
	
	public double calculateDistance(Point miOtroPunto) {
		return this.calculateDistance(miOtroPunto.getX(), miOtroPunto.getY());
	}
}
