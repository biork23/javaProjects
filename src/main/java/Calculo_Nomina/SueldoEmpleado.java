package Calculo_Nomina;
import java.util.Scanner;

public class SueldoEmpleado{
	private double horasTrabajadas;
	private double horasExtras;
	private double descuento;
	Scanner input = new Scanner(System.in);
	
	

	public void Sueldo(double horasTrabajadas, double horasExtras, double descuento) {
		this.horasTrabajadas = horasTrabajadas;
		this.horasExtras = horasExtras;
		this.descuento = descuento;
	}
	
	public void DatosNomina() {
		SueldoEmpleado datosNomina = new SueldoEmpleado();
		
		System.out.print("Ingrese sus horas trabajadas: ");
		horasTrabajadas = input.nextDouble();
		datosNomina.setHorasTrabajadas(horasTrabajadas);
		
		System.out.print("Ingrese sus horas extras: ");
		horasExtras = input.nextDouble();
		datosNomina.setHorasExtras(horasExtras);
	}

	public double CalculoSueldoBruto() {
		double sueldoPorHora = 75.87;
		double sueldoHoraExtra = 25.96;
		
		double sueldoBase = horasTrabajadas * sueldoPorHora;
		double sueldoExtra = horasExtras * sueldoHoraExtra;
		
		return sueldoBase + sueldoExtra; 
		
	}
	
	public double CalcularDescuento(double sueldoBruto) {
		if (sueldoBruto < 2000) {
			return sueldoBruto * 0.16;
			
		}else {
			return sueldoBruto * 0.18;
		}
		
	}
	
	public double CalcularSueldoNeto() {
		
		double sueldoBruto = CalculoSueldoBruto(); 
		double descuento = CalcularDescuento(sueldoBruto);
		
		return sueldoBruto - descuento;
	}
	
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	public double getHorasExtras() {
		return horasExtras;
	}
	public double getDescuento() {
		return descuento;
	}
	

}
