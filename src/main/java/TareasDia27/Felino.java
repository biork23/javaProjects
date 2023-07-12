package TareasDia27;

public class Felino extends Animal {
	
	private String familia;
	private String habitad;
	
	public Felino (String nombre, String tipo_alimentacion, int edad, String familia, String habitad) {
		super(nombre, tipo_alimentacion, edad);
		this.familia = familia;
		this.habitad = habitad;
		
	}
	
	public String getFamilia() {
		return familia;
	}
	
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	public String getHabitad() {
		return habitad;
	}
	
	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}
	
	public void show() {
		System.out.println(getNombre()+ "- " + getTipo_alimentacion()+"- "+ getEdad()+"- "+getFamilia()+"- "+getHabitad());
	}

}
