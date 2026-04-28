/**
 * 
 */
package datos.estructura;

import java.util.Scanner;

/**
 * 
 */
public class matrizEstudiante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double[][] notas = new double[6][5];

			for (int i = 0; i < 6; i++) {
				double suma = 0;
				System.out.println("Estudiante: " + (i + 1));

				for (int j = 0; j < 4; j++) {
					System.out.print("Nota " + (j + 1) + ": ");
					notas[i][j] = sc.nextDouble();
					suma += notas[i][j];
				}

				notas[i][4] = suma / 4;
			}

			System.out.println("\nResultados:");
			for (int i = 0; i < 6; i++) {
				System.out.println("Estudiante " + (i + 1) + " promedio: " + notas[i][4]);
			}
		}
		 
		}

	}

