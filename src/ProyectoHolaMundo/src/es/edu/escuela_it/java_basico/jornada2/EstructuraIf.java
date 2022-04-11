package es.edu.escuela_it.java_basico.jornada2;

import java.util.Scanner;

public class EstructuraIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hola ingrese su nombre");

		String datoDeUsuario = sc.nextLine();
		System.out.println("hola ingrese su edad");

		int edad = sc.nextInt(); // para trabajar con enteros 
		

		sc.close();

		System.out.println("Hola " + edad);
		
		if(edad>17) {
			System.out.println("Bienvendio");
			
		}else if(edad < 30){
			System.out.println("hola estas en la edad correcta");
		
		}else {
			System.out.println("Debes ser mayor de edad ");
		}

	}
}
