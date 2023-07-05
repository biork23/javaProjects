package TareasDia21;

//Crea una clase "Perro" con los siguientes atributos: nombre (String) y edad (int). 
//Incluye un constructor y métodos para obtener y establecer los valores de los atributos.
//Luego, crea dos objetos de la clase "Perro" y muestra su información por pantalla.

public class Perro {
	
	String nombre;
	int edad;
	
	public Perro(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void DogName() {
		
		System.out.println("El perro se llama " + nombre);
	}
	
	public int DogAge() {
		
		return edad;
		
	}
	
	public static void main(String[] args) {
		
		Perro perro1 = new Perro ("Bobby", 8);
		Perro perro2 =new Perro ("Pancho", 3);
		
		perro1.DogName();
		perro2.DogName();
		
		int edadPerro1 = perro1.DogAge();
		int edadPerro2 = perro2.DogAge();	
		
		System.out.println("Edad del perro 1 es: "+ edadPerro1);
		System.out.println("Edad del perro 2 es: "+ edadPerro2);
		
	}
	

}
