package edu.udem.poo.cursos.mundo;

/**
 * Representa una excepci�n del programa
 * @author jehincapie
 */
public class CursoException extends Exception {
	
	/**
	 * Construye la excepci�n con base en el mensaje
	 * @param msg String mensaje que describe la excepci�n
	 */
	public CursoException(String msg) {
		super(msg);
	}
	
}
