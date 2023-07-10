package EjerciciosDia25;

import java.util.ArrayList;
import java.util.List;

public class FourletterWords {
	
	public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("BackEnd");
        palabras.add("Java");
        palabras.add("Lenguaje");
        palabras.add("Programación");
        
        long contadorStreams = palabras.stream()
                .filter(palabra -> palabra.length() > 4)
                .peek(System.out::println)
                .count();
        System.out.println("Cantidad de palabras con más de cuatro caracteres (usando streams): " + contadorStreams);
    }

}
