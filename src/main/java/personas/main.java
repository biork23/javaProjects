package personas;

public class main {
	
	public static void main(String[] args) {
		
		double miAltura = 1.83;
		
		String miNombre = "Ismael";
		
		Atributos Persona1 = new Atributos();
		
		Persona1.setNombre(miNombre);
		
		Persona1.setAltura(miAltura);
		
	    
				
		
		System.out.println("Nombre: "+ Persona1.getNombre());
		System.out.println("Altura: "+ Persona1.getAltura());
	}

}
