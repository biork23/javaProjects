package tareasJava;

public class DivicionNumeros {
    public static void main(String[] args) {
        int numero1 = 17;
        int numero2 = 3;

        int cociente = numero1 / numero2;
        int resto = numero1 % numero2;
        double respuestaReal = (double) numero1 / numero2;

        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
        System.out.println("Respuesta real: " + respuestaReal);
    }
}
