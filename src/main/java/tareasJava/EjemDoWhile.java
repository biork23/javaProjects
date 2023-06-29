package tareasJava;
import java.util.Scanner;

public class EjemDoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dato;
		
		do {
			System.out.println("Tienes que ingresar un numero positivo: ");
			dato = scanner.nextint();
			
		}while(dato >=0);
		
		System.out.println("Nuevo numero ingresado");
	}
	
	

}
