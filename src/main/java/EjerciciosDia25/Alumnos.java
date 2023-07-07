package EjerciciosDia25;

 class Alumnos {
	
	private String nombre;
	private int edad;
	private String grupo;
	private double promedio;
	
	public Alumnos(String nombre, int edad, String grupo, double promedio) {
		
		this.nombre= nombre;
		this.edad= edad;
		this.grupo= grupo;
		this.promedio= promedio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGrupo() {
		return grupo;
	}
	
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public double getPromedio() {
		return promedio;
	}
	
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	@Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", grupo='" + grupo + '\'' +
                ", promedio=" + promedio +
                '}';
    }
	
	

}
