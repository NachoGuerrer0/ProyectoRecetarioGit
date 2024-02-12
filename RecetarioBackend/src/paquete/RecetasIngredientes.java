package paquete;

public class RecetasIngredientes {
	private int IDReceta;
	private int IDIngrediente;
	private int Cantidad;
	
	//constructor
	public RecetasIngredientes(int IDReceta, int IDIngrediente, int Cantidad) {
		this.IDReceta = IDReceta;
		this.IDIngrediente = IDIngrediente;
		this.Cantidad = Cantidad;
	}
	
	//getters y setters
	public int getIDReceta() {
		return IDReceta;
	}
	
	public void setIDReceta(int IDReceta) {
		this.IDReceta = IDReceta;
	}
	
	public int getIDIngrediente() {
		return IDIngrediente;
	}
	
	public void setIDIngrediente(int IDIngrediente) {
		this.IDIngrediente = IDIngrediente;
	}
	
	public int getCantidad() {
		return Cantidad;
	}
	
	public void setCantidad(int Cantidad) {
		this.Cantidad = Cantidad;
	}
}