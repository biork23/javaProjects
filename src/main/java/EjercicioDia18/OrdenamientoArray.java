package EjercicioDia18;

public class OrdenamientoArray {
    public static void ordenar(int[] numeros) {
        int i = 0;
        while (i < numeros.length - 1) {
            int j = 0;
            while (j < numeros.length - i - 1) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
                j++;
            }
            i++;
        }
    }
}
