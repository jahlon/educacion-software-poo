package edu.udem.poo.cursos.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InterfazCursosEstudiante extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCursosEstudiante frame = new InterfazCursosEstudiante();
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
	public InterfazCursosEstudiante() {
		setResizable(false);
		setTitle("Cursos estudiante");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		PanelEstudiante panelEstudiante = new PanelEstudiante();
		contentPane.add(panelEstudiante, BorderLayout.NORTH);
		
		PanelCursos panelCursos = new PanelCursos();
		contentPane.add(panelCursos, BorderLayout.CENTER);
	}

	public void registrarEstudiante(String nombre, String apellido, long codigo) {
		// TODO Auto-generated method stub
		
	}

	public void registrarCurso(String codigo, String nombre, int creditos) {
		// TODO Auto-generated method stub
		
	}

}
