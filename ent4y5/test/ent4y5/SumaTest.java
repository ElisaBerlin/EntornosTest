package ent4y5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	public void sumaPositivos() {
		System.out.println("Sumando dos números positivos: ");
		Suma S = new Suma(2, 3);
		assertTrue(S.sumar() == 5);
		
	}
	@Test
	public void sumaNegativos() {
		System.out.println("Sumando dos números negativos: ");
		Suma S = new Suma(-2, -3);
		assertTrue(S.sumar() == -5);
	}
	
	@Test
	public void sumaPositivoNegativo() {
		System.out.println("Sumando números positivos y negativos: ");
		Suma S = new Suma(-2, 3);
		assertTrue(S.sumar() == 1);
	}
}
	