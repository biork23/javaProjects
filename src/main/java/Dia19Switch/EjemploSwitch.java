package Dia19Switch;
import java.util.Scanner;

public class EjemploSwitch {
	
	public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calificación: ");
        int calificacion = scanner.nextInt();
        
        String categoria;
        
        switch(calificacion) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                categoria = "Reprobado";
                break;
            case 7:
            case 8:
                categoria = "Regular";
                break;
            case 9:
            case 10:
                categoria = "Excelente";
                break;
            default:
                categoria = "Calificación inválida";
        }
        
        System.out.println("La calificación es: " + categoria);
    }

}
