package taxi.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import taxi.app.CalcularPago;

class TaxiTest {

	@Test
	void test0() {
		double result = CalcularPago.pago(0);
		double expected = 20;
		assertEquals(expected, result);
	}

	@Test
	void test1() {
		double result = CalcularPago.pago(19.9999999);
		double expected = 19;
		assertEquals(expected, result, 0.001); 
		// Se puede introducir un margen de error como 3er parámetro
	}
	
}
