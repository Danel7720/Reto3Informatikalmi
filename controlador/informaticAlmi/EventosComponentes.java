package informaticAlmi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EventosComponentes {
	public static final int PROCESADOR=1;
	public static final int RAM=2;
	public static final int DISCODURO=3;
	public static final int GRAFICA=4;
	public static final int PLACA=5;
	public static final int CAJA=6;
	public static final int ALIMENTACION=7;
	public static final int REFRIGERACION=8;
	
	private Basedatos bd;
	private Componentes componentes;
	private ArrayList<Componente> componente;
	private ArrayList<Carrito> carrito;

	private ResultSet rs;
	
	
	public EventosComponentes(Componentes componentes) {
		this.componentes=componentes;
		//FUNCION QUE LLENA EL ARRAY DE COMPONENTES
		llenarArray();
		//FUNCION QUE LLENA LOS JCOMBOBOX
		llenarBoxradius();
		//BOTON AÑADIR A LA CESTA
		componentes.getBtnAnadirCesta().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub 
				//COGER EL STRING DEL COMBOBOX SELECCIONADO
				String nombreProcesador = String.valueOf(componentes.getBoxProcesador().getSelectedItem());
				String nombrePlaca = String.valueOf(componentes.getBoxPlacabase().getSelectedItem());
				String nombreRam = String.valueOf(componentes.getBoxRam().getSelectedItem());
				String nombreDisco = String.valueOf(componentes.getBoxDisco().getSelectedItem());
				String nombreGrafica = String.valueOf(componentes.getBoxGrafica().getSelectedItem());
				String nombreCaja = String.valueOf(componentes.getBoxCaja().getSelectedItem());
				String nombreAlimentacion = String.valueOf(componentes.getBoxAlimentacion().getSelectedItem());
				String nombreRefrigeracion = String.valueOf(componentes.getBoxrefigeracion().getSelectedItem());
				//COGER EL ARRAYLIST CARRITO
				carrito = componentes.getGs().getCesta().getEventosCesta().getCarrito();
				//PARA CADA JCOMBOBOX
				//COMPROBAR QUE EL TEXTFIEL TENGA UN NUMERO MAYOR A 0
					//COGER EL COMPONETE SELECCIONADO
					//COMPROBAR SI EL COMPOP ESTA SELECTED Y SUMAR EL STOCK !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
					//COMPROBAR QUE EL NUMERO SEA MENOR O IGUAL AL STOCK
						//SI ES ASI AÑADIR AL ARRAY SI NO ALERTA
				if(Integer.parseInt(componentes.getTxtProcesador().getText())>0||componentes.getTxtProcesador().getText().trim()=="") {
					Componente proc= busarComp(nombreProcesador);
					if (proc.getStock()<Integer.parseInt(componentes.getTxtProcesador().getText())) {
						JOptionPane.showMessageDialog(componentes, "No hay suficiente stock "+proc.getNombre());
					}else {
						carrito.add(new Carrito(proc, Integer.parseInt(componentes.getTxtProcesador().getText())));
					}
				}if(Integer.parseInt(componentes.getTxtPlaca().getText())>0||componentes.getTxtPlaca().getText().trim()=="") {
					Componente placa = busarComp(nombrePlaca);
					if (placa.getStock()<Integer.parseInt(componentes.getTxtPlaca().getText())) {
						JOptionPane.showMessageDialog(componentes, "No hay suficiente stock "+placa.getNombre());
					}else {
						carrito.add(new Carrito(placa, Integer.parseInt(componentes.getTxtPlaca().getText())));
					}
				}if(Integer.parseInt(componentes.getTxtRam().getText())>0||componentes.getTxtRam().getText().trim()=="") {
					Componente ram = busarComp(nombreRam);
					if (ram.getStock()<Integer.parseInt(componentes.getTxtRam().getText())) {
						JOptionPane.showMessageDialog(componentes, "No hay suficiente stock "+ram.getNombre());
					}else {
						carrito.add(new Carrito(ram, Integer.parseInt(componentes.getTxtRam().getText())));
					}
				}if(Integer.parseInt(componentes.getTxtDisco().getText())<0||componentes.getTxtDisco().getText().trim()=="") {
					Componente disco = busarComp(nombreDisco);
					if (disco.getStock()>Integer.parseInt(componentes.getTxtDisco().getText())) {
						JOptionPane.showMessageDialog(componentes, "No hay suficiente stock "+disco.getNombre());
					}else {
						carrito.add(new Carrito(disco, Integer.parseInt(componentes.getTxtDisco().getText())));
					}
				}if(Integer.parseInt(componentes.getTxtGrafica().getText())>0||componentes.getTxtGrafica().getText().trim()=="") {
					Componente grafica= busarComp(nombreGrafica);
					if (grafica.getStock()<Integer.parseInt(componentes.getTxtGrafica().getText())) {
						JOptionPane.showMessageDialog(componentes, "No hay suficiente stock "+grafica.getNombre());
					}else {
						carrito.add(new Carrito(grafica, Integer.parseInt(componentes.getTxtGrafica().getText())));	
					}
				}if(Integer.parseInt(componentes.getTxtCaja().getText())>0||componentes.getTxtCaja().getText().trim()=="") {
					Componente caja= busarComp(nombreCaja);
					if (caja.getStock()<Integer.parseInt(componentes.getTxtCaja().getText())) {
						JOptionPane.showMessageDialog(componentes, "No hay suficiente stock "+caja.getNombre());
					}else {
						carrito.add(new Carrito(caja, Integer.parseInt(componentes.getTxtCaja().getText())));
					}
					
				}if(Integer.parseInt(componentes.getTxtAlmientacion().getText())>0||componentes.getTxtAlmientacion().getText().trim()=="") {
					Componente alim= busarComp(nombreAlimentacion);
					if (alim.getStock()<Integer.parseInt(componentes.getTxtAlmientacion().getText())) {
						JOptionPane.showMessageDialog(componentes, "No hay suficiente stock "+alim.getNombre());
					}else {
						carrito.add(new Carrito(alim, Integer.parseInt(componentes.getTxtAlmientacion().getText())));
					}
					
				}if(Integer.parseInt(componentes.getTxtRefrigeracion().getText())>0||componentes.getTxtRefrigeracion().getText().trim()=="") {
					Componente refri=busarComp(nombreRefrigeracion);
					if (refri.getStock()<Integer.parseInt(componentes.getTxtAlmientacion().getText())) {
						JOptionPane.showMessageDialog(componentes, "No hay suficiente stock "+refri.getNombre());
					}else {
						carrito.add(new Carrito(refri, Integer.parseInt(componentes.getTxtRefrigeracion().getText())));
					}
				}
				//FUNCION QUE REINICIA LOS COMBOBOX
				resetTxt();
				componentes.getGs().getCesta().getEventosCesta().carrito();;
			}
		});

		componentes.getBoxProcesador().addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				Componente comp = busarComp((String) e.getItem());
				
				comp.mostrarImg(componentes.getCanvas().getGraphics(), componentes.getCanvas());
				
			}
		});
		componentes.getBoxRam().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Componente comp = busarComp((String) e.getItem());
				
				comp.mostrarImg(componentes.getCanvas_2().getGraphics(), componentes.getCanvas_2());
			}
		});
		componentes.getBoxAlimentacion().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Componente comp = busarComp((String) e.getItem());
				
				comp.mostrarImg(componentes.getCanvas_6().getGraphics(), componentes.getCanvas_6());
			}
		});
		componentes.getBoxDisco().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Componente comp = busarComp((String) e.getItem());
				
				comp.mostrarImg(componentes.getCanvas_3().getGraphics(), componentes.getCanvas_3());
			}
		});
		componentes.getBoxPlacabase().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Componente comp = busarComp((String) e.getItem());
				
				comp.mostrarImg(componentes.getCanvas_1().getGraphics(), componentes.getCanvas_1());
			}
		});
		componentes.getBoxGrafica().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Componente comp = busarComp((String) e.getItem());
				
				comp.mostrarImg(componentes.getCanvas_4().getGraphics(), componentes.getCanvas_4());
			}
		});
		componentes.getBoxrefigeracion().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Componente comp = busarComp((String) e.getItem());
				
				comp.mostrarImg(componentes.getCanvas_7().getGraphics(), componentes.getCanvas_7());
			}
		});
		componentes.getBoxCaja().addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Componente comp = busarComp((String) e.getItem());
				
				comp.mostrarImg(componentes.getCanvas_5().getGraphics(), componentes.getCanvas_5());
			}
		});
		//CUANDO SE SELECCIONE EL RADIOBUTTON LLENA EL JCOMBOBOX
		componentes.getRdbamd().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				llenarBoxradius();
			}
		});
		
		componentes.getRdbIntel().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				llenarBoxradius();
			}
		});
		//SOLO SE PUEDE ESCRIBIR NUMERO EN EL TXTFIELD(ESTO PARA TODOS)
		componentes.getTxtAlmientacion().addKeyListener(new KeyAdapter() { 

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()<'0' || e.getKeyChar()>'9') {
					e.consume();
				}
			}
		});
		componentes.getTxtCaja().addKeyListener(new KeyAdapter() { 

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()<'0' || e.getKeyChar()>'9') {
					e.consume();
				}
			}
		});
		componentes.getTxtDisco().addKeyListener(new KeyAdapter() { 

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()<'0' || e.getKeyChar()>'9') {
					e.consume();
				}
			}
		});
		componentes.getTxtGrafica().addKeyListener(new KeyAdapter() { 

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()<'0' || e.getKeyChar()>'9') {
					e.consume();
				}
			}
		});
		componentes.getTxtPlaca().addKeyListener(new KeyAdapter() { 

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()<'0' || e.getKeyChar()>'9') {
					e.consume();
				}
			}
		});
		componentes.getTxtProcesador().addKeyListener(new KeyAdapter() { 

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()<'0' || e.getKeyChar()>'9') {
					e.consume();
				}
			}
		});
		componentes.getTxtRam().addKeyListener(new KeyAdapter() { 

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()<'0' || e.getKeyChar()>'9') {
					e.consume();
				}
			}
		});
		componentes.getTxtRefrigeracion().addKeyListener(new KeyAdapter() { 

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar()<'0' || e.getKeyChar()>'9') {
					e.consume();
				}
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
	//LLENA LOS BOXRADIUS
	private void llenarBoxradius() {
		//VACIA SI HAY ALGUN DATO ANTERIOR
		vaciarBox();
		//HACE UN BUCLE POR TODO EL ARRAY
			//FILTRA POR EL TIPO Y POR LA PRIMERA LETRA EL PROCESADOR
				//AÑADE AL JCOMBOBOX
		for (Componente com : componente) {
			if (com.getTipo()==PROCESADOR) {
				if (componentes.getRdbamd().isSelected()) {
					if (com.getNombre().trim().charAt(0)=='a'||com.getNombre().trim().charAt(0)=='A') {
						componentes.getBoxProcesador().addItem(com.getNombre());
					}
				}else if (componentes.getRdbIntel().isSelected()) {
					if (com.getNombre().trim().charAt(0)=='i'||com.getNombre().trim().charAt(0)=='I') {
						componentes.getBoxProcesador().addItem(com.getNombre());
					}
				}
			} else if (com.getTipo()==PLACA){
				componentes.getBoxPlacabase().addItem(com.getNombre());
			}else if(com.getTipo()==RAM) {
				componentes.getBoxRam().addItem(com.getNombre());
			}else if(com.getTipo()==DISCODURO) {
				componentes.getBoxDisco().addItem(com.getNombre());
			}else if(com.getTipo()==GRAFICA) {
				componentes.getBoxGrafica().addItem(com.getNombre());
			}else if(com.getTipo()==CAJA) {
				componentes.getBoxCaja().addItem(com.getNombre());
			}else if(com.getTipo()==ALIMENTACION) {
				componentes.getBoxAlimentacion().addItem(com.getNombre());
			}else if(com.getTipo()==REFRIGERACION) {
				componentes.getBoxrefigeracion().addItem(com.getNombre());
			}
		}
	}
	//FUNCION QUE LLENA EL ARRAY COMPONENTES
	public void llenarArray() {
		//INICIALIZAR
		bd = new Basedatos();
		rs= bd.selectComponentes();
		try {
			componente = new ArrayList<Componente>();
			//LLENAR TODOS LOS COMPONENTES
			while ( rs.next()) {
				componente.add(new Componente(rs.getInt("id_componente"),rs.getString("nombre"),rs.getFloat("precio"),rs.getInt("stock"),rs.getInt("id_tipo_componente"),rs.getString("imagen")));	

			}} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
	}
	//VACIAR TODOS LOS COMBOBOX
	public void vaciarBox() {
		componentes.getBoxProcesador().removeAllItems();
		componentes.getBoxPlacabase().removeAllItems();
		componentes.getBoxRam().removeAllItems();
		componentes.getBoxDisco().removeAllItems();
		componentes.getBoxGrafica().removeAllItems();
		componentes.getBoxCaja().removeAllItems();
		componentes.getBoxAlimentacion().removeAllItems();
		componentes.getBoxrefigeracion().removeAllItems();
		
	}
	//VACIAR LOS JTXTFIEL
	public void resetTxt() {
		componentes.getTxtAlmientacion().setText(0+"");
		componentes.getTxtCaja().setText(0+"");
		componentes.getTxtDisco().setText(0+"");
		componentes.getTxtGrafica().setText(0+"");
		componentes.getTxtPlaca().setText(0+"");
		componentes.getTxtProcesador().setText(0+"");
		componentes.getTxtRam().setText(0+"");
		componentes.getTxtRefrigeracion().setText(0+"");
	}
	//BUSCA EL COMPONENETE CON EL NOMBRE
	public Componente busarComp(String nombre) {
		for (Componente comp : componente) {
			if (comp.getNombre()==nombre) {
				return comp;
			}
		}
		return null;
	}
}
