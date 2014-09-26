package edu.udem.poo.lavadero.mundo;

/**
 * Representa un empleado del lavadero de autos
 * @author jehincapie
 *
 */
public class Empleado {
	
	/**
	 * Constante que representa un tipo de lavada sencilla
	 */
	public static final int LAVADA_SENCILLA = 1;
	/**
	 * Constante que representa un tipo de lavada de interior
	 */
	public static final int LAVADA_INTERIOR = 2;
	/**
	 * Constante que representa un tipo de lavada de motor
	 */
	public static final int LAVADA_MOTOR = 3;
	
	/**
	 * El nombre del empleado
	 */
	private String nombre;
	/**
	 * El valor por lavada sencilla del empleado
	 */
	private double valorLavadaSencilla;
	/**
	 * El valor por lavada de interior del empleado
	 */
	private double valorLavadaInterior;
	/**
	 * El valor por lavada de motor del empleado
	 */
	private double valorLavadaMotor;
	/**
	 * El total de lavadas sencillas que ha realizado el empleado
	 */
	private int totalLavadasSencillas;
	/**
	 * El total de lavadas de interior que ha realizado el empleado
	 */
	private int totalLavadasInterior;
	/**
	 * El total de lavadas de motor que ha realizado el empleado
	 */
	private int totalLavadasMotor;
	
	/**
	 * Crea un objeto de la clase Empleado
	 * @param nombre El nombre del empleado
	 * @param valorLavadaSencilla el valor de la lavada sencilla asignado al empleado que se va a crear
	 * @param valorLavadaInterior el valor de la lavada de interior asignado al empleado que se va a crear
	 * @param valorLavadaMotor el valor de la lavada de motor asignado al empleado que se va a crear
	 */
	public Empleado(String nombre, double valorLavadaSencilla, double valorLavadaInterior, double valorLavadaMotor) {
		this.nombre = nombre;
		this.valorLavadaSencilla = valorLavadaSencilla;
		this.valorLavadaInterior = valorLavadaInterior;
		this.valorLavadaMotor = valorLavadaMotor;
		totalLavadasSencillas = 0;
		totalLavadasInterior = 0;
		totalLavadasMotor = 0;
	}
	
	/**
	 * Agrega una lavada del tipo especificado a los registro del empleado
	 * @param tipo el tipo de lavada a registrar. Puede ser uno de los tres valores: LAVADA_SENCILLA, LAVADA_INTERIOR o LAVADA_MOTOR
	 */
	public void registrarLavada(int tipo) {
		switch(tipo) {
			case LAVADA_SENCILLA:
				totalLavadasSencillas++;
				break;
				
			case LAVADA_INTERIOR:
				totalLavadasInterior++;
				break;
				
			case LAVADA_MOTOR:
				totalLavadasMotor++;
				break;
		}
	}
	
	/**
	 * Calcula el total de dinero que ha sido generado por las lavadas del empleado
	 * @return double el total de dinero generado
	 */
	public double calcularDineroGenerado() {
		return totalLavadasInterior * valorLavadaInterior +
				totalLavadasMotor * valorLavadaMotor + 
				totalLavadasSencillas * valorLavadaSencilla;
	}
	
	/**
	 * Devuelve el nombre del empleado
	 * @return String con el nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve el valor del tipo de lavada especificada
	 * @param tipoLavada indica el tipo de lavada 
	 * @return double con el valor del tipo de lavada
	 * @throws LavaderoException si el tipoLavada no está soportado
	 */
	public double getValorLavada(int tipoLavada) throws LavaderoException {
		switch( tipoLavada ) {
			case LAVADA_SENCILLA:
				return valorLavadaSencilla;
			case LAVADA_INTERIOR:
				return valorLavadaInterior;
			case LAVADA_MOTOR:
				return valorLavadaMotor;
			default:
				throw new LavaderoException("El tipo de lavada especificado no está permitido");
		}
	}
	
	/**
	 * Devuelve el total de lavadas sencillas que ha realizado el empleado
	 * @return int con el total de lavadas sencillas
	 */
	public int getTotalLavadasSencillas() {
		return totalLavadasSencillas;
	}
	
	/**
	 * Devuelve el total de lavadas de interior que ha realizado el empleado
	 * @return int con el total de lavadas de interior
	 */
	public int getTotalLavadasInterior() {
		return totalLavadasInterior;
	}
	
	/**
	 * Devuelve el total de lavadas de motor que ha realizado el empleado
	 * @return int con el total de lavadas de motor
	 */
	public int getTotalLavadasMotor() {
		return totalLavadasMotor;
	}

}
