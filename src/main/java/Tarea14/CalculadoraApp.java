package Tarea14;

import java.util.Scanner;

public class CalculadoraApp {
	

	class Calculadora {
	    public static float sumar(float num1, float num2) {
	        return num1 + num2;
	    }

	    public static float restar(float num1, float num2) {
	        return num1 - num2;
	    }

	    public static float multiplicar(float num1, float num2) {
	        return num1 * num2;
	    }

	    public static float dividir(float num1, float num2) {
	        if (num2 != 0) {
	            return num1 / num2;
	        } else {
	            throw new ArithmeticException("No se puede dividir entre cero.");
	        }
	    }
	}

	public class Calculador {
	    public static void main( String[] args) {
	        Scanner input= new Scanner(System.in);

	        System.out.print("Ingrese el primer número: ");
	        float num1 = input.nextFloat();

	        System.out.print("Ingrese el segundo número: ");
	        float num2 = input.nextFloat();

	        float resultadoSuma = Calculadora.sumar(num1, num2);
	        System.out.println("Suma: " + num1 + " + " + num2 + " = " + resultadoSuma);

	        float resultadoResta = Calculadora.restar(num1, num2);
	        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resultadoResta);

	        float resultadoMultiplicacion = Calculadora.multiplicar(num1, num2);
	        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + resultadoMultiplicacion);

	        try {
	            float resultadoDivision = Calculadora.dividir(num1, num2);
	            System.out.println("División: " + num1 + " / " + num2 + " = " + resultadoDivision);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	    
	    }
	}


}
