package TareaDia15;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();

        CalculadoraIva calculadora = new CalculadoraIva();
        double precioFinal = calculadora.calcularPrecioFinal(precio);

        System.out.println("El precio final es: " + precioFinal);
    }
}
