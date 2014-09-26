package dominio;

/**
 * Clase que representa al equipo de microfútbol
 * @author Jesús Andrés Hincapié Londoño
 */
public class Equipo {
	
	//-----------------------------------------------------
	// Constantes
	//-----------------------------------------------------
	
	/**
	 * Constante que contiene el nombre del primer jugador
	 */
	public static final String NOMBRE_1= "Pedro";
	
	/**
	 * Constante que contiene el nombre del segundo jugador
	 */
	public static final String NOMBRE_2= "Luis";
	
	/**
	 * Constante que contiene el nombre del tercer jugador
	 */
	public static final String NOMBRE_3= "Juan";
	
	/**
	 * Constante que contiene el nombre del cuarto jugador
	 */
	public static final String NOMBRE_4= "Andres";
	
	/**
	 * Constante que contiene el nombre del quinto jugador
	 */
	public static final String NOMBRE_5= "Rómulo";
	
	/**
	 * Constante que contiene el número del primer jugador
	 */
	public static final int N_1 = 1;
	
	/**
	 * Constante que contiene el número del segundo jugador
	 */
	public static final int N_2 = 2;
	
	/**
	 * Constante que contiene el número del tercer jugador
	 */
	public static final int N_3 = 3;
	
	/**
	 * Constante que contiene el número del cuarto jugador
	 */
	public static final int N_4 = 4;
	
	/**
	 * Constante que contiene el número del quinto jugador
	 */
	public static final int N_5 = 5;
	
	/**
	 * Constante que contiene el número total de jugadores del equipo
	 */
	public static final int NUMERO_JUGADORES = 5;
	
	//-----------------------------------------------------
	// Atributos
	//-----------------------------------------------------
	
	/**
	 * Representa el primer jugador
	 */
	private Jugador jugador1;
	
	// TODO: Declarar los atributos para modelar los demás jugadores
	
	/**
	 * Construye un objeto de la clase Equipo, creando los jugadores que lo conforman
	 */
	public Equipo() {
		jugador1 = new Jugador(N_1, NOMBRE_1);
		// TODO: Crear los objetos correspondientes a los demás jugadores
	}
	
	/**
	 * Retorn un arreglo con los nombres de los jugadores del equipo
	 * @return Arreglo de String con los nombres de los jugadores del equipo
	 */
	public String[] getNombresJugadores() {
		return new String[] {NOMBRE_1,NOMBRE_2,NOMBRE_3,NOMBRE_4,NOMBRE_5};
	}
	
	/**
	 * Agrega un registro de un jugador al equipo
	 * @param numero entero que represetan el número del jugador al cual se le quiere agregar el registro
	 * @param goles número entero que indica la cantidad de goles
	 * @param asistencias número entero que indica la cantidad de asistencias
	 * @param amarillas número entrero que indica la cantidad de tarjetas amarillas
	 * @param rojas número entero que indica la cantidad de tarjetas rojas
	 * @throws EquipoException Si el valor de los goles, asistencias, amarillas o rojas es negativa, o si el número de
	 * 							jugador no corresponde con un jugador del equipo.
	 */
	public void agregarRegistroJugador(int numero, int goles, int asistencias, int amarillas, int rojas) throws EquipoException {
		
		if( goles < 0 ) {
			throw new EquipoException("El número de goles es un valor inválido (debe ser mayor o igual a cero)");
		}
		
		if( asistencias < 0 ) {
			throw new EquipoException("El número de asistencias es un valor inválido (debe ser mayor o igual a cero)");
		}
		
		if( amarillas < 0 ) {
			throw new EquipoException("El número de tarjetas amarillas es un valor inválido (debe ser mayor o igual a cero)");
		}
		
		if( rojas < 0 ) {
			throw new EquipoException("El número de tarjetas rojas es un valor inválido (debe ser mayor o igual a cero)");
		}
		
		switch(numero) {
		case N_1:
			jugador1.agregarRegistro(goles, asistencias, amarillas, rojas);
			break;
		case N_2:
			// TODO: Escribir la llamada al método agregarRegistro del jugador 2
			break;
		case N_3:
			// TODO: Escribir la llamada al método agregarRegistro del jugador 2
			break;
		case N_4:
			// TODO: Escribir la llamada al método agregarRegistro del jugador 2
			break;
		case N_5:
			// TODO: Escribir la llamada al método agregarRegistro del jugador 2
			break;
		default:
			throw new EquipoException("El jugador no pertenece al equipo.");
		}
	}
	
	/**
	 * Retorna un jugador dado su número
	 * @param numero entero que indica el número del jugador
	 * @return Un objeto de la clase Jugador que corresponde al jugador con el número dado, o null si no existe un jugador con el número indicado
	 */
	public Jugador getJugador(int numero) {
		// TODO: Completar el método de según la documentación
	}
	
	/**
	 * Calcula el promedio de tarjetas amarillas del equipo
	 * @return Número real que indica el promedio de tarjetas amarillas del equipo
	 */
	public double calcularPromedioAmarillas() {
		return (double)getTotalAmarillas() / (double)NUMERO_JUGADORES;
	}
	
	/**
	 * Calcular el promedio de tarjetas rojas del equipo
	 * @return Número real que indica el promedio de tarjetas rojas del equipo
	 */
	public double calcularPromedioRojas() {
		// TODO: Completar el método según la documentación
	}
	
	/**
	 * Calcular la relación entre los goles y las asistencias del equipo (goles / asistencias)
	 * @return Número real que indica el número de goles por asistencia
	 */
	public double calcularRelacionGolesAsistencias() {
		// TODO: Completar el método según la documentación
	}
	
	/**
	 * Calcula y retorna el total de tajetas amarillas del equipo
	 * @return Número entero con el total de tarjetas amarillas
	 */
	private int getTotalAmarillas() {
		// TODO: Completar el método según la documentación
	}
	
	/**
	 * Calcula y retorna el total de tarjetas rojas del quipo
	 * @return Número entero con el total de tarjetas rojas
	 */
	private int getTotalRojas() {
		// TODO: Completar el método según la documentación
	}
	
	/**
	 * Calcula y retorna el total de goles marcados por todo el equipo
	 * @return Número entero con el total de goles del equipo
	 */
	private int getTotalGoles() {
		// TODO: Completar el método según la documentación
	}
	
	/**
	 * Calcula y retorna el total de asistencias hecha por todo el equipo
	 * @return Número entero con el totol de asistencias.
	 */
	private int getTotalAsistencias() {
		// TODO: Completar el método según la documentación
	}
	
}
