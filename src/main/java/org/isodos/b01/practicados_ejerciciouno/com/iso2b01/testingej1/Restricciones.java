package org.isodos.b01.practicados_ejerciciouno.com.iso2b01.testingej1;

public class Restricciones {
	private int aforoActual;
	private int aforoPermitido;
	private boolean confinamiento;
	
	public Restricciones(int aforoActual, int aforoPermitido, boolean confinamiento) {
		this.aforoActual = aforoActual;
		this.aforoPermitido = aforoPermitido;
		this.confinamiento = confinamiento;
	}

	public int getAforoActual() {
		return aforoActual;
	}

	public int getAforoPermitido() {
		return aforoPermitido;
	}

	public boolean isConfinamiento() {
		return confinamiento;
	}

	public void setAforoActual(int aforoActual) {
		this.aforoActual = aforoActual;
	}

	public void setAforoPermitido(int aforoPermitido) {
		this.aforoPermitido = aforoPermitido;
	}

	public void setConfinamiento(boolean confinamiento) {
		this.confinamiento = confinamiento;
	}
	
	
	

}
