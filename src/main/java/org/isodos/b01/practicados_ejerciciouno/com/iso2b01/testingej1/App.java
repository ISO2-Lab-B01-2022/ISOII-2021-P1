package org.isodos.b01.practicados_ejerciciouno.com.iso2b01.testingej1;

public class App {

	public static void main(String[] args) {
		Persona p = new Persona(true, false, false, true, true);
		Tiempo t = new Tiempo(32, 10, false, false, false);
		Restricciones r = new Restricciones(80, 100, false);
		Principal(p, t, r);
	}

	public static boolean Principal(Persona p, Tiempo t, Restricciones r) {
		boolean seguir;
		if (!Actividades(p)) {
			seguir = false;
			System.out.println("No se puede realizar ninguna actividad");
		} else {
			seguir = true;
			if (quedarseCasa(p, t)) {
				System.out.println("Lo mejor es quedarse en casa");
			} else if (irEsquiar(p, t, r)) {
				System.out.println("Se recomineda ir a esquiar");
			} else if (hacerSenderismo(p, t, r)) {
				System.out.println("Se recomienda hacer senderismo");
			} else if (hacerTurismo(p, t, r)) {
				System.out.println("Se recomineda hacer turismo");
			} else if (irCanas(p, t, r)) {
				System.out.println("Se recomineda ir de cañas");
			} else if (irPlayaPiscina(p, t, r)) {
				System.out.println("Se recomienda ir a la playa");
				if (r.getAforoActual() < r.getAforoPermitido()) {
					System.out.println("Se recomienda ir a la piscina");
				}
			}

		}
		return seguir;
	}

	public static boolean Actividades(Persona p) {
		boolean hacer;
		if (p.isSano() && !p.isSintomas() && p.isCovid() && p.isCartilla() && !p.isContacto()) {
			hacer = true;
		} else {
			hacer = false;
		}
		return hacer;
	}

	public static boolean quedarseCasa(Persona p, Tiempo t) {
		boolean hacer;
		if (t.getTemperatura() < 0 && t.getHumedad() < 15 && (t.isAgua() || t.isNieve())) {
			hacer = true;
		} else {
			hacer = false;
		}
		return hacer;
	}

	public static boolean irEsquiar(Persona p, Tiempo t, Restricciones r) {
		boolean hacer;
		if (t.getTemperatura() < 0 && t.getHumedad() < 15 && (!t.isAgua() && !t.isNieve())
				&& (r.getAforoActual() < r.getAforoPermitido())) {
			hacer = true;
		} else {
			hacer = false;
		}
		return hacer;
	}

	public static boolean hacerSenderismo(Persona p, Tiempo t, Restricciones r) {
		boolean hacer;
		if (t.getTemperatura() >= 0 && t.getTemperatura() < 15 && !t.isAgua()
				&& (r.getAforoActual() < r.getAforoPermitido())) {
			hacer = true;
		} else {
			hacer = false;
		}
		return hacer;
	}

	public static boolean hacerTurismo(Persona p, Tiempo t, Restricciones r) {
		boolean hacer;
		if (t.getTemperatura() >= 15 && t.getTemperatura() < 25 && !t.isAgua() && !t.isNublado() && t.getHumedad() < 60
				&& (r.getAforoActual() < r.getAforoPermitido())) {
			hacer = true;
		} else {
			hacer = false;
		}
		return hacer;
	}

	public static boolean irCanas(Persona p, Tiempo t, Restricciones r) {
		boolean hacer;
		if (t.getTemperatura() >= 25 && t.getTemperatura() < 35 && !t.isAgua()
				&& (r.getAforoActual() < r.getAforoPermitido())) {
			hacer = true;
		} else {
			hacer = false;
		}
		return hacer;
	}

	public static boolean irPlayaPiscina(Persona p, Tiempo t, Restricciones r) {
		boolean hacer;
		if (t.getTemperatura() > 30 && !t.isAgua()) {
			hacer = true;
		} else {
			hacer = false;
		}
		return hacer;
	}
}
