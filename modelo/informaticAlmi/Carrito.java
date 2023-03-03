package informaticAlmi;

public class Carrito {
	
	private int cantidad;
	private Componente componente;
	
	public Carrito(Componente componente, int cantidad) {
		//IGUALAR LOS PARAMETROS A LAS VARIABLES LOCALES
		// TODO Auto-generated constructor stub
		this.cantidad=cantidad;
		this.componente=componente;
	}
	//GETTERS Y SETTERS
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

}
