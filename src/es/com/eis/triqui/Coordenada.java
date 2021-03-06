package es.com.eis.triqui;

public class Coordenada {
	
	private int fila;

    private int columna;

    private static final Intervalo LIMITES = new Intervalo(0, 2); 
	
	public Coordenada() {
	    }

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        assert this.valida();
    }
    
    public int getFila() {
    	return fila;
    }    
    
    public int columna() {
    	return columna;
    }
    
    
	public boolean igual(Coordenada coordenada) {
		assert coordenada != null;
		return fila == coordenada.fila && columna == coordenada.columna;
	}

	
	public void recoger() {
		boolean error = false;
		do {
			GestorIO gestorIO = new GestorIO();
			gestorIO.out("Introduce fila [1,3]: ");
			fila = gestorIO.inInt();
			gestorIO.out("Introduce columna [1,3]: ");
			columna = gestorIO.inInt();
			error = !this.valida();
			if(error) {
				new GestorIO().out("Error!! Valores fuera de rango");
			}
		}while(error);
		
	}

	public boolean valida() {
		return LIMITES.incluye(fila) && LIMITES.incluye(columna);
	}



	public int direccion(Coordenada coordenada) {
		if (fila == coordenada.fila) {
			return 0;
		}
		
		if(columna == coordenada.columna) {
			return 1;
		}
		
		if(fila-coordenada.fila == 0 && columna - coordenada.columna == 0) {
			return 2;
		}
		
		if(fila + coordenada.fila == 4 && columna + coordenada.columna == 4) {
			return 3;
		}
		
		return -1;
	}



}
