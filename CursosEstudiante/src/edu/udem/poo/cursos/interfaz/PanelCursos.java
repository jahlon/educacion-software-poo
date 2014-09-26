package edu.udem.poo.cursos.interfaz;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class PanelCursos extends JPanel {
	private JTextField tfCodigo1;
	private JTextField tfCodigo2;
	private JTextField tfCodigo3;
	private JTextField tfCodigo4;
	private JTextField tfCodigo5;
	private JTextField tfNombre1;
	private JTextField tfNombre2;
	private JTextField tfNombre3;
	private JTextField tfNombre4;
	private JTextField tfNombre5;
	private JTextField tfCreditos1;
	private JTextField tfCreditos2;
	private JTextField tfCreditos3;
	private JTextField tfCreditos4;
	private JTextField tfCreditos5;
	private JTextField tfNota1;
	private JTextField tfNota2;
	private JTextField tfNota3;
	private JTextField tfNota4;
	private JTextField tfNota5;

	/**
	 * Create the panel.
	 */
	public PanelCursos() {
		setBorder(new TitledBorder(null, "Cursos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("50dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("50dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("30dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
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
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		add(lblCdigo, "4, 2, center, default");
		
		JLabel lblNombre = new JLabel("Nombre");
		add(lblNombre, "6, 2, center, default");
		
		JLabel lblNoCrditos = new JLabel("No. Cr\u00E9ditos");
		add(lblNoCrditos, "8, 2, center, default");
		
		JLabel lblNota = new JLabel("Nota");
		add(lblNota, "10, 2, center, default");
		
		JLabel label = new JLabel("1.");
		add(label, "2, 4, right, default");
		
		tfCodigo1 = new JTextField();
		tfCodigo1.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodigo1.setEditable(false);
		add(tfCodigo1, "4, 4, fill, default");
		tfCodigo1.setColumns(10);
		
		tfNombre1 = new JTextField();
		tfNombre1.setEditable(false);
		add(tfNombre1, "6, 4, fill, default");
		tfNombre1.setColumns(10);
		
		tfCreditos1 = new JTextField();
		tfCreditos1.setHorizontalAlignment(SwingConstants.CENTER);
		tfCreditos1.setEditable(false);
		add(tfCreditos1, "8, 4, fill, default");
		tfCreditos1.setColumns(10);
		
		tfNota1 = new JTextField();
		tfNota1.setHorizontalAlignment(SwingConstants.CENTER);
		tfNota1.setEditable(false);
		add(tfNota1, "10, 4, fill, default");
		tfNota1.setColumns(10);
		
		JButton btnRegistrarNota_1 = new JButton("Registrar Nota");
		add(btnRegistrarNota_1, "12, 4");
		
		JLabel label_1 = new JLabel("2.");
		add(label_1, "2, 6, right, default");
		
		tfCodigo2 = new JTextField();
		tfCodigo2.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodigo2.setEditable(false);
		add(tfCodigo2, "4, 6, fill, default");
		tfCodigo2.setColumns(10);
		
		tfNombre2 = new JTextField();
		tfNombre2.setEditable(false);
		add(tfNombre2, "6, 6, fill, default");
		tfNombre2.setColumns(10);
		
		tfCreditos2 = new JTextField();
		tfCreditos2.setHorizontalAlignment(SwingConstants.CENTER);
		tfCreditos2.setEditable(false);
		add(tfCreditos2, "8, 6, fill, default");
		tfCreditos2.setColumns(10);
		
		tfNota2 = new JTextField();
		tfNota2.setHorizontalAlignment(SwingConstants.CENTER);
		tfNota2.setEditable(false);
		add(tfNota2, "10, 6, fill, default");
		tfNota2.setColumns(10);
		
		JButton btnRegistrarNota_2 = new JButton("Registrar Nota");
		add(btnRegistrarNota_2, "12, 6");
		
		JLabel label_2 = new JLabel("3.");
		add(label_2, "2, 8, right, default");
		
		tfCodigo3 = new JTextField();
		tfCodigo3.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodigo3.setEditable(false);
		add(tfCodigo3, "4, 8, fill, top");
		tfCodigo3.setColumns(10);
		
		tfNombre3 = new JTextField();
		tfNombre3.setEditable(false);
		add(tfNombre3, "6, 8, fill, default");
		tfNombre3.setColumns(10);
		
		tfCreditos3 = new JTextField();
		tfCreditos3.setHorizontalAlignment(SwingConstants.CENTER);
		tfCreditos3.setEditable(false);
		add(tfCreditos3, "8, 8, fill, default");
		tfCreditos3.setColumns(10);
		
		tfNota3 = new JTextField();
		tfNota3.setHorizontalAlignment(SwingConstants.CENTER);
		tfNota3.setEditable(false);
		add(tfNota3, "10, 8, fill, default");
		tfNota3.setColumns(10);
		
		JButton btnRegistrarNota_3 = new JButton("Registrar Nota");
		add(btnRegistrarNota_3, "12, 8");
		
		JLabel label_3 = new JLabel("4.");
		add(label_3, "2, 10, right, default");
		
		tfCodigo4 = new JTextField();
		tfCodigo4.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodigo4.setEditable(false);
		add(tfCodigo4, "4, 10, fill, default");
		tfCodigo4.setColumns(10);
		
		tfNombre4 = new JTextField();
		tfNombre4.setEditable(false);
		add(tfNombre4, "6, 10, fill, default");
		tfNombre4.setColumns(10);
		
		tfCreditos4 = new JTextField();
		tfCreditos4.setHorizontalAlignment(SwingConstants.CENTER);
		tfCreditos4.setEditable(false);
		add(tfCreditos4, "8, 10, fill, default");
		tfCreditos4.setColumns(10);
		
		tfNota4 = new JTextField();
		tfNota4.setHorizontalAlignment(SwingConstants.CENTER);
		tfNota4.setEditable(false);
		add(tfNota4, "10, 10, fill, default");
		tfNota4.setColumns(10);
		
		JButton btnRegistrarNota_4 = new JButton("Registrar Nota");
		add(btnRegistrarNota_4, "12, 10");
		
		JLabel label_4 = new JLabel("5.");
		add(label_4, "2, 12, right, default");
		
		tfCodigo5 = new JTextField();
		tfCodigo5.setHorizontalAlignment(SwingConstants.CENTER);
		tfCodigo5.setEditable(false);
		add(tfCodigo5, "4, 12, fill, default");
		tfCodigo5.setColumns(10);
		
		tfNombre5 = new JTextField();
		tfNombre5.setEditable(false);
		add(tfNombre5, "6, 12, fill, default");
		tfNombre5.setColumns(10);
		
		tfCreditos5 = new JTextField();
		tfCreditos5.setHorizontalAlignment(SwingConstants.CENTER);
		tfCreditos5.setEditable(false);
		add(tfCreditos5, "8, 12, fill, default");
		tfCreditos5.setColumns(10);
		
		tfNota5 = new JTextField();
		tfNota5.setHorizontalAlignment(SwingConstants.CENTER);
		tfNota5.setEditable(false);
		add(tfNota5, "10, 12, fill, default");
		tfNota5.setColumns(10);
		
		JButton btnRegistrarNota_5 = new JButton("Registrar Nota");
		add(btnRegistrarNota_5, "12, 12");

	}

}
