package dominio;

/**
 * Esta clase representa las excepciones lanzadas por el programa
 * @author chucho
 */
public class EquipoException extends Exception {
	
	/**
	 * Construye una nueva execepción
	 * @param msg String que contiene el mensaje de la execepción
	 */
	public EquipoException( String msg ) {
		super(msg);
	}
}
