package interfaces;

import java.util.ArrayList;

import entidad.Proveedor;

public interface ProveedorInterfacesDAO {
	public int registrar(Proveedor p);
	public int actualizar(Proveedor p);
	public int eliminar(int codigo);
	public ArrayList<Proveedor> listarProveedores();
}
