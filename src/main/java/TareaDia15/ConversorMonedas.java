package TareaDia15;

public class ConversorMonedas {
    private double tasaSolesDolares = 0.3;
    private double tasaSolesPesos = 5;
    private double tasaSolesQuetzales = 2.5;
    
    public double convertir(int monedaOrigen, double cantidad) {
        double resultado = 0;
        
        switch (monedaOrigen) {
            case 1: // Soles
                resultado = solesA(cantidad);
                break;
            case 2: // Pesos
                resultado = pesosA(cantidad);
                break;
            case 3: // Dólares
                resultado = dolaresA(cantidad);
                break;
            case 4: // Quetzales
                resultado = quetzalesA(cantidad);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        
        return resultado;
    }
    
    private double solesA(double cantidad) {
        double dolares = cantidad * tasaSolesDolares;
        return dolares;
    }
    
    private double pesosA(double cantidad) {
        double soles = cantidad / tasaSolesPesos;
        return soles;
    }
    
    private double dolaresA(double cantidad) {
        double soles = cantidad / tasaSolesDolares;
        return soles;
    }
    
    private double quetzalesA(double cantidad) {
        double soles = cantidad / tasaSolesQuetzales;
        return soles;
    }

	
}
