package Geometria;

public class Rectangulo {
	
	private double area,perimetro, base, altura;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	
	}
	
	public double AreaRectangulo() {
		return base * altura;
	}
	
	public double PerimetroRectangulo() {
		return (2* base)+ (2 * altura);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
