package EjercisiosDia16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double numero3 = scanner.nextDouble();

        NumerosOperaciones operaciones = new NumerosOperaciones(numero1, numero2, numero3);
        operaciones.realizarOperaciones();
        
       
    }
}
