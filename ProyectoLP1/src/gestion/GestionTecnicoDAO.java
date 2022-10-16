package gestion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import entidad.Tecnico;
import interfaces.TecnicoInterfacesDAO;
import utils.MySQLConexion8;

public class GestionTecnicoDAO implements TecnicoInterfacesDAO{

	@Override
	public int registrar(Tecnico t) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = MySQLConexion8.getConexion();
			String sql = "insert into tbltecnico values (null,?,?,?,?,?)";
			pstm = con.prepareStatement(sql);
			//
			pstm.setString(1, t.getNombre());
			pstm.setString(2, t.getApellido());
			pstm.setString(3, t.getCorreo());
			pstm.setString(4, t.getTelefono());
			pstm.setString(5, t.getDni());
			
			res = pstm.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error >>> en la instucción SQL de registrar " + e.getMessage());
		}finally {
			try {
				if(pstm != null) pstm.close();
				if(con != null) pstm.close();
			} catch (SQLException e2) {
				System.out.println("Error al cerrar la BD" + e2.getMessage());
			}
		}
		
		return res;
	}

	@Override
	public int actualizar(Tecnico t) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = MySQLConexion8.getConexion();
			String sql = "update tbltecnico set nombre = ?, apellido = ?, correo = ?, telefono = ?, DNI = ? where codigoTecnico = ?";
			pstm = con.prepareStatement(sql);
			//
			pstm.setString(1, t.getNombre());
			pstm.setString(2, t.getApellido());
			pstm.setString(3, t.getCorreo());
			pstm.setString(4, t.getTelefono());
			pstm.setString(5, t.getDni());
			pstm.setInt(6, t.getCodigoTecnico());
			
			res = pstm.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error >>> en la instucción SQL al actualizar " + e.getMessage());
		}finally {
			try {
				if(pstm != null) pstm.close();
				if(con != null) pstm.close();
			} catch (SQLException e2) {
				System.out.println("Error al cerrar la BD" + e2.getMessage());
			}
		}
		
		return res;
	}

	@Override
	public int eliminar(int codigo) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = MySQLConexion8.getConexion();
			String sql = "delete from tbltecnico where codigoTecnico = ?";
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, codigo);
			res = pstm.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error >>> en la instrucción SQL de eliminar " + e.getMessage());
		}finally {
			try {
				if(pstm != null) pstm.close();
				if(con != null) pstm.close();
			} catch (Exception e2) {
				System.out.println("Error al cerrar la BD" + e2.getMessage());
			}
		}
		
		return res;
	}

	@Override
	public ArrayList<Tecnico> listarTecnicos() {
		// TODO Auto-generated method stub
		return null;
	}

}
