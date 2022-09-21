package cl.talentoDigital;

import java.util.ArrayList;
import java.util.Scanner;

import talentoDigital.main.Estudiante;

public class Main {

	public static void main(String[] args) {

		ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("-----------------------------------------------");
			System.out.println("                calcula  Edades                       ");
			System.out.println("-----------------------------------------------");
			System.out.println("");
			System.out.println("Ingrese 5 fechas segun formato (DD/MM/AAAA):");
			System.out.println("");

			for (int i = 1; i < 6; i++) {
				System.out.print("  - Fecha de nacimiento " + i + ": ");
				String fechaNacimiento = sc.nextLine().strip();
				Estudiante estudiante = new Estudiante(i, "18.000.000-" + i, "Apellido P" + i, 
						"Apellido M" + i, "Direccion " + i, fechaNacimiento);
				listaEstudiantes.add(estudiante);
			}
		}

		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println("edades de los estudiantes: ");
		System.out.println("");
		
		for (Estudiante e: listaEstudiantes) {
			System.out.println("  Rut " + e.getRut() + ": Edad = " + e.calcularEdad(e.getFechaNacimiento()));
		}
		
		System.out.println("");
		System.out.println("----------------------------------------");
		
		
	}

}
