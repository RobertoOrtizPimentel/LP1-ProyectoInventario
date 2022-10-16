package entidad;

public class Tecnico {
	
	private int codigoTecnico;
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	private String dni;
	
	public Tecnico() {
	}

	public Tecnico(int codigoTecnico, String nombre, String apellido, String correo, String telefono, String dni) {
		super();
		this.codigoTecnico = codigoTecnico;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.dni = dni;
	}

	public int getCodigoTecnico() {
		return codigoTecnico;
	}

	public void setCodigoTecnico(int codigoTecnico) {
		this.codigoTecnico = codigoTecnico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
