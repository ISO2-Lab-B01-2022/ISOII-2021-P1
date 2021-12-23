package org.isodos.b01.practicados_ejerciciouno.com.iso2b01.testingej1;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestEjercicio1 {

	@Before
	public void setUp() throws Exception {
		App.main(null);
	}

	@Test
	// Prueba 1
	public void testPrincipal1() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 2
	public void testPrincipal2() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 13, false, false, false);
		Restricciones r = new Restricciones(85, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 3
	public void testPrincipal3() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(30, 1, false, true, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 4
	public void testPrincipal4() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 10, true, false, true);
		Restricciones r = new Restricciones(80, 102, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 5
	public void testPrincipal5() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(12, 90, false, false, false);
		Restricciones r = new Restricciones(80, 100, true);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 6
	public void testPrincipal6() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 1, false, false, false);
		Restricciones r = new Restricciones(100, 100, true);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 7
	public void testPrincipal7() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(-5, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 8
	public void testPrincipal8() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(10, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 9
	public void testPrincipal9() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(20, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 10
	public void testPrincipal10() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(27, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 11
	public void testPrincipal11() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(32, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 12
	public void testPrincipal12() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(50, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 13
	public void testPrincipal13() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(0, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 14
	public void testPrincipal14() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(15, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 15
	public void testPrincipal15() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(25, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 16
	public void testPrincipal16() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(30, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 17
	public void testPrincipal17() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 18
	public void testPrincipal18() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(-1, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 19
	public void testPrincipal19() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(1, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 20
	public void testPrincipal20() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(14, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 21
	public void testPrincipal21() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(16, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 22
	public void testPrincipal22() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(24, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 23
	public void testPrincipal23() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(26, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 24
	public void testPrincipal24() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(29, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 25
	public void testPrincipal25() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(31, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 26
	public void testPrincipal26() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(34, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 27
	public void testPrincipal27() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(36, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 28
	public void testPrincipal28() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(-500, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 29
	public void testPrincipal29() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(900, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 30
	public void testPrincipal30() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(80, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 31
	public void testPrincipal31() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 1, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 32
	public void testPrincipal32() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 30, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 33
	public void testPrincipal33() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 90, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 34
	public void testPrincipal34() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 0, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 35
	public void testPrincipal35() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 15, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 36
	public void testPrincipal36() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 60, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 37
	public void testPrincipal37() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 100, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 38
	public void testPrincipal38() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 10, true, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 39
	public void testPrincipal39() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 10, false, true, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 40
	public void testPrincipal40() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 10, false, false, true);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 41
	public void testPrincipal41() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, -1, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 42
	public void testPrincipal42() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 1, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 43
	public void testPrincipal43() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 14, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 44
	public void testPrincipal44() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 16, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 45
	public void testPrincipal45() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 59, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 46
	public void testPrincipal46() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 61, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 47
	public void testPrincipal47() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 99, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 48
	public void testPrincipal48() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 101, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 49
	public void testPrincipal49() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, -2, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 50
	public void testPrincipal50() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 120, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 51
	public void testPrincipal51() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 10, false, false, false);
		Restricciones r = new Restricciones(20, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 52
	public void testPrincipal52() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 10, false, false, false);
		Restricciones r = new Restricciones(120, 100, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 53
	public void testPrincipal53() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 10, false, false, false);
		Restricciones r = new Restricciones(80, 90, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

	@Test
	// Prueba 54
	public void testPrincipal54() {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(35, 10, false, false, false);
		Restricciones r = new Restricciones(80, 2, false);
		boolean objetivo = true;
		boolean obj = App.Principal(p, t, r);
		assertEquals(objetivo, obj);
	}

}
