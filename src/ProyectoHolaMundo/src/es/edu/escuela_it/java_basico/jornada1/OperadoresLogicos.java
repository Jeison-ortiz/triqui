package es.edu.escuela_it.java_basico.jornada1;

public class OperadoresLogicos {
	public static void main(String[] args) { // main -> Ctrl + Espacio
		boolean tengoDinero = true;
		boolean juegaMiEquipoFavorito = true;
		boolean esLindoDia = false;
		boolean asistirAPartido = tengoDinero && juegaMiEquipoFavorito || esLindoDia;
		System.out.print(asistirAPartido);
		
		
		
	}

}
