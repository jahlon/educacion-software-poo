package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Equipo;
import dominio.EquipoException;
import dominio.Jugador;


/**
 * Esta clase representa la ventana principal de la aplicación
 * @author chucho
 */
public class InterfazEstadisticasEquipo extends JFrame {
	
	/**
	 * Panel contenedor de todos los componentes de la ventana
	 */
	private JPanel contentPane;
	
	/**
	 * Panel superior de la aplicación donde se registran las estadísticas del jugador
	 */
	private PanelJugador panelJugador;
	
	/**
	 * Panel medio de la aplicación donde se muestran algunos resultados
	 */
	private PanelResultados panelResultados;
	
	/**
	 * Panel inferior de la aplicación donde se pueden comparar dos jugadores del equipo
	 */
	private PanelComparacion panelComparacion;
	
	/**
	 * Representa el concepto de dominio que se refiere al equipo de microfútbol
	 */
	private Equipo equipo;

	/**
	 * Punto de entrada para la ejecución de la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazEstadisticasEquipo frame = new InterfazEstadisticasEquipo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crea la ventana principal
	 */
	public InterfazEstadisticasEquipo() {
		setResizable(false);
		equipo = new Equipo();
		setTitle("Estadisticas Equipo Microfútbol");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panelJugador = new PanelJugador(this);
		contentPane.add(panelJugador, BorderLayout.NORTH);
		
		panelResultados = new PanelResultados();
		contentPane.add(panelResultados, BorderLayout.CENTER);
		
		panelComparacion = new PanelComparacion(this);
		contentPane.add(panelComparacion, BorderLayout.SOUTH);
		
		panelJugador.cargarJugadores(equipo.getNombresJugadores());
		panelComparacion.cargarJugadores(equipo.getNombresJugadores());
	}
	
	/**
	 * Método que corresponde al requisito funcional de registra las estadísticas de un jugador
	 */
	public void registrarEstadisticaJugador() {
		try{
			int numero = panelJugador.getJugador();
			int goles = Integer.parseInt(panelJugador.getGoles());
			int asistencias = Integer.parseInt(panelJugador.getAsistencias());
			int amarillas = Integer.parseInt(panelJugador.getTarjetasAmarillas());
			int rojas = Integer.parseInt(panelJugador.getTarjetasRojas());
			
			equipo.agregarRegistroJugador(numero, goles, asistencias, amarillas, rojas);
			
			panelResultados.refrescarResultados(equipo.calcularPromedioAmarillas(), 
					equipo.calcularPromedioRojas(),
					equipo.calcularRelacionGolesAsistencias());
			
			panelJugador.limpiar();
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Los datos ingresados deben ser enteros", "Equipo Microfútbol", JOptionPane.ERROR_MESSAGE);
		}catch(EquipoException e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Equipo Microfútbol", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Este método hace parte del requisito funcional de comparar dos jugadores; en él se selecciona
	 * el primer jugador para la comparación y se carga su información.
	 */
	public void seleccionarPrimerJugadorParaComparacion() {
		int numeroJugador = panelComparacion.getPrimerJugador();
		Jugador jugador = equipo.getJugador(numeroJugador);
		if(jugador != null) {
			panelComparacion.refrescarPrimerJugador(jugador.getTotalGoles(), 
												jugador.getTotalAsistencias(),
												jugador.getTotalTajetasAmarillas(),
												jugador.getTotalTarjetasRojas());
		}
	}
	
	/**
	 * Este método hace parte del requisito funcional de comparar dos jugadores; en él se selecciona
	 * el segundo jugador para la comparación y se carga su información.
	 */
	public void seleccionarSegundoJugadorParaComparacion() {
		int numeroJugador = panelComparacion.getSegundoJugador();
		Jugador jugador = equipo.getJugador(numeroJugador);
		if( jugador != null ) {
			panelComparacion.refrescarSegundoJugador(jugador.getTotalGoles(), 
												jugador.getTotalAsistencias(),
												jugador.getTotalTajetasAmarillas(),
												jugador.getTotalTarjetasRojas());
		}
	}
}
