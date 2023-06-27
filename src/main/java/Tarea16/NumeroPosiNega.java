package Tarea16;

import java.util.Scanner;

public class NumeroPosiNega {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt();

        if (n > 0) {
            System.out.println("El número es positivo");
        } else if(n < 0){
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número introducido es 0");                                                     
        }
    }
}
