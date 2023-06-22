package tareasJava;

import java.util.Scanner;

public class ProductoDeEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer entero: ");
        int num3 = scanner.nextInt();

        int producto = num1 * num2 * num3;
        System.out.println("El producto de los tres enteros es: " + producto);
    }
}
