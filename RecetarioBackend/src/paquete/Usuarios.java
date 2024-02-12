package paquete;

import java.util.Date;

public class Usuarios {
	private int IDUsuario;
	private String Nombre;
	private String Apellido1;
	private String Apellido2;
	private String NombreUsuario;
	private String CorreoElectronico;
	private String Contrasena;
	private Date FechaRegistro;
	
	//constructor
	public Usuarios(int IDUsuario, String Nombre, String Apellido1, String Apellido2, String NombreUsuario, String CorreoElectronico, String Contrasena, Date FechaRegistro) {
		this.IDUsuario = IDUsuario;
		this.Nombre = Nombre;
		this.Apellido1 = Apellido1;
		this.Apellido2 = Apellido2;
		this.NombreUsuario = NombreUsuario;
		this.CorreoElectronico = CorreoElectronico;
		this.Contrasena = Contrasena;
		this.FechaRegistro = FechaRegistro;
	}

	//getters y setters
	public int getIDUsuario() {
		return IDUsuario;
	}

	public void setIDUsuario(int IDUsuario) {
		this.IDUsuario = IDUsuario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellido1() {
		return Apellido1;
	}

	public void setApellido1(String Apellido1) {
		this.Apellido1 = Apellido1;
	}

	public String getApellido2() {
		return Apellido2;
	}

	public void setApellido2(String Apellido2) {
		this.Apellido2 = Apellido2;
	}

	public String getNombreUsuario() {
		return NombreUsuario;
	}

	public void setNombreUsuario(String NombreUsuario) {
		this.NombreUsuario = NombreUsuario;
	}

	public String getCorreoElectronico() {
		return CorreoElectronico;
	}

	public void setCorreoElectronico(String CorreoElectronico) {
		this.CorreoElectronico = CorreoElectronico;
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String Contrasena) {
		this.Contrasena = Contrasena;
	}

	public Date getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(Date FechaRegistro) {
		this.FechaRegistro = FechaRegistro;
	}
	
	//metodo verificar credenciales inicio sesion
	public boolean verificarCredenciales(String NombreUsuario, String Contrasena) {
		//comparar nombre de usuario y contraseña con los guardados en Usuarios
		return this.NombreUsuario.equals(NombreUsuario) && this.Contrasena.equals(Contrasena);
	}
}