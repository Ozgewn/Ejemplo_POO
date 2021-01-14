import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSurvivor {

	private static Survivor survi=new Survivor();

	@Test
	void testCurarse() {
		survi.setEstadoSalud(1);
		assertEquals("El jugador está herido", survi.getEstadoSalud());
		survi.curarse();
		assertEquals("El jugador está saludable", survi.getEstadoSalud());
	}
	@Test
	void testObjeto(){
		survi.setObjeto("");
		assertEquals("No tienes ningún objeto", survi.getObjeto());
		survi.setObjeto("Linterna");
		assertEquals("Linterna", survi.getObjeto());
	}
	@Test
	void testInfectado() {
		assertEquals("El jugador está infectado", survi.isInfectado(true));
	}
	@Test
	void testVida() {
		assertEquals(3, survi.getVida());
	}

}
