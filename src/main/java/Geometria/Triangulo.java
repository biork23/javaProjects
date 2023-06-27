package Geometria;

public class Triangulo {
	
	private double base, altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	
	}
	
	public double AreaTriangulo() {
		return (base * altura) /2;
	}
	
	public double PerimetroRectangulo() {
		return 3 * base;
	}

}
