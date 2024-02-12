package paquete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PerfilUsuarioDAO {
	//metodo para obtener la informacion del perfil de un usuario por el ID
	public Usuarios obtenerPerfilUsuario(int IDUsuario) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Usuarios usuario = null;
		
		try {
			conn = DatabaseConnection.obtenerConexion();
			String query = "SELECT * FROM Usuarios WHERE IDUsuario =?";
			stmt.setInt(1, IDUsuario);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				//construir el objeto Usuarios con los datos obtenidos de la BD
				usuario = new Usuarios(
						rs.getInt("IDUsuario"),
						rs.getString("Nombre"),
						rs.getString("Apellido1"),
						rs.getString("Apellido2"),
						rs.getString("NombreUsuario"),
						rs.getString("CorreoElectronico"),
						rs.getString("Contrasena"),
						rs.getDate("FechaRegistro")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//cerrar conexiones
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return usuario; 
	}
}
