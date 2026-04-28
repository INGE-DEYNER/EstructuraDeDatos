
package actividades;

import java.util.Scanner;

/**
 * 
 */
public class Consultor {
	
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		int opcion;
		do {
		System.out.println("Bienvenido\n "
				+ "Que deseas hacer:\n"
				+ "1. Reforestar\n"
				+ "2. Bosque más sembrado\n"
				+ "3. Bosque menos sembrado\n"
				+ "4. Salir ");
		
		opcion = scanner.nextInt();
		switch(opcion) {
		
		case 1:
			calculo();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
		
		}while (opcion != 4);
	}

public static void calculo(){
	int hcNum;
	
	double pino, oyamel, cedro;
	
	System.out.println("Cuantas hectareas deseas reforestar:");
	hcNum = scanner.nextInt();
	
	if(hcNum <= 1000000){
		
		
		pino = ((hcNum*8)/10)*0.5;
		
		oyamel = ((hcNum*15)/12)*0.3;
		cedro = ((hcNum*10)/18)*0.2;
				
				
				
		System.out.println("En estas hectareas debes sembrar " + pino + "pinos");
		System.out.println("En estas hectareas debes sembrar " + oyamel + "oyameles");
		System.out.println("En estas hectareas debes sembrar " + cedro + "cedros");

		
		
		
	}
}
	
	
	
}
