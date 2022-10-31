package com.generation;

import java.util.Scanner; // Importar la librería

public class Codigo4 {


	public static void main(String[] args) {//Se agrego su void main para que se pueda ejecutar


		Scanner s = new Scanner(System.in); //Se agrego el System.in para poder escaner

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = s.nextLine();

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");

		Scanner s2 = new Scanner(System.in); // Le faltaba el argumento
		String j2 = s2.nextLine(); // Se cambia s por s2 para hacer referencia al segundo objeto

		if (j1 == j2) { // Se borra parentesis adicional
			System.out.println("Empate");
		} else {
			int g = 2;
			switch(j1) {
			case "piedra":
				if (j2 == "tijeras") {
					g = 1;
				}

			case "papel":
				if (j2 == "piedra") {
					g = 1;
				} // Faltaba cerrar el if
			case "tijera":
				if (j2.equals("papel")) {
					g = 1;
				}
				break;
			default:
			}
			System.out.println("Gana el jugador " + g);
		}

	}
}
