/**
 * 
 */
package datos.estructura;

import java.util.Scanner;

/**
 * 
 */
public class Vectores {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] edades = new int[5];
		int suma = 0, cantMay = 0, cantMen = 0;
		double promedio = 0;
		
		for(int i = 0; i < edades.length ;i++) {
			System.out.println("Ingrese edad " + (i+1) + ": ");
			
			edades[i] = scanner.nextInt();
			
			suma += edades[i];
			
			if(edades[i]<18) {
				cantMen +=1;
			}else {
				cantMay +=1;
			}
			
			
		}
		
		System.out.println("Edades almacenadas:");
		System.out.println("\n");
		for(int i = 0; i < edades.length; i++) {
			System.out.print(edades[i] + " | ");
		}
		System.out.println("\n");
		
		promedio = suma/edades.length;
		
		System.out.println("Promedio de edades: " + promedio);
		System.out.println("Suma de edades: " + suma);
		System.out.println("Mayores de edad: " + cantMay);
		System.out.println("Menores de edad: " + cantMen);
	
	}
	
	

}
