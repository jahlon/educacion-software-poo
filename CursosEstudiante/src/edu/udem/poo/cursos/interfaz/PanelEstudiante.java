package edu.udem.poo.cursos.interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class PanelEstudiante extends JPanel {
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JTextField tfCodigo;
	private JTextField tfPromedio;
	private InterfazCursosEstudiante principal;
	
	public PanelEstudiante(InterfazCursosEstudiante principal) {
		this();
		this.principal = principal;
	}
	
	/**
	 * Create the panel.
	 */
	public PanelEstudiante() {
		setBorder(new TitledBorder(null, "Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblNombre = new JLabel("Nombre:");
		add(lblNombre, "2, 2, right, default");
		
		tfNombre = new JTextField();
		tfNombre.setEditable(false);
		add(tfNombre, "4, 2, fill, default");
		tfNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		add(lblApellidos, "2, 4, right, default");
		
		tfApellidos = new JTextField();
		tfApellidos.setEditable(false);
		add(tfApellidos, "4, 4, fill, default");
		tfApellidos.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		add(lblCdigo, "2, 6, right, default");
		
		tfCodigo = new JTextField();
		tfCodigo.setEditable(false);
		add(tfCodigo, "4, 6, fill, default");
		tfCodigo.setColumns(10);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		add(lblPromedio, "2, 8, right, default");
		
		tfPromedio = new JTextField();
		tfPromedio.setEditable(false);
		add(tfPromedio, "4, 8, fill, default");
		tfPromedio.setColumns(10);
		
		JPanel panel = new JPanel();
		add(panel, "1, 10, 4, 1, fill, fill");
		
		JButton btnRegistrarEstudiante = new JButton("Registrar estudiante");
		btnRegistrarEstudiante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnRegistrarEstudiante);
		
		JButton btnRegistrarCurso = new JButton("Registrar curso");
		btnRegistrarCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnRegistrarCurso);

	}
	
	public void actualizarEstudiante(String nombre, String apellido, long codigo) {
		tfNombre.setText(nombre);
		tfApellidos.setText(apellido);
		tfCodigo.setText(Long.toString(codigo));
	}
	
	public void actualizarPromedio(double promedio) {
		tfPromedio.setText(Double.toString(promedio));
	}

}
