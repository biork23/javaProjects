package EjercicioDia18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;

        System.out.println("Ingrese 10 números positivos o negativos:");

        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");
            numeros[contador] = scanner.nextInt();
            contador++;
        }

        OrdenamientoArray.ordenar(numeros);
        ImprimirArray.imprimir(numeros);
        EncontrarNumero.buscar(numeros);
    }
}
