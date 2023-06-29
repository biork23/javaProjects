package EjercicioDia18;

import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10; 
            suma += digito; 
            numero /= 10; 
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}

