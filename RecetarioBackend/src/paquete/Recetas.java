package paquete;

import java.util.Date;

public class Recetas {
	private int IDReceta;
	private String Nombre;
	private String Descripcion;
	private int TiempoPreparacion;
	private int IDUsuario;
	private Date FechaSubida;
	
	
	//constructor
	public Recetas(int IDReceta, String Nombre, String Descripcion, int TiempoPreparacion, int IDUsuario, Date FechaSubida) {
		this.IDReceta = IDReceta;
		this.Nombre = Nombre;
		this.Descripcion = Descripcion;
		this.TiempoPreparacion = TiempoPreparacion;
		this.IDUsuario = IDUsuario;
		this.FechaSubida = FechaSubida;
	}
	
	//getter y setters
	public int getIDReceta() {
		return IDReceta;
	}
	
	public void setIDReceta(int IDReceta) {
		this.IDReceta = IDReceta;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}
	
	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
	
	public int getTiempoPreparacion() {
		return TiempoPreparacion;
	}
	
	public void setTiempoPreparacion(int TiempoPreparacion) {
		this.TiempoPreparacion = TiempoPreparacion;
	}
	
	public int getIDUsuario() {
		return IDUsuario;
	}
	
	public void setIDUsuario(int IDUsuario) {
		this.IDUsuario = IDUsuario;
	}
	
	public Date getFechaSubida() {
		return FechaSubida;
	}
	
	public void setFechaSubida(Date FechaSubida) {
		this.FechaSubida = FechaSubida;
	}
}