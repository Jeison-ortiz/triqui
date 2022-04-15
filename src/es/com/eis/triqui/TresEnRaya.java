package es.com.eis.triqui;

public class TresEnRaya {
	
	
	private Tablero tablero;
	private Jugador[] jugadores;
	private Turno turno;
	
	
	
	public TresEnRaya() {
			tablero = new Tablero();
			jugadores = new Jugador[2];
			jugadores[0] = new Jugador('X');
			jugadores[1] = new Jugador('O');
			turno = new Turno();
			
	}
	
 	public void jugar() {
 		do {
 			tablero.mostrar();
 			if(!tablero.estaCompleto(jugadores[turno.toca()])) {
 				jugadores[turno.toca()].ponerFicha(tablero);
 			}else {
 				jugadores[turno.toca()].moverFicha(tablero);
 			}
 			
 			turno.cambiar();
 					
 		}while(!tablero.hayTresEnRaya());
 		
 		jugadores[turno.noToca()].cantaVictoria();
 		tablero.mostrar();
		
	}
	
	public static void main(String[] args) {
		new TresEnRaya().jugar();
		
	}
	
}
