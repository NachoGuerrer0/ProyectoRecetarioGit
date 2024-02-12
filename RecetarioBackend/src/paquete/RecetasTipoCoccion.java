package paquete;

public class RecetasTipoCoccion {
	private int IDReceta;
	private int IDTipoCoccion;
	
	//constructor
	public RecetasTipoCoccion(int IDReceta, int IDTipoCoccion) {
		this.IDReceta = IDReceta;
		this.IDTipoCoccion = IDTipoCoccion;
	}
	
	//getter y setters
	public int getIDReceta() {
		return IDReceta;
	}
	
	public void setIDReceta(int IDReceta) {
		this.IDReceta = IDReceta;
	}
	
	public int getIDTipoCoccion() {
		return IDTipoCoccion;
	}
	
	public void setIDTipoCoccion(int IDTipoCoccion) {
		this.IDTipoCoccion= IDTipoCoccion;
	}
}