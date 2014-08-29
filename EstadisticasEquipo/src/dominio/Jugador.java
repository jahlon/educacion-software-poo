package dominio;

/**
 * Esta clase representa a un jugador que pertenece al equipo de microfútbol
 * @author Jesús Andrés Hincapié Londoño
 */
public class Jugador {
	
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
	
	/**
	 * Crear un nuevo jugador con el número y el nombre especificado
	 * @param numero entero que indica el número del jugador
	 * @param nombre String que indica el nombre del jugador
	 */
	public Jugador(int numero, String nombre) {
		this.numero = numero;
		this.nombre = nombre;
	}
	
	/**
	 * Agrega un registro estadístico del jugador
	 * 
	 * @param goles
	 * @param asistencias
	 * @param tarjetasAmarillas
	 * @param tarjetasRojas
	 */
	public void agregarRegistro(int goles, int asistencias, int tarjetasAmarillas, int tarjetasRojas) {
		totalGoles += goles;
		totalAsistencias += asistencias;
		totalTajetasAmarillas += tarjetasAmarillas;
		totalTarjetasRojas += tarjetasRojas;
	}
	
	/**
	 * Retorna el número del jugador
	 * @return numero del jugador
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * Retorna el nombre del jugador
	 * @return nombre del jugador
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Retorna el número total de goles marcado por el jugador
	 * @return total de goles marcados
	 */
	public int getTotalGoles() {
		return totalGoles;
	}
	
	/**
	 * Retorna el número total de asistencias hechas por el jugador
	 * @return total de asistencias hechas
	 */
	public int getTotalAsistencias() {
		return totalAsistencias;
	}
	
	/**
	 * Retorna el número total de tarjetas amarillas recibidas por el jugador
	 * @return total de tarjetas amarillas
	 */
	public int getTotalTajetasAmarillas() {
		return totalTajetasAmarillas;
	}
	
	/**
	 * Retorna el número total de tarjetas rojas recibidas por el jugador
	 * @return total de tarjetas rojas
	 */
	public int getTotalTarjetasRojas() {
		return totalTarjetasRojas;
	}
}
