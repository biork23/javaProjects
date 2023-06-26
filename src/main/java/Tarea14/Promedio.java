package Tarea14;
import java.util.Scanner;
public class Promedio {
    private float[] numeros;

    public Promedio(float[] numeros) {
        this.numeros = numeros;
    }

    public float calcularPromedio() {
        float suma = 0;
        for (float numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
 
    }
    

    public class CalculoPromedio {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de números: ");
            int cantidadNumeros = scanner.nextInt();

            float[] numeros = new float[cantidadNumeros];

            for (int i = 0; i < cantidadNumeros; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextFloat();
            }

            Promedio promedio = new Promedio(numeros);
            float resultado = promedio.calcularPromedio();

            System.out.println("El promedio de los números ingresados es: " + resultado);

          
        }
    }

    
    
    
}
