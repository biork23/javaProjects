package TareasDia23;

import java.util.ArrayList;
import java.util.List;

import TareasDia23.FiltroPersonas.Filtro;

public class FiltroPersonas {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 35));
        personas.add(new Persona("Pedro", 40));
        personas.add(new Persona("Ana", 20));

        List<String> nombresMayoresDe30 = filtrarPersonas(personas, p -> p.getEdad() > 30);

        for (String nombre : nombresMayoresDe30) {
            System.out.println(nombre);
        }
    }

    public static List<String> filtrarPersonas(List<Persona> personas, Filtro<Persona> filtro) {
        List<String> nombresFiltrados = new ArrayList<>();

        for (Persona persona : personas) {
            if (filtro.cumpleFiltro(persona)) {
                nombresFiltrados.add(persona.getNombre());
            }
        }

        return nombresFiltrados;
    }

    interface Filtro<T> {
        boolean cumpleFiltro(T objeto);
    }
}