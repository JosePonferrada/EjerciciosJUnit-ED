package sports;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeportesTest {

	@Test
	void test1() {
		String expected = "Natación";
		String result = RecomendadorDeportes.recomiendaDeporte(35);
		assertEquals(expected, result);
	}

	@Test
	void test2() {
		String expected = "Tenis";
		String result = RecomendadorDeportes.recomiendaDeporte(25);
		assertEquals(expected, result);
	}
	
	@Test
	void test3() {
		String expected = "Fútbol";
		String result = RecomendadorDeportes.recomiendaDeporte(20);
		assertEquals(expected, result);
	}
	
	@Test
	void test4() {
		String expected = "Ajedrez";
		String result = RecomendadorDeportes.recomiendaDeporte(10);
		assertEquals(expected, result);
	}
	
	@Test
	void test5() {
		String expected = "Esquí";
		String result = RecomendadorDeportes.recomiendaDeporte(0);
		assertEquals(expected, result);
	}
	
}
