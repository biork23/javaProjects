package Calculo_Nomina;

import java.util.Scanner;

public class NombreEmpleado {
	
	Scanner input = new Scanner(System.in);
	
	private String nombre;
	private String puesto;
	
	
	public void Empleado(String nombre, String puesto) {
		
		this.nombre = nombre;
		this.puesto = puesto;
		
	}
	public void mostrarEmpleado() {
		
        NombreEmpleado datos = new NombreEmpleado();
		
		System.out.print("Hola! Ingrese el nombre del empleado: ");
		nombre = input.nextLine();
		datos.setNombre(nombre);
		
		System.out.print("Ingrese puesto del empleado: ");
		puesto = input.nextLine();
		datos.setPuesto(puesto);
	}
	
	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setPuesto (String puesto) {
		this.puesto = puesto;
	}
	
	public String getPuesto() {
		return puesto;
	}	
	
//	public void mostrarEmpleado() {
//		System.out.println("Nombre: " + nombre);
//		 System.out.println("Puesto: " + puesto);
//	}
//	

}
