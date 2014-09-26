package edu.udem.poo.cursos.mundo;

/**
 * Clase que representa un estudiante
 * @author jehincapie
 */
public class Estudiante {
	
	/**
	 * Valor que indica que el estudiante a�n no tiene promedio
	 */
	public static final double SIN_PROMEDIO = -1;
	
	/**
	 * El nombre del estudiante
	 */
	private String nombre;
	
	/**
	 * Los apellidos del estudiante
	 */
	private String apellido;
	
	/**
	 * El c�digo con el que se identifica el estudiante
	 */
	private long codigo;
	
	/**
	 * El primer curso del estudiante
	 */
	private Curso curso1;
	
	/**
	 * El segundo curso del estudiante
	 */
	private Curso curso2;
	
	/**
	 * El tercer curso del estudiante
	 */
	private Curso curso3;
	
	/**
	 * El cuarto curso del estudiante
	 */
	private Curso curso4;
	
	/**
	 * El quinto curso del estudiante
	 */
	private Curso curso5;
	
	/**
	 * Crea un objeto de tipo Estudiante
	 * @param nombre String nombre del estudiante
	 * @param apellido String apellidos del estudiante
	 * @param codigo long c�digo num�rico que identifica al estudiante
	 */
	public Estudiante(String nombre, String apellido, long codigo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigo = codigo;		
	}
	
	/**
	 * Registra un curso para el estudiante
	 * @param nombreCurso String nombre del curso
	 * @param codigoCurso int c�digo del curso
	 * @param creditos int n�mero de cr�ditos del curso
	 * @throws CursoException si codigoCurso corresponde al c�digo de otro curso que haya sido registrado o
	 * 							si el estudiante ya tiene los 5 cursos registrados.
	 * @return Curso el curso que acaba de ser registrado
	 */
	public Curso registrarCurso(String nombreCurso, int codigoCurso, int creditos) throws CursoException {
		if(!esCodigoValido(codigoCurso)) {
			throw new CursoException("El c�digo especificado ya corresponde a otro curso registrado previamente");
		}
		
		if(curso1 == null){
			curso1 = new Curso(nombreCurso, codigoCurso, creditos);
			return curso1;
		}
		
		if(curso2 == null){
			curso2 = new Curso(nombreCurso, codigoCurso, creditos);
			return curso2;
		}
		
		if(curso3 == null) {
			curso3 = new Curso(nombreCurso, codigoCurso, creditos);
			return curso3;
		}
		
		if(curso4 == null) {
			curso4 = new Curso(nombreCurso, codigoCurso, creditos);
			return curso4;
		}
		
		if(curso5 == null) {
			curso5 = new Curso(nombreCurso, codigoCurso, creditos);
			return curso5;
		}
		
		throw new CursoException("El estudiante ya tiene 5 cursos registrado; no se pueden registrar m�s");
				
	}
	
	/**
	 * Verifica que no exista un curso registrado con el mismo c�digo que el pasado como par�metro
	 * @param codigo el c�digo que se quiere verigicar
	 * @return true si no existe un curso registrado con el c�digo dado, false en caso contrario.
	 */
	private boolean esCodigoValido(int codigo) {
				
		if(curso1 != null && curso1.getCodigo() == codigo) {
			return false;
		}
		
		if(curso2 != null && curso2.getCodigo() == codigo) {
			return false;
		}
		
		if(curso3 != null && curso3.getCodigo() == codigo) {
			return false;
		}
		
		if(curso4 != null && curso4.getCodigo() == codigo) {
			return false;
		}
		
		if(curso5 != null && curso5.getCodigo() == codigo) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Registra la nota del curso identificado con el c�digo dado
	 * @param codigoCurso el c�digo del curso al que se le quiere asignar la nota
	 * @param nota la nota del curso
	 * @throws CursoException si no existe un curso registrado que tenga el c�digo igual al dado
	 */
	public void asignarNotaCurso(int codigoCurso, double nota) throws CursoException {
		Curso curso = buscarCursoPorCodigo(codigoCurso);
		
		if(curso == null) {
			throw new CursoException("No existe un curso con el c�digo: " + Integer.toString(codigoCurso));
		}
		
		curso.asignarNota(nota);
	}
	
	/**
	 * Busca un curso por su c�digo
	 * @param codigo el c�digo del curso que se quiere buscar
	 * @return un objeto de tipo curso que tenga el c�digo igual al dado. Si no encuentra ning�n curso, retorna null.
	 */
	private Curso buscarCursoPorCodigo(int codigo) {
		
		if(curso1 != null && curso1.getCodigo() == codigo) {
			return curso1;
		}
		
		if(curso2 != null && curso2.getCodigo() == codigo) {
			return curso2;
		}
		
		if(curso3 != null && curso3.getCodigo() == codigo) {
			return curso3;
		}
		
		if(curso4 != null && curso4.getCodigo() == codigo) {
			return curso4;
		}
		
		if(curso5 != null && curso5.getCodigo() == codigo) {
			return curso5;
		}
		
		return null;
	}
	
	/**
	 * Calcula y devuelve el promedio cr�dito del estudiante
	 * @return double con el promedio cr�dito o SIN_PROMEDIO en caso de que ninguna materia tenga nota asignada
	 */
	public double calcularPromedio() {
		int totalCreditos = 0;
		double sumaNotas = 0;
		
		if(curso1 != null && curso1.tieneNota()) {
			totalCreditos += curso1.getCreditos();
			sumaNotas += curso1.getCreditos() * curso1.getNota();
		}
		
		if(curso2 != null && curso2.tieneNota()) {
			totalCreditos += curso2.getCreditos();
			sumaNotas += curso2.getCreditos() * curso2.getNota();
		}
		
		if(curso3 != null && curso3.tieneNota()) {
			totalCreditos += curso3.getCreditos();
			sumaNotas += curso3.getCreditos() * curso3.getNota();
		}
		
		if(curso4 != null && curso4.tieneNota()) {
			totalCreditos += curso4.getCreditos();
			sumaNotas += curso4.getCreditos() * curso4.getNota();
		}
		
		if(curso5 != null && curso5.tieneNota()) {
			totalCreditos += curso5.getCreditos();
			sumaNotas += curso5.getCreditos() * curso5.getNota();
		}
		
		if(totalCreditos == 0) { 
			return SIN_PROMEDIO;
		}
		
		return sumaNotas / totalCreditos;
	}
	
	/**
	 * Devuelve el nombre del estudiante
	 * @return String nombre del estudiante
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve el apellido del estudiante
	 * @return String apellidos del estudiante
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Devuelve el c�digo del estudiante
	 * @return long c�digo del estudiante
	 */
	public long getCodigo() {
		return codigo;
	}
	
	
	
	
	
}
