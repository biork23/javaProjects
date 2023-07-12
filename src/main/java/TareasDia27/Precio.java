package TareasDia27;

public class Precio {
	
	private double costo;
	private int cantidad;
	private String articulo;
	private String emisor;
	private String cliente;
	
	public Precio(double costo, int cantidad, String articulo, String emisor, String cliente) {
		this.costo = costo;
		this.cantidad  = cantidad;
		this.articulo = articulo;
		this.emisor = emisor;
		this.cliente = cliente;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public void setCosto(double costo ) {
		this.costo = costo;
	}
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad ) {
		this.cantidad = cantidad;
	}
	
	public String getArticulo() {
		return articulo;
	}
	
	public void setArticulo(String articulo ) {
		this.articulo = articulo;
	}
	
	public String getEmisor() {
		return emisor;
	}
	
	public void setEmisor(String emisor ) {
		this.emisor = emisor;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente ) {
		this.cliente = cliente;
	}

}
