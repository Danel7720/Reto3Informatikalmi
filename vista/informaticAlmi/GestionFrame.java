package informaticAlmi;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

public class GestionFrame extends JFrame {

	private JPanel contentPane;
	private JTabbedPane paneles;
	private Componentes componentes;
	private Cesta cesta;
	private NuevoCliente nuevoCliente;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionFrame frame = new GestionFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GestionFrame() {
		cesta = new Cesta(this);
		nuevoCliente = new NuevoCliente(this);
		//LA VENTANA NUEVO CLIENTE QUE NO SE VEA
		nuevoCliente.setVisible(false);
		
		setTitle("InformaticAlmi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 1010);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		paneles = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(paneles);
		
		JPanel panel = new JPanel();
		//INICIAR LOS CLASES 
		componentes= new Componentes(this);
		paneles.add("Componentes", componentes);
		paneles.add("Cesta", cesta);
	}
	//GETTERS Y SETTER
	public NuevoCliente getNuevoCliente() {
		return nuevoCliente;
	}

	public void setNuevoCliente(NuevoCliente nuevoCliente) {
		this.nuevoCliente = nuevoCliente;
	}

	public Componentes getComponentes() {
		return componentes;
	}

	public void setComponentes(Componentes componentes) {
		this.componentes = componentes;
	}

	public Cesta getCesta() {
		return cesta;
	}

	public void setCesta(Cesta cesta) {
		this.cesta = cesta;
	}

	public JTabbedPane getPaneles() {
		return paneles;
	}

	public void setPaneles(JTabbedPane paneles) {
		this.paneles = paneles;
	}
	

}
