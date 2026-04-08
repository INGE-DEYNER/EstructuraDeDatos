
package actividades;

import java.util.Scanner;


public class ParqueRecreativo {
	
static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String visitantes[] = new String[4];
		int ventas[] = new int[4];
		
		int totalV = 0;
		double promedio = 0;
		
		int opcion;
		do {
		System.out.println(" Bienvenido al parque recreativo  \n "
				+ "Que deseas hacer:\n"
				+ "1. Comprar tickets\n"
				+ "2. Mostrar informacion\n"
				+ "3. Total Ventas\n"
				+ "4. Promedio ventas \n"
				+ "5. Venta menor \n"
				+ "6. Salir ");
	
		System.out.print("Ingrese aqui:");
		opcion = sc.nextInt();
		sc.nextLine();
		
		switch(opcion) {
		
		case 1:
			for(int i = 0; i < visitantes.length; i++) {
				
				System.out.print("Nombre: ");
				visitantes[i]=sc.nextLine();

					System.out.print("Cantidad Tickets: ");
					ventas[i]=sc.nextInt();
					totalV += ventas[i];
					sc.nextLine();
				}
			
			break;
		case 2:
			for(int i = 0; i < visitantes.length; i++) {
				System.out.println("Cliente: " + visitantes[i] +" | " + "Cantidad Tickets: " + ventas[i] +" | ");
			}
	
			break;
			
		case 3:
			System.out.println("Total ventas: " + totalV);
			
			break;
		case 4:
			promedio = totalV/ventas.length;
			System.out.print("Promedio de Ventas: " + promedio);
			break;
		case 5:
			int venMen = 1000;
			String visMenor = null;
			for(int i = 0 ; i<ventas.length;i++) {
				
				if(venMen > ventas[i]) {
					
					venMen = ventas[i];
					visMenor = visitantes[i];
			
				}
			
			}
			System.out.println("Venta Menor: " + venMen + " Cliente: " + visMenor);	
			break;
		case 6:
			System.out.println("Saliendo..........");
			break;
			
			default:
				System.out.println("Numero invalido...");
				break;
				}

		}while(opcion != 6);
		
		
	}
}
