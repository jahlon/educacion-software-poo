package edu.udem.poo.cursos.interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class DialogoRegistroCurso extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfCodigo;
	private JTextField tfNombre;
	private JTextField tfCreditos;
	private InterfazCursosEstudiante principal;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoRegistroCurso dialog = new DialogoRegistroCurso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DialogoRegistroCurso(InterfazCursosEstudiante principal) {
		this();
		this.principal = principal;
	}
	
	/**
	 * Create the dialog.
	 */
	public DialogoRegistroCurso() {
		setTitle("Registrar curso");
		setBounds(100, 100, 450, 168);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
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
				FormFactory.DEFAULT_ROWSPEC,}));
		{
			JLabel lblCdigo = new JLabel("C\u00F3digo:");
			contentPanel.add(lblCdigo, "2, 2, right, default");
		}
		{
			tfCodigo = new JTextField();
			contentPanel.add(tfCodigo, "4, 2, fill, default");
			tfCodigo.setColumns(10);
		}
		{
			JLabel lblNombre = new JLabel("Nombre:");
			contentPanel.add(lblNombre, "2, 4, right, default");
		}
		{
			tfNombre = new JTextField();
			contentPanel.add(tfNombre, "4, 4, fill, default");
			tfNombre.setColumns(10);
		}
		{
			JLabel lblCrditos = new JLabel("Cr\u00E9ditos:");
			contentPanel.add(lblCrditos, "2, 6, right, default");
		}
		{
			tfCreditos = new JTextField();
			contentPanel.add(tfCreditos, "4, 6, fill, default");
			tfCreditos.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						registrarCurso();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void registrarCurso() {
		boolean hayErrores = false;
		String nombre = tfNombre.getText();
		String codigo = tfCodigo.getText();
		String strCreditos = tfCreditos.getText();
		int creditos = 0;
		
		String mensaje = "Los siguientes problemas ocurrieron: ";
		
		if(codigo.equals("")) {
			hayErrores = true;
			mensaje += "\n- No se ha ingresado el código";
		}
		
		if(nombre.equals("")) {
			hayErrores = true;
			mensaje += "\n- No se ha ingresado el nombre";
		}
		
		if(strCreditos.equals("")) {
			hayErrores = true;
			mensaje += "\n- No se ha ingresado el número de créditos.";
		} else {
			try {
				creditos = Integer.parseInt(strCreditos);
			} catch( NumberFormatException e  ) {
				hayErrores = true;
				mensaje += "\n- El número de créditos no tiene el formato adecuado. Debe ser un valor numérico entero";
			}
		}
		
		if( hayErrores ) {
			JOptionPane.showMessageDialog(this, mensaje, 
					"Registrar curso", JOptionPane.ERROR_MESSAGE);
		} else {
			principal.registrarCurso(codigo, nombre, creditos);
			dispose();
		}
		
	}

}
