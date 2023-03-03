package informaticAlmi;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JEditorPane;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JList;

public class Cesta extends JPanel {
	
	private JButton btnNuevoCliente;
	private GestionFrame gs;
	private JComboBox boxCliente;
	private JLabel lblPrecioN;
	private EventosCesta eventosCesta;
	private JButton btnComprar;
	//private JScrollPane scrollPane;
	private DefaultListModel<String> modelComponentes;
	private JList<String> lstComponentes;
	private JScrollPane scrollPane;

	
	public Cesta(GestionFrame gs) {
		//INICIALIZAR LA VARIABLE PASADA POR PARAMETRO
		this.gs = gs;
		setLayout(new BorderLayout(0, 0));
		
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.SOUTH);
		
		btnComprar = new JButton("Comprar");
		panel_2.add(btnComprar);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(3, 2, 0, 0));
		
		JLabel lblPrecio = new JLabel("Precio:    ");
		lblPrecio.setVerticalAlignment(SwingConstants.BOTTOM);
		lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel_1.add(lblPrecio);
		
		lblPrecioN = new JLabel("0,0€");
		lblPrecioN.setVerticalAlignment(SwingConstants.TOP);
		lblPrecioN.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblPrecioN);
		
		JPanel panel = new JPanel();
		panel_1.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		boxCliente = new JComboBox();
		panel.add(boxCliente, BorderLayout.NORTH);
		
		btnNuevoCliente = new JButton("Nuevo Cliente");
		panel.add(btnNuevoCliente, BorderLayout.SOUTH);
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		lstComponentes = new JList();
		scrollPane.setViewportView(lstComponentes);
		modelComponentes=new DefaultListModel<String>();
		lstComponentes.setModel(modelComponentes);
		
		//INICIALIZAR 
		eventosCesta = new EventosCesta(this);
		
	}
	//GETTERS Y SETTERS
	public DefaultListModel<String> getModelComponentes() {
		return modelComponentes;
	}

	public void setModelComponentes(DefaultListModel<String> modelComponentes) {
		this.modelComponentes = modelComponentes;
	}

	public JList<String> getLstComponentes() {
		return lstComponentes;
	}

	public void setLstComponentes(JList<String> lstComponentes) {
		this.lstComponentes = lstComponentes;
	}

	public JButton getBtnComprar() {
		return btnComprar;
	}

	public void setBtnComprar(JButton btnComprar) {
		this.btnComprar = btnComprar;
	}

	public EventosCesta getEventosCesta() {
		return eventosCesta;
	}

	public void setEventosCesta(EventosCesta eventosCesta) {
		this.eventosCesta = eventosCesta;
	}

	public GestionFrame getGs() {
		return gs;
	}

	public void setGs(GestionFrame gs) {
		this.gs = gs;
	}

	public JButton getBtnNuevoCliente() {
		return btnNuevoCliente;
	}

	public void setBtnNuevoCliente(JButton btnNuevoCliente) {
		this.btnNuevoCliente = btnNuevoCliente;
	}

	public JComboBox getBoxCliente() {
		return boxCliente;
	}

	public void setBoxCliente(JComboBox boxCliente) {
		this.boxCliente = boxCliente;
	}

	public JLabel getLblPrecioN() {
		return lblPrecioN;
	}

	public void setLblPrecioN(JLabel lblPrecioN) {
		this.lblPrecioN = lblPrecioN;
	}
}
