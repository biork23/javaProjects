package TareasDia22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GruposAlumnos {
    public static void main(String[] args) {
        ArrayList<String> nombresAlumnos = new ArrayList<>();
        nombresAlumnos.add("Juan Garcia");
        nombresAlumnos.add("Marío Benedetti");
        nombresAlumnos.add("Pedro Paramo");
        nombresAlumnos.add("Luis Hernandez");

        ArrayList<Integer> calificaciones = new ArrayList<>();
        calificaciones.add(85);
        calificaciones.add(90);
        calificaciones.add(75);
        calificaciones.add(98);
        
        for (String nombre : nombresAlumnos) {
        	int indice = nombresAlumnos.indexOf(nombre);
        	System.out.println("Nombre del alumno "+nombre +" "+ " calificacion "+calificaciones.get(indice));
        }

        Map<String, Integer> alumnosCalificaciones = new HashMap<>();
        for (int i = 0; i < nombresAlumnos.size(); i++) {
            String alumno = nombresAlumnos.get(i);
            int calificacion = calificaciones.get(i);
            alumnosCalificaciones.put(alumno, calificacion);
        }

        List<String> grupoA = new ArrayList<>();
        List<String> grupoB = new ArrayList<>();
        List<String> grupoC = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : alumnosCalificaciones.entrySet()) {
            String alumno = entry.getKey();
            int calificacion = entry.getValue();

            if (calificacion > 95) {
                grupoA.add(alumno);
            } else if (calificacion > 80) {
                grupoB.add(alumno);
            } else {
                grupoC.add(alumno);
            }
        }
        
        System.out.println("Los alumnos quedaron acomodados de la siguiente manera:");

        System.out.println("Grupo A: " + grupoA);
        System.out.println("Grupo B: " + grupoB);
        System.out.println("Grupo C: " + grupoC);
    }
}

