package TareasDia26;

public class Carro {
	
	protected String marca;
	
	public void piloto() {
		System.out.println("El carro va conducido");
	}
	
	class Automovil extends Carro{
		private int numPuertas;
		
		public void abrPuerta() {
			System.out.println("Abrir la " +numPuertas+ "puerta" );
		}
	}
	
	public class Herencia{
		
	}

	public static void main(String[] args) {
		Automovil auto = (Automovil) new Carro();
		auto.marca= "Mitsubishi";
		auto.numPuertas= 4;
		auto.piloto();
		auto.abrPuerta();

	}

}
