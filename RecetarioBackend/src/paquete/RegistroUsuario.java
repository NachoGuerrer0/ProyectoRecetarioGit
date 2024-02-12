package paquete;

import java.util.Date;
import java.util.regex.Pattern;

public class RegistroUsuario {
	public void RegistroUsuarios(String Nombre, String Apellido1, String Apellido2, String NombreUsuario, String CorreoElectronico,String Contrasena) {
		//validacion datos
		if (Nombre == null || Nombre.isEmpty() || Apellido1 == null || Apellido1.isEmpty() || Apellido2 == null || Apellido2.isEmpty() ||
			NombreUsuario == null || NombreUsuario.isEmpty() || CorreoElectronico == null || CorreoElectronico.isEmpty() ||
			Contrasena == null || Contrasena.isEmpty()) {
			//excepcion o mensaje de error
			System.out.println("Error: Todos los campos son obligatorios.");
			return;
		}
		
		if (!validarFormatoCorreoElectronico(CorreoElectronico)) {
			//excpcion o mensaje de error
			System.out.println("Error: El formato del correo electrónico no es válido.");
			return;
		}
		
		//Obtener fecha actual
		Date FechaRegistro = new Date();
		
		//insercion a la base de datos
		Usuarios NuevoUsuario = new Usuarios(0, Nombre, Apellido1, Apellido2, NombreUsuario, CorreoElectronico, Contrasena, FechaRegistro);
	}
	
	private boolean validarFormatoCorreoElectronico(String CorreoElectronico) {
		//expresion regular para validar el formato
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		return pattern.matcher(CorreoElectronico).matches();
	}
}
