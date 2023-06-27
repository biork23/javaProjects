package tareasJava;
import java.util.Scanner;

public class repasoSemana {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.next("Hi");
		int myInt = scanner.nextInt(5);
		scanner.close();

		System.out.println("myString is: " + myString);
		System.out.println("myInt is: " + myInt);
	}
		
	
}
