package es.com.eis.triqui;

public class Jugador {
	
	private char color;
	
	public Jugador(char color) {
		// TODO Auto-generated constructor stub
		assert color == 'x' || color == 'o';
		this.color = color;
	}

	public char color() {
		// TODO Auto-generated method stub
		return color;
	}
	
	
	public void ponerFicha(Tablero tablero){
		assert tablero != null;
		assert !tablero.estaCompleto(this);
		this.ponerFicha(tablero, null);
	}
	
	private void ponerFicha(Tablero tablero, Coordenada coordenadaOcupada) {
		new GestorIO().out("poner eljugador con "+color + "\n");
		tablero.ponerFicha(this.recogerCoordenadaPuestaValida(tablero,coordenadaOcupada), color);
	}
	
	
	private Coordenada recogerCoordenadaPuestaValida(Tablero tablero, Coordenada coordenadaOcupada) {
		Coordenada resultado = new Coordenada();
		String error = "";
		do {
			resultado.recoger();
			error = this.errorPuesta(tablero,resultado,coordenadaOcupada);
			if(!error.contentEquals("")) {
				new GestorIO().out("Error!!! " + error + "\n");
			}
		}while (!error.equals(""));
		return resultado;
	}

		
	private String errorPuesta(Tablero tablero, Coordenada coordenada, Coordenada coordenadaOcupada) {
		if (tablero.ocupada(coordenada)) {
			return "Coordenada ocupada en el tablero";
		}
		if(coordenadaOcupada != null & coordenadaOcupada.igual(coordenada)) {
			return "No se puede poner de donde se quitó la ficha";
		}
		return "";
	}

		
	public void moverFicha(Tablero tablero) {
		assert tablero != null;
		assert tablero.estaCompleto(this);
		new GestorIO().out("Mueve el jugador con " + color + "\n");
		Coordenada retirada = this.recogerCoordenadaRetiradaValida(tablero);
		tablero.retirarFicha(retirada);
		this.ponerFicha(tablero,retirada);
	}


	
	private Coordenada recogerCoordenadaRetiradaValida(Tablero tablero) {
		Coordenada resultado = new Coordenada();
		String error = "";
		do {
			resultado.recoger();
			error = this.errorRetirada(tablero, resultado);
			if(!error.equals("")){
				new GestorIO().out("Error!!!" + error + "\n");
			}
		}while(!error.equals(""));
		return resultado;
	}

	private String errorRetirada(Tablero tablero, Coordenada coordenada) {
		if(!tablero.ocupada(coordenada,color)) {
			return "Coordenada no ocupada en el tablero por una ficha" + color;
		}
		return "";
	}

	public void cantaVictoria() {
		new GestorIO().out("Victoria es des " + color + "\n");
		
	}





}
