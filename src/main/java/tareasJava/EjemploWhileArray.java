package tareasJava;
import java.util.Scanner;

public class EjemploWhileArray {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa datos a nuestro arreglo: ");
        int tamano = scanner.nextInt();

        int[] numero = new int[tamano];

        int i = 0;

        while( i < tamano) {
            System.out.println("Ingrese el numero en la posisión " + i +" :");
            numero[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Los numero que ingresaste son:");

        int n =0;

        while(n < tamano) {
            System.out.println(numero[n]);
            n++;
        }

        //Ingreasr 10 numeros en un array numeros positivos y negativos
        //acomodar de menor a mayor
        //cual es el numero mayor y cual es el menor
    }

}