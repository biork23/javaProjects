package TareasDia22;

import java.util.ArrayList;
import java.util.Scanner;

public class EliminarPalabraDuplicada {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la lista de palabras separadas por espacios: ");
        String entrada = scanner.nextLine();

        String[] palabrasArray = entrada.split(" ");

        for (String palabra : palabrasArray) {
            if (!palabras.contains(palabra)) {
                palabras.add(palabra);
            }
        }

        System.out.println("Palabras sin duplicados: ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
