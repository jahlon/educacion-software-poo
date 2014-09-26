package edu.udem.poo.lavadero.mundo;

/**
 * Representa las excepciones de la aplicación
 * @author jehincapie
 *
 */
public class LavaderoException extends Exception {
	
	/**
	 * Crea la excepción a partir de un mensaje
	 * @param msg
	 */
	public LavaderoException(String msg) {
		super(msg);
	}
}
