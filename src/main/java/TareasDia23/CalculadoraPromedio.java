package TareasDia23;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraPromedio {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        double promedio = calcularPromedio(numeros);

        System.out.println("El promedio es: " + promedio);
    }

    public static <T extends Number> double calcularPromedio(List<T> numeros) {
        double suma = 0;
        for (T numero : numeros) {
            suma += numero.doubleValue();
        }
        return suma / numeros.size();
    }
}
