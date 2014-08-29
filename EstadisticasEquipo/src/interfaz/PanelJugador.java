package interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class PanelJugador extends JPanel implements ActionListener {
	
	public static final String ACCION_AGREGAR = "AGREGAR";
	
	private JTextField tfGoles;
	private JTextField tfAsistencias;
	private JTextField tfAmarillas;
	private JTextField tfRojas;
	private JButton btnAgregarRegistro;
	private JComboBox<String> cbJugador;
	
	private InterfazEstadisticasEquipo principal;
	
	public PanelJugador( InterfazEstadisticasEquipo principal ) {
		this();
		this.principal = principal;
	}
	
	/**
	 * Create el panel
	 */
	public PanelJugador() {
		setBorder(new TitledBorder(null, "Registro de estad\u00EDsticas", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(6, 2, 5, 5));
		
		JLabel lblJugador = new JLabel("Jugador");
		add(lblJugador);
		
		cbJugador = new JComboBox<String>();
		add(cbJugador);
		
		JLabel lblGolesAnotados = new JLabel("Goles anotados");
		add(lblGolesAnotados);
		
		tfGoles = new JTextField();
		add(tfGoles);
		tfGoles.setColumns(10);
		
		JLabel lblAsistenciasHechas = new JLabel("Asistencias hechas");
		add(lblAsistenciasHechas);
		
		tfAsistencias = new JTextField();
		add(tfAsistencias);
		tfAsistencias.setColumns(10);
		
		JLabel lblTarjetasAmarillas = new JLabel("Tarjetas amarillas");
		add(lblTarjetasAmarillas);
		
		tfAmarillas = new JTextField();
		add(tfAmarillas);
		tfAmarillas.setColumns(10);
		
		JLabel lblTarjetasRojas = new JLabel("Tarjetas rojas");
		add(lblTarjetasRojas);
		
		tfRojas = new JTextField();
		add(tfRojas);
		tfRojas.setColumns(10);
		
		JLabel label = new JLabel("");
		add(label);
		
		btnAgregarRegistro = new JButton("Agregar registro");
		btnAgregarRegistro.setActionCommand(ACCION_AGREGAR);
		btnAgregarRegistro.addActionListener(this);
		add(btnAgregarRegistro);

	}
	
	public void cargarJugadores(String[] nombresJugadores) {
		cbJugador.setModel(new DefaultComboBoxModel<String>(nombresJugadores));
		cbJugador.setSelectedItem(null);
	}
	
	public void limpiar() {
		cbJugador.setSelectedItem(null);
		tfGoles.setText("");
		tfAsistencias.setText("");
		tfAmarillas.setText("");
		tfRojas.setText("");
	}
	
	public int getJugador() {
		return cbJugador.getSelectedIndex() + 1;
	}
	
	public String getGoles() {
		return tfGoles.getText();
	}
	
	public String getAsistencias() {
		return tfAsistencias.getText();
	}
	
	public String getTarjetasAmarillas() {
		return tfAmarillas.getText();
	}
	
	public String getTarjetasRojas() {
		return tfRojas.getText();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(ACCION_AGREGAR)) {
			principal.registrarEstadisticaJugador();
		}
	}	
}
