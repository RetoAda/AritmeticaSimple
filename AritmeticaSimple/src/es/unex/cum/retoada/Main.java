package es.unex.cum.retoada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		Main m = new Main();

		//Lo primero es leer lo introducido por teclado
		Scanner s = new Scanner (System.in);
		String entrada = s.nextLine();
		ArrayList <String>lista = new ArrayList <String>();
		lista.add(entrada); //voy guardando en la lista lo que me va metiendo por teclado
		while (entrada.charAt(0) != '0' || entrada.charAt(2) != '0') { //dejo de leer cuando introduce 0 0
			entrada = s.nextLine();	
			if (entrada.charAt(0) != '0' || entrada.charAt(2) != '0') lista.add(entrada);
		}
		
		m.suma(lista);
		s.close();

	}
	
	public void suma (ArrayList <String>lista) {
		Iterator it = lista.iterator();
		
		while (it.hasNext()) {
			int cont = 0; //numero de acarreos
			
			String numeros = (String) it.next();
			StringTokenizer tokens_numeros = new StringTokenizer(numeros);
			String num1 = tokens_numeros.nextToken();
			String num2 = tokens_numeros.nextToken();
			
			//Tengo que empezar a sumar por detras. Es posible que los numeros no tengan la misma longitud
			int t1 = num1.length() - 1;
			int t2 = num2.length() - 1;
			
			while (t1>=0 && t2>=0) {
				int n1 = Integer.parseInt(String.valueOf(num1.charAt(t1)));
				int n2 = Integer.parseInt(String.valueOf(num2.charAt(t2)));
				if (n1 + n2 > 9) cont ++;
				t1 --;
				t2 --;
			}
			
			if (cont == 1) System.out.println("1 operación de acarreo.");
			else 
				if (cont > 0) System.out.println(cont + " operaciones de acarreo.");
				else System.out.println("No hay operaciones de acarreo.");
		}
		
	}

}
