package es.edu.escuela_it.java_basico.jornada3;

import java.util.Arrays;



public class AreglosOrdenamiento {
	public static void main(String[] args) {
		// declaracion arreglos
		int[] edades = new int[8]; // tambien puede ser asi edades [8]
		// carga de datos
		edades[0] = 12;
		edades[1] = 19;
		edades[2] = 14;
		edades[3] = 25;
		edades[4] = 36;
		edades[5] = 17;
		edades[6] = 17;
		edades[7] = 19;
		
		Arrays.sort(edades);
		System.out.println(edades);
		
		for(int edad:edades) {
			System.out.println(edad);
		}

	}
}
