package datos.estructura;

import java.util.Scanner;

public class Matriz {

	Scanner sc =  new Scanner(System.in);
	private int sumaP = 0, sumaS=0;
	
	
	//Llenar Matriz
	
	public void llenarMatriz(int[][] m ){
		
		for (int i=0; i<m.length; i++) {
			for(int j = 0; j<m.length;j++) {
				System.out.println("Numero [" + i +"] [" + j + "]: " );
				m[i][j]=sc.nextInt();
			}//For columnas 
			
			System.out.println("");
		}//for filas
		System.out.println("Se han registrado los numeros!\n ");
	}
	
	public void mostrarMatriz(int[][] m ){
		System.out.println("Elementos Almacenados: " );
		for (int i=0; i<m.length; i++) {
			for(int j = 0; j<m.length;j++) {
				System.out.println(m[i][j]+" ");
				m[i][j]=sc.nextInt();
			}//For columnas 
			
			System.out.println("");
		}//for filas
		System.out.println("\n ");
	}
	
	public void sumarDiagonalPrincipal(int [][] m) {
		for (int i=0; i<m.length; i++) {
			for(int j = 0; j<m.length;j++) {
				if(i==j){
					sumaP+=m[i][j];
				}
			
			}
		}
		System.out.println("La suma es " + sumaP);
	}
	
	
	
	
	public void sumarDiagonalSecundaria (int[][]m) {
		for (int i=0; i<m.length; i++) {
			for(int j = 0; j<m.length;j++) {
				if(j==m.length-1-i){
					sumaS+=m[i][j];
				}
			
			}
		}
		System.out.println("La suma es " + sumaS);
		
	}
}
