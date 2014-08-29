package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class PanelResultados extends JPanel {
	private JTextField tfPromedioAmarillas;
	private JTextField tfPromedioRojas;
	private JTextField tfGolesPorAsistencia;

	/**
	 * Create the panel.
	 */
	public PanelResultados() {
		setBorder(new TitledBorder(null, "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(3, 2, 5, 5));
		
		JLabel lblPromedioTarjetasAmarillas = new JLabel("Promedio tarjetas amarillas");
		add(lblPromedioTarjetasAmarillas);
		
		tfPromedioAmarillas = new JTextField();
		tfPromedioAmarillas.setEditable(false);
		add(tfPromedioAmarillas);
		tfPromedioAmarillas.setColumns(10);
		
		JLabel lblPromedioTarjetasRojas = new JLabel("Promedio tarjetas rojas");
		add(lblPromedioTarjetasRojas);
		
		tfPromedioRojas = new JTextField();
		tfPromedioRojas.setEditable(false);
		add(tfPromedioRojas);
		tfPromedioRojas.setColumns(10);
		
		JLabel lblGolesAsistencias = new JLabel("Goles / asistencias");
		add(lblGolesAsistencias);
		
		tfGolesPorAsistencia = new JTextField();
		tfGolesPorAsistencia.setEditable(false);
		add(tfGolesPorAsistencia);
		tfGolesPorAsistencia.setColumns(10);

	}
	
	public void refrescarResultados(double promedioAmarillas, double promedioRojas, 
									double relacionGolesAsistencias) {
		tfPromedioAmarillas.setText(Double.toString(promedioAmarillas));
		tfPromedioRojas.setText(Double.toString(promedioRojas));
		if(relacionGolesAsistencias < 0)
			tfGolesPorAsistencia.setText("N/A");
		else
			tfGolesPorAsistencia.setText(Double.toString(relacionGolesAsistencias));
	}

}
