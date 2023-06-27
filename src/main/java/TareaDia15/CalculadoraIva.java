package TareaDia15;

public class CalculadoraIva {
    public double calcularPrecioFinal(double precio) {
        double precioConIVA = agregarIVA(precio);
        double precioFinal = aplicarDescuento(precioConIVA);
        return precioFinal;
    }

    private double agregarIVA(double precio) {
        double iva = precio * 0.16; // 16% de IVA
        double precioConIVA = precio + iva;
        return precioConIVA;
    }

    private double aplicarDescuento(double precio) {
        double descuento;

        if (precio > 50) {
            descuento = precio * 0.10; // 10% de descuento
            System.out.println("Su descuento es de 10%.");
        } else {
            descuento = precio * 0.05; // 5% de descuento
            System.out.println("Su descuento es del 5%. ");
        }

        double precioFinal = precio - descuento;
        return precioFinal;
    }
}

