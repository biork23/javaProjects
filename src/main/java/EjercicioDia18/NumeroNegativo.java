package EjercicioDia18;

import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero > 5) {
                System.out.println("El número ingresado es mayor a 5.");
            }
        } while (numero >= 0 && !(numero > 5));

        System.out.println("Se ingresó un número negativo mayor a 5. El programa ha terminado.");
    }
}
