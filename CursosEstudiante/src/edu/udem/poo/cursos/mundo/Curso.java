package edu.udem.poo.cursos.mundo;

/**
 * Esta clase representa un curso que toma el estudiante
 * @author jehincapie
 */
public class Curso {
	
	/**
	 * Valor constante que representa un curso que a�n no se le ha asignado la nota
	 */
	public static final double SIN_NOTA = -1.0d;
	
	/**
	 * El nombre del curso
	 */
	private String nombre;
	
	/**
	 * Un c�digo num�rico que identifica al curso
	 */
	private int codigo;
	
	/**
	 * El n�mero de cr�ditos del curso
	 */
	private int creditos;
	
	/**
	 * La nota que se le da al curso. 
	 * Debe ser un valor entre 0.0 y 5.0
	 */
	private double nota;
	
	/**
	 * Crea un objeto de tipo Curso
	 * @param nombre el nombre del curso
	 * @param codigo el c�digo del curso
	 * @param creditos el n�mero del cr�ditos del curso
	 */
	public Curso(String nombre, int codigo, int creditos) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.creditos = creditos;
		nota = SIN_NOTA;
	}
	
	/**
	 * Asigna una nota al curso
	 * @param nota la nota que se le va a asignar al curso
	 * @throws CursoException si la nota no est� entre 0.0 y 5.0
	 */
	public void asignarNota(double nota) throws CursoException {
		if(nota < 0.0 || nota > 5.0) {
			throw new CursoException("La nota est� por fuera del rango permitido. Debe estar entre 0.0 y 5.0");
		}
		this.nota = nota;
	}
	
	/**
	 * Indica si el curso ya tiene una nota asignada
	 * @return true si el curso tiene nota asignada, false en caso contrario
	 */
	public boolean tieneNota() {
		return nota != SIN_NOTA;
	}
	
	/**
	 * Devuelve el nombre del curso
	 * @return String nombre del curso
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve el c�digo del curso
	 * @return int c�digo del curso
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Devuelve el n�mero de cr�ditos del curso
	 * @return int n�mero de cr�ditos
	 */
	public int getCreditos() {
		return creditos;
	}
	
	/**
	 * Devuelve la nota del curso. Si el curso no tiene nota asignada se retorna el valor SIN_NOTA
	 * @return double la nota del curso.
	 */
	public double getNota() {
		return nota;
	}
	
}
