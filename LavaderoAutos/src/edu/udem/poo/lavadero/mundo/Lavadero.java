package edu.udem.poo.lavadero.mundo;

/**
 * Clase que representa el lavadero de autos
 * @author jehincapie
 *
 */
public class Lavadero {
	/**
	 * Representa el porcentaje de recargo a los vehículo tipo camioneta
	 */
	public static final double RECARGO_CAMIONETA = 0.2;
	
	/**
	 * Constante que representa los vehículos de tipo normal
	 */
	public static final int TIPO_NORMAL = 1;
	
	/**
	 * Constante que representa los vehículos de tipo camioneta
	 */
	public static final int TIPO_CAMIONETA = 2;
	
	/**
	 * El dinero que hay en la caja del lavadero
	 */
	private double dineroEnCaja;
	
	/**
	 * El primer empleado del lavadero
	 */
	private Empleado empleado1;
	
	/**
	 * El segundo empleado del lavadero
	 */
	private Empleado empleado2;
	
	/**
	 * El tercer empleado del lavadero
	 */
	private Empleado empleado3;
	
	/**
	 * El cuarto empleado del lavadero
	 */
	private Empleado empleado4;
	
	/**
	 * El quinto empleado del lavadero
	 */
	private Empleado empleado5;
	
	/**
	 * Crea el lavadero
	 */
	public Lavadero() {
		empleado1 = new Empleado("Juan", 8000, 15000, 25000);
		empleado2 = new Empleado("Pedro", 7500, 13200, 23000);
		empleado3 = new Empleado("Adrián", 10000, 20000, 30000);
		empleado4 = new Empleado("Miguel", 11500, 19000, 30000);
		empleado5 = new Empleado("José", 15000, 23000, 35000);
		dineroEnCaja = 0;
	}
	
	/**
	 * Registra un lavada del tipo especificado, para el tipo de vehículo indicado y para el empleado con el nombre dado
	 * @param nombreEmpleado String con el nombre del empleado
	 * @param tipoVehiculo int que indica el tipo del vehiculo. Puede ser: TIPO_NORMAL o TIPO_CAMIONETA
	 * @param tipoLavada int que indica el tipo de la lavada. Puede ser: Empleado.LAVADA_SENCILLA, Empleado.LAVADA_INTERIOR o Empleado.LAVADA_MOTOR
	 * @throws LavaderoException
	 */
	public void registrarLavadaDeVehiculo(String nombreEmpleado, int tipoVehiculo, int tipoLavada) throws LavaderoException {
		Empleado e = buscarEmpleado(nombreEmpleado);
		if(e == null) {
			throw new LavaderoException("No existe un empleado con el nombre: " + nombreEmpleado);
		} else {
			e.registrarLavada(tipoLavada);
			switch( tipoVehiculo ) {
				case TIPO_NORMAL:
					dineroEnCaja += e.getValorLavada(tipoLavada);
					break;
				case TIPO_CAMIONETA:
					dineroEnCaja += e.getValorLavada(tipoVehiculo) * (1 + RECARGO_CAMIONETA);
					break;
			}
		}
	}
	
	/**
	 * Devuelve el empleado que tiene el nombre indicado
	 * @param nombre String con el nombre del empleado que se busca
	 * @return El empleado con el nombre indicado, o null si no se encuentra un empleado con dicho nombre
	 */
	private Empleado buscarEmpleado(String nombre) {
		if(empleado1.getNombre().equals(nombre)) {
			return empleado1;
		}else if(empleado2.getNombre().equals(nombre)) {
			return empleado2;
		}else if(empleado3.getNombre().equals(nombre)) {
			return empleado3;
		}else if(empleado4.getNombre().equals(nombre)) {
			return empleado4;
		}else if(empleado5.getNombre().equals(nombre)) {
			return empleado5;
		}else{
			return null;
		}
	}
	
