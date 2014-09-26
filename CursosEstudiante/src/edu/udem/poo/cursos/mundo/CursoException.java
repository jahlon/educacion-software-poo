package edu.udem.poo.cursos.mundo;

/**
 * Representa una excepción del programa
 * @author jehincapie
 */
public class CursoException extends Exception {
	
	/**
	 * Construye la excepción con base en el mensaje
	 * @param msg String mensaje que describe la excepción
	 */
	public CursoException(String msg) {
		super(msg);
	}
	
}
