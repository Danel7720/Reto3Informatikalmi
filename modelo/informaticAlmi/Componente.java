package informaticAlmi;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;

public class Componente {
	
	private int id;
	private String nombre;
	private float precio;
	private int stock;
	private int tipo;
	private String img;

	public Componente(int id, String nombre, float precio,int stock, int tipo, String img) {
		//IGUALAR LOS PARAMETROS A LAS VARIABLES LOCALES
		this.id=id;
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
		this.tipo=tipo;
		this.img=img;
	}
	
	public void mostrarImg(Graphics gs, Canvas canvas) {
		URL url;
		Image imgCanva;
		canvas.paint(gs);
		if(img!=null) {
			try {
				url = new URL("http://192.168.0.104/img/productos/"+img.replace(" ", "%20"));
				imgCanva= new ImageIcon(url).getImage();
				gs.drawImage(imgCanva, 0, 0, canvas.getWidth(), canvas.getHeight(), canvas);
				//gs.drawImage(imgCanva, canvas.getWidth() / canvas.getWidth() + canvas.getWidth() / 200, canvas.getHeight() / 2, canvas.getWidth() - canvas.getWidth() / 2, canvas.getHeight(), canvas);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	//GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	public int getTipo() {
		return tipo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
