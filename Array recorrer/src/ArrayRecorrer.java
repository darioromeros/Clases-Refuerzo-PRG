
public class ArrayRecorrer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaración del array de tamaño 3 y tipo entero
		
		int miArray[] = new int [7];
		
		//asignacion de valor 123 en la segunda posicion
		miArray[0] = 1111;
		miArray[1] = 2222;
		miArray[2] = 3333;
		miArray[3] = 4444;
		miArray[4] = 5555;
		miArray[5] = 6666;
		miArray[6] = 7777;
		
		
		//recorrer el array
		
		for(int posicion = 0; posicion < miArray.length; posicion++) {
			
			System.out.println("La posición es: " + (posicion + 1));
			System.out.println("El valor es: " + miArray[posicion]);
			
	// for int pos = 0; pos < array.lenght; pos++
			
			
		}
	}

}
