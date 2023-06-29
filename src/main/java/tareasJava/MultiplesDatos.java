package tareasJava;

public class MultiplesDatos {
	
	public static void main(String[] args) {
		
		int[] numero = new int[5];
		
		numero[0] = 10;
		numero[1] = 20;
		numero[2] = 30;
		numero[3] = 40;
		numero[4] = 50;
		
		int primerNumero= numero[2];
		int segundoNumero= numero[1];
		int sumaDatos = numero[2]+numero[1];
		
		System.out.println("La suma es: " + sumaDatos);
		
		
		//while
		
		int otroNumero = 50;
		
		while(otroNumero > sumaDatos) {
			System.out.println("");
		}
		
	}

}
