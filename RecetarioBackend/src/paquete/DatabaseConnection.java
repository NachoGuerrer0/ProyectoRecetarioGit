package paquete;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
	//datos de conexion a la base de datos
	private static final String URL = "jdbc:sqlserver://localhost:3307;databaseName=Recetario";
	private static final String USER = "sa";
	private static final String PASSWORD = "RealBetis1907";
	
	//metodo para establecer la conexion
	public static Connection getConnection() {
		Connection connection = null;
		try {
			//registrar el driver jdbc
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establecer la conexion
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("¡Conexión a la base de datos con exito!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error al conectar con la base de datos: " + e.getMessage());
		}
		return connection;
	}
	
	//metodo para cerrar la conexion
	public static void closeConnection(Connection connection) {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
				System.out.println("Conexión cerrada.");
			}
		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexión: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		//ejemplo de uso: obtner una conexion y cerrarla
		Connection connection = getConnection();
		closeConnection(connection);
	}

	public static Connection obtenerConexion() {
		// TODO Auto-generated method stub
		return null;
	}

}
