package TareasDia27;

public class Perro extends Animal {
	
	private String raza;
	private double peso;
	
	public Perro(String nombre, String tipo_alimentacion, int edad, String raza, double peso) {
		super(nombre, tipo_alimentacion, edad);
		this.raza = raza;
		this.peso = peso;
		
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void mostrar() {
		System.out.println(getNombre()+ "- " + getTipo_alimentacion()+"- "+ getEdad()+ "- "+ getRaza()+"- "+getPeso());
	}

}
