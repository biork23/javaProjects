package EjercicioDia18;

import java.util.Scanner;

public class EncontrarNumero {
    public static void buscar(int[] numeros) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para buscar: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;
        int i = 0;
        while (i < numeros.length) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                break;
            }
            i++;
        }

        if (encontrado) {
            System.out.println(numeroBuscado + " existe en la lista de números ingresados.");
        } else {
            System.out.println(numeroBuscado + " no existe en la lista de números ingresados.");
        }
    }
}

