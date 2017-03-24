package pack;

public class Producto {
	String nombre;
	String precio;
	int cantidad;
	int id; 
	public Producto(String nombre, String precio, int id) {
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.precio = precio;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
	
}
