package paquete;

public class RecetasTipoComida {
	private int IDReceta;
	private int IDTipoComida;
	
	//constructor
	public RecetasTipoComida(int IDReceta, int IDTipoComida) {
		this.IDReceta = IDReceta;
		this.IDTipoComida = IDTipoComida;
	}
	
	//getter y setters
	public int getIDReceta() {
		return IDReceta;
	}
	
	public void setIDReceta(int IDReceta) {
		this.IDReceta = IDReceta;
	}
	
	public int IDTipoComida() {
		return IDTipoComida;
	}
	
	public void setIDTipoComida(int IDTipoComida) {
		this.IDTipoComida = IDTipoComida;
	}
}