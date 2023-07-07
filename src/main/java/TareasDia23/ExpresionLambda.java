package TareasDia23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExpresionLambda {
	
	public static void main(String[] args) {
//		Predicate<Integer> par= (numero) -> numero % 2 == 0;
//		
//		boolean respuesta = par.test(8);
//		System.out.println("¿ El numero 8 es par? " + respuesta);
		
//		List <Integer> numeros = new ArrayList<>();
//		
//		numeros.add(1);
//		numeros.add(2);
//		numeros.add(3);
//		numeros.add(4);
//		numeros.add(5);
//		numeros.add(6);
//		
//		Function<Integer, Double> cuadrado= (num) -> Math.pow(num, 3);
//		List<Double> resultado = new ArrayList<>();
//		for(Integer num: numeros) {
//			resultado.add(cuadrado.apply(num));
//		}
//		
//		System.out.println("Los resultados son: " + resultado);
		
		
		Function<String, String> palabra = word  -> word.toLowerCase();
		
		String palabraMayuscula = "TAREA";
		String palabraMinuscula = palabra.apply(palabraMayuscula);
		
		System.out.println("La palabra en minuscula es: " + palabraMinuscula);
		
		
		Function<Integer, Integer> doble = (numero) -> numero * 2;
		
		Integer numeroDoble = doble.apply(8);
		
		System.out.println("El doble de tu numero es: "+ numeroDoble);
		
		
		
		

	}
	
		
	
		

}
