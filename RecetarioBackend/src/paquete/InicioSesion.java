package paquete;

import java.util.Date;

public class InicioSesion {
	public boolean IniciarSesion(String NombreUsuario, String Contrasena) {
		//aqui verificaremos las credenciales de la base de datos
		
		//crear objeto Usuarios 
		Usuarios usuario = new Usuarios(1, "Nombre", "Apellido1", "Apellido2", "NombreUsuario", "correo@ejemplo.com", "Contrasena", new Date());
		
		//verificar credenciales del usuario
		return usuario.verificarCredenciales(NombreUsuario, Contrasena);
	}
}
