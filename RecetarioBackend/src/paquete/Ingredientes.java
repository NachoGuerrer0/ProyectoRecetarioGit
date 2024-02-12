package paquete;

public class Ingredientes {
	private int IDIngrediente;
	private String Nombre;
	
	//constructor
	public Ingredientes(int IDIngrediente, String Nombre) {
		this.IDIngrediente = IDIngrediente;
		this.Nombre = Nombre;
	}
	
	//getters y setters
	public int getIDIngrediente() {
		return IDIngrediente;
	}
	
	public void setIDIngrediente(int IDIngrediente) {
		this.IDIngrediente = IDIngrediente;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
}