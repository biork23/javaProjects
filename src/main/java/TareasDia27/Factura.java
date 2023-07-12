package TareasDia27;

public class Factura extends Precio{
	
	private int num_factura;
	private String uso_factura;
	
	public Factura(double costo, int cantidad, String articulo, String emisor, String cliente, int num_factura, String uso_factura) {
		super(costo, cantidad, articulo,emisor, cliente);
		this.num_factura= num_factura;
		this.uso_factura= uso_factura;
	}
	
	public int getNum_factura() {
		return num_factura;
	}
	
	public void setNum_factura(int num_factura) {
		this.num_factura = num_factura;
	}
	
	public String getUso_factura() {
		return uso_factura;
	}
	
	public void setUso_factura(String uso_factura) {
		this.uso_factura = uso_factura;
	}
	
	public void mostrar() {
		
		System.out.println("Su factura numero: " + getNum_factura()+ " con uso fiscal de: "+ getUso_factura() + "\nTiene " + getCantidad() +" "+ getArticulo() + " \nTiene un costo total de $"+getCosto()+ " \nApreciable cliente "+getCliente()+ " agradecemos su compra, le atendio "+getEmisor());

	}

}
