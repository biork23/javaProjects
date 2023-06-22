package tareasJava;

import java.util.Scanner;

public class MayorMenor {
    private int[] numbers;

    public MayorMenor() {
        numbers = new int[3];
    }

    public void ingresarValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres valores:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }

    public void mostrarMayorMenor() {
        int mayor = numbers[0];
        int menor = numbers[0];
        for (int i = 1; i < 3; i++) {
            if (numbers[i] > mayor) {
                mayor = numbers[i];
            }
            if (numbers[i] < menor) {
                menor = numbers[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }

    public static void main(String[] args) {
        MayorMenor objeto = new MayorMenor();
        objeto.ingresarValores();
        objeto.mostrarMayorMenor();
    }
}

