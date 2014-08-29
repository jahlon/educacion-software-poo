package dominio;

/**
 * Clase que representa al equipo de microfútbol
 * @author Jesús Andrés Hincapié Londoño
 */
public class Equipo {
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
	
	/**
	 * Representa el primer jugador
	 */
	private Jugador jugador1;
	
	/**
	 * Representa el segundo jugador
	 */
	private Jugador jugador2;
	
	/**
	 * Representa el tercer jugador
	 */
	private Jugador jugador3;
	
	/**
	 * Representa el cuarto jugador
	 */
	private Jugador jugador4;
	
	/**
	 * Representa el quinto jugador
	 */
	private Jugador jugador5;
	
	/**
	 * Construye un objeto de la clase Equipo, creando los jugadores que lo conforman
	 */
	public Equipo() {
		jugador1 = new Jugador(N_1, NOMBRE_1);
		jugador2 = new Jugador(N_2, NOMBRE_2);
		jugador3 = new Jugador(N_3, NOMBRE_3);
		jugador4 = new Jugador(N_4, NOMBRE_4);
		jugador5 = new Jugador(N_5, NOMBRE_5);
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
			jugador2.agregarRegistro(goles, asistencias, amarillas, rojas);
			break;
		case N_3:
			jugador3.agregarRegistro(goles, asistencias, amarillas, rojas);
			break;
		case N_4:
			jugador4.agregarRegistro(goles, asistencias, amarillas, rojas);
			break;
		case N_5:
			jugador5.agregarRegistro(goles, asistencias, amarillas, rojas);
			break;
		default:
			throw new EquipoException("El jugador no pertenece al equipo.");
		}
	}
	
	/**
	 * Retorna un jugador dado su número
	 * @param numero entero que indica el número del jugador
	 * @return Un onjeto de la clase Jugador
	 */
	public Jugador getJugador(int numero) {
		switch(numero) {
		case N_1:
			return jugador1;
		case N_2:
			return jugador2;
		case N_3:
			return jugador3;
		case N_4:
			return jugador4;
		case N_5:
			return jugador5;
		default:
			return null;
		}
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
		return (double)getTotalRojas() / (double)NUMERO_JUGADORES;
	}
	
	/**
	 * Calcular la relación entre los goles y las asistencias del equipo (goles / asistencias)
	 * @return Número real que indica el número de goles por asistencia
	 */
	public double calcularRelacionGolesAsistencias() {
		double totalAsistencias = getTotalAsistencias();
		if(totalAsistencias == 0)
			return -1;
		return (double)getTotalGoles() / totalAsistencias;
	}
	
	/**
	 * Calcula y retorna el total de tajetas amarillas del equipo
	 * @return Número entero con el total de tarjetas amarillas
	 */
	private int getTotalAmarillas() {
		return jugador1.getTotalTajetasAmarillas() +
				jugador2.getTotalTajetasAmarillas() +
				jugador3.getTotalTajetasAmarillas() +
				jugador4.getTotalTajetasAmarillas() +
				jugador5.getTotalTajetasAmarillas();
	}
	
	/**
	 * Calcula y retorna el total de tarjetas rojas del quipo
	 * @return Número entero con el total de tarjetas rojas
	 */
	private int getTotalRojas() {
		return jugador1.getTotalTarjetasRojas() +
				jugador2.getTotalTarjetasRojas() +
				jugador3.getTotalTarjetasRojas() +
				jugador4.getTotalTarjetasRojas() +
				jugador5.getTotalTarjetasRojas();
	}
	
	/**
	 * Calcula y retorna el total de goles marcados por todo el equipo
	 * @return Número entero con el total de goles del equipo
	 */
	private int getTotalGoles() {
		return jugador1.getTotalGoles() +
				jugador2.getTotalGoles() +
				jugador3.getTotalGoles() +
				jugador4.getTotalGoles() +
				jugador5.getTotalGoles();
	}
	
	/**
	 * Calcula y retorna el total de asistencias hecha por todo el equipo
	 * @return Número entero con el totol de asistencias.
	 */
	private int getTotalAsistencias() {
		return jugador1.getTotalAsistencias() +
				jugador2.getTotalAsistencias() +
				jugador3.getTotalAsistencias() +
				jugador4.getTotalAsistencias() +
				jugador5.getTotalAsistencias();
	}
	
}
