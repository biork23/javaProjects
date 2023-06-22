package tareasJava;

import java.util.Scanner;

public class PersonaSaludo {
    private String nombre;
    private int edad;

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = scanner.nextInt();
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void saludar() {
        System.out.println("¡Hola " + nombre + "! Bienvenido/a.");
    }

    public static void main(String[] args) {
        PersonaSaludo persona = new PersonaSaludo();
        persona.ingresarDatos();
        System.out.println();
        persona.imprimirDatos();
        System.out.println();
        persona.saludar();
    }
}
