package TareasDia22;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números enteros:");

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        Arrays.sort(numeros);

       
        System.out.println("Números en orden ascendente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

