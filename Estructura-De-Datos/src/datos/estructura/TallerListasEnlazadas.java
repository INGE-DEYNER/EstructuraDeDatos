/**
 * 
 */
package datos.estructura;

import java.util.Scanner;

/**
 * 
 */
public class TallerListasEnlazadas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int opc;
			boolean salir = false;
			//Instanciar la lista
			Listaa listaSimple = new Listaa();
			
			do {
				System.out.println("1. Insertar datos ");
				System.out.println("2. Mostrar datos");
				System.out.println("3. Eliminar ventas");
				System.out.println("4. Actualizar datos de una venta");
				System.out.println("5. Salir");
				System.out.print("Ingrese una opcion: ");
				opc = sc.nextInt();
				sc.nextLine();
				switch(opc) {
				case 1 -> {
					System.out.println("Nombre vendedor: ");
					String vendedor = sc.nextLine();
					
					System.out.println("Producto vendido: ");
					String producto = sc.nextLine();
					System.out.println("Valor venta: ");
					int valor = sc.nextInt();
					sc.nextLine();
					
					listaSimple.insertarDatos(vendedor,producto,valor);
				}
				case 2 -> listaSimple.mostrarListaChucho();
				case 3 -> listaSimple.eliminarVentas();
				case 4 -> {
					System.out.println("Nombre vendedor: ");
					String nVendedor = sc.nextLine();
					
					System.out.println("Producto vendido: ");
					String nProducto = sc.nextLine();
					System.out.println("Valor venta: ");
					int nValor = sc.nextInt();
					sc.nextLine();
					listaSimple.actualizarVenta(nVendedor, nProducto, nValor);
				}
				case 5 -> {
					System.out.println("Saliendo...");
					salir = true;
				}
				default -> System.out.println("Opcion invalida");
				}
				
			} while(!salir);
		}
		 
	 }

	}


