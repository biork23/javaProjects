package tareasJava;

import java.util.Scanner;

public class OrdenamientoArray {
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

        
        int i = 0;
        while (i < numeros.length - 1) {
            int j = 0;
            while (j < numeros.length - i - 1) {
                if (numeros[j] > numeros[j + 1]) {
   
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
                j++;
            }
            i++;
        }

        System.out.println("Números ingresados:");

        i = 0;
        while (i < numeros.length) {
            System.out.print(numeros[i] + " ");
            i++;
        }

        System.out.println("\nMayor número: " + numeros[numeros.length - 1]);
        System.out.println("Menor número: " + numeros[0]);
        
        
        System.out.print("Ingrese un número para buscar: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;
        i = 0;
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

