package es.com.eis.triqui;

public class Tablero {

	private Coordenada[][]fichas;
	private static final int DIMENSIONES = 3;
	private static char VACIA = '_';
		
	
	public Tablero() {
		fichas = new Coordenada[2][3];
	}
	
	public void mostrar() {
		GestorIO gestorIO = new GestorIO();
		for (int i =0; i<DIMENSIONES;i++) {
			for (int j =0; j<DIMENSIONES;j++) {
				gestorIO.out(this.getColor(new Coordenada(i,j)) + " ");
			}
			gestorIO.out("/n");
		}
		gestorIO.out("/n");
			
	}	
			
			
	private char getColor(Coordenada coordenada) {
		if(this.ocupada(coordenada,'o')) {
			return 'o';
		}
		if(this.ocupada(coordenada,'x')) {
			return 'x';
		}
		return VACIA;
		
	}
	
	public boolean hayTresEnRaya() {
		return this.hayTresEnRaya('O') || this.hayTresEnRaya('X');
	}
	
	private boolean hayTresEnRaya(char jugador) {
		if(!this.estaCompleto(jugador)) {
			return false;
		}
				
		int fila = this.getFila(jugador);
		int direccion = fichas[fila][0].direccion(fichas[fila][1]);
		if(direccion == -1) {
			return false;
		}
		return direccion == fichas [fila][1].direccion(fichas[fila][1]);
		
		
	}

	
	
	
	public boolean estaCompleto(Jugador jugador) {
		assert jugador != null;
		return this.estaCompleto(jugador.color());
	}


	public boolean estaCompleto(char jugador) {
		int fila = this.getFila(jugador);
		int contador = 0;
		for(int i=0; i<fichas[fila].length; i++) {
			if(fichas[fila][i]!= null) {
				contador++;
			}
		}
		return contador == DIMENSIONES;
	}
	
	
	
	
	public boolean ocupada(Coordenada coordenada, char color) {
		assert coordenada != null;
		int fila = this.getFila(color);
		
		for(int i = 0; i < fichas[fila].length;i++) {
			if(fichas[fila][i] != null && fichas[fila][i].igual(coordenada)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean ocupada(Coordenada coordenada) {
		return this.ocupada(coordenada,'O') || this.ocupada(coordenada,'X');
	}
	
	
	private int getFila(char color) {
		if(color == 'O') {
			return 0;
		}
		return 1;
	}


	public void ponerFicha(Coordenada coordenada, char color) {
		assert coordenada != null;
		int fila = this.getFila(color);
		int i = 0;
		while(fichas[fila][i]  != null) {
			i++;
		}
		fichas[fila][i] = coordenada;
	}

	
	
	
	public void retirarFicha(Coordenada coordenada) {
		assert coordenada != null;
		assert this.ocupada(coordenada);
		for(int i=0; i < fichas.length; i++) {
			for(int j=0; j < fichas[i].length;j++) {
				if(fichas[i][j] != null && fichas[i][j].igual(coordenada)) {
					fichas[i][j] = null;
				}
			}
		}
	}


	
}
		
	


