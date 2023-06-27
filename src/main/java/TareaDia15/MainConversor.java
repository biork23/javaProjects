package TareaDia15;

import java.util.Scanner;

public class MainConversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la moneda de origen:");
        System.out.println("1. Soles");
        System.out.println("2. Pesos");
        System.out.println("3. Dólares");
        System.out.println("4. Quetzales");
        int monedaOrigen = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad a convertir:");
        double cantidad = scanner.nextDouble();
        
        ConversorMonedas conversor = new ConversorMonedas();
        double resultado = conversor.convertir(monedaOrigen, cantidad);
        
        System.out.println("El resultado de la conversión es: " + resultado);
    }
}

