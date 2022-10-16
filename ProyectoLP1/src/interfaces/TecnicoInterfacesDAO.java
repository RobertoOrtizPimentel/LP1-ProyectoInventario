package interfaces;

import java.util.ArrayList;

import entidad.Tecnico;

public interface TecnicoInterfacesDAO {
	
	public int registrar(Tecnico t);
	public int actualizar(Tecnico t);
	public int eliminar(int codigo);
	public ArrayList<Tecnico> listarTecnicos();
}
