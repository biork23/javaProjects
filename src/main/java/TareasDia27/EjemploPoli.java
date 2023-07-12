package TareasDia27;

public class EjemploPoli {
	
	public static void main(String[] args) {
		
		Animal1 animalPerro = new Perro1();
		Animal1 animalGato = new Gato();
		
		animalGato.ruido();
		animalPerro.ruido();
	}

}


class Animal1{
	public void ruido() {
		System.out.println("El ruido que hace");
	}
}

class Perro1 extends Animal1 {
	@Override
	public void ruido() {
		System.out.println("wau wau");
	}
	
	public void name() {
		System.out.println("Hola mundo");
	}
}

class Gato extends Animal1{
	
	@Override
	public void ruido() {
		System.out.println("miaw miaw");
	}
}