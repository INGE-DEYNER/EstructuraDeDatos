/**
 * 
 */
package datos.estructura;

import java.util.Scanner;

/**
 * 
 */
public class ArreglosBidimencionales {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int column = 3;

	        System.out.print("Ingresa el numero de filas: ");
	        int fila = sc.nextInt();

	        int[][] numeros = new int[fila][column];

	        // Entrada de datos
	        for (int i = 0; i < fila; i++) {

	            System.out.println("Fila " + (i + 1));

	            System.out.print("Columna 1: ");
	            numeros[i][0] = sc.nextInt();

	            System.out.print("Columna 2: ");
	            numeros[i][1] = sc.nextInt();

	            // Suma automática
	            numeros[i][2] = numeros[i][0] + numeros[i][1];
	        }

	        // Mostrar resultados
	        System.out.println("\nResultados:");

	        for (int i = 0; i < fila; i++) {
	            System.out.println(
	                numeros[i][0] + " + " +
	                numeros[i][1] + " = " +
	                numeros[i][2]
	            );
	        }

	        sc.close();
	    }
	
		
	
	
		

		
	}


