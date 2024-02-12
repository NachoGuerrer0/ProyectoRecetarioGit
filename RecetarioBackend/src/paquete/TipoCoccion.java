package paquete;

public class TipoCoccion {
	private int IDTipoCoccion;
	private String Nombre;
	
	//constructor
	public TipoCoccion(int IDTipoCoccion, String Nombre) {
		this.IDTipoCoccion = IDTipoCoccion;
		this.Nombre = Nombre;
	}
	
	//getter y setters
	public int getIDTipoCoccion() {
		return IDTipoCoccion;
	}
	
	public void setIDTipoCoccion(int IDTipoCoccion) {
		this.IDTipoCoccion= IDTipoCoccion;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
}