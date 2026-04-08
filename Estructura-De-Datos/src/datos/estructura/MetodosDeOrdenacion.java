/**
 * 
 */
package datos.estructura;

import java.util.Scanner;

/**
 * 
 */
public class MetodosDeOrdenacion {
	
	//Mostrar Vector
	private static void mostrarVector(int [] num) {
		System.out.println("Elementos del vector:");
		for (int i = 0; i<num.length; i++) {
			System.out.println(num[i] + " ");;
			
		}
		System.out.println("\n");
	}
	
	// Metodo Burbuja
	
	private static void burbuja(int[] num) {
		
		int aux;
		for ( int i = 1; i< num.length; i++) {
			
			for(int j = 0 ; j < num.length-1; j++) {
				if (num[j]>num[j+1]) {
					
					//Intercambiar numeros
					aux = num[j];
					num[j]=num[j+1];
					num[j+1]=aux;
				}
			}
		}
		System.out.println("Elementos ordenados!\n");
	}
	
	
	//Insercion
	private static void insercion(int[] num) {
		int aux = 0, indice;
		for (int i = 1; i < num.length; i++) {
			aux = num[i];
			indice = i-1; // Posicion a comparar
			
			while(indice >= 0 && num[indice]>aux) {
				num[indice+1]= num[indice];
				indice--;
			}
			num[indice+1]=aux;
		}
		System.out.println("Elementos ordenados!\n");
	}
	
	//Seleccion
	private static void seleccion(int[] num) {
		int aux,min;
		for(int i = 0; i < num.length; i++) {
			min= i; // determinar el numero menor
			for(int j =i+1; j<num.length; j++) {
				if(num[min]>num[j]) {
					min=j;
				}
			
			}
			aux=num[min];
			num[min]=num[i];
			num[i]=aux;
		}
		System.out.println("Elementos ordenados!\n");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opc;
		
		boolean salir = false;
		int[] numeros = {15,17,9,6,2,11,24,3 };
		do {
			System.out.println("1. Burbuja");
			System.out.println("2. Insercion");
			System.out.println("3. Seleccion");
			System.out.println("4. Mostrar Vector");
			System.out.println("Ingrese una opcion:");
			opc = sc.nextInt();
			switch(opc) {
			 
			case 1:
				burbuja(numeros);
				break;
				
			case 2:
				insercion(numeros);
				break;
				
			case 3:
				seleccion(numeros);
				break;
			case 4:
				mostrarVector(numeros);
				break;
				
			default: System.out.println("Opcion invalida"); 
			break;
			}
		}while(!salir);
		

	}

}
