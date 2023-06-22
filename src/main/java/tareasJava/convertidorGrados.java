package tareasJava;

import java.util.Scanner;

public class convertidorGrados {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	float gradosC, gradosF;
	System.out.println("Ingresa los grados Farenheit");
	
	gradosF = input.nextFloat();
	
	gradosC = (gradosF-32)* 5/9;
	
	System.out.println(gradosF+ " grados Farenheit son "+ gradosC + " grados Celsius.");
	
	}

	

}
