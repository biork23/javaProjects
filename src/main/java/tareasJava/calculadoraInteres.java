package tareasJava;
import java.util.Scanner;

public class calculadoraInteres {
	
	public static double calcularInteresSimple(double principal, double tasaInteres, double tiempo) {
		if (tasaInteres>5) {
			return (principal * tasaInteres* 10)/100;
		
		}
			return (principal * tasaInteres * tiempo)/100;
			
			
		
		
		
	}
	
	public static double calcularInteresCompuesto(double principal, double tasaInteres, double tiempo) {
		if (tasaInteres>5) {
			return principal * Math.pow(1 + (tasaInteres / 100), tiempo)- principal;
		}
		return principal * Math.pow(1 + (tasaInteres / 100), tiempo)- principal;
		
		
		
	}
	
	public static void main(String[] argfs) {
		
		Scanner input = new Scanner(System.in);
//		double principal = 1000;
//		double tasaInteres = 5;
//		double tiempo = 3;

        System.out.println("Ingresa tu inversion principal: ");
        double principal= input.nextDouble();
        System.out.println("Ingresa tu tasa de interes: ");
        double tasaInteres= input.nextDouble();
        
        System.out.println("Ingresa tu periodo de pago: ");
        double tiempo= input.nextDouble();
        
        if(tasaInteres>5) {
        	System.out.println("Ahora su plazo es de 10 años");
        }
        
		
		double interesSimple = calcularInteresSimple(principal, tasaInteres, tiempo);
		
		System.out.println("Interes simple: " + interesSimple);
		
		double interesCompuesto = calcularInteresCompuesto(principal, tasaInteres, tiempo);
		System.out.println("Interes Compuesto: "+ interesCompuesto);
	}

}
