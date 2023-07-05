package TareasDia21;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
    
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(5.0);

       
        double area = circulo.calcularArea();
        double circunferencia = circulo.calcularCircunferencia();

       
        System.out.println("Área del círculo: " + area);
        System.out.println("Circunferencia del círculo: " + circunferencia);
    }
}


