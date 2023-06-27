package EjercisiosDia16;

public class NumerosOperaciones {
    private double numero1;
    private double numero2;
    private double numero3;

    public NumerosOperaciones(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public void realizarOperaciones() {
        double maximo1 = Math.max(numero1, Math.max(numero2, numero3));
        double maximo2 = 0;
        double minimo = 0;

        if (maximo1 == numero1) {
            maximo2 = Math.max(numero2, numero3);
            minimo = Math.min(numero2, numero3);
        } else if (maximo1 == numero2) {
            maximo2 = Math.max(numero1, numero3);
            minimo = Math.min(numero1, numero3);
        } else {
            maximo2 = Math.max(numero1, numero2);
            minimo = Math.min(numero1, numero2);
        }

        double resultado = maximo1 / maximo2;
        double residuo = maximo1 % maximo2;
        double suma = residuo + minimo;
        
       

        if (residuo == 0) {
            System.out.println("El residuo es cero");
        } else {
            System.out.println("El resultado de la división es: " + resultado);
        }

        System.out.println("La suma del residuo más el número inferior es: " + suma);
    }
}
