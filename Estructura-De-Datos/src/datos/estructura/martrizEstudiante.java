/**
 * 
 */
package datos.estructura;

import java.util.Scanner;

/**
 * 
 */
public class martrizEstudiante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			 Scanner sc = new Scanner(System.in);

		     double[][] notas = new double[6][4];

		     for(int i = 0; i<6; i++) {
		    	 
		    	 System.out.println("Estudiante: " + (i + 1));
		    	 
		    	 for (int j = 0; j <4; j++) {
		 
		    		 System.out.print("Nota " + (j+1) + ": ");
		         notas[j][0] = sc.nextDouble();


		         // Suma automática
		         notas[j][5] = (notas[j][0] + notas[j][1]);
		         }
		    	 
		     }

		     // Mostrar resultados
		     System.out.println("\nResultados:");

		     for (int i = 0; i < 5; i++) {
		         System.out.println(
		             notas[i][0] + " + " +
		             notas[i][1] + " = " +
		             notas[i][2]
		         );
		     }

		     sc.close();
		 
		}

	}

