package edu.udem.poo.lavadero.mundo;

/**
 * Representa las excepciones de la aplicaci�n
 * @author jehincapie
 *
 */
public class LavaderoException extends Exception {
	
	/**
	 * Crea la excepci�n a partir de un mensaje
	 * @param msg
	 */
	public LavaderoException(String msg) {
		super(msg);
	}
}
