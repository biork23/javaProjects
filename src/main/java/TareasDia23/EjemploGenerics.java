package TareasDia23;

public class EjemploGenerics<G> {
	
	private G dato;
	
	public G getDato() {
		return dato;
	}
	
	public void setDato(G dato) {
		this.dato = dato;
	}
	
	public static void main(String[] args) {
		EjemploGenerics<Integer> objeto = new EjemploGenerics<>();
		
		objeto.setDato(25);
		
		Integer dato = objeto.getDato();
		System.out.println("Dato: " + dato);
	}

	

}
