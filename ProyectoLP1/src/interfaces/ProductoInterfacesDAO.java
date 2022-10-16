package interfaces;

import java.util.ArrayList;

import entidad.Producto;

public interface ProductoInterfacesDAO {
	public int registrar(Producto o);
	public int actualizar(Producto o);
	public int eliminar(int codigo);
	public ArrayList<Producto> listarProductos();
}
