import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSurvivor {

	private static Survivor survi=new Survivor();

	@Test
	void testCurarse() {
		survi.setEstadoSalud(1);
		assertEquals("El jugador est� herido", survi.getEstadoSalud());
		survi.curarse();
		assertEquals("El jugador est� saludable", survi.getEstadoSalud());
	}
	@Test
	void testObjeto(){
		survi.setObjeto("");
		assertEquals("No tienes ning�n objeto", survi.getObjeto());
		survi.setObjeto("Linterna");
		assertEquals("Linterna", survi.getObjeto());
	}
	@Test
	void testInfectado() {
		assertEquals("El jugador est� infectado", survi.isInfectado(true));
	}
	@Test
	void testVida() {
		assertEquals(3, survi.getVida());
	}

}
