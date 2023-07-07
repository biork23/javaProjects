package EjerciciosDia25;

import java.util.ArrayList;
import java.util.List;

//Dado una lista de N de alumnos de diferentes grupos, edades y promedios
//definir cual de ellos es el mayor, el menor, los más sobresalientes 
//se debe coparar que grupo contiene el promedio más alto

public class MainPromedio {
	
	    public static void main(String[] args) {
	        List<Alumnos> alumnos = new ArrayList<>();
	        alumnos.add(new Alumnos("Juan Carlos", 20, "A", 8.5));
	        alumnos.add(new Alumnos("Maria Luisa", 19, "B", 9.2));
	        alumnos.add(new Alumnos("Carlos Enrique", 21, "A", 7.8));
	        alumnos.add(new Alumnos("Luis Pablo", 18, "B", 9.5));
	        alumnos.add(new Alumnos("Laura Patricia", 20, "C", 9.8));
	        alumnos.add(new Alumnos("Mario Lopez", 22, "C", 8.8));
	        
	        //Encontrar el alumno Mayor
	        
	        Alumnos alumnoMayor = alumnos.get(0);
	        for (Alumnos mayor : alumnos) {
	        	if(mayor.getEdad()> alumnoMayor.getEdad()) {
	        		alumnoMayor= mayor;
	        	}
	        }
	        
	        System.out.println("El alumno mayor es: " + alumnoMayor);
	        
	        
	        //Encontrar al alumno menor
	        
	        Alumnos alumnoMenor = alumnos.get(0);
	        for (Alumnos menor : alumnos) {
	        	if(menor.getEdad()< alumnoMenor.getEdad()) {
	        		alumnoMenor= menor;
	        	}
	        }
	        
	        System.out.println("El alumno menor es: " + alumnoMenor);
	        
	        
	        
	        

	        // Encontrar el alumno con el promedio más alto
	        Alumnos maxPromedioAlumno = alumnos.get(0);
	        for (Alumnos alumno : alumnos) {
	            if (alumno.getPromedio() > maxPromedioAlumno.getPromedio()) {
	                maxPromedioAlumno = alumno;
	            }
	        }
	        System.out.println("Alumno con el promedio más alto: " + maxPromedioAlumno);

	        // Encontrar el grupo con el promedio más alto
	        String maxPromedioGrupo = "";
	        double maxPromedioGrupoValor = 0.0;
	        for (Alumnos alumno : alumnos) {
	            double promedioGrupo = obtenerPromedioGrupo(alumnos, alumno.getGrupo());
	            if (promedioGrupo > maxPromedioGrupoValor) {
	                maxPromedioGrupoValor = promedioGrupo;
	                maxPromedioGrupo = alumno.getGrupo();
	            }
	        }
	        System.out.println("Grupo con el promedio más alto: " + maxPromedioGrupo+ " su promedio es " + maxPromedioGrupoValor);
	    }

	    private static double obtenerPromedioGrupo(List<Alumnos> alumnos, String grupo) {
	        double sumaPromedios = 0.0;
	        int contador = 0;
	        for (Alumnos alumno : alumnos) {
	            if (alumno.getGrupo().equals(grupo)) {
	                sumaPromedios += alumno.getPromedio();
	                contador++;
	            }
	        }
	        return sumaPromedios / contador;
	    }
}

