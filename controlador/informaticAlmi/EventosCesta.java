package informaticAlmi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EventosCesta {
	
	private Basedatos bd;
	private Cesta cesta;
	private ArrayList<Cliente> cliente;
	private ArrayList<Carrito> carrito;
	private ResultSet rs;

	
	public EventosCesta(Cesta cesta) {
		//INICIALIZAR LAS VARIABLES
		this.cesta=cesta;
		carrito = new ArrayList<Carrito>();
		
		llenarCliente();
		boxCliente();
		//BOTN NUEVO CLIENTE
		cesta.getBtnNuevoCliente().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//DESABILITA EL PANEL PRINCIAPL
				//HANILITA EL PANEL NUEVO CLIENTE
				cesta.getGs().getNuevoCliente().setVisible(true);
				cesta.getGs().setVisible(false);
			}
		});
		//BOTN COMPRAR
		cesta.getBtnComprar().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Cliente cli =cliente.get(cesta.getBoxCliente().getSelectedIndex());
				for (Carrito carrito2 : carrito) {
					bd.comprar(carrito2.getComponente().getId(), carrito2.getCantidad(), cli.getId());
				}
				carrito.clear();
			}
		});
		
	}
	//GETTERS Y SETTERS
	public ArrayList<Carrito> getCarrito() {
		return carrito;
	}

	public void setCarrito(ArrayList<Carrito> carrito) {
		this.carrito = carrito;
	}
	//LLENA EL ARRAY BCLIENTE
	public void llenarCliente() {
		//INICIALIZA LAS VARIABLES
		bd = new Basedatos();
		rs= bd.selectClientes();
		
		try {
			cliente = new ArrayList<Cliente>();
			//LLENAR TODOS LOS COMPONENTES
			while ( rs.next()) {
				cliente.add(new Cliente(rs.getInt("id_cliente"),rs.getString("dni"),rs.getString("nombre"),rs.getString("apellido1"),rs.getString("apellido2"),rs.getString("email"),rs.getString("poblacion"),rs.getString("pais"),rs.getString("direccion")));	

				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	//LLENA EL BOX CLIENTE
	public void boxCliente() {
		//VACIA EL ARRAY
		cesta.getBoxCliente().removeAllItems();
		//LLENA DE NUEVO EL BOX CON LOS DATOS DEL ARRAY
		for (Cliente clien : cliente) {
			cesta.getBoxCliente().addItem(clien.getNombre()+", "+clien.getDni());
		}
	}
	//CALCULA LA SUMA DEL CARRITO
	public float calcularPrecio() {
		float aux=0;
		//RCOCORRE EL CARRITO SUMANDO SUS PRECIOS Y MULTIPLICANDO POR LA CANTIDAD DEL PRODUCTO
		for (Carrito carr : carrito) {
			aux=(carr.getComponente().getPrecio()*carr.getCantidad())+aux;
		}
		return aux;
	}
	//LLENA EL ARRAY LIST
	public void modelollenar() {
		//BORRA LOS ELEMENTOS ANTERIORES
		cesta.getModelComponentes().removeAllElements();
		//RECORRE EL ARRAY Y LO AÑADE AL MODELO
		for (Carrito carr : carrito) {
			cesta.getModelComponentes().addElement(carr.getComponente().getNombre()+"          x"+carr.getCantidad());
		}
	}
	//FUNCION QUE LLAM A OTRAS CUANDO HAY ALGO EN EL CARRITO
	public void carrito() {
		//LLENA EL MODELO
		//CALCULA Y AÑADE EL PRECIO AL JLABEL
		modelollenar();
		cesta.getLblPrecioN().setText(calcularPrecio()+"");
	}
}
