package paquete;

public class TipoComida {
	private int IDTipoComida;
	private String Nombre;
	
	//constructor
	public TipoComida(int IDTipoComida, String Nombre) {
		this.IDTipoComida = IDTipoComida;
		this.Nombre = Nombre;
	}
	
	//getter y setters
	public int IDTipoComida() {
		return IDTipoComida;
	}
	
	public void setIDTipoComida(int IDTipoComida) {
		this.IDTipoComida = IDTipoComida;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
}