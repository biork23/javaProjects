package EjerciciosDia25;

import java.util.ArrayList;
import java.util.List;

public class ToUpperCase {
	
	public static void main(String[] args) {
        List<String> cadenas = new ArrayList<>();
        cadenas.add("Hola");
        cadenas.add("Mundo");
        cadenas.add("BackEnd");
        cadenas.add("Java");
        cadenas.add("Lenguaje");
        cadenas.add("Programación");
        
        System.out.println("Cadenas en mayúsculas (usando streams):");
        cadenas.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
