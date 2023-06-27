package Tarea16;

import java.util.Scanner;

public class NumParImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (esPar(numero)) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }

        if (esPrimo(numero)) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }

 
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

   
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
	      
	}
	  

      

}

	


