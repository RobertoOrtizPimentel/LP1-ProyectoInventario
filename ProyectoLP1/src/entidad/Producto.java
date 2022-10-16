package entidad;

public class Producto {
	
	private int codigoProducto;
	private String nombre;
	private String marca;
	private double precio;
	private int idProveedor;
	private int idlote;
		
	public Producto() {
	}

	public Producto(int codigoProducto, String nombre, String marca, double precio, int idProveedor, int idlote) {
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.idProveedor = idProveedor;
		this.idlote = idlote;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public int getIdlote() {
		return idlote;
	}

	public void setIdlote(int idlote) {
		this.idlote = idlote;
	}
	
	
}
