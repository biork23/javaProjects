package tareasJava;
 import java.util.Scanner;

public class EjerciciosCiclos {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		String[] Viajes = {"Tijuana", "Qintana Roo", "Oaxaca"};
		
//		for (int i=0; i < Viajes.length; i++) {
//			String Viaje = Viajes[i];
//			System.out.println("Quiero viajar a " + Viaje);
//				
//		}
		
	
		        int[] Numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		        int reves;

		        for (int i = 0; i < Numeros.length - 1; i++) {
		            for (int j = i + 1; j < Numeros.length; j++) {
		                if (Numeros[i] < Numeros[j]) {
		                   
		                    reves = Numeros[i];
		                    Numeros[i] = Numeros[j];
		                    Numeros[j] = reves;
		                }
		            }
		        }

	
		        for (int i = 0; i < Numeros.length; i++) {
		            System.out.print(Numeros[i] + " ");
		        }
		        
		       
		        
		        
		                int altura = 10; 
		                int espacios = altura - 1; 
		                int asteriscos = 1; 

		                for (int i = 0; i < altura; i++) {
		                   
		                    for (int j = 0; j < espacios; j++) {
		                        System.out.print(" ");
		                    }

		                    
		                    for (int j = 0; j < asteriscos; j++) {
		                        System.out.print("*");
		                    }

		                    
		                    System.out.println();

		                    espacios--;
		                    asteriscos += 2;
		                }

		                for (int i = 0; i < altura - 1; i++) {
		                    System.out.print(" ");
		                }
		                System.out.println("*");
		            }
		        

		    }
		
		

		
		
		
		
	


