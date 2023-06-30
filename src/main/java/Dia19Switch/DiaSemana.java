package Dia19Switch;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();
        
        String diaSemana;
        
        switch (numero) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miércoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sábado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Número inválido";
                break;
        }
        
        System.out.println("El número " + numero + " corresponde al día de la semana: " + diaSemana);
    }
}
