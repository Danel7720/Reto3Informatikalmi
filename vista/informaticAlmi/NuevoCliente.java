package informaticAlmi;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import javax.swing.JTextField;

public class NuevoCliente extends JFrame {
	private GestionFrame gs;
	private JButton btnVolver;
	private JButton btnAdd;
	private JTextField txtId;
	private JTextField txtEmail;
	private JTextField txtNombre;
	private JTextField txtPoblacion;
	private JTextField txtApellido1;
	private JTextField txtPais;
	private JTextField txtApellido2;
	private JTextField txtDireccion;
	private EventosNuevoCliente eventosNuevoCliente;
	private JTextField txtDni;
	public NuevoCliente(GestionFrame gs) {
		//IGUALAR A UNA VARIBLE LOCAL EL PARAMETRO PASADO
		this.gs=gs;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);

		JLabel lblNewLabel = new JLabel("NUEVO CLIENTE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(5, 0, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Id:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Dni:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		txtDni = new JTextField();
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Email:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4);
		
		txtEmail = new JTextField();
		panel.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Nombre:");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_11);
		
		txtNombre = new JTextField();
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Población:");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_12);
		
		txtPoblacion = new JTextField();
		panel.add(txtPoblacion);
		txtPoblacion.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Apedillo 1:");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_9);
		
		txtApellido1 = new JTextField();
		panel.add(txtApellido1);
		txtApellido1.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Pais:");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7);
		
		txtPais = new JTextField();
		panel.add(txtPais);
		txtPais.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Apellido 2:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_5);
		
		txtApellido2 = new JTextField();
		panel.add(txtApellido2);
		txtApellido2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Dirección:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);
		
		txtDireccion = new JTextField();
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnVolver = new JButton("Volver");
		panel_1.add(btnVolver);
		
		btnAdd = new JButton("Añadir");
		panel_1.add(btnAdd);
		//INICIALIZACION
		eventosNuevoCliente = new EventosNuevoCliente(this);
	}
	
	//GETTERS AND SETTERS
	public JTextField getTxtDni() {
		return txtDni;
	}
	public void setTxtDni(JTextField txtDni) {
		this.txtDni = txtDni;
	}
	public GestionFrame getGs() {
		return gs;
	}
	public void setGs(GestionFrame gs) {
		this.gs = gs;
	}
	public JButton getBtnVolver() {
		return btnVolver;
	}
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	public JButton getBtnAdd() {
		return btnAdd;
	}
	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}
	public JTextField getTxtId() {
		return txtId;
	}
	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}
	public JTextField getTxtEmail() {
		return txtEmail;
	}
	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}
	public JTextField getTxtPoblacion() {
		return txtPoblacion;
	}
	public void setTxtPoblacion(JTextField txtPoblacion) {
		this.txtPoblacion = txtPoblacion;
	}
	public JTextField getTxtApellido1() {
		return txtApellido1;
	}
	public void setTxtApellido1(JTextField txtApellido1) {
		this.txtApellido1 = txtApellido1;
	}
	public JTextField getTxtPais() {
		return txtPais;
	}
	public void setTxtPais(JTextField txtPais) {
		this.txtPais = txtPais;
	}
	public JTextField getTxtApellido2() {
		return txtApellido2;
	}
	public void setTxtApellido2(JTextField txtApellido2) {
		this.txtApellido2 = txtApellido2;
	}
	public JTextField getTxtDireccion() {
		return txtDireccion;
	}
	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
	}

}
