package edu.udem.poo.lavadero.interfaz;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Esta clase representa el panel donde se muestran los informes del programa
 * @author jehincapie
 *
 */
public class PanelInformes extends JPanel {
	/**
	 * Campo de texto para mostrar el mejor empleado
	 */
	private JTextField tfMejorEmpleado;
	
	/**
	 * Campo de texto para mostrar el peor empleado
	 */
	private JTextField tfPeorEmpleado;
	
	/**
	 * Campo de texto para mostrar el total de lavadas sencillas
	 */
	private JTextField tfLavadasSencillas;
	
	/**
	 * Campo de texto para mostrar el total de lavadas de interior
	 */
	private JTextField tfLavadasInterior;
	
	/**
	 * Campo de texto para mostrar el total de lavadas de motor
	 */
	private JTextField tfLavadasMotor;
	
	/**
	 * Campo de texto para mostrar el dinero en caja
	 */
	private JTextField tfDineroEnCaja;

	/**
	 * Create the panel.
	 */
	public PanelInformes() {
		setBorder(new TitledBorder(null, "Informes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblMejorEmpleado = new JLabel("Mejor empleado:");
		add(lblMejorEmpleado, "2, 2, right, default");
		
		tfMejorEmpleado = new JTextField();
		tfMejorEmpleado.setEditable(false);
		add(tfMejorEmpleado, "4, 2, fill, default");
		tfMejorEmpleado.setColumns(10);
		
		JLabel lblPeorEmpleado = new JLabel("Peor empleado:");
		add(lblPeorEmpleado, "2, 4, right, default");
		
		tfPeorEmpleado = new JTextField();
		tfPeorEmpleado.setEditable(false);
		add(tfPeorEmpleado, "4, 4, fill, top");
		tfPeorEmpleado.setColumns(10);
		
		JLabel lblTotalLavadasSencillas = new JLabel("Total lavadas sencillas:");
		add(lblTotalLavadasSencillas, "2, 6, right, default");
		
		tfLavadasSencillas = new JTextField();
		tfLavadasSencillas.setEditable(false);
		add(tfLavadasSencillas, "4, 6, fill, default");
		tfLavadasSencillas.setColumns(10);
		
		JLabel lblTotalLavadasDe = new JLabel("Total lavadas de interior:");
		add(lblTotalLavadasDe, "2, 8, right, default");
		
		tfLavadasInterior = new JTextField();
		tfLavadasInterior.setEditable(false);
		add(tfLavadasInterior, "4, 8, fill, default");
		tfLavadasInterior.setColumns(10);
		
		JLabel lblTotalLavadasDe_1 = new JLabel("Total lavadas de motor:");
		add(lblTotalLavadasDe_1, "2, 10, right, default");
		
		tfLavadasMotor = new JTextField();
		tfLavadasMotor.setEditable(false);
		add(tfLavadasMotor, "4, 10, fill, top");
		tfLavadasMotor.setColumns(10);
		
		JLabel lblDineroEnCaja = new JLabel("Dinero en caja:");
		add(lblDineroEnCaja, "2, 12, right, default");
		
		tfDineroEnCaja = new JTextField();
		tfDineroEnCaja.setEditable(false);
		add(tfDineroEnCaja, "4, 12, fill, top");
		tfDineroEnCaja.setColumns(10);

	}
	
	/**
	 * Actualiza un campo del panel con el nombre del mejor empleado
	 * @param nombre String nombre del mejor empleado
	 */
	public void actualizarMejorEmpleado(String nombre) {
		tfMejorEmpleado.setText(nombre);
	}
	
	/**
	 * Actualiza un campo del panel con el nombre del peor empleado 
	 * @param nombre String nombre del peor empleado
	 */
	public void actualizarPeorEmpleado(String nombre) {
		tfPeorEmpleado.setText(nombre);
	}
	
	/**
	 * Actualiza un campo del panel con el número total del lavadas sencillas
	 * @param lavadasSencillas int el número de lavadas sencillas
	 */
	public void actualizarTotalLavadasSencillas(int lavadasSencillas) {
		tfLavadasSencillas.setText(Integer.toString(lavadasSencillas));
	}
	
	/**
	 * Actualiza un campo del panel con el número total de lavadas de interior
	 * @param lavadasInterior int el número de lavadas de interior
	 */
	public void actualizarTotalLavadasInterior(int lavadasInterior) {
		tfLavadasInterior.setText(Integer.toString(lavadasInterior));
	}
	
	/**
	 * Actualiza un campo con el número total de lavadas de motor
	 * @param lavadasMotor int el número de lavadas de motor
	 */
	public void actualizarTotalLavadasMotor(int lavadasMotor) {
		tfLavadasMotor.setText(Integer.toString(lavadasMotor));
	}
	
	/**
	 * Actualiza un campo con el total de dinero en caja
	 * @param dinero double total de dinero en caja del lavadero
	 */
	public void actualizarDineroEnCaja(double dinero) {
		tfDineroEnCaja.setText(Double.toString(dinero));
	}

}
