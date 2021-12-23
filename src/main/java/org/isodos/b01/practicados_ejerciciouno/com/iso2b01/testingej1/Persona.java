package org.isodos.b01.practicados_ejerciciouno.com.iso2b01.testingej1;

public class Persona {
	private boolean sano;
	private boolean sintomas;
	private boolean contacto;
	private boolean covid;
	private boolean cartilla;
	
	public Persona(boolean sano, boolean sintomas, boolean contacto, boolean covid, boolean cartilla) {
		this.sano = sano;
		this.sintomas = sintomas;
		this.contacto = contacto;
		this.covid = covid;
		this.cartilla = cartilla;
	}

	public boolean isSano() {
		return sano;
	}

	public boolean isSintomas() {
		return sintomas;
	}

	public boolean isContacto() {
		return contacto;
	}

	public boolean isCovid() {
		return covid;
	}

	public boolean isCartilla() {
		return cartilla;
	}

	public void setSano(boolean sano) {
		this.sano = sano;
	}

	public void setSintomas(boolean sintomas) {
		this.sintomas = sintomas;
	}

	public void setContacto(boolean contacto) {
		this.contacto = contacto;
	}

	public void setCovid(boolean covid) {
		this.covid = covid;
	}

	public void setCartilla(boolean cartilla) {
		this.cartilla = cartilla;
	}
	
	
	
	

}
