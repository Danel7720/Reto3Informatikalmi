package informaticAlmi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class EventosNuevoCliente {
	private NuevoCliente nuevoCliente;
	private Basedatos bd;
	
	public EventosNuevoCliente(NuevoCliente nuevoCliente) {
		//INICIALIZACION
		this.nuevoCliente=nuevoCliente;
		bd= new Basedatos();
		//ID APROX QUE TENDRA EL USUARIO
		nuevoCliente.getTxtId().setText((bd.maxId()+1)+"");
		//BOTON VOLVER
		nuevoCliente.getBtnVolver().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//SE VUELVE VISIBLE EL PANEL PRINCIPAL
				//SE CIERRA EL PANEL DE NUEVO CLIENTE
				nuevoCliente.getGs().setVisible(true);
				nuevoCliente.dispose();
			}
		});
		//BOTON DE AÑADIR
		nuevoCliente.getBtnAdd().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//COMPRUEBA QUE HAYA DNI
				//COMPRUEBA QUE HAYA NOMBRE
				if (nuevoCliente.getTxtDni().getText().trim().equals("")) {
					JOptionPane.showMessageDialog(nuevoCliente, "Debe de tener un Dni");
				}else if (nuevoCliente.getTxtNombre().getText().trim().equals("")) {
					JOptionPane.showMessageDialog(nuevoCliente, "Debe de tener un nombre");
				}else {
					//REALIZAR EL INSERT
					if(bd.insertClientes(nuevoCliente.getTxtDni().getText(), nuevoCliente.getTxtNombre().getText(), nuevoCliente.getTxtApellido1().getText(), 
							nuevoCliente.getTxtApellido2().getText(), nuevoCliente.getTxtEmail().getText(), nuevoCliente.getTxtDireccion().getText(), nuevoCliente.getTxtPoblacion().getText(), 
							nuevoCliente.getTxtPais().getText())!=0) {
						//VACIAT JTXFILD, ACTUALIZAR EL JCOMBOBOX DE LOS CLIENTES, HACER VISIBLE EL PRINCIAPL, DESPARECER EL NUEVO CLIENTE, ACTUALIZAZR EL IDMAX
						vaciar();
						nuevoCliente.getGs().getCesta().getEventosCesta().llenarCliente();
						nuevoCliente.getGs().getCesta().getEventosCesta().boxCliente();
						nuevoCliente.getGs().setVisible(true);
						nuevoCliente.dispose();
						bd.maxId();
					}else {//SI OCURRE UN ERROR AL AÑADIR EL USUARIO
						JOptionPane.showMessageDialog(nuevoCliente, "Ha habido un error al añadir al usuario");
					}
				}
			}
		});
	}
	//VACIAR TODOS JTXTFIELD
	public void vaciar() {
		// TODO Auto-generated method stub
		nuevoCliente.getTxtDni().setText(null);
		nuevoCliente.getTxtNombre().setText(null);
		nuevoCliente.getTxtApellido1().setText(null);
		nuevoCliente.getTxtApellido2().setText(null);
		nuevoCliente.getTxtEmail().setText(null);
		nuevoCliente.getTxtDireccion().setText(null);
		nuevoCliente.getTxtPoblacion().setText(null);
		nuevoCliente.getTxtPais().setText(null);
	}
}
