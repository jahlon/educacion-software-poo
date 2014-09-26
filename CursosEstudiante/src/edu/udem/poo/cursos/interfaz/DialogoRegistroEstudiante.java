package edu.udem.poo.cursos.interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoRegistroEstudiante extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JTextField tfCodigo;
	private InterfazCursosEstudiante principal;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoRegistroEstudiante dialog = new DialogoRegistroEstudiante();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DialogoRegistroEstudiante(InterfazCursosEstudiante principal) {
		this();
		this.principal = principal;
	}
	
	/**
	 * Create the dialog.
	 */
	public DialogoRegistroEstudiante() {
		setTitle("Registrar estudiante");
		setBounds(100, 100, 450, 164);
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
			JLabel lblNombre = new JLabel("Nombre:");
			contentPanel.add(lblNombre, "2, 2, right, default");
		}
		{
			tfNombre = new JTextField();
			contentPanel.add(tfNombre, "4, 2, fill, default");
			tfNombre.setColumns(10);
		}
		{
			JLabel lblApellidos = new JLabel("Apellidos:");
			contentPanel.add(lblApellidos, "2, 4, right, default");
		}
		{
			tfApellidos = new JTextField();
			contentPanel.add(tfApellidos, "4, 4, fill, default");
			tfApellidos.setColumns(10);
		}
		{
			JLabel lblCodigo = new JLabel("Codigo:");
			contentPanel.add(lblCodigo, "2, 6, right, default");
		}
		{
			tfCodigo = new JTextField();
			contentPanel.add(tfCodigo, "4, 6, fill, default");
			tfCodigo.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						registrarEstudiante();
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
	
	public void registrarEstudiante() {
		boolean hayErrores = false;
		String nombre = tfNombre.getText();
		String apellido = tfApellidos.getText();
		String strCodigo = tfCodigo.getText();
		long codigo = 0L;
		
		String mensaje = "Los siguientes problemas ocurrieron: ";
		
		if(nombre.equals("")) {
			hayErrores = true;
			mensaje += "\n- No se ha ingresado el nombre";
		}
		
		if(apellido.equals("")) {
			hayErrores = true;
			mensaje += "\n- No se ha ingresado el apellido";
		}
		
		if(strCodigo.equals("")) {
			hayErrores = true;
			mensaje += "\n- No se ha ingresado el código.";
		} else {
			try {
				codigo = Long.parseLong(strCodigo);
			} catch( NumberFormatException e  ) {
				hayErrores = true;
				mensaje += "\n- El código no tiene el formato adecuado. Debe ser un valor numérico";
			}
		}
		
		if( hayErrores ) {
			JOptionPane.showMessageDialog(this, mensaje, 
					"Registrar estudiante", JOptionPane.ERROR_MESSAGE);
		} else {
			principal.registrarEstudiante(nombre, apellido, codigo);
			dispose();
		}
		
		
	}
	
	

}
