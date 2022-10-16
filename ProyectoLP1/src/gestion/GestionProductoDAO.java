package gestion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import entidad.Producto;
import interfaces.ProductoInterfacesDAO;
import utils.MySQLConexion8;

public class GestionProductoDAO implements ProductoInterfacesDAO{

	@Override
	public int registrar(Producto o) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = MySQLConexion8.getConexion();
			String sql = "insert into tblproducto values (null,?,?,?,?,?)";
			pstm = con.prepareStatement(sql);
			//
			pstm.setString(1, o.getNombre());
			pstm.setString(2, o.getMarca());
			pstm.setDouble(3, o.getPrecio());
			pstm.setInt(4, o.getIdProveedor());
			pstm.setInt(5, o.getIdlote());
			
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
	public int actualizar(Producto o) {
		int res = 0;
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = MySQLConexion8.getConexion();
			String sql = "update tblproducto set Nombre = ?, Marca = ?, Precio = ?, IdProveedor = ?, idlote = ? where codigoProducto = ?";
			pstm = con.prepareStatement(sql);
			//
			pstm.setString(1, o.getNombre());
			pstm.setString(2, o.getMarca());
			pstm.setDouble(3, o.getPrecio());
			pstm.setInt(4, o.getIdProveedor());
			pstm.setInt(5, o.getIdlote());
			pstm.setInt(6, o.getCodigoProducto());
			
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
			String sql = "delete from tblproducto where codigoProducto = ?";
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
	public ArrayList<Producto> listarProductos() {
		// TODO Auto-generated method stub
		return null;
	}

}
