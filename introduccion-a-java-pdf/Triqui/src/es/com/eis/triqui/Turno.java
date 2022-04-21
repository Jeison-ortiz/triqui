package es.com.eis.triqui;

import java.util.Random;

public class Turno {
	
	private int valor;

	public Turno() {
		valor = new Random().nextInt(1);
	}
	
	
	public int toca() {	
		return valor;
	}
	
	
	public int noToca() {	
		return (valor + 1)%2;
	}

	
	public void cambiar() {
		valor = this.noToca();
	}
	




}