	/**
	 * Devuelve el dinero en caja que hay en el lavadero
	 * @return double dinero en caja del lavadero
	 */
	public double getDineroEnCaja() {
		return dineroEnCaja;
	}
	
	/**
	 * Devuelve el nombre del empleado que más dinero ha generado
	 * @return String el nombre del empleado
	 */
	public String getNombreMejorEmpleado() {
		String nombre = empleado1.getNombre();
		double dinero = empleado1.calcularDineroGenerado();
		
		if(empleado2.calcularDineroGenerado() > dinero) {
			dinero = empleado2.calcularDineroGenerado();
			nombre = empleado2.getNombre();
		}
		
		if(empleado3.calcularDineroGenerado() > dinero) {
			dinero = empleado3.calcularDineroGenerado();
			nombre = empleado3.getNombre();
		}
		
		if(empleado4.calcularDineroGenerado() > dinero) {
			dinero = empleado4.calcularDineroGenerado();
			nombre = empleado4.getNombre();
		}
		
		if(empleado5.calcularDineroGenerado() > dinero) {
			dinero = empleado5.calcularDineroGenerado();
			nombre = empleado5.getNombre();
		}
		
		return nombre;
	}
	
	/**
	 * Devuelve el nombre del empleado que menos dinero ha generado
	 * @return String el nombre del empleado
	 */
	public String getNombrePeorEmpleado() {
		String nombre = empleado1.getNombre();
		double dinero = empleado1.calcularDineroGenerado();
		
		if(empleado2.calcularDineroGenerado() < dinero) {
			dinero = empleado2.calcularDineroGenerado();
			nombre = empleado2.getNombre();
		}
		
		if(empleado3.calcularDineroGenerado() < dinero) {
			dinero = empleado3.calcularDineroGenerado();
			nombre = empleado3.getNombre();
		}
		
		if(empleado4.calcularDineroGenerado() < dinero) {
			dinero = empleado4.calcularDineroGenerado();
			nombre = empleado4.getNombre();
		}
		
		if(empleado5.calcularDineroGenerado() < dinero) {
			dinero = empleado5.calcularDineroGenerado();
			nombre = empleado5.getNombre();
		}
		
		return nombre;
	}
	
	/**
	 * Devuelve el total de lavadas sencillas realizadas por todos los empleados
	 * @return int el total de lavadas sencillas
	 */
	public int getTotalLavadasSencillas() {
		return empleado1.getTotalLavadasSencillas() +
				empleado2.getTotalLavadasSencillas() +
				empleado3.getTotalLavadasSencillas() +
				empleado4.getTotalLavadasSencillas() +
				empleado5.getTotalLavadasSencillas();
	}
	
	/**
	 * Devuelve el total de lavadas de interior realizadas por todos los empleados
	 * @return int el total de lavadas de interior
	 */
	public int getTotalLavadasDeInterior() {
		return empleado1.getTotalLavadasInterior() +
				empleado2.getTotalLavadasInterior() +
				empleado3.getTotalLavadasInterior() +
				empleado4.getTotalLavadasInterior() +
				empleado5.getTotalLavadasInterior();
	}
	
	/**
	 * Devuelve el total de lavadas de motor realizadas por todos los empleados
	 * @return int el total de lavadas de motor
	 */
	public int getTotalLavadasDeMotor() {
		return empleado1.getTotalLavadasMotor() +
				empleado2.getTotalLavadasMotor() +
				empleado3.getTotalLavadasMotor() +
				empleado4.getTotalLavadasMotor() +
				empleado5.getTotalLavadasMotor();
	}
	
	/**
	 * Devuelve un arreglo con los nombres de los empleados del lavadero
	 * @return String[] nombres de los empleados
	 */
	public String[] getNombresEmpleados() {
		return new String[] {empleado1.getNombre(), empleado2.getNombre(), empleado3.getNombre(), empleado4.getNombre(), empleado5.getNombre()};
	}
	
	
}
