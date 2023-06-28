package Tarea17;

import java.util.Scanner;

public class TablasMultiplicar {
	
	public static void main(String[] args) {
		
		int multiplicando;
		
		System.out.println("¿Que tabla de multiplicar deseas realizar?");
		Scanner scan = new Scanner (System.in);
		
		multiplicando= scan.nextInt();
		
		int multiplicador;
		
		for(multiplicador =1; multiplicador <=12; multiplicador++) {
			System.out.println(multiplicando+" x "+multiplicador+ " = " +multiplicando*multiplicador);
		}
		
		
	}
	
	
	
	
	
	

}
