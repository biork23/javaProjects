package tareasJava;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioDia3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tu primer número entero:");
        int dividendo = obtenerEntero(input);

        System.out.println("Ingresa tu segundo número entero:");
        int divisor = obtenerEntero(input);

        Division division = rdivision(dividendo, divisor);

        System.out.println("Dividendo: " + dividendo);
        System.out.println("Divisor: " + divisor);
        System.out.println("Cociente: " + division.getCociente());
        System.out.println("Resto: " + division.getResto());
        System.out.println("Respuesta: " + division.getRespuesta());
    }

    public static int obtenerEntero(Scanner input) {
        while (true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                input.next(); 
                System.out.println("¡Error! Ingresa un número entero válido.");
                System.out.println("Vuelve a ingresar el número:");
            }
        }
    }

    public static Division rdivision(int dividendo, int divisor) {
        int cociente = dividendo / divisor;
        int resto = dividendo % divisor;
        double respuestaDiv = (double) dividendo / divisor;

        return new Division(cociente, resto, respuestaDiv);
    }
}

class Division {
    private int cociente;
    private int resto;
    private double respuesta;

    public Division(int cociente, int resto, double respuesta) {
        this.cociente = cociente;
        this.resto = resto;
        this.respuesta = respuesta;
    }

    public int getCociente() {
        return cociente;
    }

    public int getResto() {
        return resto;
    }

    public double getRespuesta() {
        return respuesta;
    }
}
