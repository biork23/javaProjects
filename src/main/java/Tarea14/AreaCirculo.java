package Tarea14;

import java.util.Scanner;

public class AreaCirculo {
    private float radio;

    public void Circulo(float radio) {
        this.radio = radio;
    }

    public static float calcularArea(float radio) {
        return (float) (Math.PI * Math.pow(radio, 2));
    }



public class CalculoAreaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        float radio = input.nextFloat();

     
        float area = calcularArea(radio);

        System.out.println("El área del círculo es: " + area);

       
    }
  }
}
