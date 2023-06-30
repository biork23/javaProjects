package Dia19Switch;

import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAlumnos = 100;
        int numAlumnos = 0;
        String[] nombres = new String[maxAlumnos];
        int[] calificaciones = new int[maxAlumnos];

        int opcion;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Ver alumnos");
            System.out.println("3. Salir del programa");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    if (numAlumnos < maxAlumnos) {
                        scanner.nextLine(); 
                        System.out.print("Ingrese el nombre del alumno: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la calificación del alumno: ");
                        int calificacion = scanner.nextInt();
                        scanner.nextLine(); 

                        nombres[numAlumnos] = nombre;
                        calificaciones[numAlumnos] = calificacion;
                        numAlumnos++;

                        System.out.println("Alumno agregado correctamente.");
                    } else {
                        System.out.println("No se pueden agregar más alumnos. Se ha alcanzado el límite máximo.");
                    }
                    break;
                    
                case 2:
                    System.out.println("----- LISTA DE ALUMNOS -----");
                    for (int i = 0; i < numAlumnos; i++) {
                        String categoria = obtenerCategoria(calificaciones[i]);
                        System.out.println("Nombre: " + nombres[i] + " - Calificación: " + calificaciones[i] + " - Categoría: " + categoria);
                    }
                    break;
                    
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println();
        } while (opcion != 3);
    }
    
    public static String obtenerCategoria(int calificacion) {
        if (calificacion >= 0 && calificacion <= 6) {
            return "Reprobado";
        } else if (calificacion >= 7 && calificacion <= 8) {
            return "Regular";
        } else if (calificacion >= 9 && calificacion <= 10) {
            return "Excelente";
        } else {
            return "Calificación inválida";
        }
    }
}

