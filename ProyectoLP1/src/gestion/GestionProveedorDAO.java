package gestion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import entidad.Proveedor;
import interfaces.ProveedorInterfacesDAO;
import utils.MySQLConexion8;

public class GestionProveedorDAO implements ProveedorInterfacesDAO{

	@Override
	public int registrar(Proveedor p) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = MySQLConexion8.getConexion();
			String sql = "insert into tblproveedor values (null,?,?,?,?,?,?)";
			pstm = con.prepareStatement(sql);
			//
			pstm.setString(1, p.getNombre());
			pstm.setString(2, p.getApellido());
			pstm.setString(3, p.getTelefono());
			pstm.setString(4, p.getRuc());
			pstm.setString(5, p.getCorreo());
			pstm.setString(5, p.getDireccion());
			
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
	public int actualizar(Proveedor p) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = MySQLConexion8.getConexion();
			String sql = "update tblproveedor set nombre = ?, apellido = ?, telefono = ?, ruc = ?, correo = ?, direccion = ? where IdProveedor = ?";
			pstm = con.prepareStatement(sql);
			//
			pstm.setString(1, p.getNombre());
			pstm.setString(2, p.getApellido());
			pstm.setString(3, p.getTelefono());
			pstm.setString(4, p.getRuc());
			pstm.setString(5, p.getCorreo());
			pstm.setString(5, p.getDireccion());
			pstm.setInt(6, p.getIdProveedor());
			
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
			String sql = "delete from tblproveedor where IdProveedor = ?";
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
	public ArrayList<Proveedor> listarProveedores() {
		// TODO Auto-generated method stub
		return null;
	}

}
