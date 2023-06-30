package Dia19Switch;

import java.util.Scanner;

public class MenuComida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menú de Comidas:");
        System.out.println("1. Pizza");
        System.out.println("2. Hamburguesa");
        System.out.println("3. Ensalada");
        System.out.println("4. Sushi");
        System.out.println("5. Pasta");

        System.out.print("Seleccione una opción del menú: ");
        int opcion = scanner.nextInt();

        String comida;

        switch (opcion) {
            case 1:
                comida = "Pizza";
                break;
            case 2:
                comida = "Hamburguesa";
                break;
            case 3:
                comida = "Ensalada";
                break;
            case 4:
                comida = "Sushi";
                break;
            case 5:
                comida = "Pasta";
                break;
            default:
                comida = "Opción inválida";
                break;
        }

        System.out.println("Ha seleccionado: " + comida);
    }
}
