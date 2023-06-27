package personas;

public class Atributos {
	
	private String nombre;
	private double altura;
	
	public void Persona(String nombre, double altura) {
		this.nombre = nombre;
		this.altura = altura;
	}
    // Metodo set y get
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
}
