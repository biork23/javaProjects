package Tarea17;


public class Suma100 {
	
	public static void main(String[] args) {
		int suma = 0;
		
		for(int i=0; i<=100; i++) {
			suma= suma + i;
			System.out.println(suma+ " + " + i);
		
		}
		
		System.out.println("La suma de los primeros 100 numeros naturales es: " +suma);
	}

}
