import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSurvivor {

	@Test
	void test() {
		Survivor survi=new Survivor("Linterna");
		survi.setEstadoSalud(1);
		assertEquals("Tu objeto actual es una linterna", survi.setObjeto("Linterna")));
		assertEquals("El jugador está herido", survi.mostrarEstadoSalud());
	}

}
