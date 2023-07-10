package EjerciciosDia25;

import java.util.ArrayList;
import java.util.List;

public class EvenNumber {
	 public static void main(String[] args) {
	        List<Integer> numeros = new ArrayList<>();
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(5);
	        numeros.add(6);
	        numeros.add(7);
	        numeros.add(8);
	        numeros.add(9);
	        numeros.add(10);
	        
	        
	        System.out.println("Números pares (usando streams):");
	        numeros.stream()
	                .filter(numero -> numero % 2 == 0)
	                .forEach(System.out::println);
	    }


}
