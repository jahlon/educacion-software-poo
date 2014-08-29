package estadisticasequipo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import dominio.Equipo;

public class EquipoTest {
	
	private Equipo equipo;
	
	@Before
	public void setupEscenario() {
		equipo = new Equipo();
	}
	
	@Test
	public void getNombreJugadoresPorDefecto() {
		String[] nombres = {Equipo.NOMBRE_1,Equipo.NOMBRE_2,Equipo.NOMBRE_3, Equipo.NOMBRE_4, Equipo.NOMBRE_5};
		assertEquals(nombres, equipo.getNombresJugadores());
	}

}
