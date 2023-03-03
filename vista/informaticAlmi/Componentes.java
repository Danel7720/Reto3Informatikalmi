package informaticAlmi;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JEditorPane;
import java.awt.Insets;
import java.awt.Canvas;

public class Componentes extends JPanel {
	private JTextField txtTipo;
	private JButton btnLimpiar;
	private JButton btnAlta;
	private JPanel Ram;
	private JComboBox boxRam;
	private JPanel dscoDuro;
	private JComboBox<Componente> boxDisco;
	private JPanel grafica;
	private JPanel caja;
	private JComboBox<Componente> boxCaja;
	private JPanel fuenteDeAlimentacion;
	private JComboBox<Componente> boxAlimentacion;
	private JPanel refrigeracion;
	private JComboBox<Componente> boxrefigeracion;
	private JPanel botones;
	private JButton btnAnadirCesta;
	private JComboBox<Componente> boxPlacabase;
	private JPanel panel_1procesador;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblClave_1;
	//GETTERS AND SETTER
	public JTextField getTxtTipo() {
		return txtTipo;
	}

	public void setTxtTipo(JTextField txtTipo) {
		this.txtTipo = txtTipo;
	}

	public JTextField getTxtProcesador() {
		return txtProcesador;
	}

	public void setTxtProcesador(JTextField txtProcesador) {
		this.txtProcesador = txtProcesador;
	}

	public JTextField getTxtPlaca() {
		return txtPlaca;
	}

	public void setTxtPlaca(JTextField txtPlaca) {
		this.txtPlaca = txtPlaca;
	}

	public JTextField getTxtRam() {
		return txtRam;
	}

	public void setTxtRam(JTextField txtRam) {
		this.txtRam = txtRam;
	}

	public JTextField getTxtDisco() {
		return txtDisco;
	}

	public void setTxtDisco(JTextField txtDisco) {
		this.txtDisco = txtDisco;
	}

	public JTextField getTxtGrafica() {
		return txtGrafica;
	}

	public void setTxtGrafica(JTextField txtGrafica) {
		this.txtGrafica = txtGrafica;
	}

	public JTextField getTxtCaja() {
		return txtCaja;
	}

	public void setTxtCaja(JTextField txtCaja) {
		this.txtCaja = txtCaja;
	}

	public JTextField getTxtAlmientacion() {
		return txtAlmientacion;
	}

	public void setTxtAlmientacion(JTextField txtAlmientacion) {
		this.txtAlmientacion = txtAlmientacion;
	}

	public JTextField getTxtRefrigeracion() {
		return txtRefrigeracion;
	}

	public void setTxtRefrigeracion(JTextField txtRefrigeracion) {
		this.txtRefrigeracion = txtRefrigeracion;
	}

	private JRadioButton rdbIntel;
	private JRadioButton rdbamd;
	public ButtonGroup getGroup() {
		return group;
	}

	public void setGroup(ButtonGroup group) {
		this.group = group;
	}

	public JRadioButton getRdbIntel() {
		return rdbIntel;
	}

	public void setRdbIntel(JRadioButton rdbIntel) {
		this.rdbIntel = rdbIntel;
	}

	public JRadioButton getRdbamd() {
		return rdbamd;
	}

	public void setRdbamd(JRadioButton rdbamd) {
		this.rdbamd = rdbamd;
	}

	private JComboBox<Componente> boxProcesador;
	private ButtonGroup group;
	
	
	private EventosComponentes eventosComponentes;
	private JTextField txtProcesador;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JPanel panel_4;
	private JPanel panel_5;
	private JLabel lblNewLabel_1;
	private JTextField txtPlaca;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblNewLabel_2;
	private JTextField txtRam;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JLabel lblNewLabel_3;
	private JTextField txtDisco;
	private JPanel panel_13;
	private JPanel panel_12;
	private JPanel panel_14;
	private JTextField txtGrafica;
	private JComboBox<Componente> boxGrafica;
	private JLabel lblNewLabel_5;
	private JTextField txtCaja;
	private JPanel panel_18;
	private JPanel panel_19;
	private JPanel panel_20;
	private JLabel lblNewLabel_6;
	private JTextField txtAlmientacion;
	private JPanel panel_21;
	private JPanel panel_22;
	private JPanel panel_23;
	private JLabel lblNewLabel_7;
	private JTextField txtRefrigeracion;
	
