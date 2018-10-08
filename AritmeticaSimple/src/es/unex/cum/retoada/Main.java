package es.unex.cum.retoada;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Main l = new Main();

		//Lo primero es leer lo introducido por teclado
		Scanner s = new Scanner (System.in);
		String entrada = s.nextLine();
		ArrayList <String>lista = new ArrayList <String>();
		lista.add(entrada); //voy guardando en la lista lo que me va metiendo por teclado
		while (entrada.charAt(0) != '0' || entrada.charAt(2) != '0') { //dejo de leer cuando introduce 0 0
			entrada = s.nextLine();
			lista.add(entrada);
		}
		s.close();

	}

}
