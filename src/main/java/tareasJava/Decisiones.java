package tareasJava;
import java.util.Scanner;

public class Decisiones {
	
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Ingrese un año:");
		        int anio = scanner.nextInt();
		        
		        AñoBisiesto año = new AñoBisiesto(anio);
		        
		        if (año.esBisiesto()) {
		            System.out.println(anio + " es un año bisiesto.");
		        } else {
		            System.out.println(anio + " no es un año bisiesto.");
		        }
		    }
		
		
	}

	
		

