package dominio;

/**
 * Esta clase representa a un jugador que pertenece al equipo de microfútbol
 * @author Jesús Andrés Hincapié Londoño
 */
public class Jugador {
	
	//-----------------------------------------------------
	// Atributos
	//-----------------------------------------------------
	
	/**
	 * El número del jugador
	 */
	private int numero;
	
	/**
	 * El nombre del jugador
	 */
	private String nombre;
	
	/**
	 * El total de goles anotados por el jugador
	 */
	private int totalGoles;
	
	/**
	 * El total de asistencias hechas por el jugador
	 */
	private int totalAsistencias;
	
	/**
	 * El total de tarjetas amarillas recibidas por el jugador
	 */
	private int totalTajetasAmarillas;
	
	/**
	 * El total de tarjetas rojas recibidas por el jugador
	 */
	private int totalTarjetasRojas;
	
	//-----------------------------------------------------
	// Constructores
	//-----------------------------------------------------
	
	/**
	 * Constructor de un nuevo jugador. <br>
	 * Crear un nuevo jugador con el número y el nombre especificado
	 * @param numero entero que indica el número del jugador. numero > 0
	 * @param nombre String que indica el nombre del jugador
	 */
	public Jugador(int numero, String nombre) {
		// TODO: Completar el método de creación del objeto
	}
	
	//-----------------------------------------------------
	// Métodos
	//-----------------------------------------------------
	
	/**
	 * Agrega un registro estadístico del jugador
	 * 
	 * @param goles los goles por ej jugador anotados en el partido. goles >= 0
	 * @param asistencias las asistencias hechas por el jugador en el partido. asistencias >= 0
	 * @param tarjetasAmarillas las tarjetas amarillas recibidas por el jugador en el partido. tarjetasAmarillas >= 0 y tarjetasRojas <= 2
	 * @param tarjetasRojas las tarjetas rojas recibidas por el jugador en el partido. tajetasRojas >= 0 y tarjetasRojas <= 1
	 */
	public void agregarRegistro(int goles, int asistencias, int tarjetasAmarillas, int tarjetasRojas) {
		// TODO: Completar el método según la documentación
	}
	
	/**
	 * Retorna el número del jugador
	 * @return numero del jugador
	 */
	// TODO: Construir el método según la documentación
	
	/**
	 * Retorna el nombre del jugador
	 * @return nombre del jugador
	 */
	// TODO: Construir el método según la documentación
	
	/**
	 * Retorna el número total de goles marcado por el jugador
	 * @return total de goles marcados
	 */
	// TODO: Construir el método según la documentación
	
	/**
	 * Retorna el número total de asistencias hechas por el jugador
	 * @return total de asistencias hechas
	 */
	// TODO: Construir el método según la documentación
	
	/**
	 * Retorna el número total de tarjetas amarillas recibidas por el jugador
	 * @return total de tarjetas amarillas
	 */
	// TODO: Construir el método según la documentación
	
	/**
	 * Retorna el número total de tarjetas rojas recibidas por el jugador
	 * @return total de tarjetas rojas
	 */
	public int getTotalTarjetasRojas() {
		return totalTarjetasRojas;
	}
}
