package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelComparacion extends JPanel implements ItemListener {
	
	public static final String ACCION_JUGADOR_1 = "JUGADOR1";
	public static final String ACCION_JUGADOR_2 = "JUGADOR2";
	
	private JTextField tfGoles1;
	private JTextField tfGoles2;
	private JTextField tfAsistencias1;
	private JTextField tfAsistencias2;
	private JTextField tfAmarillas1;
	private JTextField tfAmarillas2;
	private JTextField tfRojas1;
	private JTextField tfRojas2;
	private JComboBox<String> cbPrimerJugador;
	private JComboBox<String> cbSegundoJugador;
	
	private InterfazEstadisticasEquipo principal;
	
	public PanelComparacion( InterfazEstadisticasEquipo principal ) {
		this();
		this.principal = principal;
	}
	
	/**
	 * Create the panel.
	 */
	public PanelComparacion() {
		setBorder(new TitledBorder(null, "Comparaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new BorderLayout(0, 5));
		
		JPanel panelJugadores = new JPanel();
		add(panelJugadores, BorderLayout.NORTH);
		panelJugadores.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblPrimerJugador = new JLabel("Primer jugador");
		panelJugadores.add(lblPrimerJugador);
		
		JLabel lblSegundoJugador = new JLabel("Segundo jugador");
		panelJugadores.add(lblSegundoJugador);
		
		cbPrimerJugador = new JComboBox<String>();
		cbPrimerJugador.setActionCommand(ACCION_JUGADOR_1);
		cbPrimerJugador.addItemListener(this);
		panelJugadores.add(cbPrimerJugador);
		
		cbSegundoJugador = new JComboBox<String>();
		cbSegundoJugador.addItemListener(this);
		cbSegundoJugador.setActionCommand(ACCION_JUGADOR_2);
		panelJugadores.add(cbSegundoJugador);
		
		JPanel panelDatos = new JPanel();
		add(panelDatos, BorderLayout.CENTER);
		panelDatos.setLayout(new GridLayout(4, 4, 2, 5));
		
		JLabel lblGoles1 = new JLabel("Goles");
		panelDatos.add(lblGoles1);
		
		tfGoles1 = new JTextField();
		tfGoles1.setEditable(false);
		panelDatos.add(tfGoles1);
		tfGoles1.setColumns(10);
		
		JLabel lblGoles2 = new JLabel("Goles");
		panelDatos.add(lblGoles2);
		
		tfGoles2 = new JTextField();
		tfGoles2.setEditable(false);
		panelDatos.add(tfGoles2);
		tfGoles2.setColumns(10);
		
		JLabel lblAsistencias1 = new JLabel("Asistencias");
		panelDatos.add(lblAsistencias1);
		
		tfAsistencias1 = new JTextField();
		tfAsistencias1.setEditable(false);
		panelDatos.add(tfAsistencias1);
		tfAsistencias1.setColumns(10);
		
		JLabel lblAsistencias2 = new JLabel("Asistencias");
		panelDatos.add(lblAsistencias2);
		
		tfAsistencias2 = new JTextField();
		tfAsistencias2.setEditable(false);
		panelDatos.add(tfAsistencias2);
		tfAsistencias2.setColumns(10);
		
		JLabel lblAmarillas1 = new JLabel("Amarillas");
		panelDatos.add(lblAmarillas1);
		
		tfAmarillas1 = new JTextField();
		tfAmarillas1.setEditable(false);
		panelDatos.add(tfAmarillas1);
		tfAmarillas1.setColumns(10);
		
		JLabel lblAmarillas2 = new JLabel("Amarillas");
		panelDatos.add(lblAmarillas2);
		
		tfAmarillas2 = new JTextField();
		tfAmarillas2.setEditable(false);
		panelDatos.add(tfAmarillas2);
		tfAmarillas2.setColumns(10);
		
		JLabel lblRojas1 = new JLabel("Rojas");
		panelDatos.add(lblRojas1);
		
		tfRojas1 = new JTextField();
		tfRojas1.setEditable(false);
		panelDatos.add(tfRojas1);
		tfRojas1.setColumns(10);
		
		JLabel lblRojas2 = new JLabel("Rojas");
		panelDatos.add(lblRojas2);
		
		tfRojas2 = new JTextField();
		tfRojas2.setEditable(false);
		panelDatos.add(tfRojas2);
		tfRojas2.setColumns(10);

	}
	
	public void cargarJugadores(String[] nombresJugadores) {
		cbPrimerJugador.setModel(new DefaultComboBoxModel<String>(nombresJugadores));
		cbSegundoJugador.setModel(new DefaultComboBoxModel<String>(nombresJugadores));
		
		cbPrimerJugador.setSelectedItem(null);
		cbSegundoJugador.setSelectedItem(null);
		
	}
	
	public int getPrimerJugador() {
		return cbPrimerJugador.getSelectedIndex() + 1;
	}
	
	public int getSegundoJugador() {
		return cbSegundoJugador.getSelectedIndex() + 1;
	}
	
	public void refrescarPrimerJugador(int goles, int asistencias, int amarillas, int rojas) {
		tfGoles1.setText(Integer.toString(goles));
		tfAsistencias1.setText(Integer.toString(asistencias));
		tfAmarillas1.setText(Integer.toString(amarillas));
		tfRojas1.setText(Integer.toString(rojas));
	}
	
	public void refrescarSegundoJugador(int goles, int asistencias, int amarillas, int rojas) {
		tfGoles2.setText(Integer.toString(goles));
		tfAsistencias2.setText(Integer.toString(asistencias));
		tfAmarillas2.setText(Integer.toString(amarillas));
		tfRojas2.setText(Integer.toString(rojas));
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if( e.getSource().equals(cbPrimerJugador) ) {
			principal.seleccionarPrimerJugadorParaComparacion();
		}else if( e.getSource().equals(cbSegundoJugador) ) {
			principal.seleccionarSegundoJugadorParaComparacion();
		}
	}
}
