package TareasDia22;

import java.util.List;
import java.util.ArrayList;

public class EjemplosDeArrays {
	
	public static void main(String[] args) {
		
		List<String> nombreAlumnos = new ArrayList<>();	
		
		 nombreAlumnos.add("Juan Vicente");
		 nombreAlumnos.add("Jose Mariscal");
		 nombreAlumnos.add("Juan Cardenas");
		 nombreAlumnos.add("Ismael Monfil");
		 
		 
		 System.out.println("Lista de nombres FUNVAL " + nombreAlumnos);
		 
		 nombreAlumnos.add(1, "Chano Vera");
		 
		 System.out.println(" Se agrega a Chano " + nombreAlumnos);
		 
		 nombreAlumnos.remove(0);
		 System.out.println("La lista quedo asi " + nombreAlumnos);
		 
		 int cantidadAlumnos = nombreAlumnos.size();
		 
		 System.out.println("Tiene la cantidad de alumnos siguientes: " + cantidadAlumnos);
		 
		 for(String nombre: nombreAlumnos) {
			 System.out.println("-- " + nombre);
		 }
		 
		 
		 List<Integer> calificaciones = new ArrayList<>();
		 
		 calificaciones.add(100);
		 calificaciones.add(90);
		 calificaciones.add(85);
		 calificaciones.add(95);
		 
		 System.out.println("Lista de calificaciones en FUNVAL " + calificaciones);
		 
		 
		 
		 for( Integer cali: calificaciones) {
			 System.out.println(cali);
		 }
		 
		 for (String nombre : nombreAlumnos) {
	        	int indice = nombreAlumnos.indexOf(nombre);
	        	System.out.println("Nombre del alumno "+nombre +" "+ " calificacion "+calificaciones.get(indice));
	        }
		 	 
		 List<String> grupos = new ArrayList<>();
		 
		 grupos.add("A");
		 grupos.add("B");
		 grupos.add("C");
		 
		 System.out.println("Los grupos de FUNVAL son: " + grupos);
		 
		 
		 for(String group: grupos) {
		 
		    System.out.println(group);
		 }
	
	}
	

}
