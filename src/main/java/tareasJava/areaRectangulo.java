package tareasJava;
import java.util.Scanner;

public class areaRectangulo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Float area, base, altura;
		System.out.println("Ingresa la base del rectangula.");
		base = input.nextFloat();
		
		System.out.println("Ingresa la altura del rectangulo.");
		altura = input.nextFloat();
		
		area = base*altura;
		
		System.out.println("El area del rectangulo es: " + area);
	}

}
