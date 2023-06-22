package tareasJava;

import java.util.Scanner;

public class areaCirculo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double area, radio;
		
		System.out.println("Ingresa el radio del circulo.");
		radio= input.nextDouble();
		
		area = 3.1416 * (radio * radio);
		
		System.out.println("El area del circulo es: "+area + "cm2");
	}

}
