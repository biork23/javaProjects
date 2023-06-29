package EjercicioDia18;

public class ImprimirArray {
    public static void imprimir(int[] numeros) {
        System.out.println("Números ingresados:");

        int i = 0;
        while (i < numeros.length) {
            System.out.print(numeros[i] + " ");
            i++;
        }

        System.out.println("\nMayor número: " + numeros[numeros.length - 1]);
        System.out.println("Menor número: " + numeros[0]);
    }
}
