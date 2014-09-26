package edu.udem.poo.lavadero.interfaz;

import javax.swing.JPanel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import edu.udem.poo.lavadero.mundo.Empleado;
import edu.udem.poo.lavadero.mundo.Lavadero;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase que representa el panel donde se ingresa la información para registrar una lavada
 * @author jehincapie
 *
 */
public class PanelRegistroLavadas extends JPanel {
	
	/**
	 * Agrupa los botones de tipo de vehículo
	 */
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Agrupa los botones de opciones de tipo de lavada
	 */
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	/**
	 * Lista desplegable donde se cargan los nombres de los empleados
	 */
	private JComboBox<String> cbNombreEmpleado;
	
	/**
	 * Radio button para la opción de tipo de vehículo normal
	 */
	private JRadioButton rdbtnNormal;
	
	/**
	 * Radio button para la opción de tipo de vehículo camioneta
	 */
	private JRadioButton rdbtnCamioneta;
	
	/**
	 * Radio button para la opción de tipo de lavada sencilla
	 */
	private JRadioButton rdbtnSencilla;
	
	/**
	 * Radio button para la opción de tipo de lavada de interior
	 */
	private JRadioButton rdbtnInteiror;
	
	/**
	 * Radio button para la opción de tipo de lavada de motor
	 */
	private JRadioButton rdbtnMotor;
	
	/**
	 * Instancia de la clase InterfazLaveroAutos. Representa el controlador de la aplicación
	 */
	private InterfazLavaderoAutos principal;
	
	/**
	 * Crea el panel llamando al otro constructor, e inicializa la instancia del controlador de la aplicación
	 * @param principal Instancia del ventana principal (controlador de la aplicación)
	 */
	public PanelRegistroLavadas(InterfazLavaderoAutos principal) {
		this();
		this.principal = principal;
	}
	
	/**
	 * Create the panel.
	 */
	public PanelRegistroLavadas() {
		setBorder(new TitledBorder(null, "Registro de lavadas", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(47dlu;min)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,}));
		
		JLabel lblEmpleado = new JLabel("Empleado:");
		add(lblEmpleado, "2, 2, right, default");
		
		cbNombreEmpleado = new JComboBox();
		add(cbNombreEmpleado, "4, 2, fill, default");
		
		JLabel lblTipoDeVehculo = new JLabel("Tipo de veh\u00EDculo:");
		add(lblTipoDeVehculo, "2, 4, right, default");
		
		JPanel panel = new JPanel();
		add(panel, "4, 4, fill, default");
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setSelected(true);
		buttonGroup.add(rdbtnNormal);
		panel.add(rdbtnNormal);
		
		rdbtnCamioneta = new JRadioButton("Camioneta");
		buttonGroup.add(rdbtnCamioneta);
		panel.add(rdbtnCamioneta);
		
		JLabel lblTipoDeLavada = new JLabel("Tipo de lavada:");
		add(lblTipoDeLavada, "2, 6, right, default");
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		add(panel_1, "4, 6, fill, fill");
		
		rdbtnSencilla = new JRadioButton("Sencilla");
		rdbtnSencilla.setSelected(true);
		buttonGroup_1.add(rdbtnSencilla);
		panel_1.add(rdbtnSencilla);
		
		rdbtnInteiror = new JRadioButton("Interior");
		buttonGroup_1.add(rdbtnInteiror);
		panel_1.add(rdbtnInteiror);
		
		rdbtnMotor = new JRadioButton("Motor");
		buttonGroup_1.add(rdbtnMotor);
		panel_1.add(rdbtnMotor);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, "2, 8, 3, 1, fill, fill");
		
		JButton btnRegistrarLavada = new JButton("Registrar lavada");
		btnRegistrarLavada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principal.registrarLavada();
			}
		});
		panel_2.add(btnRegistrarLavada);

	}
	
	/**
	 * Devuelve el nombre del empleado seleccionado en la lista del panel
	 * @return String con el nombre del empleado
	 */
	public String getNombreEmpleado() {
		return cbNombreEmpleado.getSelectedItem().toString();
	}
	
	/**
	 * Actualiza la lista desplegable con los nombre de los empleados
	 * @param nombres Arreglo de String que contiene los nombres de los empleados
	 */
	public void actualizarListaEmpleados(String[] nombres) {
		cbNombreEmpleado.setModel(new DefaultComboBoxModel<String>(nombres));
	}
	
	/**
	 * Devuelve el tipo de vehiculo seleccionado en el panel
	 * @return int que puede ser una de dos opciones: Lavadero.TIPO_NORMAL ó Lavadero.TIPO_CAMIONETA
	 */
	public int getTipoVehiculo() {
		if(rdbtnNormal.isSelected()) {
			return Lavadero.TIPO_NORMAL; 
		}
		
		return Lavadero.TIPO_CAMIONETA;
	}
	
	/**
	 * Devuelve el tipo de lavada seleccionada en el panel
	 * @return int que puede ser una de tres opciones: Empleado.LAVADA_SENCILLA, Empleado.LAVADA_INTERIOR o Empleado.LAVADA_MOTOR
	 */
	public int getTipoLavada() {
		if(rdbtnSencilla.isSelected()) {
			return Empleado.LAVADA_SENCILLA;
		} else if (rdbtnInteiror.isSelected()) {
			return Empleado.LAVADA_INTERIOR;
		} else {
			return Empleado.LAVADA_MOTOR;
		}
	}

}
