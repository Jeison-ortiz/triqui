package es.edu.escuela_it.java_basico.jornada2;

import java.util.Scanner;

public class InputUsuario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hola ingrese su nombre");

		String datoDeUsuario = sc.nextLine();
		int edad = sc.nextInt(); // para trabajar con enteros 
		

		sc.close();

		System.out.println("Hola " + datoDeUsuario);

	}

}
