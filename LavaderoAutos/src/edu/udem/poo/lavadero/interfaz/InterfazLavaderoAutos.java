package edu.udem.poo.lavadero.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.udem.poo.lavadero.mundo.Lavadero;
import edu.udem.poo.lavadero.mundo.LavaderoException;

/**
 * Clase que representa la ventana principal de la aplicación y actúa como controlador de la misma
 * @author jehincapie
 *
 */
public class InterfazLavaderoAutos extends JFrame {
	
	/**
	 * Panel que contiene todos los controles que conforman la interfaz
	 */
	private JPanel contentPane;
	
	/**
	 * Contiene la instnacia del panel de registro de lavadas
	 */
	private PanelRegistroLavadas panelRegistroLavadas;
	
	/**
	 * Contiene la instancia del panel de informes de la aplicación
	 */
	private PanelInformes panelInformes;
	
	/**
	 * Objeto del modelo del mundo que representa el lavadero
	 */
	private Lavadero lavadero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazLavaderoAutos frame = new InterfazLavaderoAutos();
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
	public InterfazLavaderoAutos() {
		setResizable(false);
		lavadero = new Lavadero();
		setTitle("Lavadero de Autos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panelRegistroLavadas = new PanelRegistroLavadas(this);
		panelRegistroLavadas.actualizarListaEmpleados(lavadero.getNombresEmpleados());
		contentPane.add(panelRegistroLavadas, BorderLayout.NORTH);
		
		panelInformes = new PanelInformes();
		contentPane.add(panelInformes, BorderLayout.CENTER);
	}
	
	/**
	 * Recibe el mensaje del panel de registro, reenvía la solicitud al modelo (Lavadero) y luego obtiene la información
	 * para actualizar el panel de informes
	 */
	public void registrarLavada() {
		String nombre = panelRegistroLavadas.getNombreEmpleado();
		int tipoLavada = panelRegistroLavadas.getTipoLavada();
		int tipoVehiculo = panelRegistroLavadas.getTipoVehiculo();
		
		try {
			lavadero.registrarLavadaDeVehiculo(nombre, tipoVehiculo, tipoLavada);
		} catch (LavaderoException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error: Lavadero de autos", JOptionPane.ERROR_MESSAGE);
		}
		
		panelInformes.actualizarDineroEnCaja(lavadero.getDineroEnCaja());
		panelInformes.actualizarMejorEmpleado(lavadero.getNombreMejorEmpleado());
		panelInformes.actualizarPeorEmpleado(lavadero.getNombrePeorEmpleado());
		panelInformes.actualizarTotalLavadasInterior(lavadero.getTotalLavadasDeInterior());
		panelInformes.actualizarTotalLavadasMotor(lavadero.getTotalLavadasDeMotor());
		panelInformes.actualizarTotalLavadasSencillas(lavadero.getTotalLavadasSencillas());
		
	}
}
