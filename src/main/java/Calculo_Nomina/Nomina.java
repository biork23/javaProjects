package Calculo_Nomina;


public class Nomina {
	

	
	public static void main(String[] args) {
		
		NombreEmpleado empleado = new NombreEmpleado();
		SueldoEmpleado sueldo = new SueldoEmpleado();
		
		empleado.mostrarEmpleado();
		sueldo.DatosNomina();
		sueldo.CalcularSueldoNeto();
		sueldo.CalculoSueldoBruto();
		sueldo.CalcularDescuento(0);
		
		
		System.out.println("El empleado " + empleado.getNombre() + " con puesto de:  " + empleado.getPuesto());
		System.out.println("En este periodo trabajo " + sueldo.getHorasTrabajadas() + " horas regulares y " + sueldo.getHorasExtras()+ " horas extras.");
		System.out.println("Su sueldo bruto es de: $"+ sueldo.CalculoSueldoBruto()+ " tuvo un descuento de impuestos es de: $" + sueldo.CalcularDescuento(0) + " y su sueldo neto es de: $" + sueldo.CalcularSueldoNeto());
		System.out.println("Gracias");
			
		
	}
	
	

}


