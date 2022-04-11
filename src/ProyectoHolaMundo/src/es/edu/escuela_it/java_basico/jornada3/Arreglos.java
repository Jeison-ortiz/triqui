package es.edu.escuela_it.java_basico.jornada3;

public class Arreglos {
	public static void main(String[] args) {
		
		// declaracion arreglos
		int[] edades = new int[8]; // tambien puede ser asi edades [8]
		// carga de datos
		edades[0]= 12;
		edades[1]= 13;
		edades[2]= 14;
		edades[3]= 15;
		edades[4]= 16;
		edades[5]= 17;
		edades[6]= 17;
		edades[7]= 19;
		
		for(int i = 0; i<edades.length;i++ ) {
			System.out.println(edades[i]);
		}
		
		for(int edad: edades) {
			System.out.println(edad);
		}
		
		
		
	}
}