	private GestionFrame gs;
	private Canvas canvas;
	private Canvas canvas_1;
	private Canvas canvas_2;
	private Canvas canvas_3;
	private Canvas canvas_4;
	private Canvas canvas_5;
	private Canvas canvas_6;
	private Canvas canvas_7;

	/**
	 * Create the panel.
	 */
	public Componentes(GestionFrame gs) {		
		//INICIALIZAR LAS VARIABLES
		this.gs =gs;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		panel_1procesador = new JPanel();
		panel_1procesador.setBorder(new TitledBorder(null, "Procesador:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel_1procesador);
		GridBagLayout gbl_panel_1procesador = new GridBagLayout();
		gbl_panel_1procesador.columnWidths = new int[] {428, 90, 0};
		gbl_panel_1procesador.rowHeights = new int[] {90, 0};
		gbl_panel_1procesador.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1procesador.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1procesador.setLayout(gbl_panel_1procesador);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel_1procesador.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_3 = new JPanel();
		panel_1.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		lblClave_1 = new JLabel("Tipo:");
		lblClave_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblClave_1);
		
		rdbIntel = new JRadioButton("Intel");
		rdbIntel.setSelected(true);
		panel_3.add(rdbIntel);
		
		rdbamd = new JRadioButton("AMD");
		panel_3.add(rdbamd);
		
		boxProcesador = new JComboBox<Componente>();
		panel_1.add(boxProcesador);
		
		lblNewLabel = new JLabel("Cantidad:");
		panel_3.add(lblNewLabel);
		
		txtProcesador = new JTextField();
		txtProcesador.setText("0");
		panel_3.add(txtProcesador);
		txtProcesador.setColumns(10);
		
		panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		panel_1procesador.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		canvas = new Canvas();
		panel_2.add(canvas);
		
		JPanel placaBase = new JPanel();
		placaBase.setToolTipText("Ram");
		placaBase.setBorder(new TitledBorder(null, "Placa Base:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(placaBase);
		GridBagLayout gbl_placaBase = new GridBagLayout();
		gbl_placaBase.columnWidths = new int[] {428, 90, 0};
		gbl_placaBase.rowHeights = new int[] {90, 0};
		gbl_placaBase.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_placaBase.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		placaBase.setLayout(gbl_placaBase);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		placaBase.add(panel, gbc_panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_5 = new JPanel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		lblNewLabel_1 = new JLabel("Cantidad:    ");
		panel_5.add(lblNewLabel_1);
		
		txtPlaca = new JTextField();
		txtPlaca.setText("0");
		panel_5.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		boxPlacabase = new JComboBox<Componente>();
		panel.add(boxPlacabase);
		
		panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(540, 540));
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 0;
		placaBase.add(panel_4, gbc_panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		canvas_1 = new Canvas();
		panel_4.add(canvas_1);
		
		Ram = new JPanel();
		Ram.setToolTipText("Ram:");
		Ram.setBorder(new TitledBorder(null, "Ram:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(Ram);
		GridBagLayout gbl_Ram = new GridBagLayout();
		gbl_Ram.columnWidths = new int[] {428, 90, 0};
		gbl_Ram.rowHeights = new int[] {90, 0};
		gbl_Ram.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_Ram.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		Ram.setLayout(gbl_Ram);
		
		panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.insets = new Insets(0, 0, 0, 5);
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 0;
		Ram.add(panel_6, gbc_panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_8 = new JPanel();
		panel_6.add(panel_8);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
		
		lblNewLabel_2 = new JLabel("Cantidad:    ");
		panel_8.add(lblNewLabel_2);
		
		txtRam = new JTextField();
		txtRam.setText("0");
		panel_8.add(txtRam);
		txtRam.setColumns(10);
		
		boxRam = new JComboBox<Componente>();
		panel_6.add(boxRam);
		
		panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 1;
		gbc_panel_7.gridy = 0;
		Ram.add(panel_7, gbc_panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		canvas_2 = new Canvas();
		panel_7.add(canvas_2);
		
		dscoDuro = new JPanel();
		dscoDuro.setToolTipText("Disco duro:");
		dscoDuro.setBorder(new TitledBorder(null, "Disco duro:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(dscoDuro);
		GridBagLayout gbl_dscoDuro = new GridBagLayout();
		gbl_dscoDuro.columnWidths = new int[] {428, 90, 0};
		gbl_dscoDuro.rowHeights = new int[] {90, 0};
		gbl_dscoDuro.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_dscoDuro.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		dscoDuro.setLayout(gbl_dscoDuro);
		
		panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.insets = new Insets(0, 0, 0, 5);
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 0;
		dscoDuro.add(panel_9, gbc_panel_9);
		panel_9.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_11 = new JPanel();
		panel_9.add(panel_11);
		panel_11.setLayout(new BoxLayout(panel_11, BoxLayout.X_AXIS));
		
		lblNewLabel_3 = new JLabel("Cantidad:    ");
		panel_11.add(lblNewLabel_3);
		
		txtDisco = new JTextField();
		txtDisco.setText("0");
		panel_11.add(txtDisco);
		txtDisco.setColumns(10);
		
		boxDisco = new JComboBox<Componente>();
		panel_9.add(boxDisco);
		
		panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 1;
		gbc_panel_10.gridy = 0;
		dscoDuro.add(panel_10, gbc_panel_10);
		panel_10.setLayout(new BoxLayout(panel_10, BoxLayout.X_AXIS));
		
		canvas_3 = new Canvas();
		panel_10.add(canvas_3);
		
		grafica = new JPanel();
		grafica.setToolTipText("Grafica:");
		grafica.setBorder(new TitledBorder(null, "Grafica:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(grafica);
		GridBagLayout gbl_grafica = new GridBagLayout();
		gbl_grafica.columnWidths = new int[] {428, 90, 0};
		gbl_grafica.rowHeights = new int[] {90, 0};
		gbl_grafica.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_grafica.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		grafica.setLayout(gbl_grafica);
		
		panel_13 = new JPanel();
		GridBagConstraints gbc_panel_13 = new GridBagConstraints();
		gbc_panel_13.fill = GridBagConstraints.BOTH;
		gbc_panel_13.insets = new Insets(0, 0, 0, 5);
		gbc_panel_13.gridx = 0;
		gbc_panel_13.gridy = 0;
		grafica.add(panel_13, gbc_panel_13);
		panel_13.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_14 = new JPanel();
		panel_13.add(panel_14);
		panel_14.setLayout(new BoxLayout(panel_14, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_4 = new JLabel("Cantidad:    ");
		panel_14.add(lblNewLabel_4);
		
		txtGrafica = new JTextField();
		txtGrafica.setText("0");
		panel_14.add(txtGrafica);
		txtGrafica.setColumns(10);
		
		boxGrafica = new JComboBox<Componente>();
		panel_13.add(boxGrafica);
		
		panel_12 = new JPanel();
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 1;
		gbc_panel_12.gridy = 0;
		grafica.add(panel_12, gbc_panel_12);
		panel_12.setLayout(new BoxLayout(panel_12, BoxLayout.X_AXIS));
		
		canvas_4 = new Canvas();
		panel_12.add(canvas_4);
		
		caja = new JPanel();
		caja.setToolTipText("Caja:");
		caja.setBorder(new TitledBorder(null, "Caja:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(caja);
		GridBagLayout gbl_caja = new GridBagLayout();
		gbl_caja.columnWidths = new int[] {428, 90, 0};
		gbl_caja.rowHeights = new int[] {90, 0};
		gbl_caja.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_caja.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		caja.setLayout(gbl_caja);
		
		JPanel panel_15 = new JPanel();
		GridBagConstraints gbc_panel_15 = new GridBagConstraints();
		gbc_panel_15.fill = GridBagConstraints.BOTH;
		gbc_panel_15.insets = new Insets(0, 0, 0, 5);
		gbc_panel_15.gridx = 0;
		gbc_panel_15.gridy = 0;
		caja.add(panel_15, gbc_panel_15);
		panel_15.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_17 = new JPanel();
		panel_15.add(panel_17);
		panel_17.setLayout(new BoxLayout(panel_17, BoxLayout.X_AXIS));
		
		lblNewLabel_5 = new JLabel("Cantidad:    ");
		panel_17.add(lblNewLabel_5);
		
		txtCaja = new JTextField();
		txtCaja.setText("0");
		panel_17.add(txtCaja);
		txtCaja.setColumns(10);
		
		boxCaja = new JComboBox<Componente>();
		panel_15.add(boxCaja);
		
		JPanel panel_16 = new JPanel();
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.gridx = 1;
		gbc_panel_16.gridy = 0;
		caja.add(panel_16, gbc_panel_16);
		panel_16.setLayout(new BoxLayout(panel_16, BoxLayout.X_AXIS));
		
		canvas_5 = new Canvas();
		panel_16.add(canvas_5);
		
		fuenteDeAlimentacion = new JPanel();
		fuenteDeAlimentacion.setToolTipText("Fuente de alimentacion:");
		fuenteDeAlimentacion.setBorder(new TitledBorder(null, "Fuente de alimentacion:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(fuenteDeAlimentacion);
		GridBagLayout gbl_fuenteDeAlimentacion = new GridBagLayout();
		gbl_fuenteDeAlimentacion.columnWidths = new int[] {428, 90, 0};
		gbl_fuenteDeAlimentacion.rowHeights = new int[] {90, 0};
		gbl_fuenteDeAlimentacion.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_fuenteDeAlimentacion.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		fuenteDeAlimentacion.setLayout(gbl_fuenteDeAlimentacion);
		
		panel_18 = new JPanel();
		GridBagConstraints gbc_panel_18 = new GridBagConstraints();
		gbc_panel_18.fill = GridBagConstraints.BOTH;
		gbc_panel_18.insets = new Insets(0, 0, 0, 5);
		gbc_panel_18.gridx = 0;
		gbc_panel_18.gridy = 0;
		fuenteDeAlimentacion.add(panel_18, gbc_panel_18);
		panel_18.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_20 = new JPanel();
		panel_18.add(panel_20);
		panel_20.setLayout(new BoxLayout(panel_20, BoxLayout.X_AXIS));
		
		lblNewLabel_6 = new JLabel("Cantidad:    ");
		panel_20.add(lblNewLabel_6);
		
		txtAlmientacion = new JTextField();
		txtAlmientacion.setText("0");
		panel_20.add(txtAlmientacion);
		txtAlmientacion.setColumns(10);
		
		boxAlimentacion = new JComboBox<Componente>();
		panel_18.add(boxAlimentacion);
		
		panel_19 = new JPanel();
		GridBagConstraints gbc_panel_19 = new GridBagConstraints();
		gbc_panel_19.fill = GridBagConstraints.BOTH;
		gbc_panel_19.gridx = 1;
		gbc_panel_19.gridy = 0;
		fuenteDeAlimentacion.add(panel_19, gbc_panel_19);
		panel_19.setLayout(new BoxLayout(panel_19, BoxLayout.X_AXIS));
		
		canvas_6 = new Canvas();
		panel_19.add(canvas_6);
		
		refrigeracion = new JPanel();
		refrigeracion.setToolTipText("Refrigeracion:");
		refrigeracion.setBorder(new TitledBorder(null, "Refrigeracion:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(refrigeracion);
		GridBagLayout gbl_refrigeracion = new GridBagLayout();
		gbl_refrigeracion.columnWidths = new int[] {428, 90, 0};
		gbl_refrigeracion.rowHeights = new int[] {90, 0};
		gbl_refrigeracion.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_refrigeracion.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		refrigeracion.setLayout(gbl_refrigeracion);
		
		panel_21 = new JPanel();
		GridBagConstraints gbc_panel_21 = new GridBagConstraints();
		gbc_panel_21.fill = GridBagConstraints.BOTH;
		gbc_panel_21.insets = new Insets(0, 0, 0, 5);
		gbc_panel_21.gridx = 0;
		gbc_panel_21.gridy = 0;
		refrigeracion.add(panel_21, gbc_panel_21);
		panel_21.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_23 = new JPanel();
		panel_21.add(panel_23);
		panel_23.setLayout(new BoxLayout(panel_23, BoxLayout.X_AXIS));
		
		lblNewLabel_7 = new JLabel("Cantidad:    ");
		panel_23.add(lblNewLabel_7);
		
		txtRefrigeracion = new JTextField();
		txtRefrigeracion.setText("0");
		panel_23.add(txtRefrigeracion);
		txtRefrigeracion.setColumns(10);
		
		boxrefigeracion = new JComboBox<Componente>();
		panel_21.add(boxrefigeracion);
		
		panel_22 = new JPanel();
		GridBagConstraints gbc_panel_22 = new GridBagConstraints();
		gbc_panel_22.fill = GridBagConstraints.BOTH;
		gbc_panel_22.gridx = 1;
		gbc_panel_22.gridy = 0;
		refrigeracion.add(panel_22, gbc_panel_22);
		panel_22.setLayout(new BoxLayout(panel_22, BoxLayout.X_AXIS));
		
		canvas_7 = new Canvas();
		panel_22.add(canvas_7);
		
		botones = new JPanel();
		botones.setToolTipText("Refrigeracion:");
		botones.setBorder(null);
		add(botones);
		botones.setLayout(new BorderLayout(0, 0));
		
		btnAnadirCesta = new JButton("Añadir cesta");
		botones.add(btnAnadirCesta);
		
		group = new ButtonGroup();
		group.add(rdbIntel);
		group.add(rdbamd);
		//INICIALIZACION
		eventosComponentes = new EventosComponentes(this);
	}
	//GETTERS AND SETTERS
	public GestionFrame getGs() {
		return gs;
	}

	public void setGs(GestionFrame gs) {
		this.gs = gs;
	}

	public EventosComponentes getEventosComponentes() {
		return eventosComponentes;
	}

	public void setEventosComponentes(EventosComponentes eventosComponentes) {
		this.eventosComponentes = eventosComponentes;
	}

	public JButton getBtnLimpiar() {
		return btnLimpiar;
	}

	public void setBtnLimpiar(JButton btnLimpiar) {
		this.btnLimpiar = btnLimpiar;
	}

	public JButton getBtnAlta() {
		return btnAlta;
	}

	public void setBtnAlta(JButton btnAlta) {
		this.btnAlta = btnAlta;
	}

	public JComboBox getBoxRam() {
		return boxRam;
	}

	public void setBoxRam(JComboBox boxRam) {
		this.boxRam = boxRam;
	}

	public JComboBox getBoxDisco() {
		return boxDisco;
	}

	public void setBoxDisco(JComboBox boxDisco) {
		this.boxDisco = boxDisco;
	}

	public JComboBox getBoxGrafica() {
		return boxGrafica;
	}

	public void setBoxGrafica(JComboBox boxGrafica) {
		this.boxGrafica = boxGrafica;
	}

	public JComboBox getBoxCaja() {
		return boxCaja;
	}

	public void setBoxCaja(JComboBox boxCaja) {
		this.boxCaja = boxCaja;
	}

	public JComboBox getBoxAlimentacion() {
		return boxAlimentacion;
	}

	public void setBoxAlimentacion(JComboBox boxAlimentacion) {
		this.boxAlimentacion = boxAlimentacion;
	}

	public JComboBox getBoxrefigeracion() {
		return boxrefigeracion;
	}

	public void setBoxrefigeracion(JComboBox boxrefigeracion) {
		this.boxrefigeracion = boxrefigeracion;
	}

	public JButton getBtnAnadirCesta() {
		return btnAnadirCesta;
	}

	public void setBtnAnadirCesta(JButton btnAnadirCesta) {
		this.btnAnadirCesta = btnAnadirCesta;
	}

	public JComboBox getBoxPlacabase() {
		return boxPlacabase;
	}

	public void setBoxPlacabase(JComboBox boxPlacabase) {
		this.boxPlacabase = boxPlacabase;
	}

	public JComboBox getBoxProcesador() {
		return boxProcesador;
	}

	public void setBoxProcesador(JComboBox boxProcesador) {
		this.boxProcesador = boxProcesador;
	}

	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

	public Canvas getCanvas_1() {
		return canvas_1;
	}

	public void setCanvas_1(Canvas canvas_1) {
		this.canvas_1 = canvas_1;
	}

	public Canvas getCanvas_2() {
		return canvas_2;
	}

	public void setCanvas_2(Canvas canvas_2) {
		this.canvas_2 = canvas_2;
	}

	public Canvas getCanvas_3() {
		return canvas_3;
	}

	public void setCanvas_3(Canvas canvas_3) {
		this.canvas_3 = canvas_3;
	}

	public Canvas getCanvas_4() {
		return canvas_4;
	}

	public void setCanvas_4(Canvas canvas_4) {
		this.canvas_4 = canvas_4;
	}

	public Canvas getCanvas_5() {
		return canvas_5;
	}

	public void setCanvas_5(Canvas canvas_5) {
		this.canvas_5 = canvas_5;
	}

	public Canvas getCanvas_6() {
		return canvas_6;
	}

	public void setCanvas_6(Canvas canvas_6) {
		this.canvas_6 = canvas_6;
	}

	public Canvas getCanvas_7() {
		return canvas_7;
	}

	public void setCanvas_7(Canvas canvas_7) {
		this.canvas_7 = canvas_7;
	}
}
