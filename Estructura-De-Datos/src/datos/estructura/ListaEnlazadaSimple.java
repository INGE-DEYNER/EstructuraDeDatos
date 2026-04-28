package datos.estructura;

import java.util.Scanner;

public class ListaEnlazadaSimple {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int opc;
		 int refe;
		 boolean salir = false;
		 //Instanciar la lista 
		 Listaa listaSimple = new Listaa();
		 
		 do {
			 System.out.println("1. Insertar por el comienzo");
			 System.out.println("2. Insertar por el final");
			 System.out.println("3. Mpstrar elementos");
			 System.out.println("4. Salir");
			 System.out.println("5. Insertar despues de referencia");
			 System.out.println("6. Insertar antes de referencia");
			 System.out.print("Ingrese una opcion: ");
			 opc = sc.nextInt();
			 
			 switch(opc) {
			 case 1:
				 System.out.println("Ingrese el numero: ");
				 listaSimple.insertarComienzo(sc.nextInt());
				 break;
				 
			 case 2:
				 System.out.println("Ingrese el numero: ");
				 listaSimple.insertarFinal(sc.nextInt());
				 break;
				 
			 case 3:
				 System.out.println("Elementos almacenados");
				 listaSimple.mostrarLista();;
				 break;
			 case 4:
				 salir=true;
				 break;
			 case 5:
				 System.out.println("Ingrese la Referencia:");
				 refe = sc.nextInt();
				 System.out.println("Ingrese el dato almacenar:");
				 listaSimple.insertarDespuesReferencia(sc.nextInt(), refe);
				 break;
			 case 6:
				 System.out.println("Ingrese la Referencia:");
				 refe = sc.nextInt();
				 System.out.println("Ingrese el dato almacenar:");
				 listaSimple.insertarAntesReferencia(sc.nextInt(), refe);
				 break;
			 case 7:
				 System.out.println("Dato a eliminar");
				 listaSimple.eliminarDato(sc.nextInt());
				 break;
			 }
			 
		 }while(!salir);
		 
	 }
}
