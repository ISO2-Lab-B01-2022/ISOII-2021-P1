package org.isodos.b01.practicados_ejerciciouno.com.iso2b01.testingej1;

public class Tiempo {
	private int temperatura;
	private int humedad;
	private boolean agua;
	private boolean nieve;
	private boolean nublado;
	
	public Tiempo(int temperatura, int humedad, boolean agua, boolean nieve, boolean nublado) {
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.agua = agua;
		this.nieve = nieve;
		this.nublado = nublado;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public int getHumedad() {
		return humedad;
	}

	public boolean isAgua() {
		return agua;
	}

	public boolean isNieve() {
		return nieve;
	}

	public boolean isNublado() {
		return nublado;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public void setHumedad(int humedad) {
		this.humedad = humedad;
	}

	public void setAgua(boolean agua) {
		this.agua = agua;
	}

	public void setNieve(boolean nieve) {
		this.nieve = nieve;
	}

	public void setNublado(boolean nublado) {
		this.nublado = nublado;
	}
	
	

}
